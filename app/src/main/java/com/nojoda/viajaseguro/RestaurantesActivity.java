package com.nojoda.viajaseguro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RestaurantesActivity extends AppCompatActivity {

    Button botonlugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        botonlugares= (Button) findViewById(R.id.buttonLaFojata);

    }

    public void onClick(View view) {
        Intent miIntent = null;

        switch (view.getId()) {

            case R.id.buttonLaFojata:
                miIntent = new Intent(RestaurantesActivity.this, LaFojataActivity.class);
                Toast.makeText(this, "Funcionando el boton", Toast.LENGTH_LONG).show();
                startActivity(miIntent);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}