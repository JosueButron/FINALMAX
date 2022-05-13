package com.example.finalmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void onClicusu(View view) {
        Toast.makeText(this, "Datos de usuario", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.Usuario"));
    }

    public void enviar(View view){
        Intent i = new Intent(this,Usuario.class);

    }
}