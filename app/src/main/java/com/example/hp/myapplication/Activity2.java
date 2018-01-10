package com.example.hp.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView detailsField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // detailsField
        detailsField = (TextView)findViewById(R.id.detailsTextView);

        // get extra data
        detailsField.setText(getIntent().getStringExtra("DATA_DETAILS"));

    }

}

