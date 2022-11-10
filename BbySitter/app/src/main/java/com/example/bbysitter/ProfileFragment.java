package com.example.bbysitter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    int arrayIndex;
    String[] names = new String[]{"Bobby Smith", "Sally Johnson", "Sarah Williams",
            "Madeline Brown", "Heather Jones"};
    int[] imagePaths = new int[]{R.drawable.babysitterimage0, R.drawable.babysitterimage1,
            R.drawable.babysitterimage2, R.drawable.babysitterimage3, R.drawable.babysitterimage4};
    float[] ratings = new float[]{4.8f,4.2f,3.9f,3.5f,3.0f};
    boolean[][] certifications = new boolean[][]{{true, true, true, true},
        {false, true, true, true},
        {false, false, true, true},
        {false, false, false, true},
        {false, false, false, false}};
    TextView babysitterName;
    ImageView babysitterPicture;
    Button viewProfileButton;
    RatingBar rating;
    Button fiveYearsButton;
    Button cprButton;
    Button bsButton;
    Button carButton;
    Button messageButton;

    public ProfileFragment() {
        // Required empty public constructor
    }

    public ProfileFragment(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        babysitterName = view.findViewById(R.id.babysitterNameTextView);
        babysitterName.setText(names[arrayIndex]);
        babysitterPicture = view.findViewById(R.id.babysitterImageView);
        babysitterPicture.setImageResource(imagePaths[arrayIndex]);
        viewProfileButton = view.findViewById(R.id.viewProfileButton);
        //I don't know where this button is supposed to lead to
        viewProfileButton.setOnClickListener((View v) ->
                startActivity(new Intent(this.getContext(), ReviewsDescriptionCredentials.class))
        );
        rating = view.findViewById(R.id.babysitterRatingBar);
        rating.setRating(ratings[arrayIndex]);
        bsButton = view.findViewById(R.id.buttonBS);
        cprButton = view.findViewById(R.id.buttonCPR);
        carButton = view.findViewById(R.id.buttonCAR);
        fiveYearsButton = view.findViewById(R.id.button5Y);
        for(int j = 0; j < 4; j++) {
            if (certifications[arrayIndex][0] == false)
                bsButton.setBackgroundColor(Color.GRAY);
            if (certifications[arrayIndex][1] == false)
                cprButton.setBackgroundColor(Color.GRAY);
            if (certifications[arrayIndex][2] == false)
                carButton.setBackgroundColor(Color.GRAY);
            if (certifications[arrayIndex][3] == false)
                fiveYearsButton.setBackgroundColor(Color.GRAY);
        }
        messageButton = view.findViewById(R.id.messageButton);
        messageButton.setOnClickListener(v -> {
            startActivity(new Intent(this.getContext(), Chat.class));
        });

        return view;
    }
}