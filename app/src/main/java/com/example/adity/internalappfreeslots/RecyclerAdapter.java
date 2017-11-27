package com.example.adity.internalappfreeslots;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    public List<FreeSlotItem> data= Collections.emptyList();
    public Context mContext;

    public RecyclerAdapter(Context context,List<FreeSlotItem> data){

        inflater=LayoutInflater.from(context);
        this.mContext=context;
        this.data=data;
    }

    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.row,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        FreeSlotItem freeSlotItem=data.get(position);
        holder.MemName.setText(freeSlotItem.name);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView MemName;

        public MyViewHolder(View itemView) {
            super(itemView);
            MemName= (TextView) itemView.findViewById(R.id.memname);
        }
    }
}
