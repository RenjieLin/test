package edu.qc.seclass.glm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SearchItemByType extends AppCompatActivity {

    ListView listView;
    //data /list to be display
    String [] item_type = {"Frozen Food","Pharmacy","Fruits","Meat"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_item_by_type);

        ListView listView=(ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item_type);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), displayItem.class);
                String type=(String)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),type,Toast.LENGTH_LONG).show();
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });
    }
}