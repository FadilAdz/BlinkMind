package com.blinkmind;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Contoh tombol untuk jawaban soal
        Button btnQuizEnd = findViewById(R.id.next1Cplus);
        btnQuizEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman soal C++
                Intent intent = new Intent(QuizActivity.this, HasilActivity.class);
                startActivity(intent);
            }
        });
    }
}
