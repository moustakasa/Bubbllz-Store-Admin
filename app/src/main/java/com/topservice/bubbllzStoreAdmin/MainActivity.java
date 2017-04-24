package com.topservice.bubbllzStoreAdmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.topservice.bubbllzStoreAdmin.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Sign in button */
    public void signIn(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        EditText editText = (EditText) findViewById(R.id.usernameText);
        String username = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, username);
        startActivity(intent);
    }
}
