package com.example.covid_tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DemonstrationActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry,tvCases1,tvtodayCases1,tvDeaths1,tvtodayDeaths1,tvRecovered1,tvActive1,tvCritical1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demonstration);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Information of"+CountriesSurviving.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry = findViewById(R.id.tvCountry);
        tvCases1 = findViewById(R.id.tvCases1);
        tvtodayCases1 = findViewById(R.id.tvtodayCases1);
        tvDeaths1 = findViewById(R.id.tvDeaths1);
        tvtodayDeaths1 = findViewById(R.id.tvtodayDeaths1);
        tvRecovered1 = findViewById(R.id.tvRecovered1);
        tvActive1 = findViewById(R.id.tvActive1);
        tvCritical1 = findViewById(R.id.tvCritical1);

        tvCountry.setText(CountriesSurviving.countryModelsList.get(positionCountry).getCountry());
        tvCases1.setText(CountriesSurviving.countryModelsList.get(positionCountry).getCases());
        tvtodayCases1.setText(CountriesSurviving.countryModelsList.get(positionCountry).getTodayCases());
        tvDeaths1.setText(CountriesSurviving.countryModelsList.get(positionCountry).getDeaths());
        tvtodayDeaths1.setText(CountriesSurviving.countryModelsList.get(positionCountry).getTodayDeaths());
        tvRecovered1.setText(CountriesSurviving.countryModelsList.get(positionCountry).getRecovered());
        tvActive1.setText(CountriesSurviving.countryModelsList.get(positionCountry).getActive());
        tvCritical1.setText(CountriesSurviving.countryModelsList.get(positionCountry).getCritical());







    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
