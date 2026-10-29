package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class tf0 {

    /* renamed from: e, reason: collision with root package name */
    private static wk0 f16157e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16158a;

    /* renamed from: b, reason: collision with root package name */
    private final k2.c f16159b;

    /* renamed from: c, reason: collision with root package name */
    private final s2.i3 f16160c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16161d;

    public tf0(Context context, k2.c cVar, s2.i3 i3Var, String str) {
        this.f16158a = context;
        this.f16159b = cVar;
        this.f16160c = i3Var;
        this.f16161d = str;
    }

    public static wk0 a(Context context) {
        wk0 wk0Var;
        synchronized (tf0.class) {
            try {
                if (f16157e == null) {
                    f16157e = s2.z.b().i(context, new gb0());
                }
                wk0Var = f16157e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wk0Var;
    }

    public final void b(e3.b bVar) {
        s2.b5 a8;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.f16158a;
        wk0 a9 = a(context);
        if (a9 == null) {
            bVar.a("Internal Error, query info generator is null.");
            return;
        }
        w3.a C1 = w3.b.C1(context);
        s2.i3 i3Var = this.f16160c;
        if (i3Var == null) {
            s2.c5 c5Var = new s2.c5();
            c5Var.i(currentTimeMillis);
            a8 = c5Var.a();
        } else {
            i3Var.o(currentTimeMillis);
            a8 = s2.f5.f26092a.a(context, i3Var);
        }
        try {
            a9.X2(C1, new al0(this.f16161d, this.f16159b.name(), null, a8, 0, null), new sf0(this, bVar));
        } catch (RemoteException unused) {
            bVar.a("Internal Error.");
        }
    }
}
