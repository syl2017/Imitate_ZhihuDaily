package com.syl.zhihu.imitate_zhihudaily.mvp.view;

import com.syl.zhihu.imitate_zhihudaily.entity.BeforeStories;
import com.syl.zhihu.imitate_zhihudaily.entity.LatestStories;

/**
 * Created by syl on 2017/5/29.
 */

public interface IStoriesView {
    void onRequestError(String msg);

    void loadLatestStories(LatestStories latestStories);

    void loadBeforeStories(BeforeStories beforeStories);
}
