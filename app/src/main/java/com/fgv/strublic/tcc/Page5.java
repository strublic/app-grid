package com.fgv.strublic.tcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Page5 extends AppCompatActivity {

    private ExpandableListView listView;
    private ListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("UBER");
        listDataHeader.add("Reembolso");
        listDataHeader.add("Compras");
        listDataHeader.add("Silêncio");

        List<String> lst1 = new ArrayList<>();
        lst1.add("A nosso história é ...A nosso história é ..A nosso história é ..A nosso história é ..A nosso história é ..A nosso história é ..");

        List<String> lst2 = new ArrayList<>();
        lst2.add("Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ....");

        List<String> lst3 = new ArrayList<>();
        lst3.add("Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...");

        List<String> lst4 = new ArrayList<>();
        lst4.add("Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...");

        listHash.put(listDataHeader.get(0),lst1);
        listHash.put(listDataHeader.get(1),lst2);
        listHash.put(listDataHeader.get(2),lst3);
        listHash.put(listDataHeader.get(3),lst4);
    }
}
