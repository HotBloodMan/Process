package com.ljt.process;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(MainActivity.this,LiveService.class));
//        final ScreenManager screenManager = ScreenManager.getInstance(MainActivity.this);
//        ScreenBroadcastListener listener = new ScreenBroadcastListener(this);
//        listener.registerListener(new ScreenBroadcastListener.ScreenStateListener() {
//            @Override
//            public void onScreenOn() {
//                //结束liveActivity
//                screenManager.finishActivity();
//            }
//            @Override
//            public void onScreenOff() {
//                //开启liveActivity
//                screenManager.startActivity();
//            }
//        });


    }
}
