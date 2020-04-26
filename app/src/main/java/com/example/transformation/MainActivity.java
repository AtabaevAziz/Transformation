package com.example.transformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseCar(View view) {
        ImageView carImageView = findViewById(R.id.carImageView);
        carImageView.animate().alpha(0).setDuration(3000);

        ImageView beeImageView = findViewById(R.id.beeImageView);
        beeImageView.animate().alpha(1).setDuration(3000);
    }
}

