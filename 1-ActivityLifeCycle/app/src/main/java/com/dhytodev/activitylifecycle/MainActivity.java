package com.dhytodev.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView mLifecycleStatus ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLifecycleStatus = (TextView) findViewById(R.id.tv_lifecycle_events_display);
    }

    private void logAndAppend(String lifecycleStatus) {
        Log.d(TAG, "Lifecycle Event: " + lifecycleStatus);
        mLifecycleStatus.append(lifecycleStatus + "\n");
    }
}
