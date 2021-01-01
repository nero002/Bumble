package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SettingActivity extends AppCompatActivity {
    private ImageButton iBtnBackForSettings;
    private Button mBtnLogOut, mBtnDelete;
    private String data ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.black));
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            data = getIntent().getStringExtra("data");
        }

        iBtnBackForSettings = findViewById(R.id.iBtnBackForSettings);
        mBtnLogOut = findViewById(R.id.mBtnLogOut);
        mBtnDelete = findViewById(R.id.mBtnDelete);


        iBtnBackForSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (data.equals("man")) {
                    Intent intent = new Intent(SettingActivity.this, ProfileActivity.class);
                    startActivity(intent);
                } else if (data.equals("woman")) {
                    Intent intent = new Intent(SettingActivity.this, ProfileWomanActivity.class);
                    startActivity(intent);
                }

            }
        });


        mBtnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });


        mBtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

    }
}