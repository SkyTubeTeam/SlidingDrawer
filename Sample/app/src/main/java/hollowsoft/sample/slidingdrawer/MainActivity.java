package hollowsoft.sample.slidingdrawer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import hollowsoft.slidingdrawer.OnDrawerCloseListener;
import hollowsoft.slidingdrawer.OnDrawerOpenListener;
import hollowsoft.slidingdrawer.OnDrawerScrollListener;
import hollowsoft.slidingdrawer.SlidingDrawer;

/**
 * @author Igor Morais
 */
public class MainActivity extends AppCompatActivity implements OnDrawerScrollListener, OnDrawerOpenListener, OnDrawerCloseListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable final Bundle bundle) {
        super.onCreate(bundle);

        setContentView(R.layout.main);

        final SlidingDrawer drawer = (SlidingDrawer) findViewById(R.id.drawer);

        drawer.setOnDrawerScrollListener(this);
        drawer.setOnDrawerOpenListener(this);
        drawer.setOnDrawerCloseListener(this);
    }

    @Override
    public void onScrollStarted() {
        Log.d(TAG, "onScrollStarted()");
    }

    @Override
    public void onScrollEnded() {
        Log.d(TAG, "onScrollEnded()");
    }

    @Override
    public void onDrawerOpened() {
        Log.d(TAG, "onDrawerOpened()");
    }

    @Override
    public void onDrawerClosed() {
        Log.d(TAG, "onDrawerClosed()");
    }
}
