package com.syl.zhihu.imitate_zhihudaily.mvp.biz;

import com.syl.zhihu.imitate_zhihudaily.api.ApiManage;
import com.syl.zhihu.imitate_zhihudaily.entity.BeforeStories;
import com.syl.zhihu.imitate_zhihudaily.entity.LatestStories;
import com.syl.zhihu.imitate_zhihudaily.mvp.view.IStoriesView;

import rx.Observable;

/**
 * Created by syl on 2017/5/29.
 */

public class StoriesBiz implements IStoriesBiz {


    @Override
    public Observable<LatestStories> getLatestStories() {
        return ApiManage.getInstance().getmCommonApi().getLatestStories();
    }

    @Override
    public Observable<BeforeStories> getBeforeStories(String date) {
        return ApiManage.getInstance().getmCommonApi().getBeforeStories(date);
    }
}
