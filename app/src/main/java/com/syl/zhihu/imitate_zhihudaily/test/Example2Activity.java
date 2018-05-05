package com.syl.zhihu.imitate_zhihudaily.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.syl.zhihu.imitate_zhihudaily.R;

import java.util.List;
import java.util.concurrent.Callable;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by syl on 2017/6/3.
 */

public class Example2Activity extends AppCompatActivity {
    private static final String TAG = "TAG";
    private Subscription mTvShowSubscrition;
    private SimpleStringAdapter mSimpleStringAdapter;
    private RestClient mRestClient;
    private ProgressBar mProgressBar;
    private RecyclerView mTvShowListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRestClient = new RestClient(this);
//        mRestClient.creatTvShowList();


        createObservable();
        configureLayout();
    }

    public void configureLayout() {
        setContentView(R.layout.activity_example_2);
        mProgressBar = (ProgressBar) findViewById(R.id.loader);
        mTvShowListView = (RecyclerView) findViewById(R.id.tv_show_list);
        mTvShowListView.setLayoutManager(new LinearLayoutManager(this));
        mSimpleStringAdapter = new SimpleStringAdapter(this);
        mTvShowListView.setAdapter(mSimpleStringAdapter);
    }

    public void createObservable() {
        Observable<List<String>> tvShowObservable=Observable.fromCallable(new Callable<List<String>>() {
            @Override
            public List<String> call() {
                return mRestClient.getFavoriteTvShows();
            }
        });
        mTvShowSubscrition=tvShowObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<String>>() {
                    @Override
                    public void onCompleted() {
                        Log.e(TAG, "Example2Activity: onCompleted 68"+"onCompleted()");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<String> strings) {
                        displayTvShows(strings);
                    }


                });
    }

    private void displayTvShows(List<String> strings) {
        Log.e(TAG, "Example2Activity: displayTvShows 83"+strings);

        mSimpleStringAdapter.setString(strings);
        mProgressBar.setVisibility(View.GONE);
        mTvShowListView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if (mTvShowSubscrition != null && !mTvShowSubscrition.isUnsubscribed()) {
//            mTvShowSubscrition.unsubscribe();
//        }
    }
}
