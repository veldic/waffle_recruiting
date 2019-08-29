package com.example.wafflestrecruting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToFirst(View view){
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void moveToSecond(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void moveToThird(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
