package com.mdp_grp12.arcm;

/*import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;


public class Coordinates extends Activity {

    PixelGridView pgv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_coordinates);
        pgv = (PixelGridView) findViewById(R.id.pixelGridView);
        System.out.println(pgv);


    }

    public void BeginTheRobot(View v)
    {

        EditText xpostext=(EditText)findViewById(R.id.xPosText);

        EditText ypostext=(EditText)findViewById(R.id.yPosText);

        Integer x=Integer.parseInt(xpostext.getText().toString()), y=Integer.parseInt(ypostext.getText().toString());
        //System.out.println(x);

        pgv.setCoordinates(x,y);

    }






   /* @Override*/
   /* public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_coordinates, menu);
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
    }*/
