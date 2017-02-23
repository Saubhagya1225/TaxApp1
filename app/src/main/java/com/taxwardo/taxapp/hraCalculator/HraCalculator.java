package com.taxwardo.taxapp.hraCalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.taxwardo.taxapp.R;

public class HraCalculator extends AppCompatActivity {
    Toolbar toolbar;

    String[] accomodation={"Delhi","Mumbai","Chennai","Kolkata","others"};

    Spinner spinnerAcoomodation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hra_calculator);
        toolbar= (Toolbar) findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinnerAcoomodation= (Spinner) findViewById(R.id.spinner_accomodation);

        ArrayAdapter<String> adapterAccomdtn=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,accomodation);
        spinnerAcoomodation.setAdapter(adapterAccomdtn);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         super.onOptionsItemSelected(item);
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return true;
    }
}
