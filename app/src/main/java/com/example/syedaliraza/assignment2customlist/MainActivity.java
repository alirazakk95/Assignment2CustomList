package com.example.syedaliraza.assignment2customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] name;
    public static String[] numbers;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.listView);

        name=getResources().getStringArray(R.array.Names);
        numbers=getResources().getStringArray(R.array.Numbers);

        /*ArrayAdapter<String> adName=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,name);
        ArrayAdapter<String> adNumber=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,numbers);
        list.setAdapter(adName);*/

        customAdapter adapter=new customAdapter(this,name,numbers);
        list.setAdapter(adapter);
    }
}
