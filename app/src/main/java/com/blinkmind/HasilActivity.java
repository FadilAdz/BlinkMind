package com.blinkmind;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class HasilActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        // Contoh tombol untuk jawaban soal
        Button btnQuizHome = findViewById(R.id.home_btn);
        btnQuizHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman soal C++
                Intent intent = new Intent(HasilActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
