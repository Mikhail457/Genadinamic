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

public class CalTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal2);

        // кнопка назад
        Button back2 = (Button)findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(CalTwo.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка назад конец



        Button doing1 = (Button)findViewById(R.id.r);
        doing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String oper = "";
                    EditText el3 = (EditText)findViewById(R.id.editTextNumberDecimal);
                    EditText el4 = (EditText)findViewById(R.id.editTextNumberDecimal2);
                    TextView sum2 = (TextView)findViewById(R.id.res1);
                    TextView sum3 = (TextView)findViewById(R.id.res2);
                    float num3 = Float.parseFloat(el3.getText().toString());
                    float num4 = Float.parseFloat(el4.getText().toString());
                    float res2 = num3 * num3;
                    double res3 = res2 * 0.785;
                    double res4 = res3 * num4;
                    sum2.setText(res3 + oper);
                    sum3.setText(res4 + oper);
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
            Intent intent = new Intent(CalTwo.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
}