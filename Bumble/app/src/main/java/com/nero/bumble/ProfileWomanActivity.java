package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfileWomanActivity extends AppCompatActivity {
    private Button iBtnsettingWomanProfile;
    private ImageButton iBtnUserWomanProfile;
    private ImageButton iBtnswipeWomanProfile,iBtnChatWomanProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_woman);

        iBtnsettingWomanProfile = findViewById(R.id.iBtnsettingWomanProfile);
        iBtnChatWomanProfile = findViewById(R.id.iBtnChatWomanProfile);
        iBtnswipeWomanProfile= findViewById(R.id.iBtnswipeWomanProfile);
        iBtnChatWomanProfile=findViewById(R.id.iBtnChatWomanProfile);

        iBtnsettingWomanProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileWomanActivity.this, SettingActivity.class);
                intent.putExtra("data","woman");
                startActivity(intent);
            }
        });


        //redirect to swipe women

        iBtnswipeWomanProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileWomanActivity.this, SwipeManActivity.class);
                startActivity(intent);
            }
        });

        //chatActivity

        iBtnChatWomanProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileWomanActivity.this, ChatActivity.class);
                intent.putExtra("whichone","woman");
                startActivity(intent);
            }
        });

    }
}