# Extensible Design

> *Type Descriptors and Primitive Delegates: How Data Gains Meaning*

Consider a raw value in a text file. If you are reading a YAML stream, you look at it and naturally say, "That's a YAML scalar." If you switch to a JSON file, it’s a JSON token. But how does a machine process that distinction without tying its core data models to a specific format?

This comes down to the point of view (POV) of the observer.

## The Observer's POV

A generic scalar AST node, when viewed by a YAML processor, behaves like a YAML primitive type. Humans handle this contextual projection automatically. An AI might recognize it because its models have been trained on vast swathes of text contextualizing it. But how far down the spiral of data having meaning *only* in the context inferred by the observer can a compiler platform go?

Consider a scalar data value representing an insecure URL: `http://insecure.com`.

A standard JSON emitter looking at this data knows it needs to be written out as a valid JSON string wrapped in double quotes. But what happens to the raw scalar representation *in between* parsing and emitting—at the exact point where a format-agnostic, generic framework is managing it? Should the data structures track quoting styles natively?

In Cascara, an AST scalar node remains completely pure. It is just a scalar. It has no intrinsic concept of whether it requires quotation marks, or how it should visually manifest in JSON, XML, or YAML. Instead, the scalar delegates its dialect-specific behavioral rules to a **Point of View**.

### The Decoupled Primitive

Cascara achieves this through a clean separation between data containment and dialect rules via the [`Primitive`](/javadoc/cascara.common/lang/type/Primitive/) and [`PrimitiveDelegate`](/javadoc/cascara.common/lang/type/PrimitiveDelegate/) API:

```java
public interface PrimitiveDelegate {
    QuoteStyle inferQuoteStyle(Object value);
    Object coerceLiteralValue(String text);
    String unescapeQuotedString(String text, QuoteStyle style);
}
```

The [`Primitive`](/javadoc/cascara.common/lang/type/Primitive/) class acts as a universal container, encapsulating raw text inputs or native objects. The format-specific serializer or parser assigns a [`PrimitiveDelegate`](/javadoc/cascara.common/lang/type/PrimitiveDelegate/) to the container during lifecycle execution:

```java
public class Primitive {
    private PrimitiveDelegate delegate;
    protected final Object rawInput;
    private Object nativeValueCache;

    public Primitive setDelegate(PrimitiveDelegate delegate) {
        this.delegate = delegate;
        return this;
    }

    private Object nativeValue() {
        // Unescapes or coerces text dynamically based on the delegate's POV
        ...
    }
}
```

The delegate acts as the serializer’s specific POV. It determines exactly what that scalar means in a given format context. Context—the specialized lens of the active serializer or parser—is what makes raw data valuable.

## The Translation: Text to JVM Instance

Things get interesting when we cross the boundary from structural syntax back into the strongly typed world of the JVM. When an AST node is deserialized, it transitions into an instance of a live JVM class (referred to as `jvmInstance` across the Cascara codebase).

This mapping is governed by the [`TypeSerializer<T>`](/javadoc/cascara.common/lang/type/TypeSerializer/) and [`TypeDescriptor<T>`](/javadoc/cascara.common/lang/type/TypeDescriptor/) interfaces:

```java
public interface TypeSerializer<T> extends TypeDescriptor<T> {
    AstNode serialize(T value) throws SerializerException;
    T deserialize(AstNode jvmInstance) throws SerializerException;
}
```

When a format deserializer (such as [`JsonSerializer`](/javadoc/cascara.lang.json/json/processor/JsonSerializer/)) processes a field that expects a `java.net.URI`, it recognizes that `URI` isn’t a base primitive natively specified by JSON Schema. To resolve this, it runs through an structured lookup pipeline:

1. It searches the local registry for a registered `TypeDescriptor<URI>`.

2. If absent, it queries Cascara's extensibility architecture via the [`ServiceProviderLayer`](/javadoc/cascara.common/service/ServiceProviderLayer/).

3. It obtains (and caches) a native [`UriTypeDescriptor`](/javadoc/cascara.common/lang/type/UriTypeDescriptor/).

By default, all Java equivalents of the classic *Apple Core Foundation* types (including `URI`, `Date`, and `UUID`) are handled natively out of the box by `cascara.common`. The assigned `UriTypeDescriptor` exposes methods to convert the types and declares the underlying schema characteristics—explicitly telling the ecosystem that the property is structurally a `string` with a `format` constraint of `"uri"`.

And the best part? Cascara’s [`TypeDescriptor`](/javadoc/cascara.common/lang/type/TypeDescriptor/)s and [`TypeSerializer`](/javadoc/cascara.common/lang/type/TypeSerializer/)s support everything modern serialization engines can do, while clocking in up to **3x faster than SnakeYAML**—and that’s *before* unleashing our upcoming streaming performance enhancements.

See: [Performance Comparisons](/cascara/language-processors/yaml/performance-comparison/).
