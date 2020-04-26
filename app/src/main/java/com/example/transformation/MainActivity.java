package com.example.transformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isCarVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView carImageView = findViewById(R.id.carImageView);
        carImageView.animate().setDuration(3000);
    }

    public void eraseCar(View view) {
        if(isCarVisible) {
            ImageView carImageView = findViewById(R.id.carImageView);
            carImageView.animate().rotation(3600).alpha(0).setDuration(3000);

            ImageView beeImageView = findViewById(R.id.beeImageView);
            beeImageView.animate().rotation(3600).alpha(1).setDuration(3000);
            isCarVisible = false;
        } else {
            ImageView carImageView = findViewById(R.id.carImageView);
            carImageView.animate().rotation(0).alpha(1).setDuration(3000);

            ImageView beeImageView = findViewById(R.id.beeImageView);
            beeImageView.animate().rotation(0).alpha(0).setDuration(3000);
            isCarVisible = true;

        }

    }
}

