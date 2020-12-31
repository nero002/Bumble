package com.nero.bumble;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SwipeManActivity extends AppCompatActivity {
    private ImageButton miBtnFilter;
    private ImageButton miBtnUser;
    private ImageButton miBtnHeart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_man);
        initializeViewsAndListeners();

    }

    private void initializeViewsAndListeners() {
        miBtnFilter = findViewById(R.id.iBtnFilter);
        miBtnUser = findViewById(R.id.iBtnUser);
        miBtnHeart = findViewById(R.id.iBtnHeart);

        //for filter button

        miBtnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeManActivity.this, FilterActivity.class);
                startActivity(intent);
            }
        });

        // Profile visit

        miBtnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeManActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        //Heart Button

        miBtnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeManActivity.this, BeelineActivity.class);
                startActivity(intent);
            }
        });

    }
}