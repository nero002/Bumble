package com.nero.bumble;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class SwipeWomenActivity extends AppCompatActivity {
    private ImageButton miBtnFilter;
    private ImageButton miBtnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_women);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        miBtnFilter = findViewById(R.id.iBtnFilter);
        miBtnUser = findViewById(R.id.iBtnUser);
        //for filter button

        miBtnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeWomenActivity.this, FilterActivity.class);
                startActivity(intent);
            }
        });
        // Profile visit
        miBtnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeWomenActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });


    }
}










