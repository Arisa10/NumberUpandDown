package com.akbt.numberupanddown;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plus, minus;
    TextView Num;

    Integer currentNum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num = (TextView) findViewById(R.id.num);
        Num.setText("" + currentNum);

        plus = (Button) findViewById(R.id.bPlus);
                plus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (currentNum < 50) {
                            currentNum++;
                        }
                        Num.setText("" + currentNum);
                    }
                });

        minus = (Button) findViewById(R.id.bMinus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentNum > 0) {
                    currentNum--;
                }
                Num.setText("" + currentNum);
            }
        });
    }
}
