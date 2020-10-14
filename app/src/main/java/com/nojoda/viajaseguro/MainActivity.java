package com.nojoda.viajaseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonAtraciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonAtraciones= (Button) findViewById(R.id.buttonAtracciones);
    }


    public void onClick(View view) {
        Intent miIntent = null;

        switch (view.getId()){

            case R.id.buttonAtracciones:
                miIntent= new Intent(MainActivity.this,AtracionesActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnRecuca:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnValleCocora:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnPanaca:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnParqueArriero:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnMuseoQuimbaya:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnJardinBotanico:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                break;
        }
        startActivity(miIntent);
    }
}