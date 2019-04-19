package org.kasapbasi.week201911002;

import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

public class BHYT extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
   String str=intent.getExtras().getString("mac","Bulunamadı");

        Toast.makeText(context,"Bu haftaki rakip "+str,Toast.LENGTH_LONG).show();
    }
}
