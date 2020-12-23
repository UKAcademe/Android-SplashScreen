package com.ukacademe.androidsplashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by UK Academe on 01/01/2021.
 */

public class SplashScreenActivity extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * There are the two methods to hide the actionbar
         * Method 1: we can hide programmatically
         * Method 2: we can hide using custom theme design
         * So this is the Method 1 for Method 2 Check themes.xml file
         * and hide this code and define the custom theme in AndroidManifest file
         * to hide the action bar using custom theme.
         */
        //hide the default action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_splashscreen);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
