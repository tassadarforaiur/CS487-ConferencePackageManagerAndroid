package com.example.iit.conferencemanager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Account implements Serializable{

    private String user, pass, name, email, phone, address;
    private int ID;
    private Calendar accountOpening = Calendar.getInstance();
    private ArrayList<Event> eventList = new ArrayList<>();

    public Account(String u, String p, String n, String e, String ph, String a, int id) {
        user = u;
        pass = p;
        name = n;
        email = e;
        phone = ph;
        address = a;
        ID=id;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setEmail(String e){
        this.email = e;
    }

    public void setPhone(String ph){
        this.phone = ph;
    }

    public void setAddress(String a){
        this.address = a;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getAddress(){
        return this.address;
    }

    public int getID(){
        return ID;
    }

    public Calendar getAccountOpening(){
        return accountOpening;
    }

    public String toString() {
        return name + "\n" + email +" "+ phone + "\n" + address + "\n" +ID;
    }

}
