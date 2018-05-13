package com.sujk2k.hello.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // called when button gets clicked
    public void onClickFindBeer(View view) {
        BeerExpert expert = new BeerExpert();

        // get reference to the textView
        TextView brands = (TextView) findViewById(R.id.brands);

        // get the reference to the spinner
        Spinner colors = (Spinner) findViewById(R.id.color);

        // get selected item in the spinner
        String beerType = String.valueOf(colors.getSelectedItem());

        // get recommended beers from BeerExpert
        List<String> recommendedBeers = expert.getBrands(beerType);

        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : recommendedBeers) {
            brandsFormatted.append(brand).append("\n");
        }

        // display in textview
        brands.setText(brandsFormatted);
    }
}
