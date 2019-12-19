package com.roeticvampire.budgetmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Popentry extends Activity {
    EditText etNotes,etSource,etAmount;
    TextView tvNotes,tvSource,tvAmount,tvCategory;
    Button btnAdd;
    Spinner spn_Category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popentry);
        etNotes=findViewById(R.id.etNotes);
        etSource=findViewById(R.id.etSource);
        etAmount=findViewById(R.id.etcAmount);

        tvNotes=findViewById(R.id.tvNotes);
        tvSource=findViewById(R.id.tvSource);
        tvAmount=findViewById(R.id.tvAmount);
        tvCategory=findViewById(R.id.tvCategory);
        btnAdd=findViewById(R.id.btnAdd);
        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width= dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int)(width*.8),(int)(height*.7));
        WindowManager.LayoutParams params =getWindow().getAttributes();
        params.gravity= Gravity.CENTER;
        params.x=0;
        params.y=-10;
        getWindow().setAttributes(params);
        tvSource.setText("Source");
        tvAmount.setText("Amount");
        tvCategory.setText("Category");
        tvNotes.setText("Notes");
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Work in Progress", Toast.LENGTH_SHORT).show();

                finish();
            }
        });

    }
}
