package com.syl.zhihu.imitate_zhihudaily.test;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by syl on 2017/6/2.
 */

public class rxjava {
    private static final String TAG = "TAG";

    public void creatObservable() {
        Observable<List<String>> listObservable = Observable.just(getColorList());
            listObservable.subscribe(new Observer<List<String>>() {
                @Override
                public void onCompleted() {

                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onNext(List<String> strings) {
                    Log.d(TAG, "onNext: "+strings);
                }
            });

    }

    private static List<String> getColorList() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("chartreuse");
        colors.add("Van Dyke Brown");
        return colors;
    }
    private Subscription mTvShowSubscription;
    public void creatObservable2(){
        Observable<List<String>> tvShowObservable=Observable.fromCallable(new Callable<List<String>>() {
            @Override
            public List<String> call() throws Exception {
                return null;
            }
        });
        mTvShowSubscription=tvShowObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<String>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(List<String> strings) {

            }
        });
    }

}


