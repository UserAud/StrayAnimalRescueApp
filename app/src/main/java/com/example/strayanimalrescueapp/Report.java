package com.example.strayanimalrescueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Report extends AppCompatActivity {

    Button btn_submit;
    EditText et_name,et_phone, et_category, et_condition, et_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        btn_submit = findViewById(R.id.btn_submitreport);
        et_name = findViewById(R.id.et_namereport);
        et_phone = findViewById(R.id.et_phonereport);
        et_location = findViewById(R.id.et_locationreport);
        et_category = findViewById(R.id.et_categoryreport);
        et_condition = findViewById(R.id.et_conditionreport);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editTextisEmpty()){
                    return;
                }
                Toast.makeText(Report.this, "Report submit successful", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(Report.this, userchoice.class);
                startActivity(i);
            }
        });
    }

    private boolean editTextisEmpty() {
        if(TextUtils.isEmpty(et_name.getText().toString())){
            et_name.setError("Cannot be Empty");
        }
        if(TextUtils.isEmpty(et_phone.getText().toString())){
            et_phone.setError("Cannot be Empty");
        }
        if(TextUtils.isEmpty(et_condition.getText().toString())){
            et_condition.setError("Cannot be Empty");
        }
        if(TextUtils.isEmpty(et_category.getText().toString())){
            et_category.setError("Cannot be Empty");
        }
        if(TextUtils.isEmpty(et_location.getText().toString())){
            et_location.setError("Cannot be Empty");
        }

        if(TextUtils.isEmpty(et_name.getText().toString()) || TextUtils.isEmpty(et_phone.getText().toString()) || TextUtils.isEmpty(et_condition.getText().toString()) || TextUtils.isEmpty(et_category.getText().toString()) || TextUtils.isEmpty(et_location.getText().toString()))
            return true;
        else
            return false;
    }
}