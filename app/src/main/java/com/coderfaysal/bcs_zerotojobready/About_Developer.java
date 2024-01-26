package com.coderfaysal.bcs_zerotojobready;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class About_Developer extends AppCompatActivity {

    TextView powerBY;
    LinearLayout share, rating, moreApp, facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_developer);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About Developer");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // ------------ Toolbar -------------



        facebook = findViewById(R.id.facebook);
        powerBY = findViewById(R.id.powerBY);

        share = findViewById(R.id.share);
        rating = findViewById(R.id.rating);
        moreApp = findViewById(R.id.moreApp);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/coderfaysal")));
            }
        });

        powerBY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=5338546810958790262")));
            }
        });

        share.setOnClickListener(v->{
            try {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "share app");
                String shareMassage = "https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID;
                intent.putExtra(Intent.EXTRA_TEXT, shareMassage);
                startActivity(Intent.createChooser(intent, "Share by"));
            } catch (Exception e) {
                Toast.makeText(About_Developer.this, "Error occurred", Toast.LENGTH_SHORT).show();
            }
        });

        rating.setOnClickListener(v->{
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id="+BuildConfig.APPLICATION_ID)));
        });

        moreApp.setOnClickListener(v->{
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com")));
        });




    }
}