package com.mymur.mystructuretrainingprotocol.activities.list;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.mymur.mystructuretrainingprotocol.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private TypedArray mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public MyViewHolder(TextView v){
            super(v);
            textView = v;
        }
    }

    public MyAdapter(TypedArray myDataset){
        mDataset = myDataset;
    }



    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // create a new view
//    CardView cardView = (CardView)LayoutInflater.from(parent.getContext()).inflate(R.layout.my_card_view, parent, false);
//    MyViewHolder vh = new MyViewHolder(cardView);
//
//        return vh;


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(mDataset.getString(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.length();
    }
}
