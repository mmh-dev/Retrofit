package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolderAPI {

    // List<Post>
    // Call <List <Post>>

    // posts?userId=1
    @GET("posts/")
    Call<List<Post>> getPosts(
            @Query("userId") Integer[] id,  // Используем Integer вместо int чтобы можно было писать null
            @Query("_sort") String sortId,
            @Query("_order") String order);
}
