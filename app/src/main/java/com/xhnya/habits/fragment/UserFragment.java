package com.xhnya.habits.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.xhnya.habits.R;

import org.jetbrains.annotations.NotNull;

public class UserFragment  extends Fragment {
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root=inflater.inflate(R.layout.fragment_user,container,false);
        return root;
    }

}