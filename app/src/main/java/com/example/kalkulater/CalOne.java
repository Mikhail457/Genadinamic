package com.example.kalkulater;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal1);
        // кнопка назад
        Button back1 = (Button)findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(CalOne.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });




        Button doing = (Button)findViewById(R.id.doing);
        doing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String oper = "";
                    EditText el1 = (EditText)findViewById(R.id.first);
                    EditText el2 = (EditText)findViewById(R.id.second);
                    TextView sum = (TextView)findViewById(R.id.result);
                    float num1 = Float.parseFloat(el1.getText().toString());
                    float num2 = Float.parseFloat(el2.getText().toString());
                    float result = num1 / num2 * 10;
                    double res3 = result + 0.16;
                    sum.setText(res3 + oper);
                    // считает при нажатие на кнопку


                }catch (Exception e){

                }
            }
        });


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    // системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(CalOne.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}



