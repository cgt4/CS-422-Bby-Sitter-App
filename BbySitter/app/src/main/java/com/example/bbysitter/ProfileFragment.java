package com.example.bbysitter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    int arrayIndex;
    TextView tv;

    public ProfileFragment() {
        // Required empty public constructor
    }

    public ProfileFragment(int arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        tv = view.findViewById(R.id.profileTextView);
        tv.setText("Profile " + arrayIndex);
        return view;
    }
}