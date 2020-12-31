package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class BirthdayActivity extends AppCompatActivity {
    private EditText mEtMonth;
    private EditText mEtDay;
    private EditText mEtYear;
    private ImageButton iBtnNextFromBirthday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        mEtMonth = findViewById(R.id.mEtMonth);
        mEtDay = findViewById(R.id.mEtDay);
        mEtYear = findViewById(R.id.mEtYear);
        iBtnNextFromBirthday = findViewById(R.id.iBtnNextFromBirthday);

        mEtYear.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                iBtnNextFromBirthday.setBackgroundResource(R.drawable.circle_btn_bg);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        iBtnNextFromBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BirthdayActivity.this, IdentificationActivity.class);
                if (isCredentialValid()) {
                    startActivity(intent);
                }

            }
        });
    }

    private boolean isCredentialValid() {
        boolean isValid = true;
        int month=0, day=0, year=0,age=0;

        try {
             month = Integer.parseInt(mEtMonth.getText().toString());
             day = Integer.parseInt(mEtDay.getText().toString());
             year = Integer.parseInt(mEtYear.getText().toString());
             age = 2020 - year;
        } catch (NumberFormatException ee) {
            Log.d("data", "Error");

        }


        if (mEtDay.getText().toString().isEmpty()) {
            mEtDay.setError("Enter You Day");
            isValid = false;
        }
        if (mEtMonth.getText().toString().isEmpty()) {
            mEtDay.setError("Enter Your Month");
            isValid = false;
        }
        if (mEtYear.getText().toString().isEmpty()) {
            mEtDay.setError("Enter You Year");
            isValid = false;
        }

        if (month < 0 || month > 12) {
            mEtMonth.setError("Please enter valid month");
            isValid = false;
        }
       switch (month) {
           case 1: case 3:
            case 5:
           case 7:
            case 8:
            case 10:
           case 12:
               if (day < 0 || day > 31){
                   mEtDay.setError("Please Enter the valid day");
                   isValid = false;
               }
               break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 0 || day > 30) {
                   mEtDay.setError("Please Enter the valid day");
                   isValid = false;
                }
                break;
            case 2:
               if (day < 0 || day > 29){
                   isValid = false;
                   mEtDay.setError("Please Enter the valid day");
               }
               break;
       }

        if (age < 18 || age > 70) {
            mEtYear.setError("You are not eligible to date now");
            isValid = false;
        }


        return isValid;
    }
}



