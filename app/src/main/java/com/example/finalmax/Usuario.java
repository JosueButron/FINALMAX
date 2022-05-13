package com.example.finalmax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Usuario extends AppCompatActivity {

    TextView tv,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        tv = (TextView) findViewById(R.id.tv);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        ejecucionbd();
    }
    public void ejecucionbd(){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "maxdbfinal", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();


        Cursor datos = BaseDeDatos.rawQuery(" SELECT nombres FROM alumnos WHERE codigo = 1103",null);
        while (datos.moveToNext()){
            String nombre = datos.getString(datos.getInt(0));
            tv.setText(nombre);
        }
        Cursor datos2 = BaseDeDatos.rawQuery(" SELECT dni FROM alumnos WHERE codigo = 1103",null);
        while (datos2.moveToNext()){
            String dni = datos2.getString(datos2.getInt(0));
            tv2.setText(dni);
        }
        Cursor datos3 = BaseDeDatos.rawQuery(" SELECT genero FROM alumnos WHERE codigo = 1103",null);
        while (datos3.moveToNext()){
            String genero = datos3.getString(datos3.getInt(0));
            tv3.setText(genero);
        }
        Cursor datos4 = BaseDeDatos.rawQuery(" SELECT celular FROM alumnos WHERE codigo = 1103",null);
        while (datos4.moveToNext()){
            String celular = datos4.getString(datos4.getInt(0));
            tv4.setText(celular);
        }
        Cursor datos5 = BaseDeDatos.rawQuery(" SELECT edad FROM alumnos WHERE codigo = 1103",null);
        while (datos5.moveToNext()){
            String edad = datos5.getString(datos5.getInt(0));
            tv5.setText(edad);
        }




    }
    public void onClickeli(View view) {

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "maxdbfinal", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
        BaseDeDatos.execSQL("DELETE FROM alumnos WHERE codigo = 1603 ");


        Toast.makeText(this, "Eliminar", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity.class));
    }
    public void onClickupd(View view) {


        Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, update.class));
    }



}