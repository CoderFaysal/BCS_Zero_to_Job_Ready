package com.coderfaysal.bcs_zerotojobready;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class English_Grammar_Agreement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_grammar_agreement);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("English Grammar - Agreement");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // ------------ Toolbar -------------

    }
}