package com.example.jultrautomaintenance;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    Button ManageVehicles, VideoLessons, ShopsNearMe;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        ManageVehicles = (Button) findViewById(R.id.Manage_Vehicles);
        VideoLessons = (Button) findViewById(R.id.Video_Lessons);
        ShopsNearMe = (Button) findViewById(R.id.Shops_Near_Me);

        VideoLessons.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,VideoTutorials.class));
            }
        });

        ShopsNearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MapsActivity.class));
            }
        });


    }

    public void ManageVehiclesOnClick(View view){
        startActivity(new Intent(HomeActivity.this,ManageVehicleActivity.class));
    }

}
