package com.isetkl.application_produitshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class typehuile extends AppCompatActivity
{
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typehuile);

        listView = findViewById(R.id.listView);

        ArrayList<Integer> images = new ArrayList();
        images.add(R.drawable.f);
        images.add(R.drawable.f);




        ArrayList<String> Texte = new ArrayList();
        Texte.add(getResources().getString(R.string.hvisage));
        Texte.add(getResources().getString(R.string.hcorps));


        Adapter_categorie adapter_categorie = new Adapter_categorie(this,images,Texte);
        listView.setAdapter(adapter_categorie);

    }
}
