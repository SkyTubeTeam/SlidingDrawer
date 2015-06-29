package hollowsoft.sample.slidingdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hollowsoft.slidingdrawer.OnDrawerCloseListener;
import hollowsoft.slidingdrawer.OnDrawerOpenListener;
import hollowsoft.slidingdrawer.OnDrawerScrollListener;
import hollowsoft.slidingdrawer.SlidingDrawer;

public class VerticalDrawerActivity extends BaseAppCompatActivity implements OnDrawerOpenListener,
                                                            OnDrawerCloseListener,
                                                            OnDrawerScrollListener {

    private static final String TAG = VerticalDrawerActivity.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle bundle) {

        final View view = inflater.inflate(R.layout.bottom_fragment, viewGroup, false);

        final SlidingDrawer drawer = (SlidingDrawer) view.findViewById(R.id.bottom_fragment_sliding_drawer_bottom_drawer);

        drawer.setOnDrawerOpenListener(this);
        drawer.setOnDrawerCloseListener(this);
        drawer.setOnDrawerScrollListener(this);

        return view;
    }

    @Override
    public void onDrawerOpened() {
        Logger.logInfo(TAG, "Drawer Opened");
    }

    @Override
    public void onDrawerClosed() {
        Logger.logInfo(TAG, "Drawer Closed");
    }

    @Override
    public void onScrollStarted() {
        Logger.logInfo(TAG, "Scroll Started");
    }

    @Override
    public void onScrollEnded() {
        Logger.logInfo(TAG, "Scroll Ended");
    }
}
