package com.example.mrambaut.tallercasa2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Circulo2 extends AppCompatActivity {
    private EditText total;
    private double c;
    private String aux;
    private Intent i;
    private Bundle b;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo2);

        total = (EditText) findViewById(R.id.txtCajaResultado);
        b = getIntent().getExtras();
        c = b.getDouble("Area");
        aux = "" + c;
        total.setText(aux);
    }

    public void VolverCirculo (View v){
        i = new Intent(this, Circulo.class);
        startActivity(i);
    }
}

