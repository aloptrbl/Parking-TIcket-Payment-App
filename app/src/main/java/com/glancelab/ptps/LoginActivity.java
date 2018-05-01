package com.glancelab.ptps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity  {

    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        home = (Button) findViewById(R.id.home);

    }

    public void home(View view3)
    {
        Intent intent = new Intent(LoginActivity.this, NavigationActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        finish();
    }



}

