package com.trackdesk.androidcleanarchitecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    MyExample myExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((BaseApplication)getApplication()).getComponent().inject(MainActivity.this);

        Log.d("MAIN_ACTIVITY", "Is my example null ? "+(myExample == null));

        if (myExample != null) {
            Log.d("MAIN_ACTIVITY", "Status "+myExample.getStatus());
        }
    }
}
