package com.example.mrambaut.tallercasa2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Array{
    private static ArrayList<OperacionesRealizadas> operaciones = new ArrayList<>();

    public static void SalvarCambios (OperacionesRealizadas ops) {

        operaciones.add(ops);
    }

    public static ArrayList<OperacionesRealizadas> getOperaciones(){
        return operaciones;
    }
}
