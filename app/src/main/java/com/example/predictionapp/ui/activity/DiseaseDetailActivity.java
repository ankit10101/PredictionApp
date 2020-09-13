package com.example.predictionapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.predictionapp.R;

public class DiseaseDetailActivity extends AppCompatActivity {

    TextView tvDiseaseName, tvDiseaseDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_detail);
        Intent i = getIntent();
        Bundle bundle = i.getBundleExtra("DISEASE_INFO");
        String name = bundle.getString("NAME", "");
        String description = bundle.getString("DESCRIPTION", "");
        tvDiseaseName = findViewById(R.id.tvDiseaseName);
        tvDiseaseDesc = findViewById(R.id.tvDiseaseDesc);
        tvDiseaseName.setText(name);
        tvDiseaseDesc.setText(description);
    }
}