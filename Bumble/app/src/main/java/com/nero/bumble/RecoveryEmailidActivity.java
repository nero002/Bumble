package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class RecoveryEmailidActivity extends AppCompatActivity {
    private EditText mEtRecoverEmail;
    private TextView skip;
    private String interstedInData = "";
    private ImageButton iBtnNextFromRecoveryMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery_emailid);
        initializeViewsAndListeners();
        if (getIntent() != null && getIntent().getExtras() != null) {
            interstedInData = getIntent().getStringExtra("interstedGender");
            Log.d("tag", interstedInData);
        }
    }

    private void initializeViewsAndListeners() {
        mEtRecoverEmail = findViewById(R.id.mEtRecoverEmail);
        skip = findViewById(R.id.mTvSkip);
        iBtnNextFromRecoveryMail = findViewById(R.id.iBtnNextFromRecoveryMail);

        mEtRecoverEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                iBtnNextFromRecoveryMail.setBackgroundResource(R.drawable.circle_btn_bg);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        iBtnNextFromRecoveryMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tagman", interstedInData);
                Intent intent = new Intent(RecoveryEmailidActivity.this, firstMoveActivity.class);
                intent.putExtra("interstedGender", interstedInData);
                Log.d("tag", interstedInData);
                if (isValidCredential()) {
                    startActivity(intent);
                }

            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tagman", interstedInData);
                Intent intent = new Intent(RecoveryEmailidActivity.this, firstMoveActivity.class);
                Intent intent2 = new Intent(RecoveryEmailidActivity.this, MakeTheFirstMoveMen.class);
                intent.putExtra("interstedGender", interstedInData);
                Log.d("tag", interstedInData);
                if (interstedInData.equals("everyone")) {
                    startActivity(intent2);
                } else {
                    startActivity(intent);
                }

            }
        });
    }

    private boolean isValidCredential() {
        boolean isValid = false;
        if (mEtRecoverEmail.getText().toString().contains("@gmail.com")) {
            isValid = true;
        }
        return isValid;
    }
}