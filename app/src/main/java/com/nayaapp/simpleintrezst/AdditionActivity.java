package com.nayaapp.simpleintrezst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdditionActivity extends AppCompatActivity  implements View.OnClickListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.btnsum){
            Intent intent = new Intent()


        }

    }
}
