package com.xue.image.crop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ZoomImageView viewById = findViewById(R.id.image);
        viewById.setImageResource(R.drawable.timg);
    }
}
