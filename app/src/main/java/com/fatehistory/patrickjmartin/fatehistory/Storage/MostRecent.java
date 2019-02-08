package com.fatehistory.patrickjmartin.fatehistory.Storage;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;
import com.fatehistory.patrickjmartin.fatehistory.PastViewedFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class MostRecent {
    private static volatile MostRecent INSTANCE;
    private int maxSize; //5
    private ArrayList<HistoricalFigure> storage;
    private int top; //0

    private MostRecent(){
        if(INSTANCE != null) {
            throw new RuntimeException("Use getINSTANCE()");
        } else {
            storage = new ArrayList<HistoricalFigure>();
            maxSize = 5;
            top = 0;
        }
    }

    public static MostRecent getINSTANCE(){
        if(INSTANCE == null) {
            synchronized (MostRecent.class) {
                if(INSTANCE == null) {
                    INSTANCE = new MostRecent();
                }
            }
        }
        return INSTANCE;
    }

    public int size() {return top;}

    public void addHF(HistoricalFigure toAdd) {
        if(top == 5) {
            storage.remove(4);
            storage.add(0, toAdd);
        } else {
            storage.add(0, toAdd);
            top++;
        }
    }

    public void clearStorage(){
        storage.clear();
    }

    public ArrayList<HistoricalFigure> retrieveStorage(){
        return  storage;
    }

}
