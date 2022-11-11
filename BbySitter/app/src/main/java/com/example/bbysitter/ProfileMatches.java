package com.example.bbysitter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.time.LocalDate;

public class ProfileMatches extends AppCompatActivity {

    ViewPager2 profileViewPager;
    ProfilePagerAdapter ppa;
    ImageButton leftArrowButton;
    ImageButton rightArrowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_matches);
        getSupportActionBar().setHomeButtonEnabled(true);

        profileViewPager = findViewById(R.id.viewPager);
        ppa = new ProfilePagerAdapter(this);
        profileViewPager.setAdapter(ppa);

        leftArrowButton = findViewById(R.id.previousProfileImageButton);
        rightArrowButton = findViewById(R.id.nextProfileImageButton);
        leftArrowButton.setOnClickListener((View v) ->
                profileViewPager.setCurrentItem(profileViewPager.getCurrentItem()-1)
        );
        rightArrowButton.setOnClickListener((View v) ->
                profileViewPager.setCurrentItem(profileViewPager.getCurrentItem()+1)
        );

    }

    private class ProfilePagerAdapter extends FragmentStateAdapter {
        public ProfilePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull @Override
        public Fragment createFragment(int position) {
            return new ProfileFragment(position);
        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }
}