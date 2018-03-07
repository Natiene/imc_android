package com.example.samsung.exe1aula5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IMC extends AppCompatActivity {
float peso,altura,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

    }

    public void calcular(View view) {
        peso = 0.f;
        altura = 0.f;
        result = 0.f;
        peso = Float.parseFloat(((EditText) findViewById(R.id.peso)).getText().toString());
        altura = Float.parseFloat(((EditText) findViewById(R.id.altura)).getText().toString());
        altura =  altura * altura;
        result = (peso/altura);

        ((TextView) findViewById(R.id.resultado)).setText("Resultado:"+result);


    }
}
