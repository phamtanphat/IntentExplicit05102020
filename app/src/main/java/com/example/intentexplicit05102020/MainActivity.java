package com.example.intentexplicit05102020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

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
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_STRING,"Hello Main2");
                startActivity(intent);
            }
        });

        mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] arrNums = {1,2,3,4,5,6,7,8,9,10};
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_ARRAY,arrNums);
                startActivity(intent);
            }
        });
        mBtnObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person person = new Person("Nguyen Van Teo",20);
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_OBJECT, person);
                startActivity(intent);
            }
        });
    }
}