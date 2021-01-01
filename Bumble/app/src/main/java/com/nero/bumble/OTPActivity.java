package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class OTPActivity extends AppCompatActivity {

    private ImageButton iBtnFromOTPNext;
    private View viewBlack;
    private EditText mEtFistDigit;
    private EditText mEtSecondDigit;
    private EditText mEtThirdDigit;
    private EditText mEtFourthDigit;
    private TextView mTvDidNotGetText;
    private TextView mTvChange;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);
        initializeViewsAndListeners();
        otpGenerator();

    }

    private void otpGenerator() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mEtFistDigit.setText("2");
                mEtSecondDigit.setText("6");
                mEtThirdDigit.setText("0");
                mEtFourthDigit.setText("5");
            }
        }, 2000);
    }

    private void initializeViewsAndListeners() {
        mEtFistDigit = findViewById(R.id.mEtFistDigit);
        mEtSecondDigit = findViewById(R.id.mEtSecondDigit);
        mEtThirdDigit = findViewById(R.id.mEtThirdDigit);
        mEtFourthDigit = findViewById(R.id.mEtFourthDigit);
        mTvChange = findViewById(R.id.mTvChange);
        viewBlack = findViewById(R.id.blackCircleView);
        mTvDidNotGetText = findViewById(R.id.mTvDidNotGetText);
        iBtnFromOTPNext = findViewById(R.id.iBtnFromOTPNext);

        mEtFistDigit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                viewBlack.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnFromOTPNext.setBackgroundResource(R.color.yellowish);
                iBtnFromOTPNext.setBackgroundResource(R.drawable.ic_change_right_24);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        iBtnFromOTPNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OTPActivity.this, FirstNameActivity.class);
                startActivity(intent);
            }
        });

        mTvDidNotGetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OTPActivity.this, PhoneNumberActivity.class);
                startActivity(intent);
            }
        });

        mTvChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OTPActivity.this, PhoneNumberActivity.class);
                startActivity(intent);
            }
        });
    }
}





