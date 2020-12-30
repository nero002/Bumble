package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class connectActivity extends AppCompatActivity {
    private Button mBtngotitconnect;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        initializeViewsAndListeners();
        
    }

    private void initializeViewsAndListeners() {

        mBtngotitconnect = findViewById(R.id.mBtngotitconnect);
        mBtngotitconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}