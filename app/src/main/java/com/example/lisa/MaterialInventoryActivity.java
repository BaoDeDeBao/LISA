package com.example.lisa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MaterialInventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_inventory);

        final TextView dateTime1 = (TextView) findViewById(R.id.dateTime);
        //final String currentTime = "";
        final String dateFormat = DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());

        dateTime1.setBackground(getResources().getDrawable(R.color.colorLightGreen));
        //dateTime1.setText(""+ dateFormat);

        final Handler someHandler = new Handler(getMainLooper());
        someHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String currentTime = (new SimpleDateFormat("HH:mm aa", Locale.US).format(new Date()));
                someHandler.postDelayed(this, 1000);
                dateTime1.setText(dateFormat + " " + currentTime);
            }
        }, 10);
        //EditText .getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);

    }
}