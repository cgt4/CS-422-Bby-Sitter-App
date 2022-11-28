package com.example.bbysitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class ReviewsDescriptionCredentials extends AppCompatActivity {

    Button nextPage;
    RatingBar rating;
    Button fiveYearsButton;
    Button cprButton;
    Button bsButton;
    Button carButton;
    Button messageButton;

    String[] names = new String[]{"Bobby Smith", "Sally Johnson", "Sarah Williams",
            "Madeline Brown", "Heather Jones"};
    int arrayIndex;

    int[] imagePaths = new int[]{R.drawable.babysitterimage0, R.drawable.babysitterimage1,
            R.drawable.babysitterimage2, R.drawable.babysitterimage3, R.drawable.babysitterimage4};
    float[] ratings = new float[]{4.8f,4.2f,3.9f,3.5f,3.0f};
    boolean[][] certifications = new boolean[][]{{true, true, true, true},
            {false, true, true, true},
            {false, false, true, true},
            {false, false, false, true},
            {false, false, false, false}};

    String[] bios = new String[]{"Hi! My name is Bobby and I've been a certified babysitter for more than 5 years. I enjoy being around children an am really flexible. My hobbies include sports, reading, and cooking.",
    "Hi, I'm Sally! I am CPR certified and have excellent experiences with children. I am reliable and love being around children. While I don't have any of my own, I want to help raise future leaders",
            "Hi! Welcome to my bby-sitter profile. Please feel free to reach out to me if you have an inquiries about my skills or schedule. I'd be happy to meet your child and see where we can go together on this journey.",
            "My name is Madeline and I am new to the babysitting field. I have experience with taking care of my younger family members, but now since they have moved away I miss being around younger children. Happy to help in any way I can!",
            "Hi - I'm Heather! I'm available to babysit children during weekdays and am looking for more than $15/hr pay."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews_description_credentials);
        getSupportActionBar().setHomeButtonEnabled(true);

        rating = (RatingBar) findViewById(R.id.babysitterRatingBar);
        rating.setRating(4.8f);

        nextPage = findViewById(R.id.reviewsDescriptionCredentialsNextPageButton);
        nextPage.setOnClickListener((View v) ->
                startActivity(new Intent(this, Reviews.class))
        );

//        setContentView(R.layout.activity_reviews_description_credentials);


    }
}