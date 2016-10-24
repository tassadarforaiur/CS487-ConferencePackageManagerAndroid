package com.example.iit.conferencemanager;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONConverter {

    public static String toJSON(Account a){

        try {
            JSONObject accObj = new JSONObject();
            accObj.put("user", a.getUser());
            accObj.put("user", a.getPass());
            accObj.put("email", a.getEmail());
            accObj.put("name", a.getName());
            accObj.put("phone", a.getPhone());
            accObj.put("address", a.getAddress());

            return accObj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String toJSON(Event ev){


        try {
            JSONObject accObj = new JSONObject();
            accObj.put("title", ev.getTitle());
            accObj.put("description", ev.getDescription());
            accObj.put("start", ev.getStart().toString());
            accObj.put("end", ev.getEnd()).toString();
            accObj.put("location", ev.getLocation());

            return accObj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }
}
