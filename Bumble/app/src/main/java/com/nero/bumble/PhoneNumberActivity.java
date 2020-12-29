package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhoneNumberActivity extends AppCompatActivity {

    private EditText mEtindia;
    private EditText mEtPhoneNumber;
    private ImageButton mimgbtnclick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        initializeViewsAndListen();
    }

    private void initializeViewsAndListen() {

        mEtindia = findViewById(R.id.mEtindia);
        mEtPhoneNumber = findViewById(R.id.mEtPhoneNumber);
        mimgbtnclick = findViewById(R.id.mimgbtnclick);
        mimgbtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCredentialValid()) {
                    Intent intent = new Intent(PhoneNumberActivity.this,OTPActivity.class);
                    intent.putExtra("data",mEtPhoneNumber.getText().toString());
                    startActivity(intent);
                }
            }

            private boolean isCredentialValid() {
                boolean isDataValid = true;
                if (mEtPhoneNumber.getText().toString().length()!=10){
                    mEtindia.setError("please check your number");
                    isDataValid = false;
                }
                return isDataValid;
            }
        });







    }
}