package crrw.tail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent home     = new Intent(this, HomeActivity.class);
        Intent map      = new Intent(this, HomeActivity.class);
        Intent log      = new Intent(this, HomeActivity.class);
        Intent settings = new Intent(this, SettingsActivity.class);

        switch (item.getItemId()) {
            case R.id.action_home:
                startActivity(home);
                break;
            case R.id.action_map:
                startActivity(map);
                break;
            case R.id.action_log:
                startActivity(log);
                break;
            case R.id.action_settings:
                startActivity(settings);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}