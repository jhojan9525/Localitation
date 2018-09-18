package com.senasoft_2.localitation;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.senasoft_2.localitation.Pojo.PojoAdaptador;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends  RecyclerView.Adapter<MainActivity.MyViewHolder> {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    public ArrayList<PojoAdaptador>listadata;
    private Location location;

    public MainActivity(ArrayList<PojoAdaptador>listadata) {
        this.listadata =listadata;
    }

    @NonNull
    @Override
    public MainActivity.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        TextView view =(TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_vista, parent,false);

        MyViewHolder vh = new MyViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MainActivity.MyViewHolder holder, int position) {

        holder.fecha.setText(listadata.get(position).getFecha());
        holder.coodenadas.setText(listadata.get(position).getCoordenadas());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView fecha, coodenadas;
        public MyViewHolder (TextView view) {
            super(view);
            fecha =  view.findViewById(R.id.fecha);
            coodenadas =  view.findViewById(R.id.coodenadas);
        }
    }

    public MainActivity(String[] myDataset){
        myDataset = myDataset;
    }



    }

