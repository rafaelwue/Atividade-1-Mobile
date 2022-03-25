package com.computacaomobile.trabalho_layout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void irParaMenu(View view){
        Intent intent = new Intent(HomeActivity.this,MenuPrincipal.class);
        startActivity(intent);
        finish();
    }
}