package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class f30 {

    /* renamed from: a, reason: collision with root package name */
    private final e30 f8013a;

    public f30(e30 e30Var) {
        Context context;
        this.f8013a = e30Var;
        try {
            context = (Context) w3.b.r0(e30Var.n());
        } catch (RemoteException | NullPointerException e8) {
            w2.p.d("", e8);
            context = null;
        }
        if (context != null) {
            try {
                this.f8013a.j0(w3.b.C1(new n2.b(context)));
            } catch (RemoteException e9) {
                w2.p.d("", e9);
            }
        }
    }

    public final e30 a() {
        return this.f8013a;
    }

    public final String b() {
        try {
            return this.f8013a.g();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            return null;
        }
    }
}
