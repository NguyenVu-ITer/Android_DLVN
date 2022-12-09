package com.example.du_lich_vn;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UserFragment_True#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserFragment_True extends Fragment {

    public UserFragment_True() {
        // Required empty public constructor
    }

    public static UserFragment_True newInstance() {
        UserFragment_True fragment = new UserFragment_True();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user__true, container, false);
    }
}