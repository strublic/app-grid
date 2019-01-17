package com.fgv.strublic.tcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Page3 extends AppCompatActivity {

    private ExpandableListView listView;
    private ListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

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

        listDataHeader.add("O que está acontecendo");
        listDataHeader.add("O que vai acontecer");
        listDataHeader.add("Portal Gr1d");
        listDataHeader.add("Eventos Internos");
        listDataHeader.add("Eventos Externos");
        listDataHeader.add("Talks");

        List<String> lst1 = new ArrayList<>();
        lst1.add("Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ....");

        List<String> lst2 = new ArrayList<>();
        lst2.add("Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ....");

        List<String> lst3 = new ArrayList<>();
        lst3.add("Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...");

        List<String> lst4 = new ArrayList<>();
        lst4.add("30/01/2019 - Aniversariantes do Mês");
        lst4.add("30/06/2019 - Festa Junina");
        lst4.add("31/10/2019 - Halloween Day");
        lst4.add("01/12/2019 - Festa de Confraternização");

        List<String> lst5 = new ArrayList<>();
        lst5.add("12/02/2019 -  Hackaton\nConvidado: X");
        lst5.add("23/06/2019 -  Workshop\nConvidado: X");

        List<String> lst6 = new ArrayList<>();
        lst6.add("20/03/2019 -  Comer Bem\nConvidado: X");

        listHash.put(listDataHeader.get(0),lst1);
        listHash.put(listDataHeader.get(1),lst2);
        listHash.put(listDataHeader.get(2),lst3);
        listHash.put(listDataHeader.get(3),lst4);
        listHash.put(listDataHeader.get(4),lst5);
        listHash.put(listDataHeader.get(5),lst6);
    }
}

