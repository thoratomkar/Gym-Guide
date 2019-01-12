package com.example.suraj.gymguid;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        img = (ImageView) findViewById(R.id.splashscreen);
        animate();
    }

    private void nextActivity() {
        startActivity(new Intent(SplashScreen.this,MuscleGain.class));
        finish();

    }
    private void animate(){
        Display display = getWindowManager().getDefaultDisplay();
        final Point size = new Point();
        display.getSize(size);
        float height = size.y;
        float centerY=height/2;
        Animation animation = new TranslateAnimation(0, 0,height, 0);
        animation.setDuration(1500);
        animation.setFillAfter(true);
        img.startAnimation(animation);
        img.setVisibility(View.VISIBLE);


        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //load.setVisibility(View.VISIBLE);
                Handler handler1=new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        nextActivity();
                    }
                },1000);
            }
        },1700);
    }
}
