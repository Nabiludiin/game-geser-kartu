package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: MyApplication */
public final class b5 {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f21885g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f21886a;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f21887b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21888c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21889d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f21890e = null;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f21891f = null;

    /* synthetic */ b5(String str, Object obj, Object obj2, n0 n0Var, byte[] bArr) {
        this.f21886a = str;
        this.f21888c = obj;
        this.f21887b = n0Var;
    }

    public final String a() {
        return this.f21886a;
    }

    public final Object b(Object obj) {
        List<b5> list;
        synchronized (this.f21889d) {
        }
        if (obj != null) {
            return obj;
        }
        if (v4.f22711a == null) {
            return this.f21888c;
        }
        synchronized (f21885g) {
            try {
                if (f.a()) {
                    return this.f21891f == null ? this.f21888c : this.f21891f;
                }
                try {
                    list = c5.f21933a;
                    for (b5 b5Var : list) {
                        if (f.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            n0 n0Var = b5Var.f21887b;
                            if (n0Var != null) {
                                obj2 = n0Var.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f21885g) {
                            b5Var.f21891f = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                n0 n0Var2 = this.f21887b;
                if (n0Var2 != null) {
                    try {
                        return n0Var2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f21888c;
            } finally {
            }
        }
    }
}
