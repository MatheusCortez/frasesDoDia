package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovaFrase(View view){

        String [] frases={
                "Onde o amor impera, não há desejo de poder; e onde o poder predomina," +
                " há falta de amor. Um é a sombra do outro.",
                "O sofrimento precisa ser superado, e o único meio de superá-lo é suportando-o.",
                "Qualquer árvore que queira tocar os céus precisa ter raízes tão profundas a ponto de tocar os infernos.",

                "Ser normal é a meta dos fracassados!",
                "Tudo que a mente moderna não consegue definir ela considera como demência."
        };
        int numero = new Random().nextInt(5);

        TextView texto=findViewById(R.id.textResult);
        texto.setText(frases[numero]);
    }

}