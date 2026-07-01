DIR=docs/cascara/ui/theme-engine

magick convert $DIR/demo-default.png -fuzz 90% -trim +repage /tmp/1.png
magick convert $DIR/demo-noellch.png -fuzz 90% -trim +repage /tmp/2.png
magick convert $DIR/demo-aloe-ar.png -fuzz 90% -trim +repage /tmp/3.png

ffmpeg -y \
-loop 1 -t 6 -i /tmp/1.png \
-loop 1 -t 6 -i /tmp/2.png \
-loop 1 -t 6 -i /tmp/3.png \
-filter_complex \
"[0:v]fade=t=in:st=0:d=0.5,fade=t=out:st=5.8:d=0.2[v0]; \
 [1:v]fade=t=in:st=0:d=0.5,fade=t=out:st=5.8:d=0.2[v1]; \
 [2:v]fade=t=in:st=0:d=0.5,fade=t=out:st=5.8:d=0.2[v2]; \
 [v0][v1][v2]concat=n=3:v=1:a=0,format=yuv420p[v]" -map "[v]" $DIR/cascara-ui-theme.mp4
