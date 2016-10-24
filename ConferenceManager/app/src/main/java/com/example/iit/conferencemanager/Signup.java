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

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    Account PlaceHolder;

    public void sendMessage(View view) {
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
            String temp = PlaceHolder.getUser();
            String username = "username";
            intent.putExtra(temp, username);
            startActivity(intent);
        Intent intent1 = new Intent(Signup.this, Splash_Screen.class);
        startActivity(intent1);

    }
}
