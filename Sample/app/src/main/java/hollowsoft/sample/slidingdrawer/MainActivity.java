package hollowsoft.sample.slidingdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    private LinearLayout layoutContent;

    private DrawerLayout drawerLayout;

    private ActionBarDrawerToggle drawerToggle;

    private Fragment currentFragment;

    private final Map<String, Fragment> fragmentMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        setContentView(R.layout.main_activity);

        findViews();

        setupViews();
    }

    private void findViews() {

        drawerLayout = (DrawerLayout) findViewById(R.id.main_screen_drawer_layout);

        layoutContent = (LinearLayout) findViewById(R.id.main_screen_linear_layout_content);

        listView = (ListView) findViewById(R.id.main_screen_list_view_menu);
    }

    private void setupViews() {

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.app_name, R.string.app_name) {

            @Override
            public void onDrawerOpened(final View drawerView) {
                super.onDrawerOpened(drawerView);

                getSupportActionBar().setTitle(R.string.app_name);
            }

            @Override
            public void onDrawerClosed(final View drawerView) {
                super.onDrawerClosed(drawerView);

                final String tag = currentFragment.getTag();

                if (tag.equals(Screen.BOTTOM.getViewClass().getName())) {
                    getSupportActionBar().setTitle(R.string.screen_bottom);

                } else if (tag.equals(Screen.LEFT.getViewClass().getName())) {
                    getSupportActionBar().setTitle(R.string.screen_left);

                } else if (tag.equals(Screen.RIGHT.getViewClass().getName())) {
                    getSupportActionBar().setTitle(R.string.screen_right);

                } else if (tag.equals(Screen.TOP.getViewClass().getName())) {
                    getSupportActionBar().setTitle(R.string.screen_top);

                } else if (tag.equals(Screen.ABOUT.getViewClass().getName())) {
                    getSupportActionBar().setTitle(R.string.screen_about);
                }
            }
        };

        drawerLayout.setDrawerListener(drawerToggle);

        listView.setAdapter(new MenuAdapter(this, Screen.values()));
        listView.setOnItemClickListener(this);

        final String fragmentName = Screen.BOTTOM.getViewClass().getName();

        currentFragment = Fragment.instantiate(this, fragmentName);

        getSupportActionBar().setTitle(R.string.screen_bottom);

        getFragmentManager().beginTransaction()
                .add(R.id.main_screen_relative_layout_fragment, currentFragment, fragmentName).commit();

        fragmentMap.put(fragmentName, currentFragment);
    }

    @Override
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);

        drawerToggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        return drawerToggle.onOptionsItemSelected(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override
    public void onItemClick(final AdapterView<?> adapterView, final View view, final int position, final long id) {

        final Screen screen = Screen.getBy(position + 1);

        if (screen.isFragment()) {

            final FragmentManager fragmentManager = getFragmentManager();

            final String fragmentName = screen.getViewClass().getName();

            final Fragment fragment = fragmentManager.findFragmentByTag(fragmentName);

            if (fragment == null) {

                currentFragment = fragmentMap.get(fragmentName);

                if (currentFragment == null) {
                    currentFragment = Fragment.instantiate(this, fragmentName);

                    fragmentMap.put(fragmentName, currentFragment);
                }

                getFragmentManager().beginTransaction()
                        .replace(R.id.main_screen_relative_layout_fragment, currentFragment, fragmentName).commit();
            }

            drawerLayout.closeDrawer(layoutContent);
        }
    }
}
