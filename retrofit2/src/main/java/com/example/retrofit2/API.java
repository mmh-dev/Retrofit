package com.example.retrofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {

    @GET("{username}/repos")
    Call<List<Repo>> getRepos(@Path("username") String name);
}
