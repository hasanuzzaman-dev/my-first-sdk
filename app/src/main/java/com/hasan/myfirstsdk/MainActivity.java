package com.hasan.myfirstsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hasan.myfirstlibrary.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorld.printLog("TEST", "This is test");

        HelloWorld.simpleToast(this, "This is test");
    }
}