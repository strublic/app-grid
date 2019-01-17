package com.fgv.strublic.tcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Page1 extends AppCompatActivity {

    private ExpandableListView listView;
    private ListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

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

        listDataHeader.add("Nossa História");
        listDataHeader.add("Missão");
        listDataHeader.add("Visão");
        listDataHeader.add("Valores");
        listDataHeader.add("Nosso Mercado");
        listDataHeader.add("Estratégia de Negócio");

        List<String> historia = new ArrayList<>();
        historia.add("A nosso história é ...A nosso história é ..A nosso história é ..A nosso história é ..A nosso história é ..A nosso história é ..");

        List<String> missao = new ArrayList<>();
        missao.add("Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ...Nossa Missão é ....");

        List<String> visao = new ArrayList<>();
        visao.add("Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...Visão? ...");

        List<String> valores = new ArrayList<>();
        valores.add("Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...Valores são ...");

        List<String> mercado = new ArrayList<>();
        mercado.add("O mercado que ....O mercado que ..O mercado que ..O mercado que ..O mercado que ..O mercado que ..O mercado que ..");

        List<String> negocio = new ArrayList<>();
        negocio.add("Nossa Estratégia de negoc..Nossa Estratégia de negoc..Nossa Estratégia de negoc..Nossa Estratégia de negoc..Nossa Estratégia de negoc...");

        listHash.put(listDataHeader.get(0),historia);
        listHash.put(listDataHeader.get(1),missao);
        listHash.put(listDataHeader.get(2),visao);
        listHash.put(listDataHeader.get(3),valores);
        listHash.put(listDataHeader.get(4),mercado);
        listHash.put(listDataHeader.get(5),negocio);
    }
}

