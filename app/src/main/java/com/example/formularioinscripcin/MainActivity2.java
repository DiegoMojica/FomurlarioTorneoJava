package com.example.formularioinscripcin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText equipo, nombre, edad, numero;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        equipo   = (EditText) findViewById(R.id.editEquipo);
        nombre = (EditText) findViewById(R.id.editNombre);
        edad     = (EditText) findViewById(R.id.editEdad);
        numero   = (EditText) findViewById(R.id.editNumero);
        aceptar  = (Button) findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = equipo.getText().toString();
                String ape = nombre.getText().toString();
                String age = edad.getText().toString();
                String email = numero.getText().toString();

                Intent i = new Intent(MainActivity2.this, MainActivity3.class);

                i.putExtra("name", name);
                i.putExtra("ape", ape);
                i.putExtra("age", age);
                i.putExtra("email", email);

                startActivity(i);
            }
        });

    }
}