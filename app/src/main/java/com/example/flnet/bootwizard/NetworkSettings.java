package com.example.flnet.bootwizard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

/**
 * Created by flnet on 2017/10/16.
 */

public class NetworkSettings extends Activity {
    private static final long TIME_DELAY = 2000;
    Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.network_settings);
        mHandler = new Handler();


        Button agreeButton = (Button) findViewById(R.id.pass);
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
                Intent intent = new Intent(NetworkSettings.this, VipLogin.class);
                startActivity(intent);
            }
        }, TIME_DELAY);

    }
}
