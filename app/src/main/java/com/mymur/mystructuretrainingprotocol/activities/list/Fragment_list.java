package com.mymur.mystructuretrainingprotocol.activities.list;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mymur.mystructuretrainingprotocol.R;

import java.util.ArrayList;

public class Fragment_list extends ListFragment implements View.OnClickListener {

    Integer position;
    TypedArray dataArray;
    ArrayList dataList;
    Button addNew;
    View view;


    //графика с recyclerView
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


   //делаем фрагмент
//   @Override
//   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//       dataArray = getResources().obtainTypedArray(R.array.students);
//       position = getArguments().getInt("CurrentStudent");
//
//    //   view = inflater.inflate(R.layout.list_fragment, container, false);
//       //настраиваем recyclerView
////       recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
////       recyclerView.setHasFixedSize(true);
////       layoutManager = new LinearLayoutManager(getActivity());
////       recyclerView.setLayoutManager(layoutManager);
////
////       mAdapter = new MyAdapter(dataArray);
////       recyclerView.setAdapter(mAdapter);
////
////       return view;
//
//   }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        dataArray = getResources().obtainTypedArray(R.array.students);
        dataList = new ArrayList();
        for (int i = 0; i < dataArray.length(); i++) {
            dataList.add(dataArray.getString(i));
        }
        super.onActivityCreated(savedInstanceState);
        ListAdapter adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, dataList);
        setListAdapter(adapter);
    }


    @Override
    public void onClick(View v) {

    }
}
