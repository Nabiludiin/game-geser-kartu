package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class qh3 {

    /* renamed from: b, reason: collision with root package name */
    private static qh3 f14441b;

    /* renamed from: a, reason: collision with root package name */
    final mh3 f14442a;

    private qh3(Context context) {
        this.f14442a = mh3.a(context);
        lh3.a(context);
    }

    public static final qh3 a(Context context) {
        qh3 qh3Var;
        synchronized (qh3.class) {
            try {
                if (f14441b == null) {
                    f14441b = new qh3(context);
                }
                qh3Var = f14441b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qh3Var;
    }

    public final void b(kh3 kh3Var) {
        synchronized (qh3.class) {
            mh3 mh3Var = this.f14442a;
            mh3Var.f("vendor_scoped_gpid_v2_id");
            mh3Var.f("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
