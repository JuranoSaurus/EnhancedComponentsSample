package com.juranoaa.enhancedcomponentssample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;

@EActivity(R.layout.activity_main)
public class AAMainActivity extends Activity {
    public static final String ACTION_TO_ACTIVITY = "ACTION_TO_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, AAService_.class);
        startService(intent);
    }

    @Click
    void btnSendBroadcastToServiceClicked() {
        Intent intent = new Intent(AAService.ACTION_TO_SERVICE);
        sendBroadcast(intent);
    }

    @Receiver(actions = ACTION_TO_ACTIVITY)
    protected void onActionToActivity() {
        Toast.makeText(AAMainActivity.this, "echo from service received.",
                Toast.LENGTH_SHORT).show();
    }
}




