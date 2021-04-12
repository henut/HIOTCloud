package com.huatec.hiot_cloud.test.lifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.huatec.hiot_cloud.R;
import com.huatec.hiot_cloud.test.mvptest.TestMVPActivity;

public class TestLifeCycleActivity extends AppCompatActivity {

    private static final String TAG = "TestLifeCycleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_life_cycle);
        Button btnStartNew = findViewById(R.id.btn_start_new);
        Button btnStartFinish = findViewById(R.id.btn_start_finish);

        btnStartNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestLifeCycleActivity.this, TestMVPActivity.class);
                startActivity(intent);
            }
        });
        btnStartFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}
