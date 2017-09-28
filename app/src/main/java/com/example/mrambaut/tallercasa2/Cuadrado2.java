package com.example.mrambaut.tallercasa2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Cuadrado2 extends AppCompatActivity {
    private TextView total;
    private double c;
    private String aux;
    private Intent i;
    private Bundle b;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado_dos);

        total = (TextView)findViewById(R.id.txtResultadoCaja);
        b = getIntent().getExtras();
        c = b.getDouble("Area");
        aux = ""+c;
        total.setText(aux);
    }

    public void VolverCuadrado (View v){
        i = new Intent(this, Cuadrado.class);
        startActivity(i);
    }
}

