package com.syl.zhihu.imitate_zhihudaily.test;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by syl on 2017/5/30.
 */

public interface GitHubService {
    //   @POST("query?")
//    Call<PostQueryInfo> search(@Query("type") String type,@Query("postid") String postid);
    @POST("query")
    Observable<PostQueryInfo> searchRx(@Query("type") String type, @Query("postid") String postid);

}
