package com.computacaomobile.trabalho_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class DetalhesProduto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_produto);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(DetalhesProduto.this, MenuPrincipal.class));
        return;
    }
}