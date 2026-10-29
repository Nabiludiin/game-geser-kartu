package k3;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.i;
import com.google.android.gms.common.api.GoogleApiActivity;
import m3.n0;
import m3.o0;
import v2.n2;

/* compiled from: MyApplication */
public class g extends h {

    /* renamed from: c, reason: collision with root package name */
    private String f24493c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f24491e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final g f24492f = new g();

    /* renamed from: d, reason: collision with root package name */
    public static final int f24490d = h.f24498a;

    public static g p() {
        return f24492f;
    }

    @Override // k3.h
    public Intent d(Context context, int i7, String str) {
        return super.d(context, i7, str);
    }

    @Override // k3.h
    public PendingIntent e(Context context, int i7, int i8) {
        return super.e(context, i7, i8);
    }

    @Override // k3.h
    public final String g(int i7) {
        return super.g(i7);
    }

    @Override // k3.h
    public int i(Context context) {
        return super.i(context);
    }

    @Override // k3.h
    public int j(Context context, int i7) {
        return super.j(context, i7);
    }

    @Override // k3.h
    public final boolean m(int i7) {
        return super.m(i7);
    }

    public Dialog n(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        return s(activity, i7, p3.c0.b(activity, d(activity, i7, "d"), i8), onCancelListener, null);
    }

    public PendingIntent o(Context context, b bVar) {
        return bVar.P0() ? bVar.O0() : e(context, bVar.M0(), 0);
    }

    public boolean q(Activity activity, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog n7 = n(activity, i7, i8, onCancelListener);
        if (n7 == null) {
            return false;
        }
        v(activity, n7, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void r(Context context, int i7) {
        w(context, i7, null, f(context, i7, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog s(Context context, int i7, p3.c0 c0Var, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(p3.z.c(context, i7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b8 = p3.z.b(context, i7);
        if (b8 != null) {
            if (c0Var == null) {
                c0Var = onClickListener;
            }
            builder.setPositiveButton(b8, c0Var);
        }
        String f8 = p3.z.f(context, i7);
        if (f8 != null) {
            builder.setTitle(f8);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i7)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(p3.z.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        v(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final o0 u(Context context, n0 n0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        o0 o0Var = new o0(n0Var);
        n4.f.l(context, o0Var, intentFilter);
        o0Var.a(context);
        if (l(context, "com.google.android.gms")) {
            return o0Var;
        }
        n0Var.a();
        o0Var.b();
        return null;
    }

    final void v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.e) {
                n.P1(dialog, onCancelListener).O1(((androidx.fragment.app.e) activity).D(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void w(Context context, int i7, String str, PendingIntent pendingIntent) {
        int i8;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i7), null), new IllegalArgumentException());
        if (i7 == 18) {
            x(context);
            return;
        }
        if (pendingIntent == null) {
            if (i7 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e8 = p3.z.e(context, i7);
        String d8 = p3.z.d(context, i7);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) p3.o.m(context.getSystemService("notification"));
        i.e q7 = new i.e(context).n(true).f(true).j(e8).q(new i.c().h(d8));
        if (com.google.android.gms.common.util.i.f(context)) {
            p3.o.p(com.google.android.gms.common.util.n.d());
            q7.p(context.getApplicationInfo().icon).o(2);
            if (com.google.android.gms.common.util.i.g(context)) {
                q7.a(j3.a.f24245a, resources.getString(j3.b.f24260o), pendingIntent);
            } else {
                q7.h(pendingIntent);
            }
        } else {
            q7.p(R.drawable.stat_sys_warning).r(resources.getString(j3.b.f24253h)).s(System.currentTimeMillis()).h(pendingIntent).i(d8);
        }
        if (com.google.android.gms.common.util.n.f()) {
            p3.o.p(com.google.android.gms.common.util.n.f());
            synchronized (f24491e) {
                str2 = this.f24493c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(j3.b.f24252g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(n2.a("com.google.android.gms.availability", string, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            q7.g(str2);
        }
        Notification b8 = q7.b();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            k.f24504b.set(false);
            i8 = 10436;
        } else {
            i8 = 39789;
        }
        notificationManager.notify(i8, b8);
    }

    final void x(Context context) {
        new o(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean y(Activity activity, m3.j jVar, int i7, int i8, DialogInterface.OnCancelListener onCancelListener) {
        Dialog s7 = s(activity, i7, p3.c0.c(jVar, d(activity, i7, "d"), 2), onCancelListener, null);
        if (s7 == null) {
            return false;
        }
        v(activity, s7, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean z(Context context, b bVar, int i7) {
        PendingIntent o7;
        if (u3.b.a(context) || (o7 = o(context, bVar)) == null) {
            return false;
        }
        w(context, bVar.M0(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, o7, i7, true), n4.g.f25023a | 134217728));
        return true;
    }
}
