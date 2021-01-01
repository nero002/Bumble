package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChatActivity extends AppCompatActivity {

    private ImageButton iBtnUser2;
    private ImageButton iBtnChat2;
    private ImageButton imageButton9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        iBtnUser2 = findViewById(R.id.iBtnUser2);
        iBtnChat2 = findViewById(R.id.iBtnChat2);
        imageButton9 = findViewById(R.id.imageButton9);


        iBtnUser2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
        iBtnChat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this,ChatActivity.class);
                startActivity(intent);
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this,ChatActivity.class);
                startActivity(intent);
            }
        });



    }
}