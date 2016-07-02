package com.example.alexs.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Button pressing! Calls submission, generates Toast
     */
    public void submitQuiz(View view) {
        String toastMessage = submission();
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_layout_id));


        // set a message
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(toastMessage);

        // Toast...
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    /**
     * Grades the quiz, increments totalCorrect count for each correct answer
     * @return a String for Toast
     */
    public String submission() {
        totalCorrect = 0;
        //Answer One
        answerOne();
        // Answer Two
        answerTwo();
        //Answer Three
        answerThree();
        //Answer Four
        answerFour();
        //Answer Five
        answerFive();
        //Answer Six
        answerSix();
        //Answer Seven
        answerSeven();
        //Answer Eight
        answerEight();
        //Answer Nine
        answerNine();
        //Answer Ten
        answerTen();
        //And finally... a toast!
        return "Thanks for playing.\nYou got " + totalCorrect + "/10 right!\n\n" +
                "Learn the basics and play some Go here:\n" +
                "http://playgo.to/iwtg/en/";
    }

    /**
     * Answer key for questions 1-10
     *
     */
    public void answerOne(){
        RadioButton answer = (RadioButton) findViewById(R.id.rightOne);
        if(answer.isChecked()){
            totalCorrect += 1;
        }
    }
    public void answerTwo(){
        TextView answer = (TextView) findViewById(R.id.answerTwo);
        String ans = answer.getText().toString();
        if(ans.equals("China")){
            totalCorrect += 1;
        }
    }
    public void answerThree(){
        RadioButton answer = (RadioButton) findViewById(R.id.rightThree);
        if(answer.isChecked()){
            totalCorrect += 1;
        }
    }
    public void answerFour(){
        RadioButton answer = (RadioButton) findViewById(R.id.rightFour);
        if(answer.isChecked()){
            totalCorrect += 1;
        }
    }
    public void answerFive(){
        TextView answer = (TextView) findViewById(R.id.answerFive);
        String ans = answer.getText().toString();
        if(ans.equals("361")){
            totalCorrect += 1;
        }
    }
    public void answerSix(){
        RadioButton answer = (RadioButton) findViewById(R.id.rightSix);
        if(answer.isChecked()){
            totalCorrect += 1;
        }
    }
    public void answerSeven(){
        RadioButton answer = (RadioButton) findViewById(R.id.rightSeven);
        if(answer.isChecked()){
            totalCorrect += 1;
        }
    }
    public void answerEight(){
        TextView answer = (TextView) findViewById(R.id.answerEight);
        String ans = answer.getText().toString();
        if(ans.equals("AlphaGo")){
            totalCorrect += 1;
        }
    }
    public void answerNine(){
        TextView answer = (TextView) findViewById(R.id.answerNine);
        String ans = answer.getText().toString();
        if(ans.equals("what Philosophy is to Double-Entry Accounting.")){
            totalCorrect += 1;
        }
    }
    public void answerTen(){
        CheckBox first = (CheckBox) findViewById(R.id.answerTenFirst);
        CheckBox second = (CheckBox) findViewById(R.id.answerTenSecond);
        boolean firstCheck = first.isChecked();
        boolean secondCheck = second.isChecked();
        if(firstCheck || secondCheck){
            totalCorrect += 1;
        }
    }
}
