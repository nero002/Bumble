package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FirstPhotoActivity extends AppCompatActivity {
    private ImageButton iBtnGalleryPlus;
    private ImageButton iBtnNextFromFirstPhoto;
    private TextView mTvCheckGuidelines;
    private ImageButton iBtnFacebook;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_photo);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        iBtnGalleryPlus = findViewById(R.id.iBtnGalleryPlus);
        iBtnNextFromFirstPhoto = findViewById(R.id.iBtnNextFromFirstPhoto);
        mTvCheckGuidelines = findViewById(R.id.mTvCheckGuidelines);
        iBtnNextFromFirstPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPhotoActivity.this,BirthdayActivity.class);
                startActivity(intent);
            }
        });






    }
}