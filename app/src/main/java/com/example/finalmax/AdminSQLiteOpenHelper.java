package com.example.finalmax;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper
{

    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {
        BaseDeDatos.execSQL("create table alumnos" +            //Se crea la tabla de alumnos
                "(codigo text primary key, " +
                "dni text, " +
                "nombres text, " +
                "celular text, " +
                "genero text, " +
                "edad text, " +
                "contrasena text," +
                "nombre1 text," +
                "celular1 text," +
                "parentesco1 text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

