package com.hfad.finalproject.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import com.hfad.finalproject.modal.Info;
import com.hfad.finalproject.R;

public class FormActivity extends BaseActivtity {
    EditText name;
    EditText age;
    EditText gender;
    EditText enrolledDate;
    EditText email;
    EditText extraInfo;
    RatingBar rating;
    Button button;
    Boolean isFromUpdate=false;
    Info info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        init();
        boolean isToAddNew = getIntent().getBooleanExtra("addNews", false);
        if(isToAddNew){
            isFromUpdate=true;
            name.setText(info.getName());
            age.setText(info.getAge());
            gender.setText(info.getGender());
            email.setText(info.getEmail());
            enrolledDate.setText(info.getEnrolledDate());
            extraInfo.setText(info.getExtraInfo());

        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFromUpdate){
                    myApplication.getDbDatabaseManager();



                }

            }
        });


    }
    public void init(){
        name=(EditText)findViewById(R.id.edtName);
        age=(EditText)findViewById(R.id.edtGender);
        gender=(EditText)findViewById(R.id.edtGender);
        enrolledDate=(EditText)findViewById(R.id.edtEnrolledDate);
        email=(EditText)findViewById(R.id.edtEmail);
        extraInfo=(EditText)findViewById(R.id.edtExtInfo);
        rating=(RatingBar)findViewById(R.id.ratingID);
        button=(Button) findViewById(R.id.buttonSave);
    }

}
