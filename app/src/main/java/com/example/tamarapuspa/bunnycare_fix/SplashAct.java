package com.example.tamarapuspa.bunnycare_fix;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashAct extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getUsernameLocal();

    }

    public void getUsernameLocal(){

        //setting timer untuk 1 detik
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //merubah activity
                Intent gotogetstarted = new Intent(SplashAct.this, HomeAct.class);
                startActivity(gotogetstarted);
                finish();
            }
        }, 2000); //2000 ms = 2 s (2 detik)

    }
}
