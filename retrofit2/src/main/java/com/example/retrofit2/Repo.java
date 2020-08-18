package com.example.retrofit2;

import com.google.gson.annotations.SerializedName;

public class Repo {

    private String name;
    private Owner owner;

    @SerializedName("html_url")
    private String link;

    public Repo(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }
}
