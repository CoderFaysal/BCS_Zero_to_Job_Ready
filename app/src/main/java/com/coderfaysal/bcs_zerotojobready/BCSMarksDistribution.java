package com.coderfaysal.bcs_zerotojobready;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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

public class BCSMarksDistribution extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bcs_marks_distribution);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("BCS Marks Distribution");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // ------------ Toolbar -------------


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("serial", "01");
        hashMap.put("subject", "Bangla Language & Literature");
        hashMap.put("marks", "35");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "02");
        hashMap.put("subject", "English Language & Literature");
        hashMap.put("marks", "35");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "03");
        hashMap.put("subject", "Bangladesh Affairs");
        hashMap.put("marks", "30");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "04");
        hashMap.put("subject", "International Affairs");
        hashMap.put("marks", "20");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "05");
        hashMap.put("subject", "Math");
        hashMap.put("marks", "15");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "06");
        hashMap.put("subject", "Mental Ability");
        hashMap.put("marks", "15");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "07");
        hashMap.put("subject", "General Science");
        hashMap.put("marks", "15");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "08");
        hashMap.put("subject", "Computer Technology");
        hashMap.put("marks", "15");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "09");
        hashMap.put("subject", "Geography, environment & Disaster Management");
        hashMap.put("marks", "10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "10");
        hashMap.put("subject", "Ethics, Values & Good Governance");
        hashMap.put("marks", "10");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("serial", "#");
        hashMap.put("subject", "TOTAL");
        hashMap.put("marks", "200");
        arrayList.add(hashMap);



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
            View mainView = layoutInflater.inflate(R.layout.marks_item, parent, false);

            HashMap<String, String> hashMap = arrayList.get(position);
            String tvSerial =  hashMap.get("serial");
            String tvSubject =  hashMap.get("subject");
            String tvMarks =  hashMap.get("marks");

            TextView serialNumber = mainView.findViewById(R.id.serialNumber);
            TextView subjectName = mainView.findViewById(R.id.subjectName);
            TextView totalMarks = mainView.findViewById(R.id.totalMarks);

            serialNumber.setText(tvSerial);
            subjectName.setText(tvSubject);
            totalMarks.setText(tvMarks);


            return mainView;
        }
    }

}