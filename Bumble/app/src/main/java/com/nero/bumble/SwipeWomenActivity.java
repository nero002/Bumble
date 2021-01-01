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
    private ImageButton iBtnTickForSwipeWomenP1;
    private ImageButton iBtnStarButtonForSwapWomenP1;
    private ImageButton iBtnStarButtonForSwapWomenP2;
    private ImageButton iBtnTickForSwipeWomenP2;
    private ImageButton iBtnStarButtonForSwapWomenP3;
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
        iBtnTickForSwipeWomenP1 = findViewById(R.id.iBtnTickForSwipeWomenP1);
        iBtnStarButtonForSwapWomenP1 = findViewById(R.id.iBtnStarButtonForSwapWomenP1);
        iBtnStarButtonForSwapWomenP2 = findViewById(R.id.iBtnStarButtonForSwapWomenP2);
        iBtnTickForSwipeWomenP2 = findViewById(R.id.iBtnTickForSwipeWomenP2);
        iBtnStarButtonForSwapWomenP3 = findViewById(R.id.iBtnStarButtonForSwapWomenP3);
        iBtnTickForSwipeWomenP3 = findViewById(R.id.iBtnTickForSwipeWomenP3);

       // heart button
        iBtnHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,BeelineActivity.class);
                intent.putExtra("gender","women");
                startActivity(intent);
            }
        });

        //for filter button

        iBtnFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeWomenActivity.this, FilterActivity.class);
                startActivity(intent);
            }
        });
        // Profile visit
        iBtnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SwipeWomenActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        //for chat button
        iBtnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,ChatActivityForMan.class);
                intent.putExtra("whichone","woman");
                startActivity(intent);
            }
        });

        // same activity
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,SwipeWomenActivity.class);
                startActivity(intent);
            }
        });
        //tick button1 for swipe women
        iBtnTickForSwipeWomenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,BoomActivity.class);
                startActivity(intent);
            }
        });
        //star button1 for swipe women
        iBtnStarButtonForSwapWomenP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,SwipeWomenActivity.class);
                startActivity(intent);
            }
        });
        //star button2 for swipe wome
        iBtnStarButtonForSwapWomenP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,SwipeWomenActivity.class);
                startActivity(intent);
            }
        });
        //tick button2 for swipe women
        iBtnTickForSwipeWomenP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,BoomActivity.class);
                startActivity(intent);
            }
        });
        //start button2 for swipe women
        iBtnStarButtonForSwapWomenP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,BoomActivity.class);
                startActivity(intent);
            }
        });

        //cross button3 for swipe women
        iBtnTickForSwipeWomenP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwipeWomenActivity.this,BoomActivity.class);
                startActivity(intent);
            }
        });
    }
}