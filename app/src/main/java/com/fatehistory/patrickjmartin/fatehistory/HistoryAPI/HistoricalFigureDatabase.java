package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {HistoricalFigure.class}, version= 1)
public abstract class HistoricalFigureDatabase extends RoomDatabase {

    public abstract HistoricalFigureDAO getHistoricalFigureDAO();

    private static HistoricalFigureDatabase historicalFigureDB;

    public static HistoricalFigureDatabase getInstance(Context context) {
        if(historicalFigureDB == null) {
            historicalFigureDB = buildDatabaseInstance(context);
        }

        return historicalFigureDB;
    }

    private static HistoricalFigureDatabase buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context,
                HistoricalFigureDatabase.class,
                "historicalfiguredb.db").build();
    }

    public void cleanUp(){
        historicalFigureDB = null;
    }

}
