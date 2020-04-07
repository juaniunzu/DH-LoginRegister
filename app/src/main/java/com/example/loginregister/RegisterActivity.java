package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText registerActivityEditTextUsername;
    private EditText registerActivityEditTextPassword;
    private EditText registerActivityEditTextConfirmPassword;
    private Button registerActivityButtonRegister;

    public Boolean coincidenPasswords(){
        return registerActivityEditTextPassword.getText().toString().equals(registerActivityEditTextConfirmPassword.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //linkeo atributos con elementos del xml
        this.registerActivityEditTextUsername = findViewById(R.id.registerActivityEditTextUsername);
        this.registerActivityEditTextPassword = findViewById(R.id.registerActivityEditTextPassword);
        this.registerActivityEditTextConfirmPassword = findViewById(R.id.registerActivityEditTextConfirmPassword);
        this.registerActivityButtonRegister = findViewById(R.id.registerActivityButtonRegister);

        //seteo listener al boton register
        this.registerActivityButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creo intent que me llevara al mainActivity
                Intent registerAMain = new Intent(RegisterActivity.this, MainActivity.class);

                //si las passwords coiniciden ejecuto el intent, caso contrario imprimo toast que avisa
                if(coincidenPasswords()){
                    startActivity(registerAMain);
                } else {
                    Toast.makeText(RegisterActivity.this, "Verifique que los passwords coincidan", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
