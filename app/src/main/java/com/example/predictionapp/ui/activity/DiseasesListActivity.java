package com.example.predictionapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.predictionapp.Disease;
import com.example.predictionapp.R;
import com.example.predictionapp.ui.adapter.DiseaseAdapter;

import java.util.ArrayList;

public class DiseasesListActivity extends AppCompatActivity {

    ArrayList<Disease> diseaseArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases_list);
        diseaseArrayList.add(new Disease("Disease1", "Desc1"));
        diseaseArrayList.add(new Disease("Disease2", "Desc2"));
        diseaseArrayList.add(new Disease("Disease3", "Desc3"));
        diseaseArrayList.add(new Disease("Disease4", "Desc4"));
        diseaseArrayList.add(new Disease("Disease5", "Desc5"));
        diseaseArrayList.add(new Disease("Disease6", "Desc6"));
        diseaseArrayList.add(new Disease("Disease7", "Desc7"));
        diseaseArrayList.add(new Disease("Disease8", "Desc8"));
        diseaseArrayList.add(new Disease("Disease9", "Desc9"));
        diseaseArrayList.add(new Disease("Disease10", "Desc10"));
        diseaseArrayList.add(new Disease("Disease11", "Desc11"));
        RecyclerView rvDiseases = findViewById(R.id.rvDiseases);
        DiseaseAdapter diseaseAdapter =
                new DiseaseAdapter(diseaseArrayList);
        rvDiseases.setLayoutManager(new LinearLayoutManager(DiseasesListActivity.this));
        rvDiseases.setAdapter(diseaseAdapter);
    }
}