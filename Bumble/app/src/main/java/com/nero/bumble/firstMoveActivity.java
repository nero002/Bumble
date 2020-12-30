package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstMoveActivity extends AppCompatActivity {
    private Button mBtngotit;

    private Button mbtnGotItButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_move);
<<<<<<< HEAD
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        mBtngotit = findViewById(R.id.mBtngotit);
        mBtngotit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(firstMoveActivity.this,connectActivity.class);
                startActivity(intent);
            }
        });


=======

        mbtnGotItButton = findViewById(R.id.women_got_it_btn);
        mbtnGotItButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(firstMoveActivity.this, BeforeYouSwipe.class);
                startActivity(intent);
            }
        });
>>>>>>> 3b6e9c0b594d9417b0d81a6009b7006a694afe25
    }
}