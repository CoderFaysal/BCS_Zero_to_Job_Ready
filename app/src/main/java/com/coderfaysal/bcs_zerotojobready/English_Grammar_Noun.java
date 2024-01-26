package com.coderfaysal.bcs_zerotojobready;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class English_Grammar_Noun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_grammar_noun);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("English Grammar - Noun");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // ------------ Toolbar -------------

    }
}