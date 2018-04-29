package com.example.sebnem.haberapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HaberSayfasi extends AppCompatActivity {

    static String ID;
    ListView listele;
    final List<Gazete> gazeteler = new ArrayList<Gazete>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haber_sayfasi);
        listele = (ListView) findViewById(R.id.listemiz);

        GazeteAdapter adapter = new GazeteAdapter(this,gazeteler);
        listele.setAdapter(adapter);

        gazeteler.add(new Gazete("CNN"));
        gazeteler.add(new Gazete("HaberTürk"));
        gazeteler.add(new Gazete("Hürriyet"));
        gazeteler.add(new Gazete("Milliyet"));
        gazeteler.add(new Gazete("New York Times"));
        gazeteler.add(new Gazete("Posta"));
        gazeteler.add(new Gazete("Sabah"));


        listele.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ID = Long.toString(position);
                Intent intent = new Intent(HaberSayfasi.this,WebSite.class);
                startActivity(intent);
            }
        });
        /*final String[] gazeteler = {
                "Hürriyet",
                "Sabah",
                "Milliyet"
        };
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,gazeteler);
        listele.setAdapter(adapter);

        listele.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(HaberSayfasi.this);
                alertDialog.setMessage(gazeteler[position]).setCancelable(false)
                        .setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.create().show();
            }
        });
        */
    }
}
