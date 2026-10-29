package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class my3 implements jy3 {

    /* renamed from: t, reason: collision with root package name */
    private static final jy3 f12488t = ly3.f11943q;

    /* renamed from: q, reason: collision with root package name */
    private final ry3 f12489q = new ry3();

    /* renamed from: r, reason: collision with root package name */
    private volatile jy3 f12490r;

    /* renamed from: s, reason: collision with root package name */
    private Object f12491s;

    my3(jy3 jy3Var) {
        this.f12490r = jy3Var;
    }

    @Override // com.google.android.gms.internal.ads.jy3
    public final Object a() {
        jy3 jy3Var = this.f12490r;
        jy3 jy3Var2 = f12488t;
        if (jy3Var != jy3Var2) {
            synchronized (this.f12489q) {
                try {
                    if (this.f12490r != jy3Var2) {
                        Object a8 = this.f12490r.a();
                        this.f12491s = a8;
                        this.f12490r = jy3Var2;
                        return a8;
                    }
                } finally {
                }
            }
        }
        return this.f12491s;
    }

    public final String toString() {
        Object obj = this.f12490r;
        if (obj == f12488t) {
            String valueOf = String.valueOf(this.f12491s);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
