package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3, button4;
    Question question = new Question();
    TextView question_text;
    private String answer;
    private int questionlength = question.questions.length;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        question_text = (TextView)findViewById(R.id.question);
        NextQuestion(random.nextInt(questionlength));
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                if (button1.getText()==answer){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                } else {
                    GameOver();
                }
                break;

            case R.id.button2:
                if (button2.getText()==answer){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                } else {
                    GameOver();
                }
                break;

            case R.id.button3:
                if (button3.getText()==answer){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                } else {
                    GameOver();
                }
                break;

            case R.id.button4:
                if (button4.getText()==answer){
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                } else {
                    GameOver();
                }
                break;
        }
    }

    private void GameOver() {
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this);
        alertdialog.setMessage("Game over")
                .setCancelable(false)
                .setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });
        alertdialog.show();
    }

    private void NextQuestion(int num) {
        question_text.setText(question.getQuestion(num));
        button1.setText(question.getChoice1(num));
        button2.setText(question.getChoice2(num));
        button3.setText(question.getChoice3(num));
        button4.setText(question.getChoice4(num));

        answer = question.getCorrectAnswer(num);
    }
}