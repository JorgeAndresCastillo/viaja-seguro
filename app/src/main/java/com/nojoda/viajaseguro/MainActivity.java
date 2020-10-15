package com.nojoda.viajaseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonlugares;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonlugares= (Button) findViewById(R.id.buttonAtracciones);
    }


    public void onClick(View view) {
        Intent miIntent = null;

        switch (view.getId()){

            case R.id.buttonAtracciones:
                miIntent= new Intent(MainActivity.this,AtracionesActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                startActivity(miIntent);
                break;

            case R.id.buttonChalets:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //startActivity(miIntent);
                break;

            case R.id.buttonRestaurantes:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //startActivity(miIntent);
                break;

            case R.id.buttonMiradores:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //startActivity(miIntent);
                break;
        }
    }
}