/*
 * Copyright 2014 Igor Morais
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
public final class MainActivity extends AppCompatActivity implements OnDrawerScrollListener, OnDrawerOpenListener, OnDrawerCloseListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable final Bundle bundle) {
        super.onCreate(bundle);

        setContentView(R.layout.main);

        final SlidingDrawer drawer = findViewById(R.id.drawer);

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
