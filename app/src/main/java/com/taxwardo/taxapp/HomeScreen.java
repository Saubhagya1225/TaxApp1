package com.taxwardo.taxapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.taxwardo.taxapp.advancedTaxCallculation.AdvancedTaxCallculation;
import com.taxwardo.taxapp.hraCalculator.HraCalculator;
import com.taxwardo.taxapp.incomeTaxCalculation.IncomeTaxCalculation;
import com.taxwardo.taxapp.medicalBenefitCalculator.MedicalBenefitCalculator;
import com.taxwardo.taxapp.taxSavingCalculator.TaxSavingCalculator;

public class HomeScreen extends AppCompatActivity {
    Toolbar toolbar;

    TextView taxCalculator,hraCalculator,advancTaxCalculator,taxSavingCal,medicalClaimCall;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        toolbar= (Toolbar) findViewById(R.id.toolbar_layout);
        toolbar.setTitle("Home screen");
        setSupportActionBar(toolbar);


        if (getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }

        taxCalculator= (TextView) findViewById(R.id.tv_tax_callculator);
        hraCalculator= (TextView) findViewById(R.id.tv_hra_calculator);
        advancTaxCalculator= (TextView) findViewById(R.id.tv_advanced_calculator);
        taxSavingCal= (TextView) findViewById(R.id.tv_tax_saving_calculator);
        medicalClaimCall= (TextView) findViewById(R.id.tv_medical_benifit);

        taxCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this, IncomeTaxCalculation.class);
                startActivity(intent);

            }
        });
        advancTaxCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this, AdvancedTaxCallculation.class);
                startActivity(intent);
            }
        });
        hraCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this, HraCalculator.class);
                startActivity(intent);
            }
        });
        medicalClaimCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this, MedicalBenefitCalculator.class);
                startActivity(intent);
            }
        });
        taxSavingCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreen.this, TaxSavingCalculator.class);
                startActivity(intent);

            }
        });
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
