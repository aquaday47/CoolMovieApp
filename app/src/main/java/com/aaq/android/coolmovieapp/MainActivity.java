package com.aaq.android.coolmovieapp;

import android.content.res.TypedArray;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aaq.android.coolmovieapp.Views.MovieView;
import com.aaq.android.coolmovieapp.model.MyMovie;

import java.util.ArrayList;

// TODO (upgrade) convert to fragment?
public class MainActivity extends AppCompatActivity {

    //TODO(U) make custom collection type
    private ArrayList<MyMovie> mMovieList;
    private MovieView mMainMovieView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        //TODO ( strings.xml ) define strings values for MovListKey in strings.xml USE here:
        //outState.putParcelableArrayList("key", mMovieList);
        super.onSaveInstanceState(outState, outPersistentState);
    }
}
