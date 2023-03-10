package com.example.minorproject;

import android.app.Dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class DecodedMessageDialogFragment extends DialogFragment {

    static final String ARG_MESSAGE = "Image path";

    public static DecodedMessageDialogFragment newInstance(String message) {
        Bundle args = new Bundle();
        args.putString(ARG_MESSAGE, message);

        DecodedMessageDialogFragment dialogFragment = new DecodedMessageDialogFragment();
        dialogFragment.setArguments(args);
        return dialogFragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_decoded_message, null);

        String message = getArguments().getString(ARG_MESSAGE);

        TextView messageTextView = (TextView) v.findViewById(R.id.textView_decoded_message);
        messageTextView.setText(message);
        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .setTitle(R.string.decoded_message)
                .create();
    }
}