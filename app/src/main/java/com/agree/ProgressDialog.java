package com.agree;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

public class ProgressDialog {
    private static Dialog mDialog;

    public static void showProgress(Context context) {
        mDialog = new Dialog(context);
        mDialog.setCancelable(true);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        mDialog.setContentView(R.layout.progress_layout);

        if (android.os.Build.VERSION.SDK_INT <= 19 && android.os.Build.VERSION.SDK_INT >= 14) {
            int dividerId = mDialog.getContext().getResources().getIdentifier("android:id/titleDivider", null, null);
            View divider = mDialog.findViewById(dividerId);
            divider.setBackgroundColor(Color.TRANSPARENT);
        }
        mDialog.show();

    }

    public static void dimiss() {
        if (mDialog != null) {
            mDialog.dismiss();
        }
    }
}
