package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChatActivityForMan extends AppCompatActivity {

    private ImageButton iBtnUserchatForMan;
    private ImageButton iBtnChatinChatForMan;
    private ImageButton sameActivityBtninChatForMan;
    private  String data ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_for_man);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        iBtnUserchatForMan = findViewById(R.id.iBtnUserchatForMan);
        iBtnChatinChatForMan = findViewById(R.id.iBtnChatinChatForMan);
        sameActivityBtninChatForMan = findViewById(R.id.sameActivityBtninChatForMan);

        // for going to profile activity
        iBtnUserchatForMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivityForMan.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
        //for going to the chat activity
        iBtnChatinChatForMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivityForMan.this,ChatActivity.class);
                startActivity(intent);
            }
        });
        //for being on the same activity
        sameActivityBtninChatForMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.equals("woman")){
                    Intent intent = new Intent(ChatActivityForMan.this,SwipeWomenActivity.class);
                    startActivity(intent);
                }else if (data.equals("man")){
                    Intent intent= new Intent(ChatActivityForMan.this, SwipeManActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}