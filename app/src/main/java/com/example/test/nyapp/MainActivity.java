package com.example.test.nyapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;

import com.example.test.nyapp.adapters.MyCustomAdapter;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private Button afegirAmic;
    private Button veurePart;
    private ListView llistaAmics;
    private ArrayList<Amic> amics;
    private MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        afegirAmic=(Button) findViewById(R.id.afegirButton);
        veurePart=(Button) findViewById(R.id.veurePartButton);
        llistaAmics=(ListView) findViewById(R.id.llista);
        amics=new ArrayList<Amic>();
        adapter=new MyCustomAdapter(getApplicationContext(),amics);

        llistaAmics.setAdapter(adapter);

        //Afegit un amic per comprovar coses, res més!
        Amic amic1=new Amic("Pablo Marmol");
        adapter.add(amic1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
