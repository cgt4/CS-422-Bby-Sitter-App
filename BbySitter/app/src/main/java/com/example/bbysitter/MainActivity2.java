package com.example.bbysitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button questionaire;
    Button connectNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        questionaire = findViewById(R.id.button99);
        questionaire.setOnClickListener((View v) ->
                startActivity(new Intent(this, MainActivity.class))
        );

        connectNow = findViewById(R.id.button222);
        connectNow.setOnClickListener((View v) ->
                startActivity(new Intent(this, ProfileMatches.class))
        );
    }
}