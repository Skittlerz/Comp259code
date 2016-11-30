package com.braun1792.shippingcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

/**
 * Created by braun1792 on 11/30/2016.
 */
public class appMenuActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_menu);
    }

    public void calorieScreen(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void shippingScreen(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}