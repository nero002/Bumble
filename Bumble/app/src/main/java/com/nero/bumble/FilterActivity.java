package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FilterActivity extends AppCompatActivity {
    private Button btnMenFilter,btnWomenFilter,btnEveroneFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        btnEveroneFilter= findViewById(R.id.btnEveryoneFilter);
        btnMenFilter= findViewById(R.id.btnMenFilter);
        btnWomenFilter= findViewById(R.id.btnWomenFilter);

        btnEveroneFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEveroneFilter.setBackgroundResource(R.drawable.yellow_rectangle_filter_bg);
                btnMenFilter.setBackgroundResource(R.drawable.filter_btn_bg);
                btnWomenFilter.setBackgroundResource(R.drawable.filter_btn_bg);
            }
        });

        btnMenFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMenFilter.setBackgroundResource(R.drawable.yellow_rectangle_filter_bg);
                btnWomenFilter.setBackgroundResource(R.drawable.filter_btn_bg);
                btnEveroneFilter.setBackgroundResource(R.drawable.filter_btn_bg);

            }
        });

        btnWomenFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnWomenFilter.setBackgroundResource(R.drawable.yellow_rectangle_filter_bg);
                btnMenFilter.setBackgroundResource(R.drawable.filter_btn_bg);
                btnEveroneFilter.setBackgroundResource(R.drawable.filter_btn_bg);

            }
        });
    }
}