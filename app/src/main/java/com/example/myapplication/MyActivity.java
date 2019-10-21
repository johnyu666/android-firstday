package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyActivity
        extends AppCompatActivity
        implements View.OnClickListener {
    private String TAG="MyActivity";
    private Button loginBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
        loginBtn=findViewById(R.id.login);
        loginBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int m=0;
        m++;
        ++m;

        Log.i(TAG,"中国人碟胡"+m);
    }
}
