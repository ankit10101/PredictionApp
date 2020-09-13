package com.example.predictionapp.ui.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.predictionapp.R;
import com.squareup.picasso.Picasso;

public class ImagePickerActivity extends AppCompatActivity {

    ImageView ivReport;
    Button btnSelectImage, btnPredict;
    public static final int PICK_IMAGE_REQUEST = 1;
    Uri filePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_picker);
        ivReport = findViewById(R.id.ivReport);
        btnSelectImage = findViewById(R.id.btnSelectImage);
        btnPredict = findViewById(R.id.btnPredict);
        btnSelectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseImage();
            }
        });
        btnPredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ImagePickerActivity.this, PredictionResultActivity.class));
            }
        });
    }

    private void chooseImage() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK
                && data != null && data.getData() != null
        ) {
            filePath = data.getData();
            if (filePath != null) {
                Picasso.get().load(filePath).into(ivReport);
            }
        }
    }
}