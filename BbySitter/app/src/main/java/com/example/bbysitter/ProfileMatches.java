package com.example.bbysitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileMatches extends AppCompatActivity {

    Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_matches);

        nextPage = findViewById(R.id.profileMatchesNextPageButton);
        nextPage.setOnClickListener((View v) ->
                startActivity(new Intent(this, ReviewsDescriptionCredentials.class))
        );
    }
}