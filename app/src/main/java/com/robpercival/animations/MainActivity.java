package com.robpercival.animations;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {


    int  count=4;

    public void move(View view) {

        ImageView bird = (ImageView) findViewById(R.id.bird);

        if (count%4==0) {
            bird.setX(02f);
            bird.setY(10f);
            bird.animate().translationX(350f).setDuration(5000);
        }
        else if(count%4==1){
            bird.setX(01f);
            bird.setY(300f);
            bird.animate().translationX(350f).setDuration(5000);

        }
        else if (count%4==2) {
            bird.setX(01f);
            bird.setY(600f);
            bird.animate().translationX(350f).setDuration(5000);
        }
        else {


            bird.animate().translationX(600f).setDuration(5000).x(02f).y(10f);
        }
        System.out.println("Count === "+ count);
        count++;

        //bird.x(40f).y(400f).translationX(400f).setDuration(5000);
        //bird.setY(400f);


    }

   /* public void fade1(View view) {

        ImageView bart = (ImageView) findViewById(R.id.bart);

        ImageView homer = (ImageView) findViewById(R.id.homer);


        bart.animate().alpha(1f).setDuration(20000);

        homer.animate().alpha(0f).setDuration(20000);

    }
*/
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
}
