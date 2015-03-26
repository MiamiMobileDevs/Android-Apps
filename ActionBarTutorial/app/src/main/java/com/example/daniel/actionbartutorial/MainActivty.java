package com.example.daniel.actionbartutorial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class MainActivty extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activty);
    }

    /*
        To the menu items into the action bar, implement the onCreateOptionsMenu() callback mehtod
        in your activity to inflate the menu resource into the given Menu object
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use of the actionbar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*
    When the user presses one of the action buttons or another item in the
    action overflow, the system calls your activity's onOptionsItemSelected()
    callback method. In your implementation of this method, call getItemId()
    on the given MenuItem to determine which item was pressed—the returned
    ID matches the value you declared in the corresponding <item> element's
    android:id attribute.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handles presses on the action bar items
        switch(item.getItemId()){
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
