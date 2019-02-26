package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface HistoricalFigureDAO {


    @Query("SELECT * FROM historicalfigure")
    public List<HistoricalFigure> getAllHistoricalFigures();

    @Insert
    void insertHistoricalFigure(HistoricalFigure historicalFigure);

    @Update
    void updateHistoricalFigure(HistoricalFigure historicalFigure);

    //Delete single object
    @Delete
    void deletesingleHistoricalFigure(HistoricalFigure historicalFigure);


    //List of Objects to delete
    @Delete
    void deleteListofHistoricalFigure(HistoricalFigure... historicalFigure);



}
