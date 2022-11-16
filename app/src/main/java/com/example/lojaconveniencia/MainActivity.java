package com.example.lojaconveniencia;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lojaconveniencia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    EditText editTextProduto;
    EditText editTextPreco;
    CheckBox checkBoxImportado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.lojaconveniencia.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        editTextProduto = (EditText)findViewById(R.id.editTextProduto);
        editTextPreco = (EditText)findViewById(R.id.editTextPreco);
        checkBoxImportado = (CheckBox)findViewById(R.id.checkBoxImportado);
    }

    /**
     * Método onClick
     */
    public void onClick(View view){
        String nomeProduto = editTextProduto.getText().toString();
        String precoProduto = editTextPreco.getText().toString();
        String mensagem = "";

       if(nomeProduto.equals(""))
           mensagem += "Informe o nome do Produto\n";

       if(precoProduto.equals(""))
           mensagem += "Informe o preço do Produto\n";

        if(!nomeProduto.equals("") && !precoProduto.equals("")){
           double preco = Double.parseDouble(precoProduto);
           boolean produtoImportado = ((CheckBox) checkBoxImportado).isChecked();

           //Instancia um objeto Produto
           Produto produto = new Produto(nomeProduto, preco, produtoImportado);

           mensagem += "Dados Informados:\n"+ produto;
       }
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }
}