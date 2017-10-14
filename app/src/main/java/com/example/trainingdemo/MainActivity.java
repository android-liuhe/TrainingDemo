package com.example.trainingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firstlesson.FirstLesson;
import com.secondlesson.SecondLesson;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button first_btn, second_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        first_btn = (Button) findViewById(R.id.first_lesson);
        second_btn = (Button) findViewById(R.id.second_lesson);
        first_btn.setOnClickListener(this);
        second_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.first_lesson:
                Intent intent1 = new Intent(this, FirstLesson.class);
                startActivity(intent1);
                break;
            case R.id.second_lesson:
                Intent intent2 = new Intent(this, SecondLesson.class);
                startActivity(intent2);
                break;
        }
    }
}
