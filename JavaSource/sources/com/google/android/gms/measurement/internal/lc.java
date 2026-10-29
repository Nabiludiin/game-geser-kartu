package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: MyApplication */
final class lc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mc f22338a;

    lc(mc mcVar) {
        Objects.requireNonNull(mcVar);
        this.f22338a = mcVar;
    }

    final void a() {
        mc mcVar = this.f22338a;
        mcVar.h();
        w6 w6Var = mcVar.f22928a;
        if (w6Var.x().A(w6Var.f().a())) {
            w6Var.x().f22033m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                w6Var.a().w().a("Detected application was in foreground");
                c(w6Var.f().a(), false);
            }
        }
    }

    final void b(long j7, boolean z7) {
        mc mcVar = this.f22338a;
        mcVar.h();
        mcVar.q();
        w6 w6Var = mcVar.f22928a;
        if (w6Var.x().A(j7)) {
            w6Var.x().f22033m.b(true);
            mcVar.f22928a.L().p();
        }
        w6Var.x().f22037q.b(j7);
        if (w6Var.x().f22033m.a()) {
            c(j7, z7);
        }
    }

    final void c(long j7, boolean z7) {
        mc mcVar = this.f22338a;
        mcVar.h();
        if (mcVar.f22928a.g()) {
            w6 w6Var = mcVar.f22928a;
            w6Var.x().f22037q.b(j7);
            w6Var.a().w().b("Session started, time", Long.valueOf(w6Var.f().b()));
            long j8 = j7 / 1000;
            w6 w6Var2 = mcVar.f22928a;
            w6Var2.B().B("auto", "_sid", Long.valueOf(j8), j7);
            w6Var.x().f22038r.b(j8);
            w6Var.x().f22033m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j8);
            w6Var2.B().u("auto", "_s", j7, bundle);
            String a8 = w6Var.x().f22043w.a();
            if (TextUtils.isEmpty(a8)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a8);
            w6Var2.B().u("auto", "_ssr", j7, bundle2);
        }
    }
}
