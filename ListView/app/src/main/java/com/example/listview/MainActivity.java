package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView itensLocais;

    private String[] locais = {"Fortaleza", "Maranguape", "Parangaba", "Itaóca",
    "São Paulo","Rio de Janeiro","Aracaju","Bom Sucesso","Castelão","Canindé","Beira-Mar","Siqueira","Bairro do Limão","Jaraguá","Russas","Rondônia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itensLocais = findViewById(R.id.listaLocais);

        //cria adptador para a lista
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                locais
        );

        //adicionando adaptador para a lista
        itensLocais.setAdapter(adapter);

        //adiciona clique na lista
        itensLocais.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = itensLocais.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();
            }
        });


    }
}