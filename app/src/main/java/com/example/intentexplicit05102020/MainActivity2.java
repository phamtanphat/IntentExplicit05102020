package com.example.intentexplicit05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 1 : Nhan kieu string
//        Intent intent = getIntent();
//        if (intent != null){
//            String message = intent.getStringExtra(AppConstant.KEY_STRING);
//            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//        }
    }
}