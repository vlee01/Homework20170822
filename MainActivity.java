package com.example.dandanhome.www.homework20170822;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.dandanhome.www.homework20170822.data.*;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private MyDBHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.list);

        MyDBHelper helper = new MyDBHelper( this, "student.db", null,1);
        Cursor c = helper.getReadableDatabase().query("data", null, null,null, null, null,null);
        SimpleCursorAdapter adapter = new SimpleCursorAdapter( this, android.R.layout.simple_expandable_list_item_2,c, new String[]{"name","tel"},new int[] {android.R.id.text1, android.R.id.text2},0);
        list.setAdapter(adapter);

    }

    public void click1(View v)
    {
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(it);
    }


}
