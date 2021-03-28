package com.example.mapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//En este programa que hice yo logre pasar info de una activity a otra de un mapa y que me fije en las coordenadas ingresadas por usuario. Esto
//a traves de intents y putextras

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private String coord1;
    private String coord2;

    public static final String key1="llave1";
    public static final String key2="llave2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editTextNumber);
        et2 = (EditText) findViewById(R.id.editTextNumber2);
    }

    public void lanzaract(View view){
        coord1 = et1.getText().toString();
        coord2 = et2.getText().toString();

        buscar(coord1,coord2);
    }

    public void buscar(String s1, String s2){

        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra(key1, s1);
        intent.putExtra(key2, s2);
        startActivity(intent);
    }
}