![1] SlidingDrawer
==================

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SlidingDrawer-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/765)

SlidingDrawer hides content out of the screen and allows the user to drag a handle to bring the content on screen. SlidingDrawer can be used vertically or horizontally.

A special widget composed of two children views: the handle, that the users drags, and the content, attached to the handle and dragged with it.

SlidingDrawer should be used as an overlay inside layouts. This means SlidingDrawer should only be used inside of a FrameLayout or a RelativeLayout for instance.

The size of the SlidingDrawer defines how much space the content will occupy once slid out so SlidingDrawer should usually use `match_parent` for both its dimensions.

[See](http://developer.android.com/reference/android/widget/SlidingDrawer.html) :)


Setup
-----

Put a new build rule on your `gradle.build` file. For example:

```
dependencies {
    
    compile 'com.github.moraisigor:slidingdrawer:1.5.1'
}
```


Example
-------

##### In Layout

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
              xmlns:drawer="http://schemas.android.com/apk/res-auto"
              android:layout_width="match_parent"
              android:layout_height="match_parent">

    <hollowsoft.slidingdrawer.SlidingDrawer
        android:id="@+id/drawer"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        drawer:handle="@+id/handle"
        drawer:content="@+id/content">
        
        <TextView
            android:id="@+id/handle"
            android:layout_width="match_parent"
            android:layout_height="75dp"
            android:background="#01579B"
            android:gravity="center"
            android:text="Handle"/>
            
        <TextView
            android:id="@+id/content"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#00ACC1"
            android:gravity="center"
            android:text="Content"/>
    
    </hollowsoft.slidingdrawer.SlidingDrawer>
    
</LinearLayout>
```

##### In Code

```java
public class DrawerActivity extends Activity implements OnDrawerOpenListener,
                                                        OnDrawerCloseListener,
                                                        OnDrawerScrollListener {
                                                
    private static final String TAG = "DrawerActivity";
    
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        
        setContentView(R.layout.drawer_activity);
        
        final SlidingDrawer drawer = (SlidingDrawer) view.findViewById(R.id.drawer);
        
        drawer.setOnDrawerOpenListener(this);
        drawer.setOnDrawerCloseListener(this);
        drawer.setOnDrawerScrollListener(this);
    }
    
    @Override
    public void onDrawerOpened() {
        Log.i(TAG, "Drawer Opened");
    }
    
    @Override
    public void onDrawerClosed() {
        Log.i(TAG, "Drawer Closed");
    }
    
    @Override
    public void onScrollStarted() {
        Log.i(TAG, "Scroll Started");
    }
    
    @Override
    public void onScrollEnded() {
        Log.i(TAG, "Scroll Ended");
    }
}
```


Thanks
------

Awesome tools for code quality improvement:

* [Lint](http://developer.android.com/tools/help/lint.html)
* [CheckStyle](http://checkstyle.sourceforge.net)
* [FindBugs](http://findbugs.sourceforge.net)
* [PMD](http://pmd.sourceforge.net)


Contact
-------

* [My Awesome Site](http://igormorais.com) :)


License
-------

```
Copyright 2014 Igor Morais
Copyright (C) 2008 The Android Open Source Project
    
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
    
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[1]: https://raw.githubusercontent.com/MoraisIgor/SlidingDrawer/master/Asset/Icon.png
