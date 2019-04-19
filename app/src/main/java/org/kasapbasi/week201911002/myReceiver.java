package org.kasapbasi.week201911002;

import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

public class myReceiver extends BroadcastReceiver {
    public myReceiver() {
        super();
    }


    @Override
    public IBinder peekService(Context myContext, Intent service) {
        return super.peekService(myContext, service);
    }


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context," AİRPLANE MESAJ GELDİ ",Toast.LENGTH_LONG).show();

    }
}
