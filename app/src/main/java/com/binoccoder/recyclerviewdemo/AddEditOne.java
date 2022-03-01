package com.binoccoder.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddEditOne extends AppCompatActivity {
    private EditText userId, userName, userDate, userImageUrl;
    private Button clickOk, clickCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_one);
        userId=(EditText)findViewById(R.id.et_id);
        userName=(EditText)findViewById(R.id.et_name);
        userDate=(EditText)findViewById(R.id.et_date);
        userImageUrl=(EditText)findViewById(R.id.et_imageUrl);
        clickOk=(Button)findViewById(R.id.btn_ok);
        clickCancel=(Button)findViewById(R.id.btn_cancel);

        clickOk.setOnClickListener(v->{
            Intent intent=new Intent(AddEditOne.this, MainActivity.class);
            startActivity(intent);
        });

        clickCancel.setOnClickListener(v->{
            Intent intent=new Intent(AddEditOne.this, MainActivity.class);
            startActivity(intent);
        });


    }
}