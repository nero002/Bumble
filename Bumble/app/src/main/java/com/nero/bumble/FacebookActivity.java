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
    private Button mbtnlogin;
    private TextView tvCreateAccout;
    private TextView tvNotNow;
    private ImageButton ib_close_btn;
    private EditText etemailphonenumber;
    private EditText etpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        initializeViewsAndListeners();

    }

    private void initializeViewsAndListeners() {
        mbtnlogin = findViewById(R.id.login_btn);
        tvCreateAccout = findViewById(R.id.createAccount);
        tvNotNow = findViewById(R.id.notNow);
        ib_close_btn = findViewById(R.id.close_btn);
        etemailphonenumber = findViewById(R.id.email_phone_number);
        etpassword = findViewById(R.id.password);

        //login btn function

        mbtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isCredentialValid()){
                    Intent intent = new Intent(FacebookActivity.this, EnableLocationActivity.class);
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
                intent.putExtra("data",etemailphonenumber.getText().toString());
                intent.putExtra("data",etpassword.getText().toString());
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

        if (!etemailphonenumber.getText().toString().contains("@gmail.com")) {
            isDataValid = false;
            etemailphonenumber.setError("Check you email");

        }

        if (etpassword.getText().toString().length() < 6) {
            isDataValid = false;
            etpassword.setError("Password is too small");

        }
        return isDataValid;

    }

}