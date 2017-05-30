package com.syl.zhihu.imitate_zhihudaily.mvp.presenter;

import com.syl.zhihu.imitate_zhihudaily.entity.BeforeStories;
import com.syl.zhihu.imitate_zhihudaily.entity.LatestStories;
import com.syl.zhihu.imitate_zhihudaily.mvp.biz.StoriesBiz;
import com.syl.zhihu.imitate_zhihudaily.mvp.view.IStoriesView;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by syl on 2017/5/29.
 */

public class StoriesPresenter extends IBasePresenter{
private IStoriesView mView;
    private StoriesBiz mBiz;

    public StoriesPresenter(IStoriesView mView) {
        this.mView = mView;
        mBiz = new StoriesBiz();
    }

    public void getLatestStories() {
        Subscription subscription=mBiz.getLatestStories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LatestStories>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.onRequestError("数据加载失败ヽ(≧Д≦)ノ");
                    }

                    @Override
                    public void onNext(LatestStories latestStories) {
                            mView.loadLatestStories(latestStories);
                    }
                });
        addSubscription(subscription);
    }

    public void getBeforeDaily(String date) {
        Subscription subscription = mBiz.getBeforeStories(date)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BeforeStories>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.onRequestError("数据加载失败ヽ(≧Д≦)ノ");
                    }

                    @Override
                    public void onNext(BeforeStories beforeStories) {
    mView.loadBeforeStories(beforeStories);
                    }
                });
        addSubscription(subscription);
    }
}
