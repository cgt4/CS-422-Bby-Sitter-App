package com.example.bbysitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;

public class Reviews extends AppCompatActivity {

    Button nextPage;
    RatingBar rating, rating2, rating3;
    ImageView img1, img2, img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        rating = (RatingBar) findViewById(R.id.ratingBar);
        rating2 = (RatingBar) findViewById(R.id.ratingBar2);
        rating3 = (RatingBar) findViewById(R.id.ratingBar3);

        rating.setRating(5f);
        rating2.setRating(5f);
        rating3.setRating(5f);

        img1 = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView19);
        img3 = (ImageView) findViewById(R.id.imageView20);

        img1.setImageResource(R.drawable.review1);
        img3.setImageResource(R.drawable.review2);
        img2.setImageResource(R.drawable.review3);


        nextPage = findViewById(R.id.reviewsNextPageButton);
        nextPage.setOnClickListener((View v) ->
                startActivity(new Intent(this, Chat.class))
        );
    }
}