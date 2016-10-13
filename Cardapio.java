package com.example.leilane.trabalhodispmoveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Cardapio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);
        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        TextView card = (TextView)findViewById(R.id.tCardapio);
        card.setText("Seja Bem vindo ao Cardápio !!!");
    }
}
