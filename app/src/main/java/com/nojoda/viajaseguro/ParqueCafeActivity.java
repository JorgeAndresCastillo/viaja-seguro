package com.nojoda.viajaseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nojoda.viajaseguro.ui.login.LoginActivity;

public class ParqueCafeActivity extends AppCompatActivity {


    Button botonregistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_cafe);

        botonregistrar= (Button) findViewById(R.id.btnlogin);

    }


    public void onClick(View view) {
        Intent miIntent = null;

        switch (view.getId()) {

            case R.id.btnlogin:
                miIntent = new Intent(ParqueCafeActivity.this, LoginActivity.class);
                startActivity(miIntent);
                break;
            case R.id.btnregistro:
                miIntent = new Intent(ParqueCafeActivity.this, RegistroActivity.class);
                startActivity(miIntent);
                break;



        }

    }
}