package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class connectActivity extends AppCompatActivity {
    private Button mBtngotitconnect;
    private String interstedInData = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        initializeViewsAndListeners();
        if (getIntent() != null && getIntent().getExtras() != null) {
            interstedInData = getIntent().getStringExtra("interstedGender");
            Log.d("tag", interstedInData);
        }

    }

    private void initializeViewsAndListeners() {

        mBtngotitconnect = findViewById(R.id.mBtngotitconnect);
        mBtngotitconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tag", interstedInData);
                Intent intent = new Intent(connectActivity.this, BeforeYouSwipe.class);
                intent.putExtra("interstedGender", interstedInData);
                startActivity(intent);
            }
        });
    }
}