package com.fatehistory.patrickjmartin.fatehistory;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigureSearchHelper;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.WikiDao;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private Activity activity;
    private HistoricalFigure test;
    private String[] testAray;
    private String wiki, fate, fateImage;
    private HistoricalFigureSearchHelper search;
    private ListView searchResultsLV;
    private EditText searchBar;
    private HistoricalFigureSearchAdapter searchAdapter;

    private ArrayList<String> searchArrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        activity = this;
        search = HistoricalFigureSearchHelper.getINSTANCE();


        searchResultsLV = findViewById(R.id.search_list_view);
        searchBar = findViewById(R.id.search_bar_edittext);

        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                searchAdapter.getFilter().filter(s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        testAray = search.PEOPLE_MAP.get("minamoto no raikou");

        wiki = testAray[0];
        fate = testAray[1];
        fateImage = testAray[2];




//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                final HistoricalFigure testHF = test = WikiDao.getFateRealBio(wiki, fate, fateImage);
//            }
//        }).start();





    }

    @Override
    protected void onResume() {
        super.onResume();

        searchArrayList.addAll(search.keys);
        searchAdapter = new HistoricalFigureSearchAdapter(context, activity, searchArrayList);
        searchResultsLV.setAdapter(searchAdapter);

    }
}
