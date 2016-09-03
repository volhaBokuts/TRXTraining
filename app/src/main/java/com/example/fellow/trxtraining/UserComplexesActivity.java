package com.example.fellow.trxtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserComplexesActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnHome, btnExercises, btnPlaygrounds, btnUserComplexes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_complexes);

        btnHome = (Button) findViewById(R.id.buttonHome);
        btnExercises = (Button) findViewById(R.id.buttonExercises);
        btnUserComplexes = (Button) findViewById(R.id.buttonUserComplexes);
        btnPlaygrounds = (Button) findViewById(R.id.buttonPlaygrounds);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.buttonExercises:
                Intent intentExercises = new Intent(this, ExercisesActivity.class);
                startActivity(intentExercises);
                break;
            case R.id.buttonHome:
                Intent intentUserComplexes = new Intent(this, HomeActivity.class);
                startActivity(intentUserComplexes);
                break;
            case R.id.buttonPlaygrounds:
                Intent intentPlaygrounds = new Intent(this, PlaygroundsActivity.class);
                startActivity(intentPlaygrounds);
                break;
        }
    }
}
