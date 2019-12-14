package com.example.okul.numberdialog;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;

/**
 * Created by okul on 4.6.2016.
 */
public class DFragment extends DialogFragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dialogfragment, container,
                false);


        getDialog().setTitle("DialogFragment Tutorial");

        NumberPicker np;
        np = (NumberPicker) rootView.findViewById(R.id.numberPicker1);
        np.setMinValue(10);
        np.setMaxValue(40);
        np.setWrapSelectorWheel(false);
        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

            }
        });
        // Do something else
        return rootView;
    }
}
