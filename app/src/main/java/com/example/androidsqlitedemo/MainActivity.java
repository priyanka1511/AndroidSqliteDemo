package com.example.androidsqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidsqlitedemo.views.AddStudentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onClick(View view){
        int id = view.getId();
        Intent intent = null;
        switch (id){
            case R.id.btn: intent = new Intent(MainActivity.this, AddStudentActivity.class);break;
            case R.id.btn1: intent = new Intent(MainActivity.this,AddStudentActivity.class);break;
            case R.id.btn2: intent = new Intent(MainActivity.this,AddStudentActivity.class);break;
            case R.id.btn3: intent = new Intent(MainActivity.this,AddStudentActivity.class);break;
            case R.id.btn4: intent = new Intent(MainActivity.this,AddStudentActivity.class);break;
        }
        if(intent!=null)
            startActivity(intent);
    }

}
