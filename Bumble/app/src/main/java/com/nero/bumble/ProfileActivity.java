package com.nero.bumble;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private Button mbtnsetting;
    private ImageButton mswipe;
    private ImageButton mbtnchatprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mbtnsetting = findViewById(R.id.setting);
        mswipe = findViewById(R.id.swipe);
        mbtnchatprofile= findViewById(R.id.iBtnChatprofile);


        mbtnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, SettingActivity.class);
                intent.putExtra("data","man");
                startActivity(intent);
            }
        });


        //redirect to swipe women

        mswipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, SwipeWomenActivity.class);
                startActivity(intent);
            }
        });

        //chatActivity

        mbtnchatprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, ChatActivityForMan.class);
                startActivity(intent);
            }
        });

    }
}