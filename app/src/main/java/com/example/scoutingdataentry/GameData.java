package com.example.scoutingdataentry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;


public class GameData extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    int minteger1 = 0;
    int minteger2 = 0;
    int minteger3 = 0;
    int minteger4 = 0;
    int minteger5 = 0;
    int minteger6 = 0;
    int minteger7 = 0;
    int minteger8 = 0;
    int minteger9 = 0;
    int minteger10 = 0;
    int minteger11 = 0;
    int minteger12 = 0;
    int minteger13 = 0;
    int minteger14 = 0;
    int mintegerType;
    TextView displayInteger;

    private DataLogger dataLogger = new DataLogger();
    private Storage mTempStorage = new Storage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_data);

        //Here's a link to the video I used: https://www.youtube.com/watch?v=on_OrrX7Nw4
        //Start Level Spinner
        Spinner spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Hab_Level, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);
        //End Level Spinner
        Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.Hab_Level, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);
    }

    public void increaseInteger(View view) {
        mintegerType = Integer.parseInt(view.getTag().toString());
        switch(mintegerType) {
            case 1: minteger1 = minteger1 + 1;
                mTempStorage.setsCargoShip(minteger1);
                display(minteger1, mintegerType);
                break;
            case 2: minteger2 = minteger2 + 1;
                mTempStorage.setsCargoRocket(minteger2);
                display(minteger2, mintegerType);
                break;
            case 3: minteger3 = minteger3 + 1;
                mTempStorage.setsCargoDrop(minteger3);
                display(minteger3, mintegerType);
                break;
            case 4: minteger4 = minteger4 + 1;
                mTempStorage.setsHatchShip(minteger4);
                display(minteger4, mintegerType);
                break;
            case 5: minteger5 = minteger5 + 1;
                mTempStorage.setsHatchRocket(minteger5);
                display(minteger5, mintegerType);
                break;
            case 6: minteger6 = minteger6 + 1;
                mTempStorage.setsHatchDrop(minteger6);
                display(minteger6, mintegerType);
                break;
            case 7: minteger7 = minteger7 + 1;
                mTempStorage.setgCargoShip(minteger7);
                display(minteger7, mintegerType);
                break;
            case 8: minteger8 = minteger8 + 1;
                mTempStorage.setgCargoRocket(minteger8);
                display(minteger8, mintegerType);
                break;
            case 9: minteger9 = minteger9 + 1;
                mTempStorage.setgCargoDrop(minteger9);
                display(minteger9, mintegerType);
                break;
            case 10: minteger10 = minteger10 + 1;
                mTempStorage.setgHatchShip(minteger10);
                display(minteger10, mintegerType);
                break;
            case 11: minteger11 = minteger11 + 1;
                mTempStorage.setgHatchRocket(minteger11);
                display(minteger11, mintegerType);
                break;
            case 12: minteger12 = minteger12 + 1;
                mTempStorage.setgHatchDrop(minteger12);
                display(minteger12, mintegerType);
                break;
            case 13: minteger13 = minteger13 + 1;
                mTempStorage.setTechFouls(minteger13);
                display(minteger13, mintegerType);
                break;
            case 14: minteger14 = minteger14 + 1;
                mTempStorage.setFouls(minteger14);
                display(minteger14, mintegerType);
                break;
        }

    }
    public void decreaseInteger(View view) {
        mintegerType = Integer.parseInt(view.getTag().toString());
        switch(mintegerType) {
            case 1: minteger1 = minteger1 - 1;
                mTempStorage.setsCargoShip(minteger1);
                display(minteger1, mintegerType);
                break;
            case 2: minteger2 = minteger2 - 1;
                mTempStorage.setsCargoRocket(minteger2);
                display(minteger2, mintegerType);
                break;
            case 3: minteger3 = minteger3 - 1;
                mTempStorage.setsCargoDrop(minteger3);
                display(minteger3, mintegerType);
                break;
            case 4: minteger4 = minteger4 - 1;
                mTempStorage.setsHatchShip(minteger4);
                display(minteger4, mintegerType);
                break;
            case 5: minteger5 = minteger5 - 1;
                mTempStorage.setsHatchRocket(minteger5);
                display(minteger5, mintegerType);
                break;
            case 6: minteger6 = minteger6 - 1;
                mTempStorage.setsHatchDrop(minteger6);
                display(minteger6, mintegerType);
                break;
            case 7: minteger7 = minteger7 - 1;
                mTempStorage.setgCargoShip(minteger7);
                display(minteger7, mintegerType);
                break;
            case 8: minteger8 = minteger8 - 1;
                mTempStorage.setgCargoRocket(minteger8);
                display(minteger8, mintegerType);
                break;
            case 9: minteger9 = minteger9 - 1;
                mTempStorage.setgCargoDrop(minteger9);
                display(minteger9, mintegerType);
                break;
            case 10: minteger10 = minteger10 - 1;
                mTempStorage.setgHatchShip(minteger10);
                display(minteger10, mintegerType);
                break;
            case 11: minteger11 = minteger11 - 1;
                mTempStorage.setgHatchRocket(minteger11);
                display(minteger11, mintegerType);
                break;
            case 12: minteger12 = minteger12 - 1;
                mTempStorage.setgHatchDrop(minteger12);
                display(minteger12, mintegerType);
                break;
            case 13: minteger13 = minteger13 - 1;
                mTempStorage.setTechFouls(minteger13);
                display(minteger13, mintegerType);
                break;
            case 14: minteger14 = minteger14 - 1;
                mTempStorage.setFouls(minteger14);
                display(minteger14, mintegerType);
                break;
        }

    }
    private void display(int number, int mintegerType) {

        switch(mintegerType) {
            case 1: displayInteger = (TextView) findViewById(R.id.integer_number1);
                displayInteger.setText("" + number);
                break;
            case 2: displayInteger = (TextView) findViewById(R.id.integer_number2);
                displayInteger.setText("" + number);
                break;
            case 3: displayInteger = (TextView) findViewById(R.id.integer_number3);
                displayInteger.setText("" + number);
                break;
            case 4: displayInteger = (TextView) findViewById(R.id.integer_number4);
                displayInteger.setText("" + number);
                break;
            case 5: displayInteger = (TextView) findViewById(R.id.integer_number5);
                displayInteger.setText("" + number);
                break;
            case 6: displayInteger = (TextView) findViewById(R.id.integer_number6);
                displayInteger.setText("" + number);
                break;
            case 7: displayInteger = (TextView) findViewById(R.id.integer_number7);
                displayInteger.setText("" + number);
                break;
            case 8: displayInteger = (TextView) findViewById(R.id.integer_number8);
                displayInteger.setText("" + number);
                break;
            case 9: displayInteger = (TextView) findViewById(R.id.integer_number9);
                displayInteger.setText("" + number);
                break;
            case 10: displayInteger = (TextView) findViewById(R.id.integer_number10);
                displayInteger.setText("" + number);
                break;
            case 11: displayInteger = (TextView) findViewById(R.id.integer_number11);
                displayInteger.setText("" + number);
                break;
            case 12: displayInteger = (TextView) findViewById(R.id.integer_number12);
                displayInteger.setText("" + number);
                break;
            case 13: displayInteger = (TextView) findViewById(R.id.integer_number13);
                displayInteger.setText("" + number);
                break;
            case 14: displayInteger = (TextView) findViewById(R.id.integer_number14);
                displayInteger.setText("" + number);
                break;
        }

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //In case I wanna do stuff with selected text
        String text = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void saveData(View view) {
        dataLogger.addData(5940, mTempStorage);
        System.out.println(dataLogger.getData());
    }

//    public void writeToCSV(String filePath, ArrayList<Translation2d> path) {
//
//        try {
//            FileWriter fw = new FileWriter(file);
//            PrintWriter pw = new PrintWriter(fw, true);
//
//            pw.println("x,y");
//            for (Translation2d t : path) {
//                pw.println(t.getX().getFeet() + "," + t.getY().getFeet());
//            }
//
//            // pw.print("adsffdsaadsfdsfaadsffads1");
//
//            pw.close();
//        } catch (IOException ioe) {
//            System.out.println(ioe);
//        }
//
//    }

}
