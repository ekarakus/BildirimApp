package com.example.bildirimapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bildirimapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding bagla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bagla = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bagla.getRoot());

        bagla.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //burada giriş işlemleri yapılır
                String email = bagla.editEmail.getText().toString();
                String password = bagla.editPassword.getText().toString();
                if (email.equals("ekarakus@btofis.com") && password.equals("123456")) {
                    //toast mesajı ver
                    Toast.makeText(MainActivity.this,
                            "Giriş Başarılı", Toast.LENGTH_LONG).show();
                    //intent işlemi yapılır
                    Intent intent = new Intent(MainActivity.this, Member.class);
                    intent.putExtra("email", email);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this,
                            "Giriş Başarısız", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}