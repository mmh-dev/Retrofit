package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;
    private int id;

    @SerializedName("title")
    private String postTitle;

    @SerializedName("body")
    private String postBody;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getPostBody() {
        return postBody;
    }
}
