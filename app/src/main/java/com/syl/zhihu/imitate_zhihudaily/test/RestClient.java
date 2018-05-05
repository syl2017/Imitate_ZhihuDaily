package com.syl.zhihu.imitate_zhihudaily.test;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syl on 2017/6/3.
 */

public class RestClient {
    private Context mContext;

    public RestClient(Context context) {
        mContext = context;
    }
    public List<String> getFavoriteTvShows() {
        try {
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return creatTvShowList();
    }

    public List<String> creatTvShowList() {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("1");
        tvShows.add("2");
        tvShows.add("3");
        tvShows.add("4");
        tvShows.add("5");
        tvShows.add("6");
        tvShows.add("7");
        tvShows.add("7");
        tvShows.add("7");
        tvShows.add("7");tvShows.add("7");tvShows.add("7");
        tvShows.add("7");

        return tvShows;
    }
}
