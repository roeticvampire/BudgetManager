package com.roeticvampire.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class LongtermHistogram extends AppCompatActivity {

    Spinner spinnerPeriod,spinnerCategory;
    TextView tvLeftReport, tvRightReport, tvTimeline;
    ImageView ivHistogram;
    Button btnSetDate;
    Calendar c;
    DatePickerDialog dpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longterm_histogram);
    spinnerCategory=findViewById(R.id.spinnerCategory);
    spinnerPeriod=findViewById(R.id.spinnerPeriod);
    tvLeftReport=findViewById(R.id.tvLeftReport);
    tvRightReport=findViewById(R.id.tvRightReport);
    ivHistogram=findViewById(R.id.ivHistogram);







    }
}
