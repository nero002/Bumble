package com.nero.bumble;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    private Button mBtnContinueFromFacebook;
    private TextView mTvphonenumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initializeViewsAndListeners();
    }
    private void initializeViewsAndListeners() {

            mBtnContinueFromFacebook= findViewById(R.id.mBtnContinueFromFacebook);
             mTvphonenumber = findViewById(R.id.mTvphonenumber);
            mBtnContinueFromFacebook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(SignInActivity.this, EnableLocationActivity.class);
                    startActivity(intent);
                }
            });
        mTvphonenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this,PhoneNumberActivity.class);
                startActivity(intent);
            }
        });


    }
}

