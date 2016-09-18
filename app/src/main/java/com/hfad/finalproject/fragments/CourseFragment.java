package com.hfad.finalproject.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.finalproject.R;

/**
 * Created by user on 9/18/2016.
 */
public class CourseFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //

        View view = inflater.inflate(R.layout.fragment_course, container, false);
        return view;
    }
}
