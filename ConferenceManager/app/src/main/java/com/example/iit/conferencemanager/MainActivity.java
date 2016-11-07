package com.example.iit.conferencemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;



public class MainActivity extends AppCompatActivity {

    GoogleApiClient mGoogleApiClient;
    private TextView mStatusTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    public void sendMessage(View view)
    {
        Intent intent = new Intent(MainActivity.this, Signup.class);
        startActivity(intent);
    }
*/
    public void sendMessage(View view)
    {
        Intent intent = new Intent(MainActivity.this, googleLogin.class);
        startActivity(intent);
    }
    public void sendMessage1(View view)
    {
        Intent intent = new Intent(MainActivity.this, Sign_in.class);
        startActivity(intent);
    }






}

