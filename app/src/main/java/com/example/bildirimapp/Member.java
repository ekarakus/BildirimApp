package com.example.bildirimapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bildirimapp.databinding.ActivityMemberBinding;

public class Member extends AppCompatActivity {
private ActivityMemberBinding bagla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bagla = ActivityMemberBinding.inflate(getLayoutInflater());
        setContentView(bagla.getRoot());
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        bagla.textView2.setText("Kullanıcı: " + email);
    }
}