package com.example.nigeriapastandcurrent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartingScreenActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_starting_screen);

        Button button_StartQuiz = findViewById (R.id.button_start_quiz);
        button_StartQuiz.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                StartQuiz ();
            }
        });

    }

    /* method to open the start quiz activity */
    private void StartQuiz() {
        Intent intent = new Intent (StartingScreenActivity.this, QuizActivity.class);
        startActivity (intent);



    }
}
