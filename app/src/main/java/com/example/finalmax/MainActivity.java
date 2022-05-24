package com.example.finalmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.finalmax.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intentBackgroundService = new Intent(this, PushNotification.class);
        startService(intentBackgroundService);
    }
    public void onClicking(View view) {
        Toast.makeText(this, "Ingreso", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void onClickreg(View view) {
        Toast.makeText(this, "Registro", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this, registrar.class));
    }
}