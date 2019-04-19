package org.kasapbasi.week201911002;

import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

public class MySecondReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

       if( intent.getAction()==Intent.ACTION_POWER_CONNECTED)
           Toast.makeText(context," BAGLANDI",Toast.LENGTH_LONG).show();
       else if( intent.getAction()==Intent.ACTION_POWER_DISCONNECTED)
           Toast.makeText(context," KOPTU ",Toast.LENGTH_LONG).show();
    }
}
