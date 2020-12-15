package com.example.onestopmedicalsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView btnSignUp;
    private TextView btnLogin;
    private TextView btnForgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignUp = findViewById(R.id.tvSignIN);
        btnLogin = findViewById(R.id.tvLogin);
        btnForgotPass = findViewById(R.id.tvForgotPass);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpActivity();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManuActivity();
            }
        });

        btnForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForgotPasswordActivity();

            }
        });


    }

    private void openForgotPasswordActivity() {
        Intent intent =  new Intent(this,ForgotPassword.class);
        startActivity(intent);
    }

    private void openManuActivity() {
        Intent intent = new Intent(this,ManuActivity.class);
        startActivity(intent);
    }

    private void openSignUpActivity() {
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }

}