package com.example.intentejercicio;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.intentejercicio.R.id.playstation;

public class ganadorTelefono extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecciontelefonolayout);
        TextView tx_ps = findViewById(R.id.tx_ps);
        TextView tx_nintendo = findViewById(R.id.tx_nintendo);
        TextView tx_telefono = findViewById(R.id.tx_iphone);
        RadioGroup premios = (RadioGroup) findViewById(R.id.opcionespremios);
        Button enviar = findViewById(R.id.but_enviar);
        TextView ganador = findViewById(R.id.ganador);
        Bundle bundle = getIntent().getExtras();
        String nombreGanador = bundle.getString("Nombre");
        ganador.setText("Felicidades " + nombreGanador);
        /*RadioButton playstation =  premios.findViewById(R.id.playstation);
        RadioButton nintendo = premios.findViewById(R.id.nintendo);
        RadioButton iphone = premios.findViewById(R.id.iphone);*/

      premios.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (group.getCheckedRadioButtonId() == R.id.playstation) {
                        String premioUno;
                        premioUno = (String) tx_ps.getText();
                        Intent primerPremio = new Intent(ganadorTelefono.this, premioElegido.class);
                        primerPremio.putExtra("premioElegido", premioUno);

                    enviar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(primerPremio);
                        }
                    });
                    } else if (group.getCheckedRadioButtonId() == R.id.nintendo){
                        String premioDos;
                        premioDos = (String) tx_nintendo.getText();
                        Intent segundoPremio = new Intent(ganadorTelefono.this, premioElegido.class);
                        segundoPremio.putExtra("premioElegido", premioDos);

                    enviar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(segundoPremio);
                        }
                    });
                    } else if(group.getCheckedRadioButtonId() == R.id.iphone){
                        String premioTres;
                        premioTres = (String) tx_telefono.getText();
                        Intent tercerPremio = new Intent(ganadorTelefono.this, premioElegido.class);
                        tercerPremio.putExtra("premioElegido", premioTres);

                    enviar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(tercerPremio);
                        }
                    });
                    }
                }
        });
    }
}


