package com.example.bbysitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReviewsDescriptionCredentials extends AppCompatActivity {

    Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews_description_credentials);

        nextPage = findViewById(R.id.reviewsDescriptionCredentialsNextPageButton);
        nextPage.setOnClickListener((View v) ->
                startActivity(new Intent(this, Reviews.class))
        );
    }
}