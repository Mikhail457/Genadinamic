package com.example.kalkulater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc2 = (Button)findViewById(R.id.calc2);
        calc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, CalTwo.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

        Button calc1 = (Button)findViewById(R.id.calc1);
        calc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, CalOne.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

        Button calc3 = (Button)findViewById(R.id.calc3);
        calc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, CalTree.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

        Button calc4 = (Button)findViewById(R.id.calc4);
        calc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, CalFor.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });



        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}