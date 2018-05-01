package com.glancelab.ptps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    Animation slide_down,slide_left,slide_right;
    Button signin,signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = (Button) findViewById(R.id.signup);
        logo = (ImageView) findViewById(R.id.logo);
        slide_down = AnimationUtils.loadAnimation(this,R.anim.slide_down);
        logo.setAnimation(slide_down);

        signin = (Button) findViewById(R.id.signin);
        slide_left = AnimationUtils.loadAnimation(this,R.anim.slide_left);
        signin.setAnimation(slide_left);

        signup = (Button) findViewById(R.id.signup);
        slide_right = AnimationUtils.loadAnimation(this,R.anim.slide_right);
        signup.setAnimation(slide_right);


    }

    public void signin(View view)
    {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void signup(View view2)
    {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }


}

