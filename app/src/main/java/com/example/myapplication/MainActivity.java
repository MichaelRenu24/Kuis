package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int nim = 23;
    TextView txtnim = (TextView) findViewById(R.id.lblNim);
    Button kliktoast = (Button) findViewById(R.id.buttonToast);
    Button countup;
    Button countdown = (Button) findViewById(R.id.buttondown)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kliktoast = (Button) findViewById(R.id.buttonToast);
        kliktoast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Halo Renu!", Toast.LENGTH_LONG).show();

            }
        });

        countup = (Button) findViewById(R.id.buttonup);
        countup.setOnClickListener(new View.OnClickListener){
            
        };
    }


}
