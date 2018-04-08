package com.example.maciek.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView number;
    private Button random;
    private Button zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (TextView) findViewById(R.id.number);
        random = (Button) findViewById(R.id.random);
        zero = (Button) findViewById(R.id.zero);

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int num = r.nextInt(100);
                number.append("\n" + String.valueOf(num));
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText("Losowa liczba:");
            }
        });
    }
}
