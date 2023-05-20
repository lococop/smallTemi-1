package com.example.smalltemi;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.robotemi.sdk.Robot;

public class MainActivity extends AppCompatActivity {



    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference = firebaseDatabase.getReference();

    private Robot robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void skidJoy(View view) {
        long t = System.currentTimeMillis();
        long end = t + 4000;
        while (System.currentTimeMillis() < end) {
            robot.skidJoy(1F, 0F);
            if(System.currentTimeMillis() == end - 2000){
                break;
            }
        }
    }

}