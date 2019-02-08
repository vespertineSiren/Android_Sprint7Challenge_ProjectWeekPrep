package com.fatehistory.patrickjmartin.fatehistory;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigureSearchHelper;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.WikiDao;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private Context context;
    private Activity activity;
    private HistoricalFigure test;
    private String[] testAray;
    private String wiki, fate, fateImage;
    private HistoricalFigureSearchHelper search;
    private ListView searchResultsLV;
    private SearchView searchBar;
    private HistoricalFigureSearchAdapter searchAdapter;
    private FragmentPagerAdapter adapter;

    private ArrayList<String> searchArrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        activity = this;
        search = HistoricalFigureSearchHelper.getINSTANCE();
        ViewPager viewPager = findViewById(R.id.news_pager_strip);

        adapter = new ViewPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


        searchResultsLV = findViewById(R.id.search_list_view);
        searchBar = findViewById(R.id.search_bar_edittext);

        searchArrayList.addAll(search.keys);
        searchAdapter = new HistoricalFigureSearchAdapter(context, activity, searchArrayList);
        searchResultsLV.setAdapter(searchAdapter);


        searchBar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //searchAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchAdapter.getFilter().filter(newText);
                return false;
            }
        });

        searchResultsLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String chosenHF =  ((TextView)view.findViewById(R.id.hfName)).getText().toString();
                String[] chosenHFAry = search.PEOPLE_MAP.get(chosenHF);

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final HistoricalFigure chosenHFObj = WikiDao.getFateRealBio
                                (chosenHFAry[0],chosenHFAry[1], chosenHFAry[2]);

                        Intent detailsIntent = new Intent(context, HistoricalFiguresDetails.class);
                        detailsIntent.putExtra("hfDeets", chosenHFObj);
                        startActivity(detailsIntent);
                    }
                }).start();
            }
        });





    }


    @Override
    protected void onResume() {
        super.onResume();

    }


}
