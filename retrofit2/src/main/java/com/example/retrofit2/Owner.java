package com.example.retrofit2;

import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("avatar_url")
    private String avatarUrl;

    public String getAvatarUrl() {
        return avatarUrl;
    }
}
