package com.nero.bumble;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    private Button mBtnContinueFromFacebook;
    private TextView mTvphonenumber;
    private TextView mtvTerms_of_services;
    private TextView mtvPrivacy_policy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {

        mBtnContinueFromFacebook = findViewById(R.id.mBtnContinueFromFacebook);
        mTvphonenumber = findViewById(R.id.mTvphonenumber);
        mtvTerms_of_services = findViewById(R.id.tvTerms_of_services);
        mtvPrivacy_policy = findViewById(R.id.tvPrivacy_policy);

        //continue fb button

        mBtnContinueFromFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, EnableLocationActivity.class);
                startActivity(intent);
            }
        });

        //click on phonenumber

        mTvphonenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, PhoneNumberActivity.class);
                startActivity(intent);
            }
        });

        //click on T&C

        mtvTerms_of_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://https://bumble.com/en/terms/"));
                startActivity(intent);
            }
        });

        //policy

        mtvPrivacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bumble.com/en/privacy"));
                startActivity(intent);
            }
        });


    }
}

