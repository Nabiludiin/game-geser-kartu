package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class p80 extends l2.c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13704a;

    /* renamed from: b, reason: collision with root package name */
    private final s2.f5 f13705b;

    /* renamed from: c, reason: collision with root package name */
    private final s2.v0 f13706c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f13707d;

    /* renamed from: e, reason: collision with root package name */
    private final gb0 f13708e;

    /* renamed from: f, reason: collision with root package name */
    private final long f13709f;

    /* renamed from: g, reason: collision with root package name */
    private k2.l f13710g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicLong f13711h;

    public p80(Context context, String str) {
        gb0 gb0Var = new gb0();
        this.f13708e = gb0Var;
        this.f13709f = System.currentTimeMillis();
        this.f13711h = new AtomicLong();
        this.f13704a = context;
        this.f13707d = new AtomicReference(str);
        this.f13705b = s2.f5.f26092a;
        this.f13706c = s2.z.b().b(context, new s2.g5(), str, gb0Var);
    }

    @Override // x2.a
    public final k2.u a() {
        s2.y2 y2Var = null;
        try {
            s2.v0 v0Var = this.f13706c;
            if (v0Var != null) {
                y2Var = v0Var.r();
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
        return k2.u.f(y2Var);
    }

    @Override // x2.a
    public final void c(k2.l lVar) {
        try {
            this.f13710g = lVar;
            s2.v0 v0Var = this.f13706c;
            if (v0Var != null) {
                v0Var.O1(new s2.c0(lVar));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // x2.a
    public final void d(boolean z7) {
        try {
            s2.v0 v0Var = this.f13706c;
            if (v0Var != null) {
                v0Var.z0(z7);
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // x2.a
    public final void e(Activity activity) {
        if (activity == null) {
            w2.p.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            s2.v0 v0Var = this.f13706c;
            if (v0Var != null) {
                v0Var.W1(w3.b.C1(activity));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void f(s2.i3 i3Var, k2.e eVar) {
        try {
            s2.v0 v0Var = this.f13706c;
            if (v0Var != null) {
                i3Var.o(this.f13709f);
                v0Var.p3(this.f13705b.a(this.f13704a, i3Var), new s2.w4(eVar, this));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
            eVar.a(new k2.m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
