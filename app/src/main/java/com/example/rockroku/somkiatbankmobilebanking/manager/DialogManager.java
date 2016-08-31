package com.example.rockroku.somkiatbankmobilebanking.manager;

import android.content.Context;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.rockroku.somkiatbankmobilebanking.R;


public class DialogManager {
    private static DialogManager dialogManager;

    public static DialogManager getInstance() {
        if (dialogManager == null) {
            dialogManager = new DialogManager();
        }
        return dialogManager;
    }

    private MaterialDialog materialDialog;

    public void showDialog(Context context, String title, String content, String positive, String negative, MaterialDialog.SingleButtonCallback callback) {
        dismissDialog();
        materialDialog = new MaterialDialog.Builder(context)
                .title(title)
                .content(content)
                .positiveText(positive)
                .negativeText(negative)
                .onNegative(callback)
                .onPositive(callback)
                .show();
    }

    public void showLoading(Context context) {
        dismissDialog();
        materialDialog = new MaterialDialog.Builder(context)
                .content(R.string.loading)
                .progress(true, 0)
                .show();
    }

    public boolean isDialogShowing() {
        return materialDialog != null && materialDialog.isShowing();
    }

    public void dismissDialog() {
        if (materialDialog != null) {
            materialDialog.dismiss();
            materialDialog = null;
        }
    }
}
