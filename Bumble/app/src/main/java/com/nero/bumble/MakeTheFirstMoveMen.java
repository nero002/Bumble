package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MakeTheFirstMoveMen extends AppCompatActivity {

    private Button mbtn_GotIt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_the_first_move_men);

        mbtn_GotIt = findViewById(R.id.btn_GotIt);
       mbtn_GotIt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MakeTheFirstMoveMen.this, BeforeYouSwipe.class);
               startActivity(intent);

           }
       });

    }
}