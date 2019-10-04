package com.mymur.mystructuretrainingprotocol.activities.list;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.mymur.mystructuretrainingprotocol.R;

public class Fragment_list extends Fragment implements View.OnClickListener {

    Integer position;
    TypedArray dataArray;
    Button addNew;
    View view;

   //делаем фрагмент
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       dataArray = getResources().obtainTypedArray(R.array.Students);
       position = getArguments().getInt("CurrentStudent");
       view = inflater.inflate(R.layout.list_fragment, container, false);

       return view;
   }




    @Override
    public void onClick(View v) {

    }
}
