package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SwipeWomenActivity extends AppCompatActivity {
    private ImageButton iBtnHeart;
    private ImageButton iBtnFilter;
    private ImageButton iBtnUser;
    private ImageButton iBtnChat;
    private ImageButton imageButton9;
    private ImageButton iBtnCrossForSwapWomenP1;
    private ImageButton iBtnTickForSwipeWomenP1;
    private ImageButton iBtnStarButtonForSwapWomenP1;
    private ImageButton iBtnStarButtonForSwapWomenP2;
    private ImageButton iBtnCrossForSwapWomenP2;
    private ImageButton iBtnTickForSwipeWomenP2;
    private ImageButton iBtnStarButtonForSwapWomenP3;
    private ImageButton iBtnCrossForSwapWomenP3;
    private ImageButton iBtnTickForSwipeWomenP3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_women);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        iBtnHeart = findViewById(R.id.iBtnHeart);
        iBtnFilter = findViewById(R.id.iBtnFilter);
        iBtnUser = findViewById(R.id.iBtnUser);
        iBtnChat = findViewById(R.id.iBtnChat);
        imageButton9 = findViewById(R.id.imageButton9);
        iBtnCrossForSwapWomenP1 = findViewById(R.id.iBtnCrossForSwapWomenP1);
        iBtnTickForSwipeWomenP1 = findViewById(R.id.iBtnTickForSwipeWomenP1);
        iBtnStarButtonForSwapWomenP1 = findViewById(R.id.iBtnStarButtonForSwapWomenP1);
        iBtnStarButtonForSwapWomenP2 = findViewById(R.id.iBtnStarButtonForSwapWomenP2);
        iBtnCrossForSwapWomenP2 = findViewById(R.id.iBtnCrossForSwapWomenP2);
        iBtnTickForSwipeWomenP2 = findViewById(R.id.iBtnTickForSwipeWomenP2);
        iBtnStarButtonForSwapWomenP3 = findViewById(R.id.iBtnStarButtonForSwapWomenP3);
        iBtnCrossForSwapWomenP3 = findViewById(R.id.iBtnCrossForSwapWomenP3);
        iBtnTickForSwipeWomenP3 = findViewById(R.id.iBtnTickForSwipeWomenP3);


        iBtnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,BeelineActivity.class);
                startActivity(intent);
            }
        });
        iBtnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

















    }
}