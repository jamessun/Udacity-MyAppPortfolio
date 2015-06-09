package com.jamessun.www.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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

    public void showToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "";
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()) {
            case R.id.button1:
                text = getString(R.string.button_app1_toast);
                break;
            case R.id.button2:
                text = getString(R.string.button_app2_toast);
                break;
            case R.id.button3:
                text = getString(R.string.button_app3_toast);
                break;
            case R.id.button4:
                text = getString(R.string.button_app4_toast);
                break;
            case R.id.button5:
                text = getString(R.string.button_app5_toast);
                break;
            case R.id.button6:
                text = getString(R.string.button_app6_toast);
                break;

        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
