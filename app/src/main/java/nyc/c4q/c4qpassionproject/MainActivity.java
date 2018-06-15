package nyc.c4q.c4qpassionproject;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

  private Toolbar toolbar;
  private ActionBarDrawerToggle drawerToggle;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setUpRealm();
    setupToolBar();
    setupNavigationDrawer();
    setupDrawerNavigation();
  }

  private void setUpRealm() {

    Realm.init(this);
    RealmConfiguration realmConfig = new RealmConfiguration.Builder()
        .name("tasky.realm")
        .schemaVersion(0)
        .deleteRealmIfMigrationNeeded()
        .build();
    Realm.setDefaultConfiguration(realmConfig);
  }

  private void setupDrawerNavigation() {
    NavigationView navigationView = findViewById(R.id.nav_view);
    NavController navController = Navigation.findNavController(this, R.id.nav_drawer);
    NavigationUI.setupWithNavController(navigationView, navController);
  }

  public void setupToolBar() {
    toolbar = findViewById(R.id.home_toolbar);
    setSupportActionBar(toolbar);
    if (getSupportActionBar() != null) {
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      getSupportActionBar().setHomeButtonEnabled(true);
    }
  }

  public void setupNavigationDrawer() {
    DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle drawerToggle =
        new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open,
            R.string.navigation_drawer_close);
    drawerLayout.addDrawerListener(drawerToggle);
    drawerToggle.syncState();
  }

  @Override public void onBackPressed() {
    DrawerLayout drawer = findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @Override public boolean onSupportNavigateUp() {
    return Navigation.findNavController(this, R.id.nav_view).navigateUp();
  }
}
