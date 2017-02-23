package com.taxwardo.taxapp.advancedTaxCallculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.taxwardo.taxapp.R;

public class AdvancedTaxCallculation extends AppCompatActivity {
    Toolbar toolbar;
    Spinner residential,financial,age;
    String[] age_array={"Upto60","60-80","Above80"};
    String[] res_array={"Ordinarily Resident","Not Ordinarily Resident","Non-Resident"};
    String[] financ_array={"2016-2017","2015-2016","2014-2015"};
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_tax_callculation);
        toolbar= (Toolbar) findViewById(R.id.toolbar_layout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        save= (Button) findViewById(R.id.btn_save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        residential= (Spinner) findViewById(R.id.sp_residential);
        financial= (Spinner) findViewById(R.id.sp_financial);
        age= (Spinner) findViewById(R.id.sp_age);

        ArrayAdapter ageArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,age_array);
        age.setAdapter(ageArrayAdapter);

        ArrayAdapter financeArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,                financ_array);
        financial.setAdapter(financeArrayAdapter);

        ArrayAdapter resArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, res_array);
        residential.setAdapter(resArrayAdapter);
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

