package br.ulbra.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ednumero1,ednumero2;
    Button btsomar,btsubtrair,btmultiplicar,btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednumero1 = findViewById(R.id.ednumero1);
        ednumero2 = findViewById(R.id.ednumero2);
        btsomar = findViewById(R.id.btsomar);
        btsubtrair = findViewById(R.id.btsubtrair);
        btmultiplicar = findViewById(R.id.btmultiplicar);
        btdividir = findViewById(R.id.btdividir);

        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double soma = num1 + num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado soma");
                dialogo.setMessage("A soma é: " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double subtracao = num1 - num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado subtração");
                dialogo.setMessage("A subtração é: " + subtracao);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double multiplicacao = num1 * num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado multiplicação");
                dialogo.setMessage("A multiplicação é: " + multiplicacao);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double divisao = num1 / num2;

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado divisão");
                dialogo.setMessage("A divisão é: " + divisao);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });
    }
}