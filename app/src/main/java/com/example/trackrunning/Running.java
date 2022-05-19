package com.example.trackrunning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class Running extends AppCompatActivity {

    private static final String TAG = "Running";
    
    private Button btnMyCustomRun, btnQuickRun;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);
        
        initViews();
        // TODO: 5/18/2022 create onClickListeners 
        
    }
    
    private void initViews(){
        Log.d(TAG, "initViews: started");
        btnMyCustomRun = findViewById(R.id.btnMyCustomRun);
        btnQuickRun = findViewById(R.id.btnQuickRun);
    }
}