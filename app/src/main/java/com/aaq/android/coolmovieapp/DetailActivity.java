package com.aaq.android.coolmovieapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.aaq.android.coolmovieapp.databinding.DetailActivityBinding;
import com.aaq.android.coolmovieapp.model.MyMovie;

public class DetailActivity extends AppCompatActivity{
    private MyMovie mMovie;
    DetailActivityBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.detail_activity);

        Intent intent = getIntent();
        if (intent == null) {
            closeOnError();
        }
    }

    private void closeOnError() {
        finish();
        Toast.makeText(this, R.string.detail_error_message, Toast.LENGTH_SHORT).show();
    }

    private void populateUI(MyMovie movie){

    }
}
