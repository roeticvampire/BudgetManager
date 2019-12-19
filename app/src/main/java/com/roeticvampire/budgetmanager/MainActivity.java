package com.roeticvampire.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView tvThisWeek,tvDateStart,tvDay,tvSpentToday,tvMajorExpenses;
    ProgressBar pbWeek;
    ImageView ivPie;
    FloatingActionButton btnNewEntry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDay=findViewById(R.id.tvDay);
        tvDay.setText("Day "+ Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
        tvThisWeek=findViewById(R.id.tvThisWeek);
        tvThisWeek.setText("THIS WEEK");
        tvSpentToday=findViewById(R.id.tvSpentToday);
        tvDateStart=findViewById(R.id.tvDateStart);
        tvMajorExpenses=findViewById(R.id.tvMajorExpenses);
        ivPie=findViewById(R.id.ivPie);
        pbWeek=findViewById(R.id.pbWeek);pbWeek.setProgress(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
        btnNewEntry=findViewById(R.id.btnNewEntry);
        btnNewEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent= new Intent(getApplicationContext(),Popentry.class);
                Intent intent= new Intent(getApplicationContext(),Popentry.class);
                startActivity(intent);
            }
        });
    }












}
