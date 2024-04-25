package com.example.sharedata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextData = findViewById(R.id.editTextData);
        Button buttonShare = findViewById(R.id.buttonShare);

        // Check if the button is not null before setting the click listener
        if (buttonShare != null) {
            buttonShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String data = editTextData.getText().toString().trim(); // Trim the input
                    if (!data.isEmpty()) { // Check if the input is not empty
                        Intent intent = new Intent(MainActivity.this, ShareActivity.class);
                        intent.putExtra("sharedData", data);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter some data.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        } else {
            Toast.makeText(MainActivity.this, "Button not found.", Toast.LENGTH_SHORT).show();
        }
    }
}
