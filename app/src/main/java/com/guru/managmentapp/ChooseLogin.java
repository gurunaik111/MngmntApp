package com.guru.managmentapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class ChooseLogin extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) { //click
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_login);

    }

    public void onTLoginButtonClicked(View view) {
        Intent intent=new Intent(getApplicationContext(),LogoScreen.class);

        startActivity(intent);
    }

    public void onSLoginButtonClick(View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);

        startActivity(intent);
    }
}
