package hollowsoft.sample.slidingdrawer;

import android.app.Activity;
import android.app.Fragment;

public enum Screen {

    BOTTOM      (1, R.string.screen_bottom, R.drawable.ic_launcher, BottomFragment.class),
    LEFT        (2, R.string.screen_left, R.drawable.ic_launcher, LeftFragment.class),
    RIGHT       (3, R.string.screen_right, R.drawable.ic_launcher, RightFragment.class),
    TOP         (4, R.string.screen_top, R.drawable.ic_launcher, TopFragment.class),
    ABOUT       (5, R.string.screen_about, R.drawable.ic_launcher, AboutFragment.class);

    private final int id;
    private final int name;
    private final int icon;
    private final Class<?> viewClass;

    Screen(final int id, final int name, final int icon, final Class<?> viewClass) {

        this.id = id;
        this.name = name;
        this.icon = icon;
        this.viewClass = viewClass;
    }

    public final int getId() {
        return id;
    }

    public final int getName() {
        return name;
    }

    public final int getIcon() {
        return icon;
    }

    public final Class<?> getViewClass() {
        return viewClass;
    }

    public final boolean isFragment() {
        return Fragment.class.isAssignableFrom(viewClass);
    }

    public final boolean isActivity() {
        return Activity.class.isAssignableFrom(viewClass);
    }

    public static Screen getBy(final int id) {

        for (final Screen screen : Screen.values()) {

            if (screen.getId() == id) {
                return screen;
            }
        }

        throw new IllegalArgumentException("The Screen has not found.");
    }

    public static Screen getBy(final String name) {

        for (final Screen screen : Screen.values()) {

            if (screen.name().equals(name)) {
                return screen;
            }
        }

        throw new IllegalArgumentException("The Screen has not found.");
    }
}
