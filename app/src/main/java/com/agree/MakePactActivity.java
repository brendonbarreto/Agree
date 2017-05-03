package com.agree;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by brendon.barreto on 02/05/2017.
 */

public class MakePactActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private EditText mDateInput;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_pact);

        mDateInput = (EditText) findViewById(R.id.input_date);
        mDateInput.setEnabled(false);
        datePickerDialog = new DatePickerDialog(
                this, MakePactActivity.this, 2017, 02, 02);


        mDateInput.setOnClickListener(view -> datePickerDialog.show());

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Toast.makeText(this, "foi", Toast.LENGTH_LONG).show();
        mDateInput.setText(year+"/"+month+"/"+dayOfMonth);
    }
}
