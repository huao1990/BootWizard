package com.example.flnet.bootwizard;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserAgreement extends Activity {

    private static final long TIME_DELAY = 1000;
    private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_agreement);
        mHandler = new Handler();


        Button agreeButton = (Button) findViewById(R.id.agree);
        agreeButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity();
            }
        });

    }

    private void launchActivity() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(UserAgreement.this, NetworkSettings.class);
                startActivity(intent);
            }
        }, TIME_DELAY);

    }

}
