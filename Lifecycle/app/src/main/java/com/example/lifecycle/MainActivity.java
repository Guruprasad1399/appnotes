package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.time.temporal.TemporalAccessor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("MYANDROIDLIFECYCLE","onCreate method is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MYANDROIDLIFECYCLE", "onStart method is called");
    }
}