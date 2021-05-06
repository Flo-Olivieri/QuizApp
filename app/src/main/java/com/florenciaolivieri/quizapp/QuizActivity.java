package com.florenciaolivieri.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private Button buttonConfirmNext;

    private TextView textViewQuestions;
    private TextView textViewScore;
    private TextView textViewQuestionsCount;
    private TextView textViewCorrect, textViewWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        setupUI();


    }

    private void setupUI() {
        textViewQuestions       = findViewById(R.id.textViewQuestion);
        textViewScore           = findViewById(R.id.txtScore);
        textViewQuestionsCount  = findViewById(R.id.txtTotalQuestion);
        rbGroup                 = findViewById(R.id.radio_group);
        rb1                     = findViewById(R.id.radio_button1);
        rb2                     = findViewById(R.id.radio_button2);
        rb3                     = findViewById(R.id.radio_button3);
        rb4                     = findViewById(R.id.radio_button4);
        buttonConfirmNext       = findViewById(R.id.button_next);

    }
}