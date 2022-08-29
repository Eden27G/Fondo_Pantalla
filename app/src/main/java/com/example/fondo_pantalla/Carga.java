package com.example.fondo_pantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Carga extends AppCompatActivity {

    TextView app_name,desarrollado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carga);

        //Cambio de letra
        String ubicaion = "fuentes/varsity_regular.ttf";
        Typeface tf = Typeface.createFromAsset(Carga.this.getAssets(),ubicaion);

        app_name = findViewById(R.id.app_name);
        desarrollado = findViewById(R.id.desarrollado);

        final int Duracion = 5000;//tiempo en que va estar en la pantalla de inicio

        new Handler().postDelayed(() -> {
            //Codigo que se ejecutara
            Intent intent = new Intent(Carga.this,MainActivity.class); //Nos mandara a la pantalla MainActivity
            startActivity(intent);
            finish();   //cuando retrocede ya no regresas a la pantalla de carga
        },Duracion);

        app_name.setTypeface(tf);
        desarrollado.setTypeface(tf);
    }
}