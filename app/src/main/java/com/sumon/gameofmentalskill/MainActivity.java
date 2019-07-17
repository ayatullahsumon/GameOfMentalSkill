package com.sumon.gameofmentalskill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long Delay=2000;

        Timer runsTimer = new Timer();
        TimerTask shoTimerTask=new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent);
            }
        };
        runsTimer.schedule(shoTimerTask,Delay);
    }

}
