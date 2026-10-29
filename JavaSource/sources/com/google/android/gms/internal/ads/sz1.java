package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class sz1 implements bz1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15893a;

    /* renamed from: b, reason: collision with root package name */
    private final fz1 f15894b;

    /* renamed from: c, reason: collision with root package name */
    private final tz2 f15895c;

    sz1(long j7, Context context, fz1 fz1Var, gu0 gu0Var, String str) {
        this.f15893a = j7;
        this.f15894b = fz1Var;
        vz2 y7 = gu0Var.y();
        y7.d(context);
        y7.v(str);
        this.f15895c = y7.a().b();
    }

    @Override // com.google.android.gms.internal.ads.bz1
    public final void a(s2.b5 b5Var) {
        try {
            this.f15895c.I7(b5Var, new qz1(this));
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.bz1
    public final void b() {
        try {
            tz2 tz2Var = this.f15895c;
            tz2Var.B1(new rz1(this));
            tz2Var.C0(w3.b.C1(null));
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    final /* synthetic */ long c() {
        return this.f15893a;
    }

    final /* synthetic */ fz1 e() {
        return this.f15894b;
    }

    @Override // com.google.android.gms.internal.ads.bz1
    public final void d() {
    }
}
