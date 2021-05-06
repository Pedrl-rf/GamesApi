package com.example.intentejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextInputEditText nombre = findViewById(R.id.tv_nombre);
        TextInputEditText apellido = findViewById(R.id.tv_apellido);
        TextInputEditText edad = findViewById(R.id.tv_edad);
        Button botonEnviar = findViewById(R.id.bt_enviar);
        Button si = findViewById(R.id.bt_si);
        Button no = findViewById(R.id.bt_no);
        TextInputEditText nombreEmpresa = findViewById(R.id.tv_empresa);
        TextInputEditText nombreConcurso = findViewById(R.id.tv_nombreConcurso);
        LinearLayout empresa = findViewById(R.id.layout_empresa);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nombre.getText().toString().isEmpty()){
                    nombre.setError("RELLENA EL CAMPO");
                }else if(apellido.getText().toString().isEmpty()){
                    apellido.setError("RELLENA EL CAMPO");
                }else if(edad.getText().toString().isEmpty()){
                    edad.setError("RELLENA EL CAMPO");
                }else{
                    String nombrePersona;
                    nombrePersona = nombre.getText().toString();
                    nombre.toString();
                    Intent intent = new Intent(MainActivity.this, ganadorTelefono.class);
                    intent.putExtra("Nombre", nombrePersona);
                    startActivity(intent);
                }
            }
        });

        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(empresa.getVisibility() == View.GONE){
                    empresa.setVisibility(View.VISIBLE);

                }else if(nombreEmpresa.getText().toString().isEmpty()){
                    nombreEmpresa.setError("RELLENA EL CAMPO");
                }else if(nombreConcurso.getText().toString().isEmpty()) {
                    nombreConcurso.setError("RELLENA EL CAMPO");
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(empresa.getVisibility() == View.VISIBLE){
                    empresa.setVisibility(View.GONE);
                }
            }
        });

    }
}