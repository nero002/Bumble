package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class FirstNameActivity extends AppCompatActivity {

    private EditText mEtPersonFirstName;
    private ImageButton iBtnNextFromFirstName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_name);
        initializeViewsAndListeners();

    }

    private void initializeViewsAndListeners() {
        mEtPersonFirstName = findViewById(R.id.mEtPersonFirstName);
        iBtnNextFromFirstName = findViewById(R.id.iBtnNextFromFirstName);
        iBtnNextFromFirstName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isCredentialValid()) {
                    Intent intent = new Intent(FirstNameActivity.this, FirstPhotoActivity.class);
                    intent.putExtra("nameOf Person", mEtPersonFirstName.getText().toString());
                    startActivity(intent);
                }
            }
        });

        mEtPersonFirstName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                iBtnNextFromFirstName.setBackgroundResource(R.drawable.circle_btn_bg);
               // iBtnNextFromFirstName.setBackgroundResource(R.drawable.ic_change_right_24);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private boolean isCredentialValid() {
        boolean isValid = true;
        if (mEtPersonFirstName.getText().toString().isEmpty()) {
            mEtPersonFirstName.setError("Please enter your first name");
            isValid = false;
        }
        return isValid;
    }
}