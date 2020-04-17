package com.howto.mydoctorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRv;
    List<AppModel> mModel;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRv = findViewById(R.id.recyclerview);
        mModel = new ArrayList<>();

        mModel.add(new AppModel("Medicine", R.drawable.ic_medicne));
        mModel.add(new AppModel("Health Care", R.drawable.ic_health));
        mModel.add(new AppModel("Prescription", R.drawable.ic_prescription));
        mModel.add(new AppModel("Ambulance", R.drawable.ic_ambulance));
        mModel.add(new AppModel("Consultancy", R.drawable.ic_consultancy));
        mModel.add(new AppModel("Hospital", R.drawable.ic_hospital));
        mModel.add(new AppModel("Home Service", R.drawable.ic_homeservice));
        mModel.add(new AppModel("Nursing Facilities", R.drawable.ic_nursing));
        mModel.add(new AppModel("Online Purchase", R.drawable.ic_online));
        mModel.add(new AppModel("Emergency", R.drawable.ic_emergency));

        myAdapter = new MyAdapter(this, mModel);
        mRv.setLayoutManager(new GridLayoutManager(this, 3));
        mRv.setAdapter(myAdapter);

    }
}
