package com.thirdlesson;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.EditText;

import com.example.trainingdemo.R;

/**
 * Created by liuhe on 2017/10/29.
 */

/**
 * 已经在manifests中设置了旋转不进行重建了
 */

public class ThirdLesson extends Activity{

    private EditText editText;
    private String EXTRS_TEXT;
    private static final String TAG = "ThirdLesson";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdlesson_layout);
        Log.d(TAG, "onCreate()");

        if (savedInstanceState != null){
            String test = savedInstanceState.getString(EXTRS_TEXT);
            Log.d(TAG, "onCreate()----->>---:" + test);
        }
        editText = (EditText) findViewById(R.id.edit);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState()");
        outState.putString(EXTRS_TEXT, "test");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String test = savedInstanceState.getString(EXTRS_TEXT);
        Log.d(TAG, "onRestoreInstanceState()----->>---:" + test);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }
}
