package com.example.dpr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {

    ArrayList<Medicines> list;
    public AdapterClass(ArrayList<Medicines> list)
    {
        this.list =list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_holder,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.MyViewHolder myViewHolder, int i) {
       myViewHolder.name.setText(list.get(i).getName());
        myViewHolder.prep.setText(list.get(i).getPrep());
        myViewHolder.price.setText(list.get(i).getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView prep;
        TextView price;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);

                name = itemView.findViewById(R.id.name);
                prep = itemView.findViewById(R.id.prep);
                price = itemView.findViewById(R.id.price);

        }
    }
}
