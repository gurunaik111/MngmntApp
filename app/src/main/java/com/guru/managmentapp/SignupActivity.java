package com.guru.managmentapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class SignupActivity extends Activity{



    @Override
    protected void onCreate(Bundle savedInstanceState) { //click
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_signup);
        Button submitButton= (Button)findViewById(R.id.button_submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String  ns= (String) findViewById(R.id.schoolName);
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
              //  intent.putExtra("School-q","oxford");
               // intent.putExtra("Div-q","asd");
                startActivity(intent);
            }
        });


    }


    public void onSubmitButtonClick(View view) {
    }
/*
    TextView schoolName=(TextView) findViewById(R.id.schoolName);
    TextView studClass=(TextView) findViewById(R.id.studentClass);
    TextView studDiv=(TextView) findViewById(R.id.studentDivision);





    public void onSubmitButtonClick(View view) {

       // String c= R.id.class;

        Intent iData = new Intent(this, MainActivity.class);
        final int result=1;
        iData.putExtra("calling ","Signup");
        startActivity(iData);

       iData.putExtra(
                EXTRA_STRING_NAME,
                "returnValueAsString" );

        setResult(android.app.Activity.RESULT_OK, iData);

       // MainActivity.onCreate(iData);

        //..returns us to the parent "MyMainActivity"..


    }  */
}
