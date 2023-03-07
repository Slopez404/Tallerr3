package com.example.tallerr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class IngresarUsuario extends AppCompatActivity {

    TextView tvBoton;
    String x="Texto de prueba";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_usuario);

        tvBoton = (TextView) findViewById(R.id.tvBoton);

        tvBoton.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(IngresarUsuario.this, ResultadoNota.class);
                intent.putExtra ("Dato01",x);
                intent.putExtra("Dato02", "...");
                startActivity(intent);
            }
        });
    }

}