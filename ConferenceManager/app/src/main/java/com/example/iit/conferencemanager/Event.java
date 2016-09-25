package com.example.iit.conferencemanager;

import java.util.Calendar;


public class Event{

    private Calendar start= Calendar.getInstance();
    private Calendar end = Calendar.getInstance();
    private String title, status="inactive", link, description, hostID, eventID;

    public Event(String tt, String d, int sY, int sM, int sD, int eY, int eM, int eD, double p, String l, String hID, String eID){
        title = tt;
        description = d;
        start.set(sY, sM, sD);
        end.set(eY, eM, eD);
        link=l;
        hostID=hID;
        eventID=eID;
    }

    public String toString(){
        return ""+title+"\n"+description+"\n"+link+"\n";

    }

    //Takes the difference in Milliseconds(start-current)
    public void beginListing(Calendar cal) {
        if(cal.compareTo(start)>0){
            status="active";
        }else{
            status="inactive";
        }
    }

    //Takes the difference in Milliseconds(current-end)
    public void endListing(Calendar cal) {
        if(end.compareTo(cal)<0){
            status="inactive";
        }else{
            status="active";
        }
    }

    public Calendar getStart(){
        return this.start;
    }

    public String getStatus(){
        return this.status;
    }

    public String getHostID(){
        return this.hostID;
    }

    public String getEventID(){
        return this.eventID;
    }

}
