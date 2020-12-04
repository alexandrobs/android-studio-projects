package com.example.bancodedadossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            //criar BD
            SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("app", MODE_PRIVATE, null);
            //criar tabela
            //sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS clientes (nome VARCHAR, idade INT(3) ) ");

            //inserir dados
//            sqLiteDatabase.execSQL("INSERT INTO clientes (nome, idade) VALUES ('Alex', 34)");
//            sqLiteDatabase.execSQL("INSERT INTO clientes (nome, idade) VALUES ('Auri', 48)");
//            sqLiteDatabase.execSQL("INSERT INTO clientes (nome, idade) VALUES ('Sofia', 9)");
//            sqLiteDatabase.execSQL("INSERT INTO clientes (nome, idade) VALUES ('Sky', 3)");
//            sqLiteDatabase.execSQL("INSERT INTO clientes (nome, idade) VALUES ('Miguelito', 1)");

            //recuperar dados
//            String consulta =
//                    "SELECT nome, idade FROM clientes " +
//                            "WHERE nome = 'Sky' AND idade = 3";

//            String consulta =
//                    "SELECT nome, idade FROM clientes " +
//                            "WHERE idade > 40 OR idade = 1";

//            String consulta =
//                    "SELECT nome, idade FROM clientes " +
//                            "WHERE nome IN ('Sky','Auri')";

//            String consulta =
//                    "SELECT nome, idade FROM clientes " +
//                            "WHERE idade IN (1, 34)";

//            String consulta =
//                    "SELECT nome, idade FROM clientes " +
//                            "WHERE idade BETWEEN 1 AND 35";

            String consulta =
                    "SELECT nome, idade FROM clientes " +
                            "WHERE nome LIKE '%k%' ";



            Cursor cursor = sqLiteDatabase.rawQuery(consulta, null);

            //indices da tabela
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");

            cursor.moveToFirst();
            while(cursor != null){
                String nome = cursor.getString(indiceNome);
                String idade = cursor.getString(indiceIdade);
                Log.i("RESULTADO - nome ", nome + " idade " + idade);
                cursor.moveToNext();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}