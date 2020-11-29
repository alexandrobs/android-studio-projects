package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView campoResultado;

    private CheckBox campoVerde;
    private CheckBox campoAzul;
    private CheckBox campoVermelho;
    private TextView campoCores;

    private RadioButton campoMasculino;
    private RadioButton campoFeminino;
    private RadioButton campoNaoBinario;

    private RadioGroup campoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editTextNome);
        campoEmail = findViewById(R.id.editTextEmail);
        campoResultado = findViewById(R.id.textViewResultado);

        campoVerde = findViewById(R.id.checkBoxVerde);
        campoAzul = findViewById(R.id.checkBoxAzul);
        campoVermelho = findViewById(R.id.checkBoxVermelho);
        campoCores = findViewById(R.id.textViewCores);

        campoMasculino = findViewById(R.id.radioButtonMasculino);
        campoFeminino = findViewById(R.id.radioButtonFeminino);
        campoNaoBinario = findViewById(R.id.radioButtonNaoBinario);

        campoSexo = findViewById(R.id.radioGroupSexo);

        selecaoRadioButton();

    }

    public void checkCores(){

        String texto = "";
        if(campoVerde.isChecked()){
            //outra forma de fazer, agora pegando o valor do próprio texto declarado no checkbox
            //usando o método getText()
            String corSelecionada = campoVerde.getText().toString();
            texto = corSelecionada + " selecionado - ";
        }if(campoAzul.isChecked()){
            texto = texto + "Azul selecionado - ";
        }if(campoVermelho.isChecked()){
            texto = texto + "Vermelho selecionado - ";
        }
        campoResultado.setText(texto);

    }

    public void selecaoRadioButton(){

        campoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if ( checkedId == R.id.radioButtonMasculino){
                    campoResultado.setText("Masculino");
                }else if (checkedId == R.id.radioButtonFeminino){
                    campoResultado.setText("Feminino");
                }else if(checkedId == R.id.radioButtonNaoBinario){
                    campoResultado.setText("Não Binário");
                }
            }
        });
        //como aprendi de maneira menos verbosa
        /*if(campoMasculino.isChecked()){
            campoResultado.setText("Masculino");
        }if (campoFeminino.isChecked()){
            campoResultado.setText("Feminino");
        }else if(campoNaoBinario.isChecked()){
            campoResultado.setText("Não Binário");
        }

         */

        //como eu mesmo fiz copiando do exercicio anterior
//        String texto = "";
//        if (campoMasculino.isChecked()){
//            String radioButtonSelecionado = campoMasculino.getText().toString();
//            texto = radioButtonSelecionado;
//        }
//        if (campoFeminino.isChecked()){
//            String radioButtonSelecionado = campoFeminino.getText().toString();
//            texto = radioButtonSelecionado;
//        }
//        if (campoNaoBinario.isChecked()){
//            String radioButtonSelecionado = campoNaoBinario.getText().toString();
//            texto = radioButtonSelecionado;
//        }
//        campoResultado.setText(texto);


    }

        public void buttonEnviar(View view) {
            checkCores();
            //selecaoRadioButton();
//            String nome = campoNome.getText().toString();
//            String email = campoEmail.getText().toString();
//            campoResultado.setText("nome: " + nome + " email: " + email);
     }

        public void buttonLimpar(View view){
            campoNome.setText("");
            campoEmail.setText("");
        }

}