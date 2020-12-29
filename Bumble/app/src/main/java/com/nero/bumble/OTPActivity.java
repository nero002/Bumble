package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OTPActivity extends AppCompatActivity {

    private ImageButton btnNextForOtp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);
        btnNextForOtp= findViewById(R.id.btnNext);
        btnNextForOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(OTPActivity.this, FirstPhotoActivity.class);
                startActivity(intent);
            }
        });
    }
}