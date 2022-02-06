package com.example.quranapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HAdopter extends RecyclerView.Adapter<HAdopter.HViewHolder>{
ArrayList<HModel> models;
Context context;

    public HAdopter(ArrayList<HModel> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public HViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row_template, parent, false);


        return new HViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull HViewHolder holder, int position) {

        holder.para.setText(models.get(position).getPara());
        holder.number.setText(models.get(position).getNumber());


    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    class HViewHolder extends RecyclerView.ViewHolder {


        TextView para, number;

        public HViewHolder(@NonNull View itemView) {
            super(itemView);



            para = itemView.findViewById(R.id.paraName);
            number = itemView.findViewById(R.id.numbers);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    models.get(getAdapterPosition());


                            Bundle bundle = new Bundle();
                            String string = Integer.toString(getAdapterPosition());
                            bundle.putString("position",string);

                            Intent intent = new Intent(context, MainActivity.class);
                            intent.putExtras(bundle);
                            context.startActivity(intent);

                }
            });


        }
    }


}
