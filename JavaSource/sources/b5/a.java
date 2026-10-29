package b5;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.IntentSender;
import android.util.Log;
import k3.j;
import l3.f;

/* compiled from: MyApplication */
public abstract class a {
    public static Dialog a(Activity activity, String str) {
        return new AlertDialog.Builder(activity).setMessage(str).setNeutralButton(R.string.ok, (DialogInterface.OnClickListener) null).create();
    }

    public static boolean b(Activity activity, f fVar, k3.b bVar, int i7, int i8) {
        return c(activity, fVar, bVar, i7, activity.getString(i8));
    }

    public static boolean c(Activity activity, f fVar, k3.b bVar, int i7, String str) {
        if (bVar.P0()) {
            try {
                bVar.R0(activity, i7);
                return true;
            } catch (IntentSender.SendIntentException unused) {
                fVar.d();
                return false;
            }
        }
        Dialog n7 = j.n(bVar.M0(), activity, i7);
        if (n7 != null) {
            n7.show();
        } else {
            e(activity, str);
        }
        return false;
    }

    public static void d(Activity activity, int i7, int i8, int i9) {
        Dialog a8;
        if (activity == null) {
            Log.e("BaseGameUtils", "*** No Activity. Can't show failure dialog!");
            return;
        }
        switch (i8) {
            case 10002:
                a8 = a(activity, activity.getString(b.f3409c));
                break;
            case 10003:
                a8 = a(activity, activity.getString(b.f3408b));
                break;
            case 10004:
                a8 = a(activity, activity.getString(b.f3407a));
                break;
            default:
                a8 = j.o(j.g(activity), activity, i7, null);
                if (a8 == null) {
                    Log.e("BaseGamesUtils", "No standard error dialog available. Making fallback dialog.");
                    a8 = a(activity, activity.getString(i9));
                    break;
                }
                break;
        }
        a8.show();
    }

    public static void e(Activity activity, String str) {
        new AlertDialog.Builder(activity).setMessage(str).setNeutralButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }
}
