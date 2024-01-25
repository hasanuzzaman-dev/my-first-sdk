package com.hasan.myfirstlibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class HelloWorld {
    public static void main(String[] main){

    }

    public static void printLog(String tag, String msg){
        Log.d(tag,msg);
    }

    public static void simpleToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
