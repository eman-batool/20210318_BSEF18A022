package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btn;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        text = findViewById(R.id.textView2);
        text = findViewById(R.id.textView3);
        Log.d("ALC", "onCreate Called ");
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("value");
            text.setText(String.valueOf(count));
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("value",count);
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        Log.d("ALC", "onStart Called ");

    }


    @Override
    protected void onPause()
    {

        super.onPause();
        Log.d("ALC", "onPause Called ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC", "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC", "onDestroy Called");
    }

    public void counter(View view) {
        count= Integer.parseInt(text.getText().toString());
        count=count+1;
        text.setText(String.valueOf(count));
    }

    public void activity2(View view) {
        Intent intent= new Intent(this , MainActivity2.class);
        startActivity(intent);

    }

    public void activity3(View view) {

        Intent intent= new Intent(this , MainActivity3.class);
        startActivity(intent);
    }





}