package com.example.cmltdstudent.takehomeassignment09_ningelb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {


    private EditText vacation;
    private EditText days;
    private CheckBox passport;

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference foodRef = database.getReference("vacation");


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        vacation = (EditText) findViewById(R.id.vacation);
        days = (EditText) findViewById(R.id.days);
        passport = (CheckBox) findViewById(R.id.passport);
    }

    public void firebase (View view) {

        String addVacation = vacation.getText().toString();
        int addDays = Integer.parseInt(days.getText().toString());
        boolean isPassport = passport.isChecked();

        Vacation vacation = new Vacation(addVacation, addDays, isPassport);
        foodRef.push().setValue(vacation);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
