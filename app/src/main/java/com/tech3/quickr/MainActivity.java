package com.tech3.quickr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.listView);
        String str[] = {"HELLO","H","E","L","L","O"};
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1,str));
        lv.setTextFilterEnabled(true);
    }

    public void OnItemClick(View v){
        Toast.makeText(this,"Hello",);
    }
}
