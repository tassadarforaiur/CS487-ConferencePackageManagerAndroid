package com.example.iit.conferencemanager;

import java.util.ArrayList;

public class Search {

    private String key;

    public Search(String k){
        key=k;
    }

    public ArrayList<Event> searchID(ArrayList<Event> e, String keyID){
        ArrayList<Event> eventResults=new ArrayList<>();

        for(int i=0; i<e.size();i++){
            if(e.get(i).getEventID().equals(keyID)){
                eventResults.add(e.get(i));
            }
        }
        return eventResults;
    }
}
