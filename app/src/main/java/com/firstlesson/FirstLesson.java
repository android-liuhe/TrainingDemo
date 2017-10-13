package com.firstlesson;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.example.trainingdemo.R;

/**
 * Created by liuhe on 2017/10/13.
 */

public class FirstLesson extends Activity {

    public static String EXTRA_MESSAGE = "firstless";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlesson_layout);
    }

    public void sendMessage(View view){

        EditText editText = (EditText) findViewById(R.id.edit_Message);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
