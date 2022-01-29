package com.example.strayanimalrescueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdoptUser extends AppCompatActivity {
    Button btn_submit;
    EditText et_name, et_phone, et_gender, et_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt_user);

        btn_submit = findViewById(R.id.btn_submit);
        et_name = findViewById(R.id.et_nameuser);
        et_phone = findViewById(R.id.et_phoneuser);
        et_gender = findViewById(R.id.et_genderuser);
        et_address = findViewById(R.id.et_adressuser);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextisEmpty()) {
                    return;
                }
                Toast.makeText(AdoptUser.this, "Application successful! Please wait for the contact from Volunteer.", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(AdoptUser.this, userchoice.class);
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
            if(TextUtils.isEmpty(et_gender.getText().toString())){
                et_gender.setError("Cannot be Empty");
            }
            if(TextUtils.isEmpty(et_address.getText().toString())){
                et_address.setError("Cannot be Empty");
            }

            if(TextUtils.isEmpty(et_name.getText().toString()) || TextUtils.isEmpty(et_phone.getText().toString()) || TextUtils.isEmpty(et_gender.getText().toString()) || TextUtils.isEmpty(et_address.getText().toString()))
                return true;
            else
                return false;
        }
}