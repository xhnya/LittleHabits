package com.xhnya.habits.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.xhnya.habits.R;

import org.jetbrains.annotations.NotNull;

public class AllFragment extends Fragment {

    private MaterialViewPager mViewPager;


    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root=inflater.inflate(R.layout.fragment_all,container,false);
        return root;
    }

}