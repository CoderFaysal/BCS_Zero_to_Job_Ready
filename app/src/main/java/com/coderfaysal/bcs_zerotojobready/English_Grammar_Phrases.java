package com.coderfaysal.bcs_zerotojobready;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class English_Grammar_Phrases extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_grammar_phrases);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("English Grammar - Phrases");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // ------------ Toolbar -------------


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("question", "1. To make clean breast of");
        hashMap.put("hint", "A. To gain prominence \nB. To praise oneself \nC. To confess without of reserve \nD. To destroy before it blooms \nE. None of these");
        hashMap.put("answer", "Answer: Option C");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("question", "2. To keeps one's temper");
        hashMap.put("hint", "A. To become hungry \nB. To be in good mood \nC. To preserve ones energy \nD. To be aloof from \nE. None of these");
        hashMap.put("answer", "Answer: Option B");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("question", "3. To catch a tartar");
        hashMap.put("hint", "A. To trap wanted criminal with great difficulty \nB. To catch a dangerous person \nC. To meet with disaster \nD. To deal with a person who is more than one's match \nE. None of these");
        hashMap.put("answer", "Answer: Option B");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("question", "4. To drive home");
        hashMap.put("hint", "A. To find one's roots \nB. To return to place of rest \nC. Back to original position \nD. To emphasise \nE. None of these");
        hashMap.put("answer", "Answer: Option D");
        arrayList.add(hashMap);

//        hashMap = new HashMap<>();
//        hashMap.put("question", "");
//        hashMap.put("hint", "");
//        hashMap.put("answer", "");
//        arrayList.add(hashMap);


        MainAdapter mainAdapter = new MainAdapter();
        listView.setAdapter(mainAdapter);


    }


    public class MainAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View mainView = layoutInflater.inflate(R.layout.phrases_item, parent, false);

            HashMap<String, String> hashMap = arrayList.get(position);
            String tvQuestion =  hashMap.get("question");
            String tvHint =  hashMap.get("hint");
            String tvAnswer =  hashMap.get("answer");

            TextView questionName = mainView.findViewById(R.id.questionName);
            TextView hintOptions = mainView.findViewById(R.id.hintOptions);
            TextView answerOptions = mainView.findViewById(R.id.answerOptions);

            questionName.setText(tvQuestion);
            hintOptions.setText(tvHint);
            answerOptions.setText(tvAnswer);


            return mainView;
        }
    }

}