package com.example.intentexplicit05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button mBtnString,mBtnArray,mBtnObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnString = findViewById(R.id.buttonString);
        mBtnArray = findViewById(R.id.buttonArray);
        mBtnObject = findViewById(R.id.buttonObject);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent(AppConstant.KEY_STRING,"Hello Main2");
            }
        });

        mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] arrNums = {1,2,3,4,5,6,7,8,9,10};
                sendIntent(AppConstant.KEY_ARRAY,arrNums);
            }
        });
        mBtnObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Person> persons = new ArrayList<>();
                persons.add(new Person("Nguyen Van Teo",20));
                sendIntent(AppConstant.KEY_OBJECT, persons);
            }
        });
    }
    private <T> void sendIntent(String key , T value){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        if (value instanceof String){
            intent.putExtra(key,(String)value);
        }
        if (value instanceof int[]){
            intent.putExtra(key,(int[]) value);
        }
        if (value instanceof ArrayList<?>){
            if (value instanceof Object){
                intent.putExtra(key,(ArrayList<Person>) value);
            }
        }
        startActivity(intent);
    }
}