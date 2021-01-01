package com.nero.bumble;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FacebookActivity extends AppCompatActivity {
    private Button mBtnLogin;
    private TextView tvCreateAccout;
    private TextView tvNotNow;
    private ImageButton ib_close_btn;
    private EditText mEtPhoneEmail;
    private EditText mEtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        initializeViewsAndListeners();
        isCredentialValid();
    }

    private void initializeViewsAndListeners() {
        mBtnLogin = findViewById(R.id.mBtnLogin);
        tvCreateAccout = findViewById(R.id.createAccount);
        tvNotNow = findViewById(R.id.notNow);
        ib_close_btn = findViewById(R.id.close_btn);
        mEtPhoneEmail = findViewById(R.id.mEtPhoneEmail);
        mEtPassword = findViewById(R.id.mEtPassword);

        //login btn function

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacebookActivity.this, EnableLocationActivity.class);
                if(isCredentialValid()){
                    startActivity(intent);
                }

            }

        });
        //not now function

        tvNotNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacebookActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

        //create account function open fb page

        tvCreateAccout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                startActivity(intent);

            }
        });

        //close btn
        ib_close_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacebookActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }

    //validation

    private boolean isCredentialValid() {
        boolean isDataValid = true;
        if (!mEtPhoneEmail.getText().toString().contains("@gmail.com")) {
            mEtPhoneEmail.setError("Check you email");
            isDataValid = false;


        }

        if (mEtPassword.getText().toString().length() < 6) {
            mEtPassword.setError("Password is to small");
            isDataValid = false;


        }
        return isDataValid;

    }

}