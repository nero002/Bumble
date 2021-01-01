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
    private ImageButton iBtnChat;
    private ImageButton imageButton9;
    private ImageButton iBtnStarButtonForSwapWomenP1;
    private ImageButton iBtnCrossForSwapWomenP1;
    private ImageButton iBtnTickForSwipeWomenP1;
    private ImageButton iBtnStarButtonForSwapWomenP2;
    private ImageButton iBtnCrossForSwapWomenP2;
    private ImageButton iBtnTickForSwipeWomenP2;
    private ImageButton iBtnStarButtonForSwapWomenP3;
    private ImageButton iBtnCrossForSwapWomenP3;
    private ImageButton iBtnTickForSwipeWomenP3;

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
        //chat button
        iBtnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,ChatActivity.class);
                startActivity(intent);
            }
        });
        //same activity button
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });
        //star button for swipe man activity
        iBtnStarButtonForSwapWomenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });
        iBtnCrossForSwapWomenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });
        //tick button for swipe men
        iBtnTickForSwipeWomenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });
        //star button for swipe men
        iBtnStarButtonForSwapWomenP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });
        iBtnCrossForSwapWomenP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });

        iBtnStarButtonForSwapWomenP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });

        iBtnCrossForSwapWomenP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,SwipeManActivity.class);
                startActivity(intent);
            }
        });
        iBtnTickForSwipeWomenP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeManActivity.this,BoomActivity.class);
                startActivity(intent);
            }
        });
    }
}