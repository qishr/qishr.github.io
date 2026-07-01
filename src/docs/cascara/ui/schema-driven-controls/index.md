# Schema-Driven Controls

## The Emergent UI: From Schema to Screen

Once data exposes its structural DNA via a schema definition, desktop UI presentation ceases to be a manual layout chore; it becomes a deterministic science.

When building an entry form, the framework routes the class properties through [`ObjectFieldFactory`](/javadoc/cascara.ui/form/ObjectFieldFactory/). This factory generates a reactive, self-contained JavaFX control wrapper called a `Field`.

The layout presentation rules adapt automatically based on the field constraints:

- **Read-Only Contexts:** If the schema flags the property as `readOnly`—or if the field belongs to a parent array, sequence, or object locked in a read-only state (like a non-editable table)—the `Field` control automatically presents itself as a clickable **Hyperlink**.

- **Writable Contexts:** If the property is editable, the control exposes an interactive input node that automatically applies live validation matching the URI schema pattern, instantly highlighting errors if the text is malformed.

The developer writes zero manual UI layout or data-binding code. You simply deserialize an incoming data file into a JVM object, hand it to the factory, and an interactive presentation emerges.

### Handling Discrete Sets: Enums and Option Providers

What happens if the underlying type is a Java `Enum`? Reflection assigns the correct structural enum constant during deserialization, and [`ObjectFieldFactory`](/javadoc/cascara.ui/form/ObjectFieldFactory/) automatically generates a drop-down list control. The selection items populate dynamically using one of three hierarchical strategies:

```
1. Reflective Constants  --->  Reads declared Java Enum values
2. JSON Schema Rules    --->  Extracts discrete values defined via 'enum' keyword
3. Option Providers     --->  Queries dynamic runtime directories or contexts
```

While the first two approaches provide fixed option lists, the third hooks directly into Cascara's open [`OptionProvider`](/javadoc/cascara.ui/option/OptionProvider/) architecture:

```java
public interface OptionProvider extends ServiceProvider {
    List<Option> getOptions(Map<String,Property<?>> contextData, String parameter);
    void addListener(Runnable listener);
}
```

By pairing an [`@OptionConstraint`](/javadoc/cascara.ui/schema/OptionConstraint/) annotation on a class field with a custom `OptionProvider`, the generated drop-down list becomes contextually alive:

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface OptionConstraint {
    String provider() default "";
    String parameter() default "";
}
```

This capability is vividly showcased in the [*Cascara UI Demo* application](/features/theme-engine/)'s **Theme Drop-down**. The list of options doesn't rely on a hardcoded array; it dynamically tracks the filesystem contents of your `~/.cascara/themes` and `~/.cascara/packages` directories.

If you drop a new VS Code theme file straight into the packages directory while the application is running, the `OptionProvider` catches the system event, triggers its listeners, and the drop-down instantly mutates on screen without requiring an application restart.

## The Bottom Line

With Cascara's architecture, application developers don't have to concern themselves with how layout, synchronization, or formatting rules interlock behind the scenes. Complex data conversions, reactive UI bindings, and schema validation loops happen implicitly.

