package com.example.intentexplicit05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//         1 : Nhan kieu string
//        Intent intent = getIntent();
//        if (intent != null){
//            String message = intent.getStringExtra(AppConstant.KEY_STRING);
//            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//        }
        // 2 : Nhan kieu array
//        Intent intent = getIntent();
//        if (intent != null){
//            int[] arrNums = intent.getIntArrayExtra(AppConstant.KEY_ARRAY);
//            Toast.makeText(this, arrNums.length + "", Toast.LENGTH_SHORT).show();
//        }
        //3 : Nhan kieu object
//        Intent intent = getIntent();
//        if (intent != null){
//            ArrayList<Person> persons = intent.getParcelableArrayListExtra(AppConstant.KEY_OBJECT);
//            Toast.makeText(this, persons.size() + "", Toast.LENGTH_SHORT).show();
//        }
    }
}