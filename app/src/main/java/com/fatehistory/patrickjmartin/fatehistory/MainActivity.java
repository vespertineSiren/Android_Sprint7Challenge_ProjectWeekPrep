package com.fatehistory.patrickjmartin.fatehistory;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigureSearchHelper;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.WikiDao;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    Context context;
    HistoricalFigure test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        test = WikiDao.getFateRealBio("Shuten-dōji", "Shuten_Dōji");


    }
}
