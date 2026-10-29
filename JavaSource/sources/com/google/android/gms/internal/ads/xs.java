package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class xs extends m2.a {

    /* renamed from: a, reason: collision with root package name */
    private final bt f18993a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f18994b;

    /* renamed from: c, reason: collision with root package name */
    private final ys f18995c = new ys();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f18996d = new AtomicLong();

    public xs(bt btVar, String str) {
        this.f18993a = btVar;
        this.f18994b = new AtomicReference(str);
    }

    @Override // m2.a
    public final k2.u a() {
        s2.y2 y2Var;
        try {
            y2Var = this.f18993a.f();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
            y2Var = null;
        }
        return k2.u.f(y2Var);
    }

    @Override // m2.a
    public final void c(Activity activity) {
        try {
            this.f18993a.n7(w3.b.C1(activity), this.f18995c);
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }
}
