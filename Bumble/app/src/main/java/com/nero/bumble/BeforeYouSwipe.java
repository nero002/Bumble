package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BeforeYouSwipe extends AppCompatActivity {
    private Button mBtnAgree;
    private String interstedInData ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_you_swipe);

        if (getIntent() != null && getIntent().getExtras() != null) {
            interstedInData = getIntent().getStringExtra("interstedGender");
            Log.d("tag", interstedInData);
        }
        mBtnAgree = findViewById(R.id.mBtnAgree);
        mBtnAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag", interstedInData);
                Intent intentMan = new Intent(BeforeYouSwipe.this, SwipeManActivity.class);
                Intent intentWoman = new Intent(BeforeYouSwipe.this, SwipeWomenActivity.class);
                if (interstedInData.equals("man")){
                    startActivity(intentMan);
                }else if (interstedInData.equals("woman")){
                    startActivity(intentWoman);
                }else {
                    startActivity(intentMan);
                }

            }

        });
    }
}