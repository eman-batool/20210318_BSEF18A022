package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        text=findViewById(R.id.textView6);
        Log.d("ALC3", "onCreate Called ");
    }


    @Override
    protected void onStart()
    {
        super.onStart();

        Log.d("ALC3", "onStart Called ");

    }


    @Override
    protected void onPause()
    {

        super.onPause();
        Log.d("ALC3", "onPause Called ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC3", "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC3", "onDestroy Called");
    }
}