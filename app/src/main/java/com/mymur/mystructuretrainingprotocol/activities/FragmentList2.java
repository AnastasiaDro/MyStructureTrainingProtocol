package com.mymur.mystructuretrainingprotocol.activities;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mymur.mystructuretrainingprotocol.R;
import com.mymur.mystructuretrainingprotocol.activities.list.MyAdapter;

import java.util.ArrayList;

public  class FragmentList2 extends Fragment {
    View view;
    Integer position;
    TypedArray dataArray;
    ArrayList dataList;
    Button addNew;
    


    //графика с recyclerView
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.list_fragment, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
       recyclerView.setHasFixedSize(true);
       layoutManager = new LinearLayoutManager(getActivity());
       recyclerView.setLayoutManager(layoutManager);

       mAdapter = new MyAdapter(dataArray);
       recyclerView.setAdapter(mAdapter);

       return view;


    }
}