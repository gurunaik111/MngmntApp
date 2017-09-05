package com.guru.managmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button submitButton= (Button)findViewById(R.id.button_submit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String  ns= (String) findViewById(R.id.schoolName);
                Intent intent=new Intent(getApplicationContext(),TConsole.class);
                //  intent.putExtra("School-q","oxford");
                // intent.putExtra("Div-q","asd");
                startActivity(intent);
            }
        });

        }


    public void submitButtonClicked(View view) {
    }
}
