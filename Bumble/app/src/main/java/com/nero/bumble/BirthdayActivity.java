package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        iBtnNextFromBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BirthdayActivity.this, IdentificationActivity.class);
                startActivity(intent);
            }
        });
    }
}



