package com.guru.managmentapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

  //  private TextView mTextMessage;
 //  String School= getIntent().getStringExtra("School-q");
 //  String Div= getIntent().getStringExtra("Div-q");

    //..for logging..
 //   private static final String TAG = "MainActivity";

    //..The request code is supposed to be unique?..
  //  public static final int MY_REQUEST_CODE = 123;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();




            switch (item.getItemId()) {
                case R.id.notice:
                    fragment=new CNotice();
                    fragmentTransaction.replace(R.id.frag_place,fragment).commit();

                    return true;
                case R.id.Calendar:
                    fragment=new SNotice();
                    fragmentTransaction.replace(R.id.frag_place,fragment).commit();

                    return true;
                case R.id.classNotice:
                    fragment=new CNotice();
                    fragmentTransaction.replace(R.id.frag_place,fragment).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
/*
    private void pushFxn()
    {
        Intent intent =
                new Intent(
                        this,
                        SignupActivity.class );

        startActivityForResult( intent, MY_REQUEST_CODE );
    }

    protected void onActivityResult(
            int requestCode,
            int resultCode,
            Intent pData)
    {
        if ( requestCode == MY_REQUEST_CODE )
        {
            if (resultCode == Activity.RESULT_OK )
            {
                final String zData = pData.getExtras().getString( SignupActivity.EXTRA_STRING_NAME );

                //..do something with our retrieved value..

                Log.v( TAG, "Retrieved Value zData is "+zData );
                //..logcats "Retrieved Value zData is returnValueAsString"

            }
        }

    }
*/
}
