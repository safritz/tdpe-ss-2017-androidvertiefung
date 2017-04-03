package com.example.sabrinafritz.androidvertiefung;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sabrinafritz on 14.03.17.
 */

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
    }

    /**
     * load the activity layout.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
