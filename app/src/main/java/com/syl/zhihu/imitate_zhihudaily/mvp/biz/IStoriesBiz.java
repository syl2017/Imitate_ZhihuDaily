package com.syl.zhihu.imitate_zhihudaily.mvp.biz;

import com.syl.zhihu.imitate_zhihudaily.entity.BeforeStories;
import com.syl.zhihu.imitate_zhihudaily.entity.LatestStories;

import rx.Observable;

/**
 * Created by syl on 2017/5/29.
 */

public interface IStoriesBiz {
Observable<LatestStories> getLatestStories();

    Observable<BeforeStories> getBeforeStories(String date);
}
