package com.example.predictionapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.predictionapp.R;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPredictDisease, btnComingSoon, btnRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnPredictDisease = findViewById(R.id.btnPredictDisease);
        btnComingSoon = findViewById(R.id.btnComingSoon);
        btnRead = findViewById(R.id.btnRead);
        btnPredictDisease.setOnClickListener(this);
        btnComingSoon.setOnClickListener(this);
        btnRead.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPredictDisease:
                startActivity(new Intent(MenuActivity.this, ImagePickerActivity.class));
                break;
            case R.id.btnComingSoon:
                Toast.makeText(MenuActivity.this, "New functionality will be added soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnRead:
                startActivity(new Intent(MenuActivity.this, DiseasesListActivity.class));
                break;
        }
    }
}