package com.example.intentejercicio;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class premioElegido extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.premioelegido);
        TextView congratulation = findViewById(R.id.premio_ganador);
        Bundle bundle = getIntent().getExtras();
        String nombrePremio = bundle.getString("premioElegido");
        congratulation.setText("¡HAS GANADO DE PREMIO UN/UNA "+nombrePremio+"!");

    }
}
