package com.example.predictionapp.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.predictionapp.Disease;
import com.example.predictionapp.R;
import com.example.predictionapp.ui.activity.DiseaseDetailActivity;

import java.util.ArrayList;

public class DiseaseAdapter extends RecyclerView.Adapter<DiseaseAdapter.DiseaseHolder> {

    private ArrayList<Disease> diseaseArrayList;
    Context context;

    public DiseaseAdapter(ArrayList<Disease> diseaseArrayList) {
        this.diseaseArrayList = diseaseArrayList;
    }

    @NonNull
    @Override
    public DiseaseHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_row, viewGroup, false);
        context = viewGroup.getContext();
        return new DiseaseHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiseaseHolder holder, int position) {
        final Disease currentDisease = diseaseArrayList.get(position);

        holder.name.setText(currentDisease.getName());
        holder.desc.setText(currentDisease.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("NAME", currentDisease.getName());
                bundle.putString("DESCRIPTION", currentDisease.getDescription());
                i.putExtra("DISEASE_INFO", bundle);
                context.startActivity(new Intent(context, DiseaseDetailActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return diseaseArrayList.size();
    }

    class DiseaseHolder extends RecyclerView.ViewHolder {
        TextView name, desc;

        public DiseaseHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.tvName);
            this.desc = itemView.findViewById(R.id.tvDesc);
        }
    }
}
