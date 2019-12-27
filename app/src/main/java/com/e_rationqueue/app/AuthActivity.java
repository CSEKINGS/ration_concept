package com.e_rationqueue.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AuthActivity extends AppCompatActivity {
    EditText Name;
    EditText Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        Name = findViewById(R.id.etName);
        Password = findViewById(R.id.etPassword);
        Login = findViewById(R.id.btnLogin);

        Login.setOnClickListener(view -> {
            validate(Name.getText().toString(), Password.getText().toString());
        });


    }

    public void validate(String id, String pass) {
        if ((id.equals("admin")) && (pass.equals("pass"))) {
            Intent intent = new Intent(AuthActivity.this, SecondActivity.class);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Username or password incorrect", Toast.LENGTH_LONG).show();
        }
    }

}
