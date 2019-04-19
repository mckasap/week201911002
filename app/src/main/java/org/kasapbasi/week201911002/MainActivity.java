package org.kasapbasi.week201911002;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter ifilter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        Intent batteryStatus = this.registerReceiver( new myReceiver(), ifilter);


        IntentFilter iflt1= new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        Intent pw1 = this.registerReceiver( new MySecondReceiver(), iflt1);
        IntentFilter iflt2= new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);
        Intent pw2 = this.registerReceiver( new MySecondReceiver(), iflt2);





    }
}
