package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonContatos, buttonConversas;
    private ConversasFragment conversasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        //configurar objeto para o fragment
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        //transaction.add(R.id.frameConteudo, conversasFragment);
        transaction.commit();
    }
}