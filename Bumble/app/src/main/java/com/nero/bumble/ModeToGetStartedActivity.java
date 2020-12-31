package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ModeToGetStartedActivity extends AppCompatActivity {

    private ImageButton mimgbtnclick;
    private boolean isSelected = false;
    private ImageButton iBtnDate, iBtnBff, iBtnBizz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_to_get_started);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        mimgbtnclick = findViewById(R.id.mimgbtnclick);
        iBtnBff = findViewById(R.id.iBtnBff);
        iBtnBizz = findViewById(R.id.iBtnBizz);
        iBtnDate = findViewById(R.id.iBtnDate);

        iBtnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mimgbtnclick.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnDate.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnBizz.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnBff.setBackgroundResource(R.drawable.ic_radioonenne);
                isSelected = true;
            }
        });

        iBtnBizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mimgbtnclick.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnBizz.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnDate.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnBff.setBackgroundResource(R.drawable.ic_radioonenne);
                isSelected = true;
            }
        });

        iBtnBff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mimgbtnclick.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnBff.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnDate.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnBizz.setBackgroundResource(R.drawable.ic_radioonenne);
                isSelected = true;
            }
        });

        mimgbtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeToGetStartedActivity.this, WhoAreUInterestedActivity.class);
                if (isSelected) {
                    startActivity(intent);
                }

            }
        });
    }
}