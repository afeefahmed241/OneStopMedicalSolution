package com.example.onestopmedicalsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HospitalsActivity extends AppCompatActivity {

    private TextView btnTstBtnH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        btnTstBtnH = findViewById(R.id.tvTstBtnH);

        btnTstBtnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHospitalInfoActivity();
            }
        });
    }

    private void openHospitalInfoActivity() {
        Intent intent = new Intent(this,HospitalInfo.class);
        startActivity(intent);
    }
}