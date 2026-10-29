package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class kj0 extends g3.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f11069a;

    /* renamed from: b, reason: collision with root package name */
    private final ki0 f11070b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f11071c;

    /* renamed from: e, reason: collision with root package name */
    private final long f11073e = System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f11074f = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    private final ij0 f11072d = new ij0();

    public kj0(Context context, String str) {
        this.f11069a = str;
        this.f11071c = context.getApplicationContext();
        this.f11070b = s2.z.b().f(context, str, new gb0());
    }

    @Override // g3.a
    public final k2.u a() {
        s2.y2 y2Var = null;
        try {
            ki0 ki0Var = this.f11070b;
            if (ki0Var != null) {
                y2Var = ki0Var.n();
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
        return k2.u.f(y2Var);
    }

    @Override // g3.a
    public final void c(Activity activity, k2.p pVar) {
        ij0 ij0Var = this.f11072d;
        ij0Var.k8(pVar);
        try {
            ki0 ki0Var = this.f11070b;
            if (ki0Var != null) {
                ki0Var.B1(ij0Var);
                ki0Var.C0(w3.b.C1(activity));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void d(s2.i3 i3Var, g3.b bVar) {
        try {
            ki0 ki0Var = this.f11070b;
            if (ki0Var != null) {
                i3Var.o(this.f11073e);
                ki0Var.L7(s2.f5.f26092a.a(this.f11071c, i3Var), new jj0(bVar, this));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }
}
