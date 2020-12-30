package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstMoveActivity extends AppCompatActivity {
    private Button mBtngotit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_move);

        mBtngotit = findViewById(R.id.mBtngotit);
        mBtngotit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(firstMoveActivity.this, connectActivity.class);
                startActivity(intent);
            }
        });

    }
}