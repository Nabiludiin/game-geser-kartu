package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.Objects;

/* compiled from: MyApplication */
public final class cc {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22014a;

    public cc(Context context) {
        p3.o.m(context);
        this.f22014a = context;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    private final void k(pd pdVar, Runnable runnable) {
        pdVar.b().t(new yb(this, pdVar, runnable));
    }

    public final void a() {
        Log.v("FA", this.f22014a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", this.f22014a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int c(final Intent intent, int i7, final int i8) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f22014a;
        w6 O = w6.O(context, null, null);
        final p5 a8 = O.a();
        String action = intent.getAction();
        O.c();
        a8.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i8), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(pd.F(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.bc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    cc.this.f(i8, a8, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new y7(pd.F(this.f22014a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final boolean e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) p3.o.m(string);
            pd F = pd.F(this.f22014a);
            final p5 a8 = F.a();
            F.c();
            a8.w().b("Local AppMeasurementJobService called. action", str);
            k(F, new Runnable() { // from class: com.google.android.gms.measurement.internal.zb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    cc.this.g(a8, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        com.google.android.gms.internal.measurement.p3.o(this.f22014a, null).y(new Runnable() { // from class: com.google.android.gms.measurement.internal.ac
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                cc.this.h(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void f(int i7, p5 p5Var, Intent intent) {
        Context context = this.f22014a;
        t4.m0 m0Var = (t4.m0) context;
        if (m0Var.L(i7)) {
            p5Var.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i7));
            w6.O(context, null, null).a().w().a("Completed wakeful intent.");
            m0Var.a(intent);
        }
    }

    final /* synthetic */ void g(p5 p5Var, JobParameters jobParameters) {
        p5Var.w().a("AppMeasurementJobService processed last upload request.");
        ((t4.m0) this.f22014a).b(jobParameters, false);
    }

    final /* synthetic */ void h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((t4.m0) this.f22014a).b(jobParameters, false);
    }
}
