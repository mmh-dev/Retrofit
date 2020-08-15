package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {

    // List<Post>
    // Call <List <Post>>
    @GET("posts")
    Call<List<Post>> getPosts();
}
