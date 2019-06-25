package com.example.rumiwasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Logo = (ImageView)findViewById(R.id.imgLogo);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.scanim);
        Logo.startAnimation(anim);
        final Intent st = new Intent(this,StartActivity.class);
        Thread timer = new Thread(){
            public void run (){
                try{
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(st);
                    finish();
                }
            }
        };
        timer.start();
    }
}