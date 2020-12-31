package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BeforeYouSwipe extends AppCompatActivity {
    private Button mBtnAgree;
    private String interestId="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_you_swipe);

        if (getIntent() != null && getIntent().getExtras() != null) {
            try {
                interestId = getIntent().getStringExtra("interest");
            } catch (Exception exception) {
                Log.d("tag", "Error");
            }

        }

        mBtnAgree = findViewById(R.id.mBtnAgree);
        mBtnAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interestId.equals("man")) {
                    Intent intentMan = new Intent(BeforeYouSwipe.this, SwipeManActivity.class);
                    startActivity(intentMan);
                } else if (interestId.equals("woman")) {
                    Intent intentWoman = new Intent(BeforeYouSwipe.this, SwipeWomenActivity.class);
                    startActivity(intentWoman);
                }

            }
        });
    }
}