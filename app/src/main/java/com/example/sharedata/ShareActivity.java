package com.example.sharedata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        TextView textViewSharedData = findViewById(R.id.textViewSharedData);

        // Retrieve the shared data from the intent
        String sharedData = getIntent().getStringExtra("sharedData");

        // Check if the shared data is not null before setting the text
        if (sharedData != null) {
            textViewSharedData.setText(sharedData);
        } else {
            // Optionally, set a default message if the shared data is null
            textViewSharedData.setText("No data shared.");
        }
    }

}
