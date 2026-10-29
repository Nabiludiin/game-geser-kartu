package k3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: MyApplication */
public class c extends DialogFragment {

    /* renamed from: q, reason: collision with root package name */
    private Dialog f24474q;

    /* renamed from: r, reason: collision with root package name */
    private DialogInterface.OnCancelListener f24475r;

    /* renamed from: s, reason: collision with root package name */
    private Dialog f24476s;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) p3.o.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f24474q = dialog2;
        if (onCancelListener != null) {
            cVar.f24475r = onCancelListener;
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f24475r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f24474q;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f24476s == null) {
            this.f24476s = new AlertDialog.Builder((Context) p3.o.m(getActivity())).create();
        }
        return this.f24476s;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
