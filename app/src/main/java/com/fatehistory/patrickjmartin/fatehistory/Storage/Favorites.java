package com.fatehistory.patrickjmartin.fatehistory.Storage;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;

import java.util.ArrayList;

public class Favorites {
    private static volatile Favorites INSTANCE;
    private ArrayList<HistoricalFigure> storage;


    private Favorites(){
        if(INSTANCE != null) {
            throw new RuntimeException("Use getINSTANCE()");
        } else {
            storage = new ArrayList<HistoricalFigure>();
        }
    }

    public static Favorites getINSTANCE(){
        if(INSTANCE == null) {
            synchronized (Favorites.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Favorites();
                }
            }
        }
        return INSTANCE;
    }

    public int size() {return storage.size();}

    public void addHF(HistoricalFigure toAdd) {
        int id = toAdd.getHfID();
        Boolean addFavorte = true;

        for(HistoricalFigure n : storage) {
            if(n.getHfID() == id) {
                addFavorte = false;
            }
        }

        if(addFavorte) {
            storage.add(toAdd);
        }
    }

    public void clearStorage(){
        storage.clear();
    }

    public ArrayList<HistoricalFigure> retrieveStorage(){
        return  storage;
    }

}
