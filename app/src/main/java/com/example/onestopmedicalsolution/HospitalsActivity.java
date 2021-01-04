package com.example.onestopmedicalsolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class HospitalsActivity extends AppCompatActivity implements HospitalAdapter.ItemClicked {


    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Hospital> hospitals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        recyclerView = findViewById(R.id.listHospitals);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        hospitals = new ArrayList<Hospital>();

        hospitals.add(new Hospital("Kurmitola","0171329847","231"));
        hospitals.add(new Hospital("DMC","0171329847","241"));
        hospitals.add(new Hospital("CMH","0171329847","250"));
        hospitals.add(new Hospital("SJDF","0171329847","221"));
        hospitals.add(new Hospital("Kurmitola","0171329847","231"));
        hospitals.add(new Hospital("DMC","0171329847","241"));
        hospitals.add(new Hospital("CMH","0171329847","250"));
        hospitals.add(new Hospital("SJDF","0171329847","221"));
        hospitals.add(new Hospital("Kurmitola","0171329847","231"));
        hospitals.add(new Hospital("DMC","0171329847","241"));
        hospitals.add(new Hospital("CMH","0171329847","250"));
        hospitals.add(new Hospital("SJDF","0171329847","221"));


        // for updating the listView myAdapter.notifyDataSetChanged();


        myAdapter = new HospitalAdapter(this,hospitals);
        recyclerView.setAdapter(myAdapter);
    }


    @Override
    public void onItemClicked(int index) {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+hospitals.get(index).getName()));
        startActivity(intent);
    }
}