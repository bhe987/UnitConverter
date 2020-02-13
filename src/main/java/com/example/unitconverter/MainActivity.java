package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtMiles, txtKilometers, txtPounds, txtKilograms, txtGallons, txtLiters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtMiles = findViewById(R.id.txtMiles);
        txtKilometers = findViewById(R.id.txtKilometers);
        txtPounds = findViewById(R.id.txtPounds);
        txtKilograms = findViewById(R.id.txtKilograms);
        txtGallons = findViewById(R.id.txtGallons);
        txtLiters = findViewById(R.id.txtLiters);


        txtF.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) {// convert F to C
                String strF = s.toString();
                Log.i("UnitConverter", "Value in txtF = " + strF);

                if (!txtF.isFocused()) return;
                if (strF.length() == 0) return;


                try {
                    double valF = Double.parseDouble(strF);
                    double valC = (valF - 32.0)*5/9;
                    String strC = Double.toString(valC);
                    Log.i("UnitConverter", "Value in txtC = " + strC);

                    MainActivity.this.txtC.setText(strC);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtC.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) { //convert C to F
                String strC = s.toString();
                Log.i("UnitConverter", "Value in txtC = " + strC);

                if (!txtC.isFocused()) return;
                if (strC.length() == 0) return;

                try {
                    double valC = Double.parseDouble(strC);
                    double valF = valC*9/5 + 32;
                    String strF = Double.toString(valF);
                    Log.i("UnitConverter", "Value in txtF = " + strF);

                    MainActivity.this.txtF.setText(strF);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );

        txtMiles.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) { //convert miles to kilometers
                String strMiles = s.toString();
                Log.i("UnitConverter", "Value in txtMiles = " + strMiles);

                if (!txtMiles.isFocused()) return;
                if (strMiles.length() == 0) return;

                try {
                    double valMiles = Double.parseDouble(strMiles);
                    double valKilometers = valMiles * 1.6093;
                    String strKilometers = Double.toString(valKilometers);
                    Log.i("UnitConverter", "Value in txtKilometers = " + strKilometers);

                    MainActivity.this.txtKilometers.setText(strKilometers);
                }  catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        txtKilometers.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {  //convert kilometers to miles
                String strKilometers = s.toString();
                Log.i("UnitConverter", "Value in txtKilometers = " + strKilometers);

                if (!txtKilometers.isFocused()) return;
                if (strKilometers.length() == 0) return;

                try {
                    double valKilometers = Double.parseDouble(strKilometers);
                    double valMiles = valKilometers/1.6093;
                    String strMiles = Double.toString(valMiles);
                    Log.i("UnitConverter", "Value in txtMiles = " + strMiles);

                    MainActivity.this.txtMiles.setText(strMiles);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        txtPounds.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) { //convert pounds to kilograms
                String strPounds = s.toString();
                Log.i("UnitConverter", "Value in txtPounds = " + strPounds);

                if (!txtPounds.isFocused()) return;
                if (strPounds.length() == 0) return;

                try {
                    double valPounds = Double.parseDouble(strPounds);
                    double valKilograms = valPounds/1.6093;
                    String strKilograms = Double.toString(valKilograms);
                    Log.i("UnitConverter", "Value in txtKilograms = " + strKilograms);

                    MainActivity.this.txtKilograms.setText(strKilograms);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        txtKilograms.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) { //convert kilograms to pounds
                String strKilograms = s.toString();
                Log.i("UnitConverter", "Value in txtKilograms = " + strKilograms);

                if (!txtKilograms.isFocused()) return;
                if (strKilograms.length() == 0) return;

                try {
                    double valKilograms = Double.parseDouble(strKilograms);
                    double valPounds = valKilograms/1.6093;
                    String strPounds = Double.toString(valPounds);
                    Log.i("UnitConverter", "Value in txtPounds = " + strPounds);

                    MainActivity.this.txtPounds.setText(strPounds);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        txtGallons.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) { //convert gallons to liters
                String strGallons = s.toString();
                Log.i("UnitConverter", "Value in txtGallons = " + strGallons);

                if (!txtGallons.isFocused()) return;
                if (strGallons.length() == 0) return;

                try {
                    double valGallons = Double.parseDouble(strGallons);
                    double valLiters = valGallons*3.7854;
                    String strLiters = Double.toString(valLiters);
                    Log.i("UnitConverter", "Value in txtLiters = " + strLiters);

                    MainActivity.this.txtLiters.setText(strLiters);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        txtLiters.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) { //convert liters to gallons
                String strLiters = s.toString();
                Log.i("UnitConverter", "Value in txtLiters = " + strLiters);

                if (!txtLiters.isFocused()) return;
                if (strLiters.length() == 0) return;

                try {
                    double valLiters = Double.parseDouble(strLiters);
                    double valGallons = valLiters/3.7854;
                    String strGallons = Double.toString(valGallons);
                    Log.i("UnitConverter", "Value in txtGallons = " + strGallons);

                    MainActivity.this.txtGallons.setText(strGallons);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
