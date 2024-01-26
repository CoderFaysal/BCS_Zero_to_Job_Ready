package com.coderfaysal.bcs_zerotojobready;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_text_center);



        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("t_title", "BCS Marks Distribution");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "BCS Preliminary English Syllabus");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Adjective");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Adverb");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Agreement");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Alternative");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Basic Verb");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Conditional");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Conjunction");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Compound Word");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Determiner");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Gerund");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Noun");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "English Grammar - Phrases");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("t_title", "About Developer");
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
            View mainView = layoutInflater.inflate(R.layout.main_item, parent, false);


            HashMap<String, String> hashMap = arrayList.get(position);
            String tvTitle =  hashMap.get("t_title");


            TextView titleText = mainView.findViewById(R.id.title_main);
            titleText.setText(tvTitle);

            CardView main_items = mainView.findViewById(R.id.main_items);

            main_items.setOnClickListener(v->{
                assert tvTitle != null;
                if (tvTitle.contains("BCS Marks Distribution")){
                    startActivity(new Intent(MainActivity.this, BCSMarksDistribution.class));
                } else if (tvTitle.contains("BCS Preliminary English Syllabus")){
                    startActivity(new Intent(MainActivity.this, BCS_Preliminary_English_Syllabus.class));
                } else if (tvTitle.contains("English Grammar - Adjective")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Adjective.class));
                } else if (tvTitle.contains("English Grammar - Adverb")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Adverb.class));
                } else if (tvTitle.contains("About Developer")){
                    startActivity(new Intent(MainActivity.this, About_Developer.class));
                } else if (tvTitle.contains("English Grammar - Agreement")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Agreement.class));
                } else if (tvTitle.contains("English Grammar - Alternative")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Alternative.class));
                } else if (tvTitle.contains("English Grammar - Basic Verb")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Basic_Verb.class));
                } else if (tvTitle.contains("English Grammar - Conditional")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Conditional.class));
                } else if (tvTitle.contains("English Grammar - Conjunction")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Conjunction.class));
                } else if (tvTitle.contains("English Grammar - Compound Word")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Compound_Word.class));
                } else if (tvTitle.contains("English Grammar - Determiner")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Determiner.class));
                } else if (tvTitle.contains("English Grammar - Gerund")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Gerund.class));
                } else if (tvTitle.contains("English Grammar - Noun")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Noun.class));
                } else if (tvTitle.contains("English Grammar - Phrases")){
                    startActivity(new Intent(MainActivity.this, English_Grammar_Phrases.class));
                }





            });


            return mainView;
        }
    }

}