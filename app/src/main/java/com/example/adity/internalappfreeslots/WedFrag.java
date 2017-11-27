package com.example.adity.internalappfreeslots;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class WedFrag extends Fragment {

    public RecyclerView recyclerView1;
    public RecyclerView recyclerView2;
    public RecyclerView recyclerView3;
    public RecyclerView recyclerView4;
    public RecyclerAdapter recyclerAdapter1,recyclerAdapter2,recyclerAdapter3,recyclerAdapter4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.wedfrag,container,false);
        recyclerView1= (RecyclerView) rootview.findViewById(R.id.rwed);
        recyclerView2= (RecyclerView) rootview.findViewById(R.id.rwed2);
        recyclerView3= (RecyclerView) rootview.findViewById(R.id.rwed3);
        recyclerView4= (RecyclerView) rootview.findViewById(R.id.rwed4);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerAdapter1=new RecyclerAdapter(getActivity(),getData(1));
        recyclerAdapter2=new RecyclerAdapter(getActivity(),getData(2));
        recyclerAdapter3=new RecyclerAdapter(getActivity(),getData(3));
        recyclerAdapter4=new RecyclerAdapter(getActivity(),getData(4));
        recyclerView1.setAdapter(recyclerAdapter1);
        recyclerView2.setAdapter(recyclerAdapter2);
        recyclerView3.setAdapter(recyclerAdapter3);
        recyclerView4.setAdapter(recyclerAdapter4);
        return rootview;
    }
    private List<FreeSlotItem> getData(int n){
        List<FreeSlotItem> data=new ArrayList<>();
        String names[] = new String[0];
        switch (n) {
            case 1:
                names = new String[]{"Shashank", "First Last Name", "First Last Name", "First Last Name", "First Last Name"};
                break;
            case 2:
                names = new String[]{"Geetanjali", "First Last Name", "First Last Name", "First Last Name", "First Last Name"};
                break;
            case 3:
                names = new String[]{"Geetanjali", "Shashank", "First Last Name", "First Last Name", "First Last Name"};
                break;
            case 4:
                names = new String[]{"Aayush", "Shashank", "First Last Name", "First Last Name", "First Last Name"};
                break;
        }
        for(int i=0;i<names.length;i++){
            FreeSlotItem freeSlotItem=new FreeSlotItem(names[i]);
            freeSlotItem.name=names[i];
            data.add(freeSlotItem);
        }
        return data;
    }

}
