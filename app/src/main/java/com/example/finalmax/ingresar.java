package com.example.finalmax;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ingresar extends AppCompatActivity {

    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        et = findViewById(R.id.editText);

    }
    public void onClickinicio(View view) {
        Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, inicio.class));
//        Intent i = new Intent(this, inicio.class);
//        i.putExtra("dato",et.getText().toString());
//        startActivity(i);


    }
}