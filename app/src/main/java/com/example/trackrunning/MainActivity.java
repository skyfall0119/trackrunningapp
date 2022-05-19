package com.example.trackrunning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Button btnRunning, btnHistory, btnSetting, btnCustomRun;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initViews();

        // TODO: 5/18/2022  create onclicklistener for the buttons
        
    }


    private void initViews(){
        Log.d(TAG, "initViews: started");
        btnRunning = findViewById(R.id.btnRunning);
        btnCustomRun = findViewById(R.id.btnCustomRun);
        btnHistory = findViewById(R.id.btnHistory);
        btnSetting = findViewById(R.id.btnSetting);
    }



}