package com.example.bbysitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setHomeButtonEnabled(true);
        setContentView(R.layout.activity_chat);
    }
}