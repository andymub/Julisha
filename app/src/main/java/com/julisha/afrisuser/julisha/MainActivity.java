package com.julisha.afrisuser.julisha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextView txtMainTitle;
    private boolean onRestartLoginActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMainTitle=(TextView)findViewById(R.id.txtMainTitle);
//        Typeface typefaceLoginTile=Typeface.createFromAsset(getAssets(),"forte.ttf");
//        txtMainTitle.setTypeface(typefaceLoginTile);
        txtMainTitle.setText(R.string.app_name);
        /*setContentView(R.layout.activity_box);*/
        //
        //
        //
        //I"m gonna run a timer for 2-3 sec befor starting login ativity
        timerBeforeLoginStart();


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        timerBeforeLoginStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


    private void timerBeforeLoginStart() {
        //I"m gonna run a timer for 2-3 sec befor starting login ativity
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent loginIntent =new Intent(MainActivity.this,LoginActivity.class);
                onRestartLoginActivity=true;
                loginIntent.putExtra("onRestartLoginActivity",onRestartLoginActivity);
                startActivity(loginIntent);
            }
        },2000);
    }
}

