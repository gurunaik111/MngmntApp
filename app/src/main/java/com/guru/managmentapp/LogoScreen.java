package com.guru.managmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LogoScreen extends android.app.Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_screen);
        TextView tv = (TextView) findViewById(R.id.txtview);
        ImageView iv = (ImageView) findViewById(R.id.imgview);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);
        final Intent i=new Intent(this,TConsole.class);
        Thread timer=new Thread(){
            public  void run(){

                try {
                    sleep(5000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }

                finally {
                    startActivity(i);
                    finish();
                }
            }

        };
        timer.start();
    }
}
