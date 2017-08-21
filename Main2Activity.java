package com.example.dandanhome.www.homework20170822;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;


public class Main2Activity extends AppCompatActivity {

    private MyDBHelper helper;

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViews();
    }

    private void findViews() {
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
    }

    public void add( View v) {
        String ID   = editText1.getText().toString();
        String name = editText2.getText().toString();
        String tel  = editText3.getText().toString();
        ContentValues values = new ContentValues();
        values.put("ID",ID);
        values.put("name",name);
        values.put("tel",tel);
        long id = helper.getWritableDatabase().insert("data",null,values);
        Log.d("ADD", id+"");
    }

}
