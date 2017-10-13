package com.firstlesson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.trainingdemo.R;

/**
 * Created by liuhe on 2017/10/13.
 */

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(FirstLesson.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.activity_display_message);
        viewGroup.addView(textView);
    }
}
