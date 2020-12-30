package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ModeToGetStartedActivity extends AppCompatActivity {

    private ImageButton mimgbtnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_to_get_started);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        mimgbtnclick = findViewById(R.id.mimgbtnclick);
        mimgbtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeToGetStartedActivity.this,WhoAreUInterestedActivity.class);
                startActivity(intent);
            }
        });
    }
}