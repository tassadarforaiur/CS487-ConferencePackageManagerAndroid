package com.example.iit.conferencemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;

public class Login extends AppCompatActivity {
//this is a comment
    GoogleApiClient mGoogleApiClient;
    private View button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button = findViewById(R.id.sign_in_button);
        button.setOnClickListener(this);


        // Configure sign-in to request the user's ID, email address, and basic
        // profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleApiClient with access to the Google Sign-In API and the
        // options specified by gso.
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity */, this /* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();


        }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sign_in_button:
                signIn();
                break;
            // ...
        }
        /*
        * btnHit.setOnClickListener(new View.OnClickListener(){
        *   @Override
        *   public void onClick(View v){
        *       new HttpGet().execute("Our desired URL");//this invokes get because the serve does not need to be updated.
        *   }
        * });
        * */
    }

    private void signIn() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent, RC_SIGN_IN);
        new HttpGet().execute("Our desired URL");//this invokes get because the serve does not need to be updated. Data already on the server from signup just needs to be retrieved.
    }
/*  temporarily disabled
    Account PlaceHolder;

    public void sendMessage(View view) {
        Intent intent = new Intent(Login.this, HttpPost.class);
        EditText ETEmail = (EditText) findViewById(R.id.editText1);
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
*/


}
