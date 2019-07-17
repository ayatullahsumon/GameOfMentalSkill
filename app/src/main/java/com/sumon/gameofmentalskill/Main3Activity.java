package com.sumon.gameofmentalskill;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;
    MediaPlayer mediaPlayer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);

        if(mediaPlayer==null) {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.m);
            mediaPlayer.start();
            mediaPlayer.setLooping(true);
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent=new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent=new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(intent);
            }
        });

    }
}
