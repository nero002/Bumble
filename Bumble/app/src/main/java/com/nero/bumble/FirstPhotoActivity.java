package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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
        iBtnFacebook = findViewById(R.id.iBtnFacebook);
        iBtnNextFromFirstPhoto = findViewById(R.id.iBtnNextFromFirstPhoto);
        mTvCheckGuidelines = findViewById(R.id.mTvCheckGuidelines);

        iBtnNextFromFirstPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iBtnNextFromFirstPhoto.setBackgroundResource(R.drawable.circle_btn_bg);
                Intent intent = new Intent(FirstPhotoActivity.this, BirthdayActivity.class);
                startActivity(intent);
            }
        });
        iBtnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iBtnNextFromFirstPhoto.setBackgroundResource(R.drawable.circle_btn_bg);
                Intent browserIntent=null, chooser=null;
                browserIntent= new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("http://www.facebook.com"));
                chooser = Intent.createChooser(browserIntent,"Open Website Using...");
                if(browserIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(chooser);
                }
            }
        });

        iBtnGalleryPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iBtnNextFromFirstPhoto.setBackgroundResource(R.drawable.circle_btn_bg);
                Intent intent = new Intent();
                intent.setAction(android.content.Intent.ACTION_VIEW);
                intent.setType("image/*");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });
        mTvCheckGuidelines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstPhotoActivity.this, "Post your origin picture",Toast.LENGTH_LONG).show();
            }
        });


    }
}