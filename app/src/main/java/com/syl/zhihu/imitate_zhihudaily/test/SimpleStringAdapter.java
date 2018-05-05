package com.syl.zhihu.imitate_zhihudaily.test;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.syl.zhihu.imitate_zhihudaily.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syl on 2017/6/3.
 */

public class SimpleStringAdapter extends RecyclerView.Adapter<SimpleStringAdapter.ViewHolder> {
    private static final String TAG = "TAG";
    private final Context mContext;
    private final List<String> mString = new ArrayList<>();

    public SimpleStringAdapter(Context context) {


        mContext = context;
    }

    public void setString(List<String> newString) {
        mString.clear();
        Log.d(TAG, "setString35: "+newString.toString());
        mString.addAll(newString);
        Log.d(TAG, "setString37: "+mString);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.string_list_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
//        Log.d(TAG, "onBindViewHolder: "+position);
        Log.d(TAG, "onBindViewHolder: "+mString);
//        holder.mColorDisplay.setText(position+"1");
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext, mString.get(position), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mString.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView mColorDisplay;


        public ViewHolder(View itemView) {
            super(itemView);
            mColorDisplay = (TextView) itemView.findViewById(R.id.color_display);
        }
    }
}
