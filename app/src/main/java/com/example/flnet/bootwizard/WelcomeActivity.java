package com.example.flnet.bootwizard;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends Activity {
    private static final long TIME_DELAY = 2000;
    Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mHandler = new Handler();
        launchActivity();


    }

    private void launchActivity() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, UserAgreement.class);
                startActivity(intent);
            }
        }, TIME_DELAY);

    }
}
