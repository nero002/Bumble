package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class IdentificationActivity extends AppCompatActivity {
    private ImageButton iBtnHowDoYouIdentify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);
        initializeViewsAndListeners();

    }

    private void initializeViewsAndListeners() {
        iBtnHowDoYouIdentify = findViewById(R.id.iBtnHowDoYouIdentify);
        iBtnHowDoYouIdentify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IdentificationActivity.this,ModeToGetStartedActivity.class);
                startActivity(intent);
            }
        });

    }
}