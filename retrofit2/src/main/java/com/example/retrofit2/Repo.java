package com.example.retrofit2;

import com.google.gson.annotations.SerializedName;

public class Repo {

    private String name;

    @SerializedName("html_url")
    private String link;

    public Repo(String name, String link) {
        this.name = name;
        this.link = link;
    }


    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }
}
