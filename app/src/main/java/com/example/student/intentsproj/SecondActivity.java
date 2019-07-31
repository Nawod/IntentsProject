package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String number1 = intent.getStringExtra(FirstActivity.no1);
        String number2 = intent.getStringExtra(FirstActivity.no2);

        num1 = findViewById(R.id.num1);
        num1.setText(number1);
        num2 = findViewById(R.id.num2);
        num2.setText(number2);

    }
        public void Add (View v){

        TextView no1 = findViewById(R.id.num1);
        TextView no2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);

        double num1 = Double.parseDouble(no1.getText().toString());
        double num2 = Double.parseDouble(no2.getText().toString());
        double sum = num1 + num2;
        result.setText(Double.toString(num1)+"  +  "+Double.toString(num2)+"  =  "+Double.toString(sum));
        }

        public void Min (View v){

        TextView no1 = findViewById(R.id.num1);
        TextView no2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);

        double num1 = Double.parseDouble(no1.getText().toString());
        double num2 = Double.parseDouble(no2.getText().toString());
        double sum = num1 - num2;
        result.setText(Double.toString(num1)+"  -  "+Double.toString(num2)+"  =  "+Double.toString(sum));
        }

        public void Mult (View v){

        TextView no1 = findViewById(R.id.num1);
        TextView no2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);

        double num1 = Double.parseDouble(no1.getText().toString());
        double num2 = Double.parseDouble(no2.getText().toString());
        double sum = num1 * num2;
        result.setText(Double.toString(num1)+"  X  "+Double.toString(num2)+"  =  "+Double.toString(sum));
        }

        public void Dvd (View v){

        TextView no1 = findViewById(R.id.num1);
        TextView no2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.result);

        double num1 = Double.parseDouble(no1.getText().toString());
        double num2 = Double.parseDouble(no2.getText().toString());
        double sum = num1 / num2;
        result.setText(Double.toString(num1)+"  /  "+Double.toString(num2)+"  =  "+Double.toString(sum));
        }
}
