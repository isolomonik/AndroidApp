package com.isolomonik.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void lesson1(View view) {
        Intent intent = new Intent(this, Main1Activity.class);
        startActivity(intent);
    }
    public static  long factorial (int n){
        return 654;

    }
}
