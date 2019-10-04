package com.mymur.mystructuretrainingprotocol.activities.list;

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

public class Fragment_list extends Fragment implements View.OnClickListener {

    Integer position;
    TypedArray dataArray;
    Button addNew;
    View view;


    //графика с recyclerView
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


   //делаем фрагмент
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       dataArray = getResources().obtainTypedArray(R.array.students);
       position = getArguments().getInt("CurrentStudent");

       view = inflater.inflate(R.layout.list_fragment, container, false);
       //настраиваем recyclerView
       recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
       recyclerView.setHasFixedSize(true);
       layoutManager = new LinearLayoutManager(getActivity());
       recyclerView.setLayoutManager(layoutManager);

       mAdapter = new MyAdapter(dataArray);
       recyclerView.setAdapter(mAdapter);





       return view;
   }




    @Override
    public void onClick(View v) {

    }
}
