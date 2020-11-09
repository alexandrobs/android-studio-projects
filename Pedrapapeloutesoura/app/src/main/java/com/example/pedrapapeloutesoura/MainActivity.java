package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

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

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("Pedra");

    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("Papel");

    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("Tesoura");

    }

    public void opcaoSelecionada(String opcaoUser){
        ImageView imageResultado = findViewById(R.id.escolhaApp);

        int numeroAleatorio = new Random().nextInt(3);
        String[] opcoes = {"Pedra","Papel","Tesoura"};
        String opcaoApp = opcoes[numeroAleatorio];

        switch (opcaoApp){
            case "Pedra" :
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel" :
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "Tesoura" :
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        TextView resultadoJogo = findViewById(R.id.resultadoUsuario);

        if(
                opcaoApp == "Pedra" && opcaoUser == "Tesoura" ||
                opcaoApp == "Papel" && opcaoUser == "Pedra" ||
                opcaoApp == "Tesoura" && opcaoUser == "Papel"){//opções para o App vencer
                resultadoJogo.setText("Você perdeu :("
                );
        }else if(
                opcaoUser == "Pedra" && opcaoApp == "Tesoura" ||
                opcaoUser == "Papel" && opcaoApp == "Pedra" ||
                opcaoUser == "Tesoura" && opcaoApp == "Papel") {//opções para o App vencer
                resultadoJogo.setText("Você venceu :)"
                );//opções para o User vencer
        }else{
                resultadoJogo.setText("Empatou com o App :)"
                );
        }
        System.out.println("Opção do Usuário: " + opcaoUser + " Opção do App: " + opcaoApp);
    }
}