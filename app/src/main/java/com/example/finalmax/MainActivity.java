package com.example.finalmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClicking(View view) {
        Toast.makeText(this, "Ingreso", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.ingresar"));
    }

    public void onClickreg(View view) {
        Toast.makeText(this, "Registro", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.registrar"));
    }
}