package com.example.sebnem.haberapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText name,pass;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = (EditText) findViewById(R.id.etUserName);
        pass = (EditText) findViewById(R.id.etPassword);
        btn_login = (Button) findViewById(R.id.button);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isim = name.getText().toString();
                String sifre = pass.getText().toString();
                if (isim.equals("GYK") && sifre.equals("1234")){
                    Toast.makeText(LoginActivity.this,"Giriş Başarılı",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,HaberSayfasi.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this,"Kullanıcı Adı veya Şifre Hatalı",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
