package com.example.lab_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = "Create!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Created");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        CharSequence text = "Start!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.d(TAG, "Started");
    }
    @Override
    protected void onStop() {

        super.onStop();
        Context context = getApplicationContext();
        CharSequence text = "Stop!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Stopped");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Context context = getApplicationContext();
        CharSequence text = "Destroy";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Log.e(TAG, "AAAAAA. App is destroyed");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        CharSequence text = "Pause!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.w(TAG, "Paused");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        CharSequence text = "Resume";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Resumed");
    }


}