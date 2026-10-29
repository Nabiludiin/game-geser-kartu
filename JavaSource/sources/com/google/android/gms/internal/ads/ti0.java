package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class ti0 extends f3.c {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f16202a;

    /* renamed from: b, reason: collision with root package name */
    private final ki0 f16203b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f16204c;

    /* renamed from: d, reason: collision with root package name */
    private final ij0 f16205d;

    /* renamed from: e, reason: collision with root package name */
    private k2.l f16206e;

    /* renamed from: f, reason: collision with root package name */
    private final long f16207f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f16208g;

    public ti0(Context context, String str) {
        this(context, str, s2.z.b().f(context, str, new gb0()));
    }

    @Override // f3.c
    public final k2.u a() {
        s2.y2 y2Var = null;
        try {
            ki0 ki0Var = this.f16203b;
            if (ki0Var != null) {
                y2Var = ki0Var.n();
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
        return k2.u.f(y2Var);
    }

    @Override // f3.c
    public final void c(k2.l lVar) {
        this.f16206e = lVar;
        this.f16205d.j8(lVar);
    }

    @Override // f3.c
    public final void d(Activity activity, k2.p pVar) {
        ij0 ij0Var = this.f16205d;
        ij0Var.k8(pVar);
        if (activity == null) {
            w2.p.f("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ki0 ki0Var = this.f16203b;
            if (ki0Var != null) {
                ki0Var.B1(ij0Var);
                ki0Var.C0(w3.b.C1(activity));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void e(s2.i3 i3Var, f3.d dVar) {
        try {
            ki0 ki0Var = this.f16203b;
            if (ki0Var != null) {
                i3Var.o(this.f16207f);
                ki0Var.I7(s2.f5.f26092a.a(this.f16204c, i3Var), new ej0(dVar, this));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public ti0(Context context, String str, ki0 ki0Var) {
        this.f16207f = System.currentTimeMillis();
        this.f16208g = new AtomicLong();
        this.f16204c = context.getApplicationContext();
        this.f16202a = new AtomicReference(str);
        this.f16203b = ki0Var;
        this.f16205d = new ij0();
    }
}
