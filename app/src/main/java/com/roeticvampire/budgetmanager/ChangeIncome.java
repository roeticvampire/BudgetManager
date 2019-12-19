package com.roeticvampire.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class ChangeIncome extends AppCompatActivity {
    TextView tvFrom,tvTo,tvSetAmount;
    EditText etSetAmount;
    Button btnSubmit,btnInitialDate,btnFinalDate;
    Calendar c;
    DatePickerDialog dpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_income);
        tvFrom=findViewById(R.id.tvFrom);
        tvTo=findViewById(R.id.tvTo);
        tvSetAmount=findViewById(R.id.tvSetAmount);
        etSetAmount=findViewById(R.id.etSetAmount);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnFinalDate=findViewById(R.id.btnFinalDate);
        btnInitialDate=findViewById(R.id.btnInitialDate);
        btnInitialDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=Calendar.getInstance();
                int day=c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year=c.get(Calendar.YEAR);
                dpd = new DatePickerDialog(ChangeIncome.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int myear, int mmonth, int mdayOfMonth) {
                    tvFrom.setText(mdayOfMonth+"/"+(mmonth+1)+"/"+myear);
                    }
                },year,month,day);
                dpd.show();

            }
        });

        btnFinalDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=Calendar.getInstance();
                int day=c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year=c.get(Calendar.YEAR);
                dpd = new DatePickerDialog(ChangeIncome.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int myear, int mmonth, int mdayOfMonth) {
                        tvTo.setText(mdayOfMonth+"/"+(mmonth+1)+"/"+myear);
                    }
                },year,month,day);
                dpd.show();

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });


    }
}
