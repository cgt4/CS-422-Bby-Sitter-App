package com.example.bbysitter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.time.LocalDate;

public class ProfileMatches extends AppCompatActivity {

    ViewPager2 profileViewPager;
    ProfilePagerAdapter ppa;
    ImageButton leftArrowButton;
    ImageButton rightArrowButton;
    static int lastScrolledToProfile = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_matches);
        getSupportActionBar().setHomeButtonEnabled(true);

        profileViewPager = findViewById(R.id.viewPager);
        ppa = new ProfilePagerAdapter(this);
        profileViewPager.setAdapter(ppa);
        profileViewPager.setCurrentItem(lastScrolledToProfile, false);

        leftArrowButton = findViewById(R.id.previousProfileImageButton);
        rightArrowButton = findViewById(R.id.nextProfileImageButton);
        leftArrowButton.setOnClickListener((View v) ->
                profileViewPager.setCurrentItem(profileViewPager.getCurrentItem()-1)
        );
        rightArrowButton.setOnClickListener((View v) ->
                profileViewPager.setCurrentItem(profileViewPager.getCurrentItem()+1)
        );
        //This disables left arrow on first profile and right arrow on last profile
        profileViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if(position == 0)
                    leftArrowButton.setVisibility(View.INVISIBLE);
                else
                    leftArrowButton.setVisibility(View.VISIBLE);
                if(position == 4)
                    rightArrowButton.setVisibility(View.INVISIBLE);
                else
                    rightArrowButton.setVisibility(View.VISIBLE);
                Log.i("viewpager position: ", position + "");
                lastScrolledToProfile = position;
            }
        });
    }

    //Added this so backing out restarts the profile selection from position 0.
    @Override
    public void onBackPressed()
    {
        lastScrolledToProfile = 0;
        super.onBackPressed();
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                lastScrolledToProfile = 0;
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
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