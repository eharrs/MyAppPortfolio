package com.example.eric.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

    // Button click handlers
    public void onAppButtonClick( View v ) throws Exception
    {
        String clickMessage;
        switch( v.getId() )
        {
            case R.id.App1Button:
                clickMessage = "onButton1Click";
                break;
            case R.id.App2Button:
                clickMessage = "onButton2Click";
                break;
            case R.id.App3Button:
                clickMessage = "onButton3Click";
                break;
            case R.id.App4Button:
                clickMessage = "onButton4Click";
                break;
            case R.id.App5Button:
                clickMessage = "onButton5Click";
                break;
            case R.id.App6Button:
                clickMessage = "onButton6Click";
                break;
            default:
                throw new Exception("Invalid id in click handler");
        }

        Toast toast = Toast.makeText(this, clickMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}
