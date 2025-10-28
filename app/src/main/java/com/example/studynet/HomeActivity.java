package com.example.studynet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button btn_session;
    private Button btn_quizzes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_session = (Button) findViewById(R.id.btn_sessions);
        btn_session.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_session = new Intent(HomeActivity.this, Sessions.class);
                startActivity(intent_session);
            }
        });
        btn_quizzes = (Button) findViewById(R.id.btn_quizzes);
        btn_quizzes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_session = new Intent(HomeActivity.this, Quizzes.class);
                startActivity(intent_session);
            }
        });
    }
}