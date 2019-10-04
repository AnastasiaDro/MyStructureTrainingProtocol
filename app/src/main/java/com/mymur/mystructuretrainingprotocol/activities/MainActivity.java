package com.mymur.mystructuretrainingprotocol.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;

import com.mymur.mystructuretrainingprotocol.R;
import com.mymur.mystructuretrainingprotocol.activities.list.Fragment_list;


//здесь будет поле входа c выбором ученика
public class MainActivity extends AppCompatActivity {

    Fragment testingFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager =getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Bundle bundle = new Bundle();
        bundle.putInt("CurrentStudent", 0);
        Fragment_list fragmentList = new Fragment_list();
        fragmentList.setArguments(bundle);
        fragmentTransaction.add(R.id.testFrame, fragmentList);
        fragmentTransaction.commit();
    }
}
