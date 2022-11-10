package com.example.bbysitter;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    int arrayIndex;
    String[] names = new String[]{"Bobby", "Sally", "Sarah", "Madeline", "Heather"};
    int[] imagePaths = new int[]{R.drawable.babysitterimage0, R.drawable.babysitterimage1,
            R.drawable.babysitterimage2, R.drawable.babysitterimage3, R.drawable.babysitterimage4};
    TextView babysitterName;
    ImageView babysitterPicture;
    Button viewProfileButton;

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
        return view;
    }
}