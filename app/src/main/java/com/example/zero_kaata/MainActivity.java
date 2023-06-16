package com.example.zero_kaata;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int flag = 0;
    int checkWin = 0;
    int count = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView status;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    @SuppressLint("ResourceAsColor")
    public void onclick(View v){
        status = findViewById(R.id.status);
        Button currentButton = (Button) v;
        if(currentButton.getText().toString().equals("") && checkWin!=1){
            count++;
            if(flag==0){
                status.setText(R.string.o_turn);
                currentButton.setText("X");
                flag=1;
            }
            else {
                status.setText(R.string.x_turn);
                currentButton.setText("O");
                flag=0;
            }

            if(count>4){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    status.setText(getString(R.string.winStatus)+b1);
                    btn1.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn2.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn3.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.green,getTheme()));
                    checkWin=1;
                }
                else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                    status.setText(getString(R.string.winStatus)+b4);
                    btn4.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn6.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.green,getTheme()));
                    checkWin=1;
                }
                else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                    status.setText(getString(R.string.winStatus)+b7);
                    btn7.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn8.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.green,getTheme()));
                    checkWin=1;
                }
                else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                    status.setText(getString(R.string.winStatus)+b1);
                    btn1.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn4.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn7.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.green,getTheme()));
                    checkWin=1;
                }
                else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                    status.setText(getString(R.string.winStatus)+b2);
                    btn2.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn8.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.green,getTheme()));
                    checkWin=1;
                }
                else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                    status.setText(getString(R.string.winStatus)+b3);
                    btn3.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn6.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.green,getTheme()));
                    checkWin=1;
                }
                else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                    status.setText(getString(R.string.winStatus)+b1);
                    btn1.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn9.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.green,getTheme()));
                    checkWin=1;
                }
                else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                    status.setText(getString(R.string.winStatus)+b3);
                    btn3.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn5.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    btn7.setBackgroundColor(getResources().getColor(R.color.green,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.green,getTheme()));
                    checkWin=1;
                }
                else if(count==9){
                    btn1.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    btn2.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    btn3.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    btn4.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    btn5.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    btn6.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    btn7.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    btn8.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    btn9.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
                    status.setTextColor(getResources().getColor(R.color.red,getTheme()));
                    status.setText(R.string.draw);
                }
            }
        }
    }

    public void reset(View v){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn1.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        btn2.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        btn3.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        btn4.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        btn5.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        btn6.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        btn7.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        btn8.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        btn9.setBackgroundColor(getResources().getColor(R.color.defaultColor,getTheme()));
        status.setTextColor(getResources().getColor(R.color.black,getTheme()));
        status.setText(R.string.x_turn);
        flag = 0;
        count = 0;
        checkWin = 0;
    }
}