package com.syl.zhihu.imitate_zhihudaily.api;


import com.syl.zhihu.imitate_zhihudaily.entity.BeforeStories;
import com.syl.zhihu.imitate_zhihudaily.entity.LatestStories;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by syl on 2017/5/29.
 */

public interface CommonApi {
    @GET("news/lastest")
    Observable<LatestStories> getLatestStories();

    @GET("new/before/{data}")
    Observable<BeforeStories> getBeforeStories(@Path("date") String date);

    @GET("new/lastest")
    Call<LatestStories> getLatesNormalStories();
}

