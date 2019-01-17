package com.fgv.strublic.tcc;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.ic_logo);

        setContentView(R.layout.activity_main);
    }

    public void quemsomos(View view)
    {
        Intent intent = new Intent(MainActivity.this, Page1.class);
        startActivity(intent);
    }

    public void cultura(View view)
    {
        Intent intent = new Intent(MainActivity.this, Page2.class);
        startActivity(intent);
    }

    public void fiquepordentro(View view)
    {
        Intent intent = new Intent(MainActivity.this, Page3.class);
        startActivity(intent);
    }

    public void calendarios(View view)
    {
        Intent intent = new Intent(MainActivity.this, Page4.class);
        startActivity(intent);
    }


    public void politicas(View view)
    {
        Intent intent = new Intent(MainActivity.this, Page5.class);
        startActivity(intent);
    }

    public void griders(View view)
    {
        Intent intent = new Intent(MainActivity.this, Page6.class);
        startActivity(intent);
    }
}
