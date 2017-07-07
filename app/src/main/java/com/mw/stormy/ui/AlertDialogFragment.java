package com.mw.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.mw.stormy.R;

/**
 * Created by MW on 6/22/17.
 */

public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
            .setTitle(R.string.error_title)
            .setMessage(R.string.error_msg)
            .setPositiveButton(R.string.error_ok_btn, null);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
