package com.secondlesson;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.trainingdemo.R;

/**
 * Created by liuhe on 2017/10/14.
 */

public class SecondLesson extends Activity{

    private static final String TAG = "SecondLesson";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlesson_layout);

        //获取资源文件字符串方法
        String text = getResources().getString(R.string.hello_world);
        Log.d(TAG, text);
    }
}
