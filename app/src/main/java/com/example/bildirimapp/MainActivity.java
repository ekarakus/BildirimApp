package com.example.bildirimapp;

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
                if (email == "ekarakus@btofis.com" && password == "123456") {
                    //toast mesajı ver
                    Toast.makeText(MainActivity.this,
                            "Giriş Başarılı", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Giriş Başarısız", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}