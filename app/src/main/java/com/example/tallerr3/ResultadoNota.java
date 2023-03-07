package com.example.tallerr3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoNota extends AppCompatActivity {
    TextView codigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_nota);

        recibirDatos();
    }

    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String d1 = extras.getString("Dato01");
        String d2 = extras.getString("Dato02");

        codigo = (TextView) findViewById(R.id.codigo);
        codigo.setText(d1);

    }
}