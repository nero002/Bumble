package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnableLocationActivity extends AppCompatActivity {

    private Button mBtnEnableLocation;
    private Button mBtnNotnow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enable);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        mBtnEnableLocation = findViewById(R.id.mBtnEnableLocation);
        mBtnNotnow = findViewById(R.id.mBtnNotnow);
        mBtnNotnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnableLocationActivity.this,ModeToGetStartedActivity.class);
                startActivity(intent);
            }
        });

    }
}