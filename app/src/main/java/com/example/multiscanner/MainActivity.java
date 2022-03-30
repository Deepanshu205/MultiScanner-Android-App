package com.example.multiscanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView QrCode, TextScan, ObjectDetection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QrCode = findViewById(R.id.QrCode);
        TextScan = findViewById(R.id.TextScan);
        ObjectDetection = findViewById(R.id.ObjectDetection);

        QrCode.setOnClickListener(this);
        TextScan.setOnClickListener(this);
        ObjectDetection.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){

            case R.id.QrCode:
                intent = new Intent(MainActivity.this, QrCode.class);
                startActivity(intent);
                break;

            case R.id.TextScan:
                intent = new Intent(MainActivity.this,TextScan.class);
                startActivity(intent);
                break;

            case R.id.ObjectDetection:
                startActivity(new Intent(MainActivity.this,CameraActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                break;

        }


    }

}