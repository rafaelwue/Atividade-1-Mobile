package com.computacaomobile.trabalho_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void visualizarProduto1(View view){
        Intent intent = new Intent(MenuPrincipal.this,DetalhesProduto.class);
        startActivity(intent);
        finish();
    }
}