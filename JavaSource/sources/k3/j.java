package k3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;

/* compiled from: MyApplication */
public abstract class j extends k {

    /* renamed from: f, reason: collision with root package name */
    public static final int f24502f = k.f24503a;

    public static Resources e(Context context) {
        return k.e(context);
    }

    public static int g(Context context) {
        return k.g(context);
    }

    public static Dialog n(int i7, Activity activity, int i8) {
        return o(i7, activity, i8, null);
    }

    public static Dialog o(int i7, Activity activity, int i8, DialogInterface.OnCancelListener onCancelListener) {
        if (true == k.i(activity, i7)) {
            i7 = 18;
        }
        return g.p().n(activity, i7, i8, onCancelListener);
    }
}
