package com.example.finalmax;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NOMBRE = "max.db";

    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, DATABASE_NOMBRE, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {
        BaseDeDatos.execSQL("create table alumnos" +            //Se crea la tabla de alumnos
                "(codigo text primary key, " +
                "dni text, " +
                "nombres text, " +
                "celular text, " +
                "genero text, " +
                "edad int, " +
                "contraseña text)");

    /*        BaseDeDatos.execSQL("create table contactos" +            //Se crea la tabla de alumnos
                "(codigo int primary key, " +
                "dni text, " +
                "nombres text, " +
                "celular text, " +
                "genero text, " +
                "codigo_familiar text, " +
                "FOREIGN_KEY (text)");


        CREATE TABLE track(
                trackid     INTEGER,
                trackname   TEXT,
                trackartist INTEGER,
                FOREIGN KEY(trackartist) REFERENCES artist(artistid)


        );

         */

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

