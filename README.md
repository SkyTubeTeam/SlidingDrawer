SlidingDrawer
=============

This widget has ported and improved from the Android Open Source Project.


SlidingDrawer hides content out of the screen and allows the user to drag a handle to bring the content on screen. SlidingDrawer can be used vertically or horizontally. A special widget composed of two children views: the handle, that the users drags, and the content, attached to the handle and dragged with it. SlidingDrawer should be used as an overlay inside layouts. This means SlidingDrawer should only be used inside of a FrameLayout or a RelativeLayout for instance. The size of the SlidingDrawer defines how much space the content will occupy once slid out so SlidingDrawer should usually use match_parent for both its dimensions.
