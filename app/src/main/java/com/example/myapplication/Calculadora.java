package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.mariuszgromada.math.mxparser.Expression;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpression;

public class Calculadora extends AppCompatActivity {

    String texto2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView texto = findViewById(R.id.textView);

        Button botonMas = findViewById(R.id.botonPlus);
        Button botonMenos = findViewById(R.id.buttonmenos);
        Button botonDividir = findViewById(R.id.button_dividir);
        Button botonMultiplicar = findViewById(R.id.button_multiplicar);
        Button botonIgual = findViewById(R.id.button_igual);
        Button punto = findViewById(R.id.button_punto);
        Button botonAc = findViewById(R.id.botonAc);
        Button botonCe = findViewById(R.id.botonCe);
        Button boton1 = findViewById(R.id.button_1);
        Button boton2 = findViewById(R.id.button2);
        Button boton3 = findViewById(R.id.button_3);
        Button boton4 = findViewById(R.id.button_4);
        Button boton5 = findViewById(R.id.button_5);
        Button boton6 = findViewById(R.id.button_6);
        Button boton7 = findViewById(R.id.button_7);
        Button boton8 = findViewById(R.id.button_8);
        Button boton9 = findViewById(R.id.button_9);
        Button boton0 = findViewById(R.id.button_0);


        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "-";
                texto.setText(texto2);


            }
        });
        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "+";
                texto.setText(texto2);
            }
        });
        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texto2 += "*";
                texto.setText(texto2);
            }
        });
        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "/";
                texto.setText(texto2);
            }
        });
        botonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String textoAC = "";
                texto2 = "";

                texto.setText(textoAC);


            }
        });
        botonCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String textoAux="";
               char letraAux;

                for (int i = 0; i< texto2.length() -1; i++){

                    textoAux += texto2.charAt(i);

                }

                texto2 = textoAux;

                texto.setText(textoAux);
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texto2 += "7";
                texto.setText(texto2);
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "8";
                texto.setText(texto2);
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "9";
                texto.setText(texto2);


            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "4";
                texto.setText(texto2);
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texto2 += "5";
                texto.setText(texto2);
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "6";
                texto.setText(texto2);
            }
        });


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "1";
                texto.setText(texto2);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "2";
                texto.setText(texto2);


            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                texto2 += "3";
                texto.setText(texto2);
            }
        });
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texto2 += "0";
                texto.setText(texto2);
            }
        });


        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texto2 += ".";
                texto.setText(texto2);

            }
        });


        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Expression expression = new Expression(texto2);

                double valor = expression.calculate();
                texto2 = String.valueOf(valor);
                texto.setText(String.valueOf(valor));

            }
        });

    }



}


