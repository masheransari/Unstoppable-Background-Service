package com.example.asheransari.start_service_temp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by asher.ansari on 9/19/2017.
 */

public class AndroidStartServiceOnBoot extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Now Service has been created..!!", Toast.LENGTH_SHORT).show();
        Log.e("temp data","activity created..!!");
    }
}
