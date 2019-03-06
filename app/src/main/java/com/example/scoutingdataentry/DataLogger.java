package com.example.scoutingdataentry;

import java.util.HashMap;

public class DataLogger {

    private HashMap<Integer, Storage> globalStoage;

    public DataLogger() {
        globalStoage = new HashMap<Integer, Storage>();
    }

    public HashMap<Integer, Storage> getData() {
        return globalStoage;
    }

    public void addData(int team, Storage dataToAdd) {
        getData().put(team, dataToAdd);
    }

    public Storage getData(int team) {
        return getData().get(team);
    }

}
