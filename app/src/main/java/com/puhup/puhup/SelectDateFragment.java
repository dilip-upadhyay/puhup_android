package com.puhup.puhup;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

/**
 * Created by Manish on 1/4/2017.
 */

public class SelectDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    Fragment fragment;

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar calendar = Calendar.getInstance();
        int yy = calendar.get(Calendar.YEAR);
        int mm = calendar.get(Calendar.MONTH);
        int dd = calendar.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), this, yy, mm, dd);
    }

    @Override
    public void onDateSet(DatePicker view, int yy, int mm, int dd) {
        populateSetDate(yy, mm + 1, dd);
    }

    public void populateSetDate(int year, int month, int day) {
        String date = (month + "/" + day + "/" + year);
        EditText editTextDate = (EditText) fragment.getView().findViewById(R.id.dob);
        editTextDate.setText(date);
    }

}