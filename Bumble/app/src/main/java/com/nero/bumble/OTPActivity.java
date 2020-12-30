package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class OTPActivity extends AppCompatActivity {

    private ImageButton iBtnFromOTPNext;
    private EditText mEtFistDigit;
    private EditText mEtSecondDigit;
    private EditText mEtThirdDigit;
    private EditText mEtFourthDigit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
            mEtFistDigit = findViewById(R.id.mEtFistDigit) ;
            mEtSecondDigit = findViewById(R.id.mEtSecondDigit);
            mEtThirdDigit =findViewById(R.id.mEtThirdDigit);
            mEtFourthDigit = findViewById(R.id.mEtFourthDigit);
            iBtnFromOTPNext= findViewById(R.id.iBtnFromOTPNext);
            iBtnFromOTPNext.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(OTPActivity.this, FirstPhotoActivity.class);
                    startActivity(intent);
                }
            });
        }
        }





