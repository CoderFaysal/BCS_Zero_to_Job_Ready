package com.coderfaysal.bcs_zerotojobready;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class English_Grammar_Conditional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_grammar_conditional);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("English Grammar - Conditional");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // ------------ Toolbar -------------

    }
}