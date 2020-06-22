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

public class CalTree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal3);

        // кнопка назад
        Button back3 = (Button)findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(CalTree.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка назад конец


        Button doing1 = (Button)findViewById(R.id.doing2);
        doing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String oper = "";
                    EditText chss = (EditText)findViewById(R.id.editTextNumberDecimal3);
                    EditText uo= (EditText)findViewById(R.id.editTextNumberDecimal4);
                    EditText ppt= (EditText)findViewById(R.id.editTextNumberDecimal5);
                    EditText sao2= (EditText)findViewById(R.id.editTextNumberDecimal6);
                    EditText svo2= (EditText)findViewById(R.id.editTextNumberDecimal7);
                    EditText gb= (EditText)findViewById(R.id.editTextNumberDecimal8);

                    TextView si = (TextView)findViewById(R.id.si);
                    TextView iuo = (TextView)findViewById(R.id.IUO);
                    TextView ivo2 = (TextView)findViewById(R.id.IVO2);
                    TextView ido2 = (TextView)findViewById(R.id.IDO2);
                    TextView o2er = (TextView)findViewById(R.id.O2ER);

                    float chss2 = Float.parseFloat(chss.getText().toString());
                    float uo2 = Float.parseFloat(uo.getText().toString());
                    float ppt2 = Float.parseFloat(ppt.getText().toString());
                    float sao22 = Float.parseFloat(sao2.getText().toString());
                    float svo22 = Float.parseFloat(svo2.getText().toString());
                    float gb2 = Float.parseFloat(gb.getText().toString());

                    float e1 = (uo2*chss2)/ppt2;
                    si.setText(e1 + oper);

                    float e2 = uo2 / ppt2;
                    iuo.setText(e2 + oper);

                    double e3 = (1.34 * e1 * gb2 * (sao22-svo22))/100000;
                    ivo2.setText(e3 + oper);

                    double e4 = (1.34 * e1 * gb2 * sao22)/100000;
                    ido2.setText(e4 + oper);

                    float e5 = (sao22 - svo22)/sao22;
                    o2er.setText(e5 + oper);

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
            Intent intent = new Intent(CalTree.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }

}