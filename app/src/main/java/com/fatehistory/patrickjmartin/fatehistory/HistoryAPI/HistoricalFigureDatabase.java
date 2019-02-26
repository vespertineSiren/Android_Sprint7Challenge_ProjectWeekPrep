package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {HistoricalFigure.class}, version= 1)
public abstract class HistoricalFigureDatabase extends RoomDatabase {
}
