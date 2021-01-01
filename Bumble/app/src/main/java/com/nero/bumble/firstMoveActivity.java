package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class firstMoveActivity extends AppCompatActivity {
    private Button mBtngotit;
    private String interstedInData="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_move);
        if (getIntent()!=null && getIntent().getExtras()!=null){
            interstedInData=getIntent().getStringExtra("interstedGender");
            Log.d("tag",interstedInData);
        }

        mBtngotit = findViewById(R.id.mBtngotit);
        mBtngotit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag",interstedInData);
                Intent intent = new Intent(firstMoveActivity.this, connectActivity.class);
                intent.putExtra("interstedGender",interstedInData);
                Log.d("tag",interstedInData);
                startActivity(intent);
            }
        });

    }
}