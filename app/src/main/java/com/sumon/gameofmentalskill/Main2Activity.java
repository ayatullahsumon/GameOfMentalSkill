package com.sumon.gameofmentalskill;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button btn,btn2,btn3,btn4;
    EditText etx,etx2;
    TextView txv,txv2;
    MediaPlayer mediaPlayer;
    int[] arr={0,0,0,0,0,0};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.btn);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        etx = findViewById(R.id.etx);

        etx2=findViewById(R.id.etx2);
        txv = findViewById(R.id.txv);
        txv2=findViewById(R.id.txv2);

        if(mediaPlayer==null) {
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.m1);
            mediaPlayer.start();
            mediaPlayer.setLooping(true);
            //mediaPlayer=null;
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    arr[0] = Integer.parseInt(etx.getText().toString());
                    if(arr[0]%3==0) {
                        arr[1] = arr[0] + 1;
                        arr[2] = arr[0] + arr[1];
                        arr[3] = arr[1] + arr[2];
                        arr[4] = arr[2] + arr[3];
                        arr[5] = arr[3] + arr[4];
                    }
                    else if(arr[0]%5==0) {
                        arr[1] = arr[0] + arr[0] % 7;
                        arr[2] = arr[0] - arr[0] % 6 + 5;
                        arr[3] = arr[1] + arr[0] % 7;
                        arr[4] = arr[2] - arr[0] % 6 + 5;
                        arr[5] = arr[3] + arr[0] % 7;
                    }
                    else if(arr[0]%7==0) {
                        arr[1] = arr[0] + arr[0] % 8;
                        arr[2] = arr[1] - arr[0] + 5;
                        arr[3] = arr[2] - arr[1] + 5;
                        arr[4] = arr[3] - arr[2] + 5;
                        arr[5] = arr[4] - arr[3] + 5;
                    }
                    else if(arr[0]>10) {
                        arr[1] = arr[0] + 1;
                        arr[2] = arr[0] + arr[1] + 1;
                        arr[3] = arr[1] + arr[2] + 2;
                        arr[4] = arr[2] + arr[3] + 3;
                        arr[5] = arr[3] + arr[4] + 4;
                    }
                    else {
                        arr[1] = arr[0] * 1;
                        arr[2] = arr[1] * 2;
                        arr[3] = arr[2] * 3;
                        arr[4] = arr[3] * 4;
                        arr[5] = arr[4] * 5;
                    }
                    txv.setText(Integer.toString(arr[0]) +" "+ Integer.toString(arr[1]) +" "+ Integer.toString(arr[2]) +" "+ Integer.toString(arr[3]) +" "+Integer.toString(arr[4]) +" ");
                } catch (NumberFormatException nfe) {
                    Toast t = Toast.makeText(getApplicationContext(), "Please input integer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                     if(Integer.toString(arr[5]).equals(etx2.getText().toString()))
                     {
                         txv2.setText(" Hurrah!! You have won ");
                     }
                     else
                     {
                         txv2.setText(" Sorry!! You are wrong ");
                     }
                }
                catch (NumberFormatException nfe) {
                    Toast t = Toast.makeText(getApplicationContext(), "Please input integer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                      if(!(Integer.toString(arr[4]).equals("Input any number not more than 2 digit")))
                      {txv2.setText("Currect result is "+Integer.toString(arr[5]));}
                      else {
                          Toast t = Toast.makeText(getApplicationContext(), "Here is no result", Toast.LENGTH_SHORT);
                          t.show();
                      }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.stop();
                txv2.setText("Input any number not more than 2 digit");
                txv.setText("Here you will see the sequence");

            }
        });

    }

}


