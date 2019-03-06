package com.example.scoutingdataentry;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;

import static android.os.Environment.DIRECTORY_DOWNLOADS;


public class GameData extends AppCompatActivity {

    private static final String LOG_TAG = GameData.class.getName();

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
    EditText gamePoints;
    EditText notes;
    RadioGroup radioGroup1;
    RadioButton selectedRadioButton;
    CheckBox yellowCard;
    CheckBox redCard;
    CheckBox broke;

    private DataLogger dataLogger = new DataLogger();
    public static Storage mTempStorage = new Storage();
    private Storage toPrint = new Storage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_data);

        //Start Level Spinner
        Spinner spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Hab_Level, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        mTempStorage.setStartLevel(Integer.parseInt(parent.getSelectedItem().toString()));
                        System.out.println("value added to startlevel: " + mTempStorage.getStartLevel());
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

        //End Level Spinner
        Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.Hab_Level, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        mTempStorage.setEndLevel(Integer.parseInt(parent.getSelectedItem().toString()));
                        System.out.println("value added to endlevel: " + mTempStorage.getEndLevel());
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
        //Alliance RadioGroup
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedRadioButton = findViewById(checkedId);
                mTempStorage.setAlliance(selectedRadioButton.getText().toString());
            }
        });

        //Idk what's going on with formatting here
        //Yellow Card Checkbox
        yellowCard = findViewById(R.id.checkbox_yellow);
        yellowCard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                  @Override
                                                  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                      mTempStorage.setYellowCard(isChecked);
                                                  }
                                              }
        );

        //Red Card Checkbox
        redCard = findViewById(R.id.checkbox_red);
        redCard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                               @Override
                                               public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                   mTempStorage.setRedCard(isChecked);
                                               }
                                           }
        );

        //Brokeded Checkbox
        broke = findViewById(R.id.checkbox_broke);
        broke.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                             @Override
                                             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                 mTempStorage.setBroke(isChecked);
                                             }
                                         }
        );

    }

    public void increaseInteger(View view) {
        mintegerType = Integer.parseInt(view.getTag().toString());
        switch (mintegerType) {
            case 1:
                minteger1 = minteger1 + 1;
                mTempStorage.setsCargoShip(minteger1);
                display(minteger1, mintegerType);
                break;
            case 2:
                minteger2 = minteger2 + 1;
                mTempStorage.setsCargoRocket(minteger2);
                display(minteger2, mintegerType);
                break;
            case 3:
                minteger3 = minteger3 + 1;
                mTempStorage.setsCargoDrop(minteger3);
                display(minteger3, mintegerType);
                break;
            case 4:
                minteger4 = minteger4 + 1;
                mTempStorage.setsHatchShip(minteger4);
                display(minteger4, mintegerType);
                break;
            case 5:
                minteger5 = minteger5 + 1;
                mTempStorage.setsHatchRocket(minteger5);
                display(minteger5, mintegerType);
                break;
            case 6:
                minteger6 = minteger6 + 1;
                mTempStorage.setsHatchDrop(minteger6);
                display(minteger6, mintegerType);
                break;
            case 7:
                minteger7 = minteger7 + 1;
                mTempStorage.setgCargoShip(minteger7);
                display(minteger7, mintegerType);
                break;
            case 8:
                minteger8 = minteger8 + 1;
                mTempStorage.setgCargoRocket(minteger8);
                display(minteger8, mintegerType);
                break;
            case 9:
                minteger9 = minteger9 + 1;
                mTempStorage.setgCargoDrop(minteger9);
                display(minteger9, mintegerType);
                break;
            case 10:
                minteger10 = minteger10 + 1;
                mTempStorage.setgHatchShip(minteger10);
                display(minteger10, mintegerType);
                break;
            case 11:
                minteger11 = minteger11 + 1;
                mTempStorage.setgHatchRocket(minteger11);
                display(minteger11, mintegerType);
                break;
            case 12:
                minteger12 = minteger12 + 1;
                mTempStorage.setgHatchDrop(minteger12);
                display(minteger12, mintegerType);
                break;
            case 13:
                minteger13 = minteger13 + 1;
                mTempStorage.setTechFouls(minteger13);
                display(minteger13, mintegerType);
                break;
            case 14:
                minteger14 = minteger14 + 1;
                mTempStorage.setFouls(minteger14);
                display(minteger14, mintegerType);
                break;
        }

    }

    public void decreaseInteger(View view) {
        mintegerType = Integer.parseInt(view.getTag().toString());
        switch (mintegerType) {
            case 1:
                minteger1 = minteger1 - 1;
                mTempStorage.setsCargoShip(minteger1);
                display(minteger1, mintegerType);
                break;
            case 2:
                minteger2 = minteger2 - 1;
                mTempStorage.setsCargoRocket(minteger2);
                display(minteger2, mintegerType);
                break;
            case 3:
                minteger3 = minteger3 - 1;
                mTempStorage.setsCargoDrop(minteger3);
                display(minteger3, mintegerType);
                break;
            case 4:
                minteger4 = minteger4 - 1;
                mTempStorage.setsHatchShip(minteger4);
                display(minteger4, mintegerType);
                break;
            case 5:
                minteger5 = minteger5 - 1;
                mTempStorage.setsHatchRocket(minteger5);
                display(minteger5, mintegerType);
                break;
            case 6:
                minteger6 = minteger6 - 1;
                mTempStorage.setsHatchDrop(minteger6);
                display(minteger6, mintegerType);
                break;
            case 7:
                minteger7 = minteger7 - 1;
                mTempStorage.setgCargoShip(minteger7);
                display(minteger7, mintegerType);
                break;
            case 8:
                minteger8 = minteger8 - 1;
                mTempStorage.setgCargoRocket(minteger8);
                display(minteger8, mintegerType);
                break;
            case 9:
                minteger9 = minteger9 - 1;
                mTempStorage.setgCargoDrop(minteger9);
                display(minteger9, mintegerType);
                break;
            case 10:
                minteger10 = minteger10 - 1;
                mTempStorage.setgHatchShip(minteger10);
                display(minteger10, mintegerType);
                break;
            case 11:
                minteger11 = minteger11 - 1;
                mTempStorage.setgHatchRocket(minteger11);
                display(minteger11, mintegerType);
                break;
            case 12:
                minteger12 = minteger12 - 1;
                mTempStorage.setgHatchDrop(minteger12);
                display(minteger12, mintegerType);
                break;
            case 13:
                minteger13 = minteger13 - 1;
                mTempStorage.setTechFouls(minteger13);
                display(minteger13, mintegerType);
                break;
            case 14:
                minteger14 = minteger14 - 1;
                mTempStorage.setFouls(minteger14);
                display(minteger14, mintegerType);
                break;
        }

    }

    private void display(int number, int mintegerType) {

        switch (mintegerType) {
            case 1:
                displayInteger = (TextView) findViewById(R.id.integer_number1);
                displayInteger.setText("" + number);
                mTempStorage.setsCargoShip(number);
                break;
            case 2:
                displayInteger = (TextView) findViewById(R.id.integer_number2);
                displayInteger.setText("" + number);
                mTempStorage.setsCargoRocket(number);
                break;
            case 3:
                displayInteger = (TextView) findViewById(R.id.integer_number3);
                displayInteger.setText("" + number);
                mTempStorage.setsCargoDrop(number);
                break;
            case 4:
                displayInteger = (TextView) findViewById(R.id.integer_number4);
                displayInteger.setText("" + number);
                mTempStorage.setsHatchShip(number);
                break;
            case 5:
                displayInteger = (TextView) findViewById(R.id.integer_number5);
                displayInteger.setText("" + number);
                mTempStorage.setsHatchRocket(number);
                break;
            case 6:
                displayInteger = (TextView) findViewById(R.id.integer_number6);
                displayInteger.setText("" + number);
                mTempStorage.setsHatchDrop(number);
                break;
            case 7:
                displayInteger = (TextView) findViewById(R.id.integer_number7);
                displayInteger.setText("" + number);
                mTempStorage.setgCargoShip(number);
                break;
            case 8:
                displayInteger = (TextView) findViewById(R.id.integer_number8);
                displayInteger.setText("" + number);
                mTempStorage.setgCargoRocket(number);
                break;
            case 9:
                displayInteger = (TextView) findViewById(R.id.integer_number9);
                displayInteger.setText("" + number);
                mTempStorage.setgCargoDrop(number);
                break;
            case 10:
                displayInteger = (TextView) findViewById(R.id.integer_number10);
                displayInteger.setText("" + number);
                mTempStorage.setgHatchShip(number);
                break;
            case 11:
                displayInteger = (TextView) findViewById(R.id.integer_number11);
                displayInteger.setText("" + number);
                mTempStorage.setgHatchRocket(number);
                break;
            case 12:
                displayInteger = (TextView) findViewById(R.id.integer_number12);
                displayInteger.setText("" + number);
                mTempStorage.setgHatchDrop(number);
                break;
            case 13:
                displayInteger = (TextView) findViewById(R.id.integer_number13);
                displayInteger.setText("" + number);
                mTempStorage.setTechFouls(number);
                break;
            case 14:
                displayInteger = (TextView) findViewById(R.id.integer_number14);
                displayInteger.setText("" + number);
                mTempStorage.setFouls(number);
                break;
        }

    }

    public void saveData(View view) {

        //Grabbing points
        gamePoints = findViewById(R.id.editText);
        mTempStorage.setPoints(Integer.parseInt(gamePoints.getText().toString()));

        //Grabbing notes
        notes = findViewById(R.id.editText2);
        mTempStorage.setNotes(notes.getText().toString());

        //dataLogging
        dataLogger.addData(mTempStorage.getTeamNumber(), mTempStorage);
        HashMap<Integer, Storage> data = dataLogger.getData();

        String filename = "gamedata.csv";

        //Run through all the keys (teams), setting toPrint to all the values, and then printing it all out
        for (int key : data.keySet()) {
            toPrint.setAlliance(data.get(key).getAlliance());
            toPrint.setStartLevel(data.get(key).getStartLevel());
            toPrint.setsCargoShip(data.get(key).getsCargoShip());
            toPrint.setsCargoRocket(data.get(key).getsCargoRocket());
            toPrint.setsCargoDrop(data.get(key).getsCargoDrop());
            toPrint.setsHatchShip(data.get(key).getsHatchShip());
            toPrint.setsHatchRocket(data.get(key).getsHatchRocket());
            toPrint.setsHatchDrop(data.get(key).getsHatchDrop());
            toPrint.setgCargoShip(data.get(key).getgCargoShip());
            toPrint.setgCargoRocket(data.get(key).getgCargoRocket());
            toPrint.setgCargoDrop(data.get(key).getgCargoDrop());
            toPrint.setgHatchShip(data.get(key).getgHatchShip());
            toPrint.setgHatchRocket(data.get(key).getgHatchRocket());
            toPrint.setgHatchDrop(data.get(key).getgHatchDrop());
            toPrint.setEndLevel(data.get(key).getEndLevel());
            toPrint.setTechFouls(data.get(key).getTechFouls());
            toPrint.setFouls(data.get(key).getFouls());
            toPrint.setYellowCard(data.get(key).getYellowCard());
            toPrint.setRedCard(data.get(key).getRedCard());
            toPrint.setBroke(data.get(key).getBroke());
            toPrint.setPoints(data.get(key).getPoints());
            toPrint.setNotes(data.get(key).getNotes());
            writeCSV(toPrint.toString(), filename, GameData.this);
        }

        startActivity(new Intent(GameData.this, RobotEntry.class));
    }

    public void writeCSV(String dataToSave, String filename, Context cntxt) {
        File file = new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_DOWNLOADS), filename);
        FileOutputStream fOut;
        OutputStreamWriter osw;
        if(file.exists()) {
            System.out.println("Gamedata.csv exists");
            if (isWritable()) {
                System.out.println("External Storage is Writable to");
                try {
                    System.out.println("HELLLLOOOO???");
                    fOut = cntxt.openFileOutput(filename, Context.MODE_APPEND);
                    osw = new OutputStreamWriter(fOut);
                    osw.write(dataToSave);
                    osw.close();
                    Toast.makeText(this, "CSV in downloads folder on phone", Toast.LENGTH_LONG).show();
                    MediaScannerConnection.scanFile(this, new String[] {file.toString()}, null, null);
                    System.out.println("Should have printed");
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                    Toast.makeText(this, "Failed to save CSV", Toast.LENGTH_LONG).show();
                }
            } else {
                System.out.println("External Storage is NOT Writable to");
            }

        //Works for writing new file, if previously nonexistent
        } else {
            System.out.println("Gamedata.csv does not exist");
            if (isWritable()) {
                System.out.println("External Storage is Writable to");
                try {
                    fOut = new FileOutputStream(file);
                    osw = new OutputStreamWriter(fOut);
                    osw.write(dataToSave);
                    osw.close();
                    Toast.makeText(this, "CSV in downloads folder on phone", Toast.LENGTH_LONG).show();
                    MediaScannerConnection.scanFile(this, new String[] {file.toString()}, null, null);
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                    Toast.makeText(this, "Failed to save CSV", Toast.LENGTH_LONG).show();
                }
            } else {
                System.out.println("External Storage is NOT Writable to");
            }
        }

    }

    public boolean isWritable() {
        /* Checks if external storage is available for read and write */
        String state = Environment.getExternalStorageState();

        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

}
