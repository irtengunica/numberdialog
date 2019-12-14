package com.example.okul.numberdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.NumberPicker;


public class MainActivity extends FragmentActivity {
    Button dfragbutton;
    Button deneme1;
    Button deneme2;
    Button alertdfragbutton;
    FragmentManager fm = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dfragbutton = (Button) findViewById(R.id.dfragbutton);
        alertdfragbutton = (Button) findViewById(R.id.alertdfragbutton);
        deneme1 = (Button) findViewById(R.id.button1);
        deneme2 = (Button) findViewById(R.id.button2);
        deneme2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //CustomDialog1Calistir();
            }
        });
        deneme1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditNameDialog deeee=new EditNameDialog();
                deeee.show(fm,"deneme");
            }
        });
        // Capture button clicks
        dfragbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                DFragment dFragment = new DFragment();
                // Show DialogFragment
                dFragment.show(fm,"Dialog Fragment");
            }
        });


        // Capture button clicks
        alertdfragbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                AlertDFragment alertdFragment = new AlertDFragment();
                // Show Alert DialogFragment
                alertdFragment.show(fm, "Alert Dialog Fragment");
            }
        });
    }




}

