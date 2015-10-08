package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Oda114 on 6.10.2015.
 */
public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.err.println("Error1!!!!!!!!!");
    }
}