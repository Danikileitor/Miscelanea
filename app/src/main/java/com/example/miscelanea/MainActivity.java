package com.example.miscelanea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText txtOperando1, txtOperando2;
    public TextView lbResultado;
    public String valorInicial;
    public int operando1, operando2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOperando1 = findViewById(R.id.txtOperando1);
        txtOperando2 = findViewById(R.id.txtOperando2);
        lbResultado = findViewById(R.id.lbResultado);
        valorInicial = getString(R.string.lbResultado);
    }

    public void potencia(View view) {
        if (!String.valueOf(txtOperando1.getText()).matches("")){
            operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        }else{operando1 = 1;}
        if (!String.valueOf(txtOperando2.getText()).matches("")){
            operando2 = Integer.parseInt(String.valueOf(txtOperando2.getText()));
        }else{operando2 = 0;}
        resultado = (int) Math.pow(operando1, operando2);
        lbResultado.setText(String.valueOf(resultado));
    }

    public void factorial(View view) {
        if (!String.valueOf(txtOperando1.getText()).matches("")){
            operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        }else{operando1 = 1;}
        resultado = 1;
        for (int i=operando1;i>0;i--)resultado=resultado*i;
        lbResultado.setText(String.valueOf(resultado));
    }

    @SuppressWarnings("StringConcatenationInLoop")
    public void fibonacci(View view) {
        if (!String.valueOf(txtOperando1.getText()).matches("")){
            operando1 = Integer.parseInt(String.valueOf(txtOperando1.getText()));
        }else{operando1 = 1;}
        String fibonacci = "";
        if (operando1>=1) {
            int num1 = 0, num2 = 1, suma = 1;
            for (int i = 1; i <= operando1; i++) {
                fibonacci += suma + "/";
                suma = num1 + num2;
                num1 = num2;
                num2 = suma;
            }
        fibonacci = fibonacci.substring(0, fibonacci.length()-1);
        }else{fibonacci = "0";}
        lbResultado.setText(fibonacci);
    }
}