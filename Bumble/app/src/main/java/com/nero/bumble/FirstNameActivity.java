package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class FirstNameActivity extends AppCompatActivity {
    private EditText mEtPersonFirstName;
    private ImageButton iBtnNextFromFirstName;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_name);
        initializeViewsAndListeners();

    }

    private void initializeViewsAndListeners() {
        mEtPersonFirstName = findViewById(R.id.mEtPersonFirstName);
        iBtnNextFromFirstName = findViewById(R.id.iBtnNextFromFirstName);
        iBtnNextFromFirstName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstNameActivity.this,FirstPhotoActivity.class);
                startActivity(intent);
            }
        });




    }
}