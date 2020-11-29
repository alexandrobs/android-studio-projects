package com.example.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.adapter.AdapterFilms;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //criar filmes
        this.criarFilmes();

        //configurar adapter
        AdapterFilms adapterFilms = new AdapterFilms(listaFilmes);

        //configurar recyclet view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterFilms);

    }

    public void criarFilmes(){

        Filme filme0 = new Filme("Sonic", "aventura", "2020");
        listaFilmes.add(filme0);

        Filme filme1 = new Filme("Boneco Assassino", "Terror", "2019");
        listaFilmes.add(filme1);

        Filme filme2 = new Filme("Pica Pau", "animação", "2018");
        listaFilmes.add(filme2);

        Filme filme3 = new Filme("Peppa Pig", "desenho", "2015");
        listaFilmes.add(filme3);

        Filme filme4 = new Filme("titulo", "genero", "1986");
        listaFilmes.add(filme4);

        Filme filme5 = new Filme("titulo", "genero", "1998");
        listaFilmes.add(filme5);

        Filme filme6 = new Filme("titulo", "genero", "2011");
        listaFilmes.add(filme6);

        Filme filme7 = new Filme("titulo", "genero", "2000");
        listaFilmes.add(filme7);

        Filme filme8 = new Filme("titulo", "genero", "1997");
        listaFilmes.add(filme8);

        Filme filme9 = new Filme("Chaplin", "drama", "1920");
        listaFilmes.add(filme9);


    }
}