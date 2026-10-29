package k3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: MyApplication */
public class n extends androidx.fragment.app.d {
    private Dialog H0;
    private DialogInterface.OnCancelListener I0;
    private Dialog J0;

    public static n P1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        n nVar = new n();
        Dialog dialog2 = (Dialog) p3.o.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        nVar.H0 = dialog2;
        if (onCancelListener != null) {
            nVar.I0 = onCancelListener;
        }
        return nVar;
    }

    @Override // androidx.fragment.app.d
    public Dialog I1(Bundle bundle) {
        Dialog dialog = this.H0;
        if (dialog != null) {
            return dialog;
        }
        M1(false);
        if (this.J0 == null) {
            this.J0 = new AlertDialog.Builder((Context) p3.o.m(r())).create();
        }
        return this.J0;
    }

    @Override // androidx.fragment.app.d
    public void O1(androidx.fragment.app.n nVar, String str) {
        super.O1(nVar, str);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.I0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
