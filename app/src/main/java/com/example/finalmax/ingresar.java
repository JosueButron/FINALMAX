package com.example.finalmax;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ingresar extends AppCompatActivity {
    private EditText et_loguser, et_logpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        et_loguser= (EditText)findViewById(R.id.txt_loguser);
        et_logpass= (EditText)findViewById(R.id.txt_logpass);


    }


    public void ingresarAlumnos(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "maxdbfinal", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
        String loguser = et_loguser.getText().toString();
        String logpass = et_logpass.getText().toString();

        if((!loguser.isEmpty()) || (!logpass.isEmpty()))
        {
            Cursor file = BaseDeDatos.rawQuery( "SELECT contrasena FROM alumnos WHERE codigo = " + loguser,null);

            if(file.moveToFirst())
            {

                Toast.makeText(this, "Inicio exitoso", Toast.LENGTH_SHORT).show();
                BaseDeDatos.close();
                startActivity(new Intent(this, inicio.class));
            }
            else
            {
                Toast.makeText(this, "Error en credenciales", Toast.LENGTH_SHORT).show();
                BaseDeDatos.close();
            }

        }
        else
        {
            Toast.makeText(this, "Ingresar usuario y contraseña", Toast.LENGTH_SHORT).show();
        }

    }
}