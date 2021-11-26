package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView result;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = ( EditText) findViewById(R.id.etnum1);
        num2 = (EditText) findViewById(R.id.etnum2);
        add = (Button) findViewById(R.id.btnadd);
        sub = (Button) findViewById(R.id.btnsub);
        mul = (Button) findViewById(R.id.btnmul);
        div = (Button) findViewById(R.id.btndiv);
        result = (TextView) findViewById(R.id.tvanswer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1= Integer.parseInt( num1.getText().toString());
                int number2= Integer.parseInt( num2.getText().toString());
                int sum = number1 + number2;
                result.setText(" answer " + String.valueOf(sum));
            }
        });
         sub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int number1= Integer.parseInt( num1.getText().toString());
                 int number2= Integer.parseInt( num2.getText().toString());
                 int sub = number1 - number2;
                 result.setText(" answer " + String.valueOf(sub));
             }
         });
         mul.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int number1= Integer.parseInt( num1.getText().toString());
                 int number2= Integer.parseInt( num2.getText().toString());
                 int mul = number1 * number2;
                 result.setText(" answer " + String.valueOf(mul));
             }
         });
         div.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int number1= Integer.parseInt( num1.getText().toString());
                 int number2= Integer.parseInt( num2.getText().toString());
                 int div = number1 / number2;
                 result.setText(" answer " + String.valueOf(div));
             }
         });
    }
}