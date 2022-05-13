package com.example.finalmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registrar extends AppCompatActivity {
    private EditText et_codigo, et_dni, et_nombres, et_celular, et_genero, et_edad, et_contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        et_codigo= (EditText)findViewById(R.id.nombre);                 //Variables para la base de datos
        et_dni= (EditText)findViewById(R.id.txt_dni);
        et_nombres= (EditText)findViewById(R.id.txt_nombres);
        et_celular= (EditText)findViewById(R.id.txt_celular);
        et_genero= (EditText)findViewById(R.id.txt_genero);
        et_edad= (EditText)findViewById(R.id.txt_edad);
        et_contrasena= (EditText)findViewById(R.id.txt_contrasena);

    }

    public void RegistrarAlumnos(View view) {                                  //Función para registrar los datos
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "maxdbfinal", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String codigo = et_codigo.getText().toString();
        String dni = et_dni.getText().toString();
        String nombres = et_nombres.getText().toString();
        String celular = et_celular.getText().toString();
        String genero = et_genero.getText().toString();
        String edad = et_edad.getText().toString();
        String contrasena = et_contrasena.getText().toString();


        if (!codigo.isEmpty() && !dni.isEmpty() && !nombres.isEmpty() && !celular.isEmpty() && !genero.isEmpty()
                && !edad.isEmpty() && !contrasena.isEmpty())
        {
            ContentValues registro = new ContentValues();
            registro.put("codigo", codigo);
            registro.put("dni", dni);
            registro.put("nombres", nombres);
            registro.put("celular", celular);
            registro.put("genero", genero);
            registro.put("edad", edad);
            registro.put("contrasena", contrasena);

            BaseDeDatos.insert("alumnos", null, registro);
            BaseDeDatos.close();
            et_codigo.setText("");
            et_dni.setText("");
            et_nombres.setText("");
            et_celular.setText("");
            et_genero.setText("");
            et_edad.setText("");
            et_contrasena.setText("");

            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }

        else
        {
            Toast.makeText(this, "Debera llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
}