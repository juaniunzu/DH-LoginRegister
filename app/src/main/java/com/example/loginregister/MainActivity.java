package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText mainActivityEditTextUsername;
    private EditText mainMainActivityEditTextPassword;
    private Button mainActivityButtonLogin;
    private Button mainActivityButtonRegister;
    private Map<String, String> usuariosRegistrados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linkeo los atributos con los elementos del xml
        this.mainActivityEditTextUsername = findViewById(R.id.mainActivityEditTextUsername);
        this.mainMainActivityEditTextPassword = findViewById(R.id.mainActivityEditTextPassword);
        this.mainActivityButtonLogin = findViewById(R.id.mainActivityButtonLogin);
        this.mainActivityButtonRegister = findViewById(R.id.mainActivityButtonRegister);
        this.usuariosRegistrados = new HashMap<>(); // para en un futuro agregarle los usuarios que se van registrando

        //seteo el listener del boton login
        this.mainActivityButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creo intent: desde donde hasta donde
                Intent mainALogin = new Intent(MainActivity.this, LoginActivity.class);

                //creo bundle que llevara username
                Bundle username = new Bundle();

                //agrego username ingresado al bundle creado
                username.putString("username", mainActivityEditTextUsername.getText().toString());

                //asocio el bundle con el intent
                mainALogin.putExtras(username);

                //ejecuto el intent
                startActivity(mainALogin);

            }
        });

        //seteo el listener del boton register
        this.mainActivityButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creo intent
                Intent mainARegister = new Intent(MainActivity.this, RegisterActivity.class);

                //ejecuto el intent
                startActivity(mainARegister);

            }
        });



    }
}
