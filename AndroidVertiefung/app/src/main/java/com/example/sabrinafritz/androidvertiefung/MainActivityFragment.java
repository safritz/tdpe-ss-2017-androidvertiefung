package com.example.sabrinafritz.androidvertiefung;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sabrinafritz on 14.03.17.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    /**
     * load the fragment layout.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;

    }
}
