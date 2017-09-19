package com.example.asheransari.start_service_temp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/**
 * Created by asher.ansari on 9/19/2017.
 */

public class BootCompleted extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
            Intent startServiceIntent = new Intent(context, AndroidStartServiceOnBoot.class);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                context.startForegroundService(startServiceIntent);
            } else {
                context.startService(startServiceIntent);
            }
        }
    }
}
