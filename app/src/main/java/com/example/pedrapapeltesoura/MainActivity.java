    package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void SelecionadoPedra(View view) {

            this.opcaoSelecionada("Pedra");

        }

        public void SelecionadoTesoura(View view) {

            this.opcaoSelecionada("Tesoura");

        }
        public void SelecionadoPapel(View view) {

            this.opcaoSelecionada("Papel");

        }


        public void opcaoSelecionada(String opcaoSelecionada){

            ImageView EscolhaApp = findViewById(R.id.EscolhaApp);
            TextView textoresultado = findViewById(R.id.resultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = opcoes[numero];

        switch (opcaoApp){

            case "Pedra" :
                EscolhaApp.setImageResource(R.drawable.pedra);
                break;

            case "Papel" :
                EscolhaApp.setImageResource(R.drawable.papel);
                break;

            case "Tesoura" :
                EscolhaApp.setImageResource(R.drawable.tesoura);
                break;

        }

        if (
                (opcaoApp == "Tesoura" && opcaoSelecionada == "Papel") ||
                (opcaoApp == "Papel" && opcaoSelecionada == "Pedra") ||
                (opcaoApp == "Pedra" && opcaoSelecionada == "Tesoura")
        ){
            textoresultado.setText("Você perdeu :( ");

        }else if (
                (opcaoSelecionada == "Tesoura" && opcaoApp == "Papel") ||
                        (opcaoSelecionada == "Papel" && opcaoApp == "Pedra") ||
                        (opcaoSelecionada == "Pedra" && opcaoApp == "Tesoura")

        ) {
            textoresultado.setText("Você ganhouu :) ");

        }else {//Empate
            textoresultado.setText("Empatamos ;) ");

        }





        //logs Testes
        System.out.println( "Item Selecionado" + opcaoSelecionada );
        System.out.println("Escolha app" + numero);
    }

}