package com.example.android.p2q5;

/**
 * Created by USER on 12/6/2017.
 */

public class SalesAgent {

    private String name, website, phone;

    public SalesAgent(String name, String website, String phone){
        this.name = name;
        this.website = website;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public String getWebsite(){
        return website;
    }

    public String getPhone(){
        return phone;
    }
}
