package com.syl.zhihu.imitate_zhihudaily.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by syl on 2017/5/29.
 */

public class ApiManage {
    private static ApiManage mApiManage;
    private Retrofit mRetrofit;
    private static CommonApi mCommonApi;

    private static final int DEFAULT_TIMEOUT = 5;

    public ApiManage() {
    }

    public static ApiManage getInstance() {
        if (mApiManage == null) {
            synchronized (ApiManage.class) {
                if (mApiManage == null) {
                    mApiManage = new ApiManage();
                }
            }
        }
        return mApiManage;
    }

    public CommonApi getmCommonApi() {

        return mCommonApi == null ? configRetrofit(CommonApi.class) : mCommonApi;
    }

    private <T> T configRetrofit(Class<T> service) {
        mRetrofit = new Retrofit.Builder()
                .baseUrl("http://news-at.zhihu.com/api/4/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return mRetrofit.create(service);
    }

    private static OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .build();
}
