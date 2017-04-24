package com.topservice.bubbllzStoreAdmin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.widget.Toast;

public class TicketGivenDialogFragment extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.checkIfDiscountGiven)
                .setPositiveButton(R.string.yesChoice, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(), "ΕΥΧΑΡΙΣΤΟΥΜΕ",
                                Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton(R.string.noChoice, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(), "ΕΥΧΑΡΙΣΤΟΥΜΕ",
                                Toast.LENGTH_LONG).show();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}

