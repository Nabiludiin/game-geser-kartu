package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: MyApplication */
final class ky3 implements Serializable, jy3 {

    /* renamed from: q, reason: collision with root package name */
    private final transient ry3 f11292q = new ry3();

    /* renamed from: r, reason: collision with root package name */
    final jy3 f11293r;

    /* renamed from: s, reason: collision with root package name */
    volatile transient boolean f11294s;

    /* renamed from: t, reason: collision with root package name */
    transient Object f11295t;

    ky3(jy3 jy3Var) {
        this.f11293r = jy3Var;
    }

    @Override // com.google.android.gms.internal.ads.jy3
    public final Object a() {
        if (!this.f11294s) {
            synchronized (this.f11292q) {
                try {
                    if (!this.f11294s) {
                        Object a8 = this.f11293r.a();
                        this.f11295t = a8;
                        this.f11294s = true;
                        return a8;
                    }
                } finally {
                }
            }
        }
        return this.f11295t;
    }

    public final String toString() {
        Object obj;
        if (this.f11294s) {
            String valueOf = String.valueOf(this.f11295t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f11293r;
        }
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj2);
        sb2.append(")");
        return sb2.toString();
    }
}
