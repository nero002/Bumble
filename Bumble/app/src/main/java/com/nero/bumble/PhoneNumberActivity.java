package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class PhoneNumberActivity extends AppCompatActivity {

    private EditText mEtPhoneNumber;
    private ImageButton mimgbtnclick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        initializeViewsAndListen();
    }

    private void initializeViewsAndListen() {

        mEtPhoneNumber = findViewById(R.id.mEtPhoneNumber);
        mimgbtnclick = findViewById(R.id.mimgbtnclick);
        mEtPhoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mimgbtnclick.setBackgroundResource(R.drawable.circle_btn_bg);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mimgbtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCredentialValid()) {
                    Intent intent = new Intent(PhoneNumberActivity.this,OTPActivity.class);
                    intent.putExtra("dataPhoneNumber",mEtPhoneNumber.getText().toString());
                    startActivity(intent);
                }
            }

            private boolean isCredentialValid() {
                boolean isDataValid = true;
                if (mEtPhoneNumber.getText().toString().length()!=10){
                    mEtPhoneNumber.setError("please check your number");
                    isDataValid = false;
                }
                return isDataValid;
            }
        });
    }
}