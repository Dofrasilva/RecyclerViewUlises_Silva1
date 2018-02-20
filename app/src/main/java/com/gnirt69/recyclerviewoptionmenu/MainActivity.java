package com.gnirt69.recyclerviewoptionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<RecyclerItem> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();


        String[] values = new String[]{"Resultado: \n"+"resul:\n"};
        String[]cadenas= values[0].split(":");

        for (int p=0;p<cadenas.length;p++){

            listItems.add(new RecyclerItem(" ",cadenas[p]));

        }


        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);
    }
}
