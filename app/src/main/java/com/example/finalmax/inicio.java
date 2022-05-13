package com.example.finalmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
        startActivity(new Intent(this, Usuario.class));

    }


}