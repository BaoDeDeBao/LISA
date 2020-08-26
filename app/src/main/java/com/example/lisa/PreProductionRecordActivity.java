package com.example.lisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PreProductionRecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_production_record);

        final TextView dateTimePre = (TextView) findViewById(R.id.dateTimePre);
        //final String currentTime = "";
        final String dateFormat = DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());

        final EditText edtTxtFlavor = (EditText) findViewById(R.id.edtTxtFlavor);
        edtTxtFlavor.setBackground(getResources().getDrawable(R.color.colorLightGray));
        dateTimePre.setBackground(getResources().getDrawable(R.color.colorLightGreen));
        //dateTime1.setText(""+ dateFormat);

        final Handler someHandler = new Handler(getMainLooper());
        someHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String currentTime = (new SimpleDateFormat("HH:mm aa", Locale.US).format(new Date()));
                someHandler.postDelayed(this, 1000);
                dateTimePre.setText(dateFormat + " " + currentTime);
            }
        }, 10);

    }
}
