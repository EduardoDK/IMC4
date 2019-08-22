package com.example.imc4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.annotation.Target;


public class MainActivity extends AppCompatActivity {


    //Objetos encapsulados
    private EditText editTextPeso;
    private EditText editTextAltura;
    private TextView textViewResultado;


    //Metódo Principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculado os objetos com elementos do layout
        editTextPeso = findViewById(R.id.edit_text_peso);
        editTextAltura = findViewById(R.id.edit_text_altura);
        textViewResultado = findViewById(R.id.text_view_resultado);
        textViewResultado.setText("");

    }

    public void calcularIMC(View v)
    {
        Double peso = Double.parseDouble(editTextPeso.getText()
                .toString()
                .replace(",","."));

        Double altura = Double.parseDouble(editTextAltura.getText()
                .toString()
                .replace(",","."));

        Double imc = peso/Math.pow(altura,2);



        if(imc<18.5){
                    textViewResultado.setText("Magreza");
                    textViewResultado.setTextColor(
                    getResources().getColor(R.color.magreza)

            );

        }
        else if (imc >=18.5 && imc<24.9){
                    textViewResultado.setText("Saudavel");
                    textViewResultado.setTextColor(
                    getResources().getColor(R.color.saudavel)
            );

        }
        else if(imc >=25.0 && imc< 29.9 ){
            textViewResultado.setText("Sobrepeso");
            textViewResultado.setTextColor(
                    getResources().getColor(R.color.sobrepeso)
            );

        }
        else if(imc >=30.0 && imc<34.9){
            textViewResultado.setText("Obesidade Gráu1");
            textViewResultado.setTextColor(
                    getResources().getColor(R.color.obeso1)
            );

        }
        else if(imc>=35.0 && imc<39.9){
            textViewResultado.setText("Obesidade Gráu2");
            textViewResultado.setTextColor(
                    getResources().getColor(R.color.obeso2)
            );
        }
        else if (imc>=40){
            textViewResultado.setText("Gordão");
            textViewResultado.setTextColor(
                    getResources().getColor(R.color.obeso3)
            );
        }




    }




}
