package com.nero.bumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class RecoveryEmailidActivity extends AppCompatActivity {
    private EditText mEtRecoverEmail;
    private ImageButton iBtnNextFromRecoveryMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery_emailid);
        initializeViewsAndListeners();
    }

    private void initializeViewsAndListeners() {
        mEtRecoverEmail = findViewById(R.id.mEtRecoverEmail);
        iBtnNextFromRecoveryMail = findViewById(R.id.iBtnNextFromRecoveryMail);
        iBtnNextFromRecoveryMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecoveryEmailidActivity.this,firstMoveActivity.class);
                startActivity(intent);
            }
        });
    }
}