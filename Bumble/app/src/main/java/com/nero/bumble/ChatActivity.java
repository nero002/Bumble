package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChatActivity extends AppCompatActivity {

    private ImageButton iBtnUserchat;
    private ImageButton iBtnChatinchat;
    private ImageButton sameactivitybtninchat;
    private  String data ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        initializeViewsAndListeners();
        if (getIntent()!=null && getIntent().getExtras()!= null){
            data= getIntent().getStringExtra("whichone");
        }
    }

    private void initializeViewsAndListeners() {
        iBtnUserchat = findViewById(R.id.iBtnUserchat);
        iBtnChatinchat = findViewById(R.id.iBtnChatinchat);
        sameactivitybtninchat = findViewById(R.id.sameactivitybtninchat);

          // for going to profile activity
        iBtnUserchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this,ProfileWomanActivity.class);
                startActivity(intent);
            }
        });
        //for going to the chat activity
        iBtnChatinchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this,ChatActivity.class);
                startActivity(intent);
            }
        });
        //for being on the same activity
        sameactivitybtninchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(ChatActivity.this,SwipeManActivity.class);
                    startActivity(intent);
                }

        });
    }
}