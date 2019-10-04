package com.mymur.mystructuretrainingprotocol.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mymur.mystructuretrainingprotocol.R;


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
//        Fragment_list fragmentList = new Fragment_list();
//        fragmentList.setArguments(bundle);
//        fragmentTransaction.add(R.id.testFrame, fragmentList);
        FragmentList2 fragmentList2 = new FragmentList2();
        fragmentList2.setArguments(bundle);
        fragmentTransaction.add(R.id.testFrame, fragmentList2);

        fragmentTransaction.commit();
    }

    public static class FragmentList2 extends Fragment {
        View view;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

            view = inflater.inflate(R.layout.list_fragment, container, false);

            return view;
        }


    }
}
