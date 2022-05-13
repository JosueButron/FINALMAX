package com.example.finalmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class update extends AppCompatActivity {
    private EditText et_dni, et_nombres, et_celular, et_genero, et_edad ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        //Variables para la base de datos
        et_dni= (EditText)findViewById(R.id.dni);
        et_nombres= (EditText)findViewById(R.id.nombre);
        et_celular= (EditText)findViewById(R.id.celular);
        et_genero= (EditText)findViewById(R.id.genero);
        et_edad= (EditText)findViewById(R.id.edad);

    }
    public void onClicksave(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "maxdbfinal", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();


        String dni = et_dni.getText().toString();
        String nombres = et_nombres.getText().toString();
        String celular = et_celular.getText().toString();
        String genero = et_genero.getText().toString();
        String edad = et_edad.getText().toString();


        BaseDeDatos.execSQL(" UPDATE alumnos SET nombres = "+ nombres + " where codigo = '1103'");
        BaseDeDatos.execSQL(" UPDATE alumnos SET dni = "+dni +" where codigo = '1103'");
        BaseDeDatos.execSQL(" UPDATE alumnos SET celular = "+celular +" where codigo = '1103'");
        BaseDeDatos.execSQL(" UPDATE alumnos SET genero = "+genero +" where codigo = '1103'");
        BaseDeDatos.execSQL(" UPDATE alumnos SET edad = "+edad +" where codigo = '1103'");


        Toast.makeText(this, "Actualizado", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, Usuario.class));

    }
}