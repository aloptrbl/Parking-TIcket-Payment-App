package com.glancelab.ptps;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
ImageView logo;
Animation bounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        logo = (ImageView) findViewById(R.id.logo);
        bounce = AnimationUtils.loadAnimation(this,R.anim.bounce);
        logo.setAnimation(bounce);
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
