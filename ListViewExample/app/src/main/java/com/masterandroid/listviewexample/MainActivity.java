package com.masterandroid.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //ListView
    ListView listView;
    //data /list to be display
    String [] mobileTypes = {"Frozen food","Cleanners","Paper goods","Meat","seafood","fruit"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listviewy);
        ArrayAdapter adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                mobileTypes
        );
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String i = mobileTypes[position];
                    openActivity2(i);
            }
        });
    }
    public void openActivity2(String i){
        Intent intent = new Intent(this, item.class);
        intent.putExtra("itemt",i);
        startActivity(intent);
    }
}