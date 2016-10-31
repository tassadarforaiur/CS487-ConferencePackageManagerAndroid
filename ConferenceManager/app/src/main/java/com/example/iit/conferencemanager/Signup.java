package com.example.iit.conferencemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        * btnHit.setOnClickListener(new View.OnClickListener(){
        *   @Override
        *   public void onClick(View v){
        *       new HttpPost().execute("Our desired URL");//This invokes post because the server is being updated with a new account
        *   }
        * });
        * */
    }
    Account PlaceHolder = new Account("","","","","","");
    HttpPost poster = new HttpPost();

    public void sendMessage(View view) {
        //Intent intent = new Intent(Signup.this, Splash_Screen.class);
        Intent intent = new Intent(Signup.this, HttpPost.class);
        EditText ETUser = (EditText) findViewById(R.id.editText4);
        EditText ETEmail = (EditText) findViewById(R.id.editText5);
        EditText ETPass = (EditText) findViewById(R.id.editText6);
        EditText ETFName = (EditText) findViewById(R.id.editText7);
        EditText ETLName = (EditText) findViewById(R.id.editText8);
        EditText ETPhone = (EditText) findViewById(R.id.editText9);
        EditText ETAddr = (EditText) findViewById(R.id.editText10);
        //Email = (EditText)findViewById()
        PlaceHolder.setUser(ETUser.getText().toString());
        PlaceHolder.setUser(ETEmail.getText().toString());
        PlaceHolder.setUser(ETPass.getText().toString());
        PlaceHolder.setUser(ETFName.getText().toString());
        PlaceHolder.setUser(ETLName.getText().toString());
        PlaceHolder.setUser(ETPhone.getText().toString());
        PlaceHolder.setUser(ETAddr.getText().toString());
        //intent.putExtra(PlaceHolder);
        //to satisfy string requirement, to remove later.
            //String temp = PlaceHolder.getUser();
           // String username = "username";
           // intent.putExtra(temp, username);
           // startActivity(intent);
        //poster.doInBackground(PlaceHolder.getEmail());
        startActivity(intent);

    }
}
