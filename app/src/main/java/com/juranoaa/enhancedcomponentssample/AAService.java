package com.juranoaa.enhancedcomponentssample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import org.androidannotations.annotations.EService;
import org.androidannotations.annotations.Receiver;

@EService
public class AAService extends Service {
    public static final String ACTION_TO_SERVICE = "ACTION_TO_SERVICE";

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Receiver(actions = ACTION_TO_SERVICE)
    protected void onActionToServce() {
        Intent intent = new Intent(AAMainActivity.ACTION_TO_ACTIVITY);
        sendBroadcast(intent);
    }
}
