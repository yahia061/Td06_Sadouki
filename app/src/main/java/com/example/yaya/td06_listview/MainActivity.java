package com.example.yaya.td06_listview;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);

        String[] values = new String[]{
                "Device", "Geo localisation", "Accélérométre", "Connexion internet", "Dialogues", "Albums photos", "Connexion Réseau", "Gestion des fichier", "Carnet de contacts"
        };
        MonAdaptateurDeListe adaptateur = new MonAdaptateurDeListe(this, values);
        listView.setAdapter(adaptateur);

    }


}

