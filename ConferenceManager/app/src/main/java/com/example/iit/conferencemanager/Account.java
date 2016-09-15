package com.example.iit.conferencemanager;

import java.io.Serializable;
import java.util.Calendar;

public class Account implements Serializable{

    private String user, pass, fName, lName, email, phone, address;
    private static int accountCount=0;
    private int ID;
    private Calendar accountOpening = Calendar.getInstance();

    public Account(String u, String p, String fn, String ln, String e, String ph, String a, int id) {
        user = u;
        pass = p;
        fName = fn;
        lName = ln;
        email = e;
        phone = ph;
        address = a;
        ID=id;
    }

    public void setFName(String fN){
        this.fName = fN;
    }

    public void setLName(String lN){
        this.lName = lN;
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

    public String getFName(){
        return fName;
    }

    public String getLName(){
        return lName;
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
        return fName + " " + lName + "\n" + email +" "+ phone + "\n" + address + "\n" +ID;
    }

}
