package com.example.mlseriesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View; // Import View class
import android.os.Bundle;

import com.example.mlseriesdemo.helpers.ImageHelperActivity;
import com.example.mlseriesdemo.image.FlowerIdentificationActivity;
import com.example.mlseriesdemo.image.ImageClassificationActivity;
import com.example.mlseriesdemo.image.ObjectDetectionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onGotoImageActivity(View view) {
        // Create an Intent to start the ImageHelperActivity
        Intent intent = new Intent(this, ImageClassificationActivity.class);

        // Start the activity
        startActivity(intent);
    }

    public void onGotoFlowerIdentification(View view) {
        // Create an Intent to start the ImageHelperActivity
        Intent intent = new Intent(this, FlowerIdentificationActivity.class);

        // Start the activity
        startActivity(intent);
    }

    public void onGotoObjectDetection(View view) {
        // Create an Intent to start the ImageHelperActivity
        Intent intent = new Intent(this, ObjectDetectionActivity.class);

        // Start the activity
        startActivity(intent);
    }


}
