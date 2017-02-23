package com.taxwardo.taxapp.incomeTaxCalculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.taxwardo.taxapp.R;

public class IncomeTaxCalculation extends AppCompatActivity {
    Toolbar toolbar;

    String[] spinnerAge={"upto 60","60-80","above 80"};
    String[] spinnerFinacialYear={"2015-16","2016-17","2017-18"};
    String[] residentialStatus={"Ordinary Resident","Not-Ordinary Resident","Non-resident"};

    Spinner spinnerForAge,spinnerForYear,spinnerForResident;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_tax_calculation);

        toolbar= (Toolbar) findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinnerForAge= (Spinner) findViewById(R.id.sppinner_age);
        spinnerForYear= (Spinner) findViewById(R.id.spinner_financial_year);
        spinnerForResident= (Spinner) findViewById(R.id.spinner_residential);

        ArrayAdapter<String> adapterAge=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,spinnerAge);
        spinnerForAge.setAdapter(adapterAge);

        ArrayAdapter<String> adapterYear=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,spinnerFinacialYear);
        spinnerForYear.setAdapter(adapterYear);

        ArrayAdapter<String> adapterResidential=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,residentialStatus);
        spinnerForResident.setAdapter(adapterResidential);



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
