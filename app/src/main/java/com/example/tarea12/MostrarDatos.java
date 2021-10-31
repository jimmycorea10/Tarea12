package com.example.tarea12;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MostrarDatos extends MainActivity {

    EditText nombre2,apellido2,edad2,correo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        nombre2 = findViewById(R.id.txtnombre2);
        apellido2 = findViewById(R.id.txtapellido2);
        edad2 = findViewById(R.id.txtedad2);
        correo2 = findViewById(R.id.txtcorreo2);

        String txtnombre = getIntent().getStringExtra("nombre");
        String txtapellido = getIntent().getStringExtra("apellido");
        String txtedad = getIntent().getStringExtra("edad");
        String txtcorreo = getIntent().getStringExtra("correo");

        nombre2.setText(txtnombre);
        apellido2.setText(txtapellido);
        edad2.setText(txtedad);
        correo2.setText(txtcorreo);


    }

}