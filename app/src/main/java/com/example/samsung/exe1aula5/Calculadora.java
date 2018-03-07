package com.example.samsung.exe1aula5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
    }

    public void abriCalculadora(View view) {
        setContentView(R.layout.activity_calculadora);
    }

    public void encerrar(View view) {
        finish();
    }

    public void voltarMenu(View view) {
        setContentView(R.layout.principal);
    }

    public void mais(View view) {
        float resultado =  0.f,valor1 = 0.f, valor2 = 0.f;
         valor1 = Float.parseFloat(((EditText) findViewById(R.id.valor1)).getText().toString());
         valor2 = Float.parseFloat(((EditText) findViewById(R.id.valor2)).getText().toString());
        resultado =  (valor1 + valor2);

        ((TextView) findViewById(R.id.resultado)).setText("Resultado:"+resultado);
    }

    public void menos(View view) {
        float resultado =  0.f,valor1 = 0.f, valor2 = 0.f;
        valor1 = Float.parseFloat(((EditText) findViewById(R.id.valor1)).getText().toString());
        valor2 = Float.parseFloat(((EditText) findViewById(R.id.valor2)).getText().toString());
        resultado =  (valor1 - valor2);

        ((TextView) findViewById(R.id.resultado)).setText("Resultado:"+resultado);
    }

    public void vezes(View view) {
        float resultado =  0.f,valor1 = 0.f, valor2 = 0.f;
        valor1 = Float.parseFloat(((EditText) findViewById(R.id.valor1)).getText().toString());
        valor2 = Float.parseFloat(((EditText) findViewById(R.id.valor2)).getText().toString());
        resultado =  (valor1 * valor2);

        ((TextView) findViewById(R.id.resultado)).setText("Resultado:"+resultado);
    }

    public void divisao(View view) {
        float resultado =  0.f,valor1 = 0.f, valor2 = 0.f;
        valor1 = Float.parseFloat(((EditText) findViewById(R.id.valor1)).getText().toString());
        valor2 = Float.parseFloat(((EditText) findViewById(R.id.valor2)).getText().toString());
        resultado =  (valor1 / valor2);

        ((TextView) findViewById(R.id.resultado)).setText("Resultado:"+resultado);
    }
}
