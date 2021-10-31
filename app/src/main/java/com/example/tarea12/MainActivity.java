package com.example.tarea12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre,apellido,edad,correo;
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txtnombre);
        apellido = findViewById(R.id.txtapellido);
        edad = findViewById(R.id.txtedad);
        correo = findViewById(R.id.txtcorreo);
        guardar = findViewById(R.id.btnsalvar);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MostrarDatos.class);
                intent.putExtra("nombre",nombre.getText().toString());
                intent.putExtra("apellido",apellido.getText().toString());
                intent.putExtra("edad",edad.getText().toString());
                intent.putExtra("correo",correo.getText().toString());

                startActivity(intent);

            }
        });


    }


}