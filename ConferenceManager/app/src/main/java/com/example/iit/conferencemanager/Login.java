package com.example.iit.conferencemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        * btnHit.setOnClickListener(new View.OnClickListener(){
        *   @Override
        *   public void onClick(View v){
        *       new HttpGet().execute("Our desired URL");//this invokes get because
        *   }
        * });
        * */
    }

    Account PlaceHolder;

    public void sendMessage(View view) {
        Intent intent = new Intent(Login.this, HttpPost.class);
        EditText ETEmail = (EditText) findViewById(R.id.editText);
        EditText ETPass = (EditText) findViewById(R.id.editText2);
        PlaceHolder.setUser(ETEmail.getText().toString());
        PlaceHolder.setUser(ETPass.getText().toString());
        //intent.putExtra(PlaceHolder);
        //to satisfy string requirement, to remove later.
        String temp = PlaceHolder.getUser();
        String username = "username";
        intent.putExtra(temp, username);
        startActivity(intent);
        Intent intent1 = new Intent(Login.this, Splash_Screen.class);
        startActivity(intent1);

    }



}
