package com.example.theburguerprovectv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class armadoPedido extends AppCompatActivity {

    RadioGroup groupHamburguesa,groupOpcion,groupPapa,groupBebida,groupPostre;
    Button buttonCarga, rearmado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armado_pedido);

        groupHamburguesa = findViewById(R.id.seleccion_hamburguesa);
        groupOpcion = findViewById(R.id.seleccion_opcion);
        groupPapa = findViewById(R.id.seleccion_papas);
        groupBebida = findViewById(R.id.seleccion_bebidas);
        groupPostre = findViewById(R.id.seleccion_postres);
        rearmado = findViewById(R.id.rearmado);
        buttonCarga = findViewById(R.id.buttonCarga);

        rearmado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                groupHamburguesa.clearCheck();
                groupOpcion.clearCheck();
                groupPapa.clearCheck();
                groupBebida.clearCheck();
                groupPostre.clearCheck();
            }
        });


        buttonCarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radioHamburguesa;
                String radioOpcion;
                String radioPapa;
                String radioBebida;
                String radioPostre;
                String linea = "";
                if (groupHamburguesa.getCheckedRadioButtonId() == -1) {
                } else {
                    int idHamburguesa;
                    idHamburguesa = groupHamburguesa.getCheckedRadioButtonId();
                    RadioButton rb = findViewById(idHamburguesa);
                    radioHamburguesa=rb.getText().toString();
                    linea = radioHamburguesa;

                }
                if (groupOpcion.getCheckedRadioButtonId() == -1) {
                } else {
                    int idOpcion;
                    idOpcion = groupOpcion.getCheckedRadioButtonId();
                    RadioButton rb = findViewById(idOpcion);
                    radioOpcion=rb.getText().toString();
                    linea = linea + " Opción " + radioOpcion;

                }
                if (groupPapa.getCheckedRadioButtonId() == -1) {
                } else {
                    int idPapa;
                    idPapa = groupPapa.getCheckedRadioButtonId();
                    RadioButton rb = findViewById(idPapa);
                    radioPapa=rb.getText().toString();
                    if (linea == "") {
                        linea = radioPapa;
                    } else {
                        linea = linea + "-" + radioPapa;
                    }

                }
                if (groupBebida.getCheckedRadioButtonId() == -1) {
                } else {
                    int idBebida;
                    idBebida = groupBebida.getCheckedRadioButtonId();
                    RadioButton rb = findViewById(idBebida);
                    radioBebida=rb.getText().toString();
                    if (linea == "") {
                        linea = radioBebida;
                    } else {
                        linea = linea + "-" + radioBebida;
                    }

                }
                if (groupPostre.getCheckedRadioButtonId() == -1) {
                } else {
                    int idPostre;
                    idPostre = groupPostre.getCheckedRadioButtonId();
                    RadioButton rb = findViewById(idPostre);
                    radioPostre=rb.getText().toString();
                    if (linea == "") {
                        linea = radioPostre;
                    } else {
                        linea = linea + "-" + radioPostre;
                    }

                }

                Intent data = new Intent();
                data.putExtra("linea", linea);
                setResult(Activity.RESULT_OK, data);
                finish();
            }

        });
    }
}