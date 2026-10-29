package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: MyApplication */
final class a92 extends TimerTask {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AlertDialog f4828q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Timer f4829r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ u2.a0 f4830s;

    a92(i92 i92Var, AlertDialog alertDialog, Timer timer, u2.a0 a0Var) {
        this.f4828q = alertDialog;
        this.f4829r = timer;
        this.f4830s = a0Var;
        Objects.requireNonNull(i92Var);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f4828q.dismiss();
        this.f4829r.cancel();
        u2.a0 a0Var = this.f4830s;
        if (a0Var != null) {
            a0Var.b();
        }
    }
}
