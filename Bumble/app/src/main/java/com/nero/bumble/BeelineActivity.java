package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BeelineActivity extends AppCompatActivity {
    private ImageButton iBtnCross;
    private String gender="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beeline);
        if (getIntent()!=null && getIntent().getExtras()!=null){
            gender = getIntent().getStringExtra("gender");
        }
        iBtnCross= findViewById(R.id.iBtnCross);
        iBtnCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gender.equals("men")){
                    Intent intent = new Intent(BeelineActivity.this,SwipeManActivity.class);
                    startActivity(intent);
                }else if(gender.equals("women")){
                    Intent intent = new Intent(BeelineActivity.this,SwipeWomenActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(BeelineActivity.this,SwipeManActivity.class);
                    startActivity(intent);
                }
            }
        });

    }


}