package com.taxwardo.taxapp.medicalBenefitCalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.taxwardo.taxapp.R;

public class MedicalBenefitCalculator extends AppCompatActivity {
    Toolbar toolbar;
    Spinner year,age1,age2;
    String[] year_array={"2014-2015","2015-2016"};
    String[] age1_array={"Below60","60-79","80 or Above"};
    String[] age2_array={"Below60","60-79","80 or Above"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_benefit_calculator);
        toolbar= (Toolbar) findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        year = (Spinner) findViewById(R.id.spiner_finacial_year);
        age1 = (Spinner) findViewById(R.id.spinner_age);
        age2 = (Spinner) findViewById(R.id.spinner_age_parent);

        ArrayAdapter adapter_year = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, year_array);
        year.setAdapter(adapter_year);


        ArrayAdapter adapter_age1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, age1_array);
        age1.setAdapter(adapter_age1);


        ArrayAdapter adapter_age2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, age2_array);
        age2.setAdapter(adapter_age2);





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

