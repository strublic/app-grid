package com.fgv.strublic.tcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Page2 extends AppCompatActivity {

    private ExpandableListView listView;
    private ListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

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

        listDataHeader.add("Manifesto Gr1d");
        listDataHeader.add("Onboarding Gr1ders");
        listDataHeader.add("Onboarding Devs");
        listDataHeader.add("Onboarding Padrinhos / Madrinhas");

        List<String> manifesto = new ArrayList<>();
        manifesto.add("A nosso história é ...A nosso história é ..A nosso história é ..A nosso história é ..A nosso história é ..A nosso história é ..");

        List<String> onbgriders = new ArrayList<>();
        onbgriders.add("Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ....");

        List<String> onbdev = new ArrayList<>();
        onbdev.add("Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...");

        List<String> onbpad = new ArrayList<>();
        onbpad.add("Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...");

        listHash.put(listDataHeader.get(0),manifesto);
        listHash.put(listDataHeader.get(1),onbgriders);
        listHash.put(listDataHeader.get(2),onbdev);
        listHash.put(listDataHeader.get(3),onbpad);
    }
}