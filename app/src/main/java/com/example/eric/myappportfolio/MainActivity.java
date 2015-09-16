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

    // Click handlers
    public void onButton1Click( View view )
    {
        Toast toast = Toast.makeText(this, "onButton1Click", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onButton2Click( View view )
    {
        Toast toast = Toast.makeText(this, "onButton2Click", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onButton3Click( View view )
    {
        Toast toast = Toast.makeText(this, "onButton3Click", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onButton4Click( View view )
    {
        Toast toast = Toast.makeText(this, "onButton4Click", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onButton5Click( View view )
    {
        Toast toast = Toast.makeText(this, "onButton5Click", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onButton6Click( View view )
    {
        Toast toast = Toast.makeText(this, "onButton6Click", Toast.LENGTH_SHORT);
        toast.show();
    }
}
