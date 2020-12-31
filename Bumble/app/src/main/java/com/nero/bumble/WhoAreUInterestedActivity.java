package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WhoAreUInterestedActivity extends AppCompatActivity {
    private ImageButton iBtnManInterested, iBtnWomanInterested, iBtnEveryoneInterested,iBtnNextForInterseted;
    private boolean isSelected=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_are_u_interested);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        iBtnNextForInterseted = findViewById(R.id.iBtnNextForInterseted);
        iBtnManInterested=findViewById(R.id.iBtnMenInterested);
        iBtnWomanInterested= findViewById(R.id.iBtnWomenInterested);
        iBtnEveryoneInterested=findViewById(R.id.iBtnEveryoneInterested);

        iBtnManInterested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iBtnNextForInterseted.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnManInterested.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnWomanInterested.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnEveryoneInterested.setBackgroundResource(R.drawable.ic_radioonenne);
                isSelected=true;
            }
        });

        iBtnWomanInterested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iBtnNextForInterseted.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnWomanInterested.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnManInterested.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnEveryoneInterested.setBackgroundResource(R.drawable.ic_radioonenne);
                isSelected=true;
            }
        });

        iBtnEveryoneInterested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iBtnNextForInterseted.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnEveryoneInterested.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnManInterested.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnWomanInterested.setBackgroundResource(R.drawable.ic_radioonenne);
                isSelected=true;

            }
        });

        iBtnNextForInterseted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(WhoAreUInterestedActivity.this,RecoveryEmailidActivity.class);
                if (isSelected){
                    startActivity(intent);
                }
            }
        });
    }
}