package com.topservice.bubbllzStoreAdmin;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class SignInActivity extends AppCompatActivity {

    public static final String DISCOUNT_MESSAGE = "Το Ticket Number είναι ΕΓΚΥΡΟ για δώρο";
    public static final String NO_DISCOUNT_MESSAGE = "Το Ticket Number ΔΕΝ είναι ΕΓΚΥΡΟ για δώρο";
    public static final String WELCOME_USER = "Welcome, ";
    public static final String THANK_YOU = "ΕΥΧΑΡΙΣΤΟΥΜΕ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String username = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's loggedUserCheckedTextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.loggedUserCheckedTextView);
        textView.setText(WELCOME_USER + username + "!");
    }

    public void checkTicketNumber(View view){
        EditText ticketNumberInputText = (EditText) findViewById(R.id.ticketNumberInputText);
        TextView checkTicketNumberTextView = (TextView) findViewById(R.id.checkTicketNumberTextView);
        final TextView checkIfDiscountGivenTextView = (TextView) findViewById(R.id.checkIfDiscountGivenTextView);
        final Button yesButton = (Button) findViewById(R.id.yesButton);
        final Button noButton = (Button) findViewById(R.id.noButton);

        String ticketNumber = ticketNumberInputText.getText().toString();
        /*
        if (ticketNumber.isEmpty()) {
            checkTicketNumberTextView.setVisibility(INVISIBLE);
        }
         */
        if (ticketNumber.equals("1") ){
            checkTicketNumberTextView.setVisibility(VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    checkIfDiscountGivenTextView.setVisibility(VISIBLE);
                    yesButton.setVisibility(VISIBLE);
                    noButton.setVisibility(VISIBLE);
                }
            }, 2000);

        }
        else{
            checkTicketNumberTextView.setVisibility(INVISIBLE);
            checkIfDiscountGivenTextView.setVisibility(INVISIBLE);
            yesButton.setVisibility(INVISIBLE);
            noButton.setVisibility(INVISIBLE);
        }

    }

    public void yesButtonPressed(View view){

        final TextView checkTicketNumberTextView = (TextView) findViewById(R.id.checkTicketNumberTextView);
        final TextView checkIfDiscountGivenTextView = (TextView) findViewById(R.id.checkIfDiscountGivenTextView);
        final Button yesButton = (Button) findViewById(R.id.yesButton);
        final Button noButton = (Button) findViewById(R.id.noButton);

        Toast.makeText(this, THANK_YOU, Toast.LENGTH_SHORT).show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                checkTicketNumberTextView.setVisibility(INVISIBLE);
                checkIfDiscountGivenTextView.setVisibility(INVISIBLE);
                yesButton.setVisibility(INVISIBLE);
                noButton.setVisibility(INVISIBLE);
            }
        }, 2000);


    }

    public void noButtonPressed(View view){
        yesButtonPressed(view);
    }
}
