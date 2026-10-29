package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public abstract class c23 {

    /* renamed from: a, reason: collision with root package name */
    static w4.i f6229a;

    /* renamed from: b, reason: collision with root package name */
    public static h3.b f6230b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6231c = new Object();

    public static void a(Context context, boolean z7) {
        synchronized (f6231c) {
            try {
                if (f6230b == null) {
                    f6230b = h3.a.a(context);
                }
                w4.i iVar = f6229a;
                if (iVar == null || ((iVar.m() && !f6229a.n()) || (z7 && f6229a.m()))) {
                    f6229a = ((h3.b) p3.o.n(f6230b, "the appSetIdClient shouldn't be null")).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static w4.i b(Context context) {
        w4.i iVar;
        a(context, false);
        synchronized (f6231c) {
            iVar = f6229a;
        }
        return iVar;
    }
}
