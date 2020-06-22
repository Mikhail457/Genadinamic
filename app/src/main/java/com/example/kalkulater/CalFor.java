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

public class CalFor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal4);

        // кнопка назад
        Button back4 = (Button)findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(CalFor.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка назад конец


        Button doing4 = (Button)findViewById(R.id.doing4);
        doing4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String oper = "";
                    EditText si1 = (EditText)findViewById(R.id.editTextNumberDecimal9);
                    EditText ilss1= (EditText)findViewById(R.id.editTextNumberDecimal10);
                    EditText cvd1= (EditText)findViewById(R.id.editTextNumberDecimal11);


                    TextView tpg = (TextView)findViewById(R.id.textView17);
                    TextView dlp = (TextView)findViewById(R.id.textView18);


                    float si = Float.parseFloat(si1.getText().toString());
                    float ilss = Float.parseFloat(ilss1.getText().toString());
                    float cvd = Float.parseFloat(cvd1.getText().toString());


                    float e6 = ilss * si;
                    tpg.setText(e6 + oper);

                    float e7 = cvd - e6;
                    dlp.setText(e7 + oper);



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
            Intent intent = new Intent(CalFor.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}