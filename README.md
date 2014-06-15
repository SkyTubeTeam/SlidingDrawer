SlidingDrawer
=============

This widget has ported and improved from the Android Open Source Project.

SlidingDrawer hides content out of the screen and allows the user to drag a handle to bring the content on screen,
SlidingDrawer can be used vertically or horizontally.

A special widget composed of two children views: the handle, that the users drags, and the content, attached to the handle and dragged with it, SlidingDrawer should be used as an overlay inside layouts, this means SlidingDrawer should only be used inside of a FrameLayout or a RelativeLayout for instance.

The size of the SlidingDrawer defines how much space the content will occupy once slid out so SlidingDrawer should usually use match_parent for both its dimensions.

Inside an XML layout, SlidingDrawer must define the id of the handle and of the content.

See more here [SlidingDrawer](http://developer.android.com/reference/android/widget/SlidingDrawer.html)


Example
-------

##### In Layout

```xml
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/holo_red_dark"
    tools:context=".MainScreen" >

    <com.hollowsoft.library.slidingdrawer.SlidingDrawer
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:content="@+id/drawer_content"
        app:handle="@+id/drawer_handle" >

        <TextView
            android:id="@+id/drawer_handle"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@android:color/holo_blue_dark"
            android:gravity="center"
            android:paddingBottom="15dp"
            android:paddingTop="15dp"
            android:text="@string/handle"
            android:textColor="@android:color/white"
            android:textSize="25sp" />

        <TextView
            android:id="@+id/drawer_content"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="@android:color/holo_green_dark"
            android:gravity="center"
            android:text="@string/content"
            android:textColor="@android:color/white"
            android:textSize="25sp" />
    </com.hollowsoft.library.slidingdrawer.SlidingDrawer>

</RelativeLayout>
```

##### In Java

```java
public class MainScreen extends Activity {

        /*
         * (non-Javadoc)
         *
         * @see android.app.Activity#onCreate(android.os.Bundle)
         */
         @Override
         protected void onCreate(final Bundle savedInstance) {
                 super.onCreate(savedInstance);
                 setContentView(R.layout.main_screen);
         }
}
```
