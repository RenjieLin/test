package edu.qc.seclass.glm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class displayItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_item);
        Bundle bundle = getIntent().getExtras();
        String itype=bundle.getString("type","");
        String [] items ={"","","","","","","","","","","","","","","","","",""};
        String [][] item = {{"Apple","Fruits"},{"Beef","Meat"},{"Chicken","Meat"},{"Shrimp","Meat"},{"Orange","Fruits"},{"Banana","Fruits"},{"Avocado","Fruits"},
                {"Toothpaste","Pharmacy"},{"Floss","Pharmacy"},{"Tooth brush","Pharmacy"},{"Ice Cream","Frozen Food"},{"Grapes","Fruits"},{"Olives","Fruits"},{"Papaya","Fruits"},{"Peaches","Fruits"},{"Pear","Fruits"},{"Pineapple","Fruits"}
                ,{"Venison","Meat"},{"Mutton","Meat"},{"Squab","Meat"},{"Carabeef","Meat"},{"Chevon","Meat"},{"Turkey","Meat"},{"Fish","Meat"},{"oyster","Meat"},
                {"Levothyroxine","Pharmacy"},{"Lisinopril","Pharmacy"},{"Atorvastatin","Pharmacy"},{"Metformin","Pharmacy"},{"Amlodipine","Pharmacy"},{"Metoprolol","Pharmacy"},{"Omeprazole","Pharmacy"},{"Simvastatin","Pharmacy"},{"Losartan","Pharmacy"},{"Albuterol","Pharmacy"},
                {"Daily Harvest Mint Cacao Smoothie","Frozen Food"},{"Kashi 7 Grain Waffles","Frozen Food"},{"Healthy Choice Pesto & Egg White Scramble","Frozen Food"},{"Amy's Black Beans & Tomatoes Breakfast Burrito","Frozen Food"},{"Dr. Praeger's Hearty Breakfast Bowl","Frozen Food"},{"Amy's Cheese Pizza","Frozen Food"},{"Newman's Own White Thin & Crispy Pizza","Frozen Food"},{"Peas of Mind Cheese Pizza","Frozen Food"},{"KidFresh Wagon Wheels Mac 'N Cheese","Frozen Food"},{"Lean Cuisine Four Cheese Cannelloni","Frozen Food"},{"Cape Gourmet Cooked Shrimp","Frozen Food"},{"SeaPak Salmon Burgers","Frozen Food"}};
        int j = 0;
        for(int i = 0; i < item.length;i++){
            if(item[i][1].equals(itype)){
                items[j]=item[i][0];
                j+=1;
            }
        }

        ListView listView=(ListView) findViewById(R.id.itemList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                alertDialog(parent,position);
            }
        });
    }
    private void alertDialog(final AdapterView<?> parent, final int position) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("Enter the Quantity of selected item");
        dialog.setTitle("Input Box");
        EditText input = new EditText(this);

        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        input.setRawInputType(Configuration.KEYBOARD_12KEY);
        dialog.setView(input);

        dialog.setPositiveButton("Add",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int which) {

                        String type=(String)parent.getItemAtPosition(position);
                        Toast.makeText(getApplicationContext(),type,Toast.LENGTH_LONG).show();
                        final Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.putExtra("type",type);

                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"item add to list",Toast.LENGTH_LONG).show();
                    }
                });
        dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog=dialog.create();
        alertDialog.show();
    }
}