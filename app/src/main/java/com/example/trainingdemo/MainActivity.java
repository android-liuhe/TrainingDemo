package com.example.trainingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firstlesson.FirstLesson;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button first_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        first_btn = (Button) findViewById(R.id.first_lesson);
        first_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.first_lesson:
                Intent intent = new Intent(this, FirstLesson.class);
                startActivity(intent);
                break;
        }
    }
}
