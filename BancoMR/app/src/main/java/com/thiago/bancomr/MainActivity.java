package com.thiago.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.thiago.bancomr.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgSaldo.setOnClickListener(this);
        binding.imgFatura.setOnClickListener(this);
        binding.imgTransferencia.setOnClickListener(this);
        binding.imgPoupanca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if( id == R.id.imgSaldo ){
            Intent navegarTelaSaldo = new Intent(MainActivity.this, Saldo.class );
            startActivity(navegarTelaSaldo);
        }
        else if( id == R.id.imgFatura ){
            Intent navegarTelaFaturas = new Intent(MainActivity.this, Faturas.class );
            startActivity(navegarTelaFaturas);
        }
        else if ( id == R.id.imgTransferencia ){
            Intent navegarTelaTransferencias = new Intent(MainActivity.this, Transferencia.class );
            startActivity(navegarTelaTransferencias);
        }
        else if( id == R.id.imgPoupanca ){
            Intent navegarTelaPoupanca = new Intent(MainActivity.this, Poupanca.class );
            startActivity(navegarTelaPoupanca);
        }
    }
}