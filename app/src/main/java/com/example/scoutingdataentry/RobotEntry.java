package com.example.scoutingdataentry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RobotEntry extends AppCompatActivity {

    EditText teamNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot_entry);
        Button btn = findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamNumber = findViewById(R.id.teamNumber);
                GameData.mTempStorage.setTeamNumber(Integer.parseInt(teamNumber.getText().toString()));
                System.out.println("Trying to add this number to addData: " + Integer.parseInt(teamNumber.getText().toString()));

                startActivity(new Intent(RobotEntry.this, GameData.class));
            }
        });

        Button btn1 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamNumber = findViewById(R.id.teamNumber);
                GameData.mTempStorage.setTeamNumber(Integer.parseInt(teamNumber.getText().toString()));


                startActivity(new Intent(RobotEntry.this, PitData.class));
            }
        });

    }
}
