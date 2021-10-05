package com.example.retrofitandroid_path_query_querymap_url;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface Api {

    @GET("posts")
    Call<List<Post>>getPost(
            @Query("userId")Integer[] userId,
            @Query("_sort")String sort,
            @Query("_order")String order

    );

    @GET("posts")
    Call<List<Post>>getPost(
            @QueryMap Map<String,String> parameters

    );



    @GET("posts/{id}/comments")
    Call<List<Comment>>getComment(@Path("id") int postId);

    @GET
    Call<List<Comment>>getComment(@Url String url);
}
