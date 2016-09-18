package com.hfad.finalproject.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hfad.finalproject.appllication.MyApplication;

/**
 * Created by user on 9/18/2016.
 */
public class BaseActivtity extends AppCompatActivity{
    MyApplication myApplication;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myApplication= (MyApplication) getApplication();
    }
}
