package com.example.loginregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private TextView activityLoginTextViewUsernameRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //linkeo atributo con elemento del xml
        this.activityLoginTextViewUsernameRecibido = findViewById(R.id.activityLoginTextViewUsernameRecibido);

        //traigo el intent
        Intent desdeMainActivity = getIntent();

        //le saco el bundle que trae
        Bundle usernameRecibidoDeIntent = desdeMainActivity.getExtras();

        //le saco al bundle el username y lo guardo en un string
        String usernameRecibido = usernameRecibidoDeIntent.getString("username");

        //asocio el string al text del textView
        activityLoginTextViewUsernameRecibido.setText(usernameRecibido);

    }
}
