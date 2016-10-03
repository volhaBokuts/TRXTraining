package com.example.fellow.trxtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTraining, btnExercises, btnPlaygrounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTraining = (Button) findViewById(R.id.buttonTraining);
        btnExercises = (Button) findViewById(R.id.buttonExercises);
        btnPlaygrounds = (Button) findViewById(R.id.buttonPlaygrounds);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.buttonTraining:
                Intent intentTraining = new Intent(this, ExercisesActivity.class);
                startActivity(intentTraining);
            case R.id.buttonExercises:
                Intent intentExercises = new Intent(this, ExercisesActivity.class);
                startActivity(intentExercises);
                break;
            case R.id.buttonPlaygrounds:
                Intent intentPlaygrounds = new Intent(this, PlaygroundsActivity.class);
                startActivity(intentPlaygrounds);
                break;
        }
    }
}
