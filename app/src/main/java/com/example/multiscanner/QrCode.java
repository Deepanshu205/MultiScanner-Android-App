package com.example.multiscanner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QrCode extends AppCompatActivity {
    Button qrButton;
    public static TextView qrTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        setContentView(R.layout.activity_qr_code);
        actionBar.setTitle("QR Code Scanner");
        qrTextView = (TextView)findViewById(R.id.qr_textView);
        qrButton = (Button)findViewById(R.id.qr_button);

        qrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),qrscanner_view.class));
            }
        });

    }
}