package com.nojoda.viajaseguro;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AtracionesActivity extends AppCompatActivity {

    Button botonParqueCafe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atraciones);

        //botonParqueCafe= (Button) findViewById(R.id.btnParqueCafe);
    }


    public void onClick(View view) {
        Intent miIntent = null;

        switch (view.getId()){

            case R.id.parquecafe:
                miIntent= new Intent(AtracionesActivity.this,ParqueCafeActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                startActivity(miIntent);
                break;

            //case R.id.btnRecuca:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                //Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //break;

            //case R.id.btnValleCocora:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                //Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //break;

            //case R.id.btnPanaca:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                //Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //break;
           // case R.id.btnParqueArriero:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                //Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //break;

           // case R.id.btnMuseoQuimbaya:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                //Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //break;

            //case R.id.btnJardinBotanico:
                //miIntent= new Intent(AtracionesActivity.this,MainActivity.class);
                //Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                //break;
        }
    }
}