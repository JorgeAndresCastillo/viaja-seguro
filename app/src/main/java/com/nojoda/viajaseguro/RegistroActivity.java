package com.nojoda.viajaseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nojoda.viajaseguro.ui.login.LoginActivity;

public class RegistroActivity extends AppCompatActivity {

    Button botonregistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        botonregistrar= (Button) findViewById(R.id.btnregistro);
    }

    public void onClick(View view) {
        Intent miIntent = null;

        switch (view.getId()) {

            case R.id.btnregistro:
                miIntent = new Intent(RegistroActivity.this, ParqueCafeActivity.class);
                startActivity(miIntent);
                break;



        }

    }













}