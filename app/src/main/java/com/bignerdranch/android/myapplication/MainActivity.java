package com.bignerdranch.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mAddVehicleBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AddVehicle
        mAddVehicleBtn = (Button)findViewById(R.id.add_vehicle);
        mAddVehicleBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {
                //start add vehicle activity
                Intent intent = new Intent(MainActivity.this, AddVehicleActivity.class);
                startActivity(intent);
            }
        });



    }
}
