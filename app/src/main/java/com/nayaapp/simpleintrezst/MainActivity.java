package com.nayaapp.simpleintrezst;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText p,t,r;
    private Button btninterest;
    Double pi,ti,ri, answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p= findViewById(R.id.principle);
        t= findViewById(R.id.Time);
        r= findViewById(R.id.Rate);
        btninterest= findViewById(R.id.Interest);

        btninterest.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                pi = Double.parseDouble(p.getText().toString());
                ti = Double.parseDouble(t.getText().toString());
                ri = Double.parseDouble(r.getText().toString());

                answer=(pi*ri*ti/100);

                Toast.makeText(MainActivity.this, "Interest is " + answer, Toast.LENGTH_SHORT).show();


            }
        });

    }
}
