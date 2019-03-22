package com.example.scoutingdataentry;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.ContentResolver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;

import static android.os.Environment.DIRECTORY_DOWNLOADS;
import static java.security.AccessController.getContext;

public class PitData extends AppCompatActivity {

    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioButton selectedRadioButton;
    CheckBox floorIntake;
    CheckBox sidewaysElevator;
    CheckBox shooter;
    CheckBox encoders;
    EditText wheelSizeBox;
    EditText weightBox;
    EditText elevatorSpeedBox;
    EditText highDTrainSpeed;
    EditText lowDTrainSpeed;
    EditText notesBox;
    private DataLogger dataLogger = new DataLogger();
    public static Storage mTempStorage = new Storage();
    private Storage toPrint = new Storage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pit_data);

        //Elevator height spinner
        Spinner spinner3 = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.Rocket_Level, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        mTempStorage.setElevatorHeight(Integer.parseInt(parent.getSelectedItem().toString()));
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

        //Hab Scaling
        Spinner spinner4 = findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.Scale_Level, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        mTempStorage.setHabScale(Integer.parseInt(parent.getSelectedItem().toString()));
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

        //Robopiggy Backs
        Spinner spinner5 = findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.Scale_Level, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        mTempStorage.setRoboPiggybacks(Integer.parseInt(parent.getSelectedItem().toString()));
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

        //Floor Hatch Panel Intake Checkbox
        floorIntake = findViewById(R.id.checkbox_floorIntake);
        floorIntake.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                   @Override
                                                   public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                       mTempStorage.setFloorIntake(isChecked);
                                                   }
                                               }
        );

        //Sideways Elevator Checkbox
        sidewaysElevator = findViewById(R.id.checkbox_sidewaysElevator);
        sidewaysElevator.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                        @Override
                                                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                            mTempStorage.setSidewaysElevator(isChecked);
                                                        }
                                                    }
        );

        //Shooter Checkbox
        shooter = findViewById(R.id.checkbox_shooter);
        shooter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                               @Override
                                               public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                   mTempStorage.setShooter(isChecked);
                                               }
                                           }
        );

        //Encoders checkbox
        encoders = findViewById(R.id.checkbox_encoders);
        encoders.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mTempStorage.setEncoders(isChecked);
            }
        });

        //Intake Type RadioGroup
        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedRadioButton = findViewById(checkedId);
                mTempStorage.setIntakeType(selectedRadioButton.getText().toString());
            }
        });

        //Language RadioGroup
        radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedRadioButton = findViewById(checkedId);
                mTempStorage.setLanguage(selectedRadioButton.getText().toString());
            }
        });

        //Drive Train Type RadioGroup
        radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedRadioButton = findViewById(checkedId);
                mTempStorage.setdTrainType(selectedRadioButton.getText().toString());
            }
        });

        //Strategy RadioGroup
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedRadioButton = findViewById(checkedId);
                mTempStorage.setStrategy(selectedRadioButton.getText().toString());
            }
        });

        //Sandstorm Type RadioGroup
        radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedRadioButton = findViewById(checkedId);
                mTempStorage.setSandstormType(selectedRadioButton.getText().toString());
            }
        });
    }
    public void saveData(View view) {
        //Grabbing wheel size
        wheelSizeBox = findViewById(R.id.editText1);
        mTempStorage.setWheelSize(wheelSizeBox.getText().toString());

        //Grabbing weight
        weightBox = findViewById(R.id.editText5);
        mTempStorage.setWeight(weightBox.getText().toString());

        //Grabbing elevator speed
        elevatorSpeedBox = findViewById(R.id.editText6);
        mTempStorage.setElevatorSpeed(elevatorSpeedBox.getText().toString());

        //Grabbing high drive train speed
        highDTrainSpeed = findViewById(R.id.editText4);
        mTempStorage.setHighDTrainSpeed(highDTrainSpeed.getText().toString());

        //Grabbing low drive train speed
        lowDTrainSpeed = findViewById(R.id.editText2);
        mTempStorage.setLowDTrainSpeed(lowDTrainSpeed.getText().toString());

        //Grabbing notes
        notesBox = findViewById(R.id.editText3);
        mTempStorage.setNotes(notesBox.getText().toString());

        //Grabbing Android Device ID
        String android_id = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        String filename = android_id + "_pitdata.csv";

        writeCSV(toPrint.stringPit(), filename);

        startActivity(new Intent(PitData.this, RobotEntry.class));
    }

    public void writeCSV(String dataToSave, String filename) {
        File file = new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_DOWNLOADS), filename);
        FileOutputStream fOut;
        OutputStreamWriter osw;
        if(file.exists()) {
            System.out.println("pitdata.csv exists");
            if (isWritable()) {
                System.out.println("External Storage is Writable to");
                try {
                    fOut = new FileOutputStream(file, true);
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

            //Works for writing new file, if previously nonexistent
        } else {
            System.out.println("pitdata.csv does not exist");
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
