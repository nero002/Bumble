package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class IdentificationActivity extends AppCompatActivity {
    private ImageButton iBtnForHowDoYouIdentify;
    public int genderFromIdentification;
    private boolean isSelected=false;
    private ImageButton iBtnManIdentity, iBtnWomenIdentity, iBtnNonBinaryIdentity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);
        initializeViewsAndListeners();

    }

    private void initializeViewsAndListeners() {
        iBtnForHowDoYouIdentify = findViewById(R.id.iBtnForHowDoYouIdentify);
        iBtnManIdentity = findViewById(R.id.iBtnManIdentity);
        iBtnWomenIdentity = findViewById(R.id.iBtnWomenIdentity);
        iBtnNonBinaryIdentity = findViewById(R.id.iBtnNonBinaryIdentity);

        iBtnManIdentity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iBtnForHowDoYouIdentify.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnManIdentity.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnWomenIdentity.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnNonBinaryIdentity.setBackgroundResource(R.drawable.ic_radioonenne);
                isSelected=true;
                genderFromIdentification=1;
            }
        });
        iBtnWomenIdentity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iBtnForHowDoYouIdentify.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnWomenIdentity.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnManIdentity.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnNonBinaryIdentity.setBackgroundResource(R.drawable.ic_radioonenne);
                genderFromIdentification=2;
                isSelected=true;
            }
        });
        iBtnNonBinaryIdentity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iBtnForHowDoYouIdentify.setBackgroundResource(R.drawable.circle_btn_bg);
                iBtnNonBinaryIdentity.setBackgroundResource(R.drawable.ic_iconfinder_check_6586148_1);
                iBtnManIdentity.setBackgroundResource(R.drawable.ic_radioonenne);
                iBtnWomenIdentity.setBackgroundResource(R.drawable.ic_radioonenne);
                genderFromIdentification=3;
                isSelected=true;

            }
        });

        iBtnForHowDoYouIdentify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent= new Intent(IdentificationActivity.this, ModeToGetStartedActivity.class);
               if (isSelected){
                   startActivity(intent);
               }
            }
        });

    }
}