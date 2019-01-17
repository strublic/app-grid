package com.fgv.strublic.tcc;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

public class Page6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

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
    public void time(View view)
    {
        Intent intent = new Intent(Page6.this, Page1.class);
        startActivity(intent);
    }

    public void depoimentos(View view)
    {
        Intent intent = new Intent(Page6.this, Page2.class);
        startActivity(intent);
    }

    public void falaai(View view)
    {
        Intent intent = new Intent(Page6.this, Page3.class);
        startActivity(intent);
    }

    public void faq(View view)
    {
        Intent intent = new Intent(Page6.this, Page4.class);
        startActivity(intent);
    }


    public void vem(View view)
    {
        Intent intent = new Intent(Page6.this, Page5.class);
        startActivity(intent);
    }
}

