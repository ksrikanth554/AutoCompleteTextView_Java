package com.sritech.www.autocompletetextview_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
   public AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv=findViewById(R.id.actv);
        /*Xml Based Array */
        //String[] values=getResources().getStringArray(R.array.countries);

        /*Java Based Array */

         String[] values={"Afganishtan","Australia","Canada","Cyprus","India","Iran"};

        /*System layout for View */
        ArrayAdapter myAdapter=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,values);

        /*User layout for View */
        // ArrayAdapter myAdapter=new ArrayAdapter(this,R.layout.indview,values);
        actv.setAdapter(myAdapter);
        actv.setThreshold(1);
    }
}
