package com.roeticvampire.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Spinner;

public class DetailedAnalysis extends AppCompatActivity {
ImageView ivGraph;
Spinner spn_Category,spn_Time,spn_GraphType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_analysis);
        ivGraph=findViewById(R.id.ivGraph);
        spn_Category=findViewById(R.id.spn_Category);
        spn_GraphType=findViewById(R.id.spn_GraphType);
        spn_Time=findViewById(R.id.spn_Time);










    }
}
