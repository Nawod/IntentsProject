package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    public static final String no1 = "1";
    public static final String no2 = "2";

    private EditText text1 , text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

       text1 = findViewById(R.id.txt1);
       text2 = findViewById(R.id.txt2);

    }
    public void sendNumbers(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        String number1 = text1.getText().toString();
        String number2 = text2.getText().toString();

        intent.putExtra(no1, number1);
        intent.putExtra(no2, number2);
        startActivity(intent);
    }
}
