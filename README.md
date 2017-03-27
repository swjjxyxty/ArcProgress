# ArcProgress
ArcProgressBar


![](https://github.com/swjjxyxty/ArcProgress/blob/master/images/screenshot.png)

#Usage

1.in your build.gradle:
> compile 'com.bestxty:arcprogress:0.0.2'

2.in your layout file:
```java
<com.bestxty.pb.ArcProgressBar
    android:id="@+id/arc_progress1"
    android:layout_width="240dp"
    android:layout_height="240dp"
    android:layout_centerInParent="true"
    app:arc_bottom_text="Hello"
    app:arc_stroke_width="5dp"
    app:arc_progress="40"/>
```


##attribute declare
```xml
<declare-styleable name="ArcProgress">
    <attr name="arc_progress" format="integer"/>
    <attr name="arc_angle" format="float"/>
    <attr name="arc_stroke_width" format="dimension"/>
    <attr name="arc_max" format="integer"/>

    <attr name="arc_unfinished_color" format="color"/>
    <attr name="arc_finished_color" format="color"/>

    <attr name="arc_text_size" format="dimension"/>
    <attr name="arc_text_color" format="color"/>

    <attr name="arc_suffix_text" format="string"/>
    <attr name="arc_suffix_text_size" format="dimension"/>
    <attr name="arc_suffix_text_padding" format="dimension"/>

    <attr name="arc_bottom_text" format="string"/>
    <attr name="arc_bottom_text_size" format="dimension"/>
</declare-styleable>
```