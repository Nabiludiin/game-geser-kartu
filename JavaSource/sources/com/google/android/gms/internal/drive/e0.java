package com.google.android.gms.internal.drive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class e0 {

    /* renamed from: d, reason: collision with root package name */
    private static final e0 f20557d = new e0(true);

    /* renamed from: b, reason: collision with root package name */
    private boolean f20559b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20560c = false;

    /* renamed from: a, reason: collision with root package name */
    final x1 f20558a = x1.f(16);

    private e0() {
    }

    static int d(z2 z2Var, int i7, Object obj) {
        int o7 = w.o(i7);
        if (z2Var == z2.B) {
            m0.h((i1) obj);
            o7 <<= 1;
        }
        return o7 + i(z2Var, obj);
    }

    private final void f(g0 g0Var, Object obj) {
        if (!g0Var.f()) {
            g(g0Var.i(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                g(g0Var.i(), obj2);
            }
            obj = arrayList;
        }
        this.f20558a.put(g0Var, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.drive.i1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(com.google.android.gms.internal.drive.z2 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.drive.m0.a(r3)
            int[] r0 = com.google.android.gms.internal.drive.f0.f20575a
            com.google.android.gms.internal.drive.e3 r2 = r2.c()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L38;
                case 2: goto L35;
                case 3: goto L32;
                case 4: goto L2f;
                case 5: goto L2c;
                case 6: goto L29;
                case 7: goto L1d;
                case 8: goto L1a;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L3b
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.i1
            if (r2 != 0) goto L27
            goto L26
        L1a:
            boolean r1 = r3 instanceof java.lang.Integer
            goto L3b
        L1d:
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.i
            if (r2 != 0) goto L27
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L26
            goto L27
        L26:
            r0 = r1
        L27:
            r1 = r0
            goto L3b
        L29:
            boolean r0 = r3 instanceof java.lang.String
            goto L27
        L2c:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L27
        L2f:
            boolean r0 = r3 instanceof java.lang.Double
            goto L27
        L32:
            boolean r0 = r3 instanceof java.lang.Float
            goto L27
        L35:
            boolean r0 = r3 instanceof java.lang.Long
            goto L27
        L38:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L27
        L3b:
            if (r1 == 0) goto L3e
            return
        L3e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.e0.g(com.google.android.gms.internal.drive.z2, java.lang.Object):void");
    }

    public static int h(g0 g0Var, Object obj) {
        z2 i7 = g0Var.i();
        int g8 = g0Var.g();
        if (!g0Var.f()) {
            return d(i7, g8, obj);
        }
        int i8 = 0;
        if (g0Var.e()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i8 += i(i7, it.next());
            }
            return w.o(g8) + i8 + w.w(i8);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i8 += d(i7, g8, it2.next());
        }
        return i8;
    }

    private static int i(z2 z2Var, Object obj) {
        switch (f0.f20576b[z2Var.ordinal()]) {
            case 1:
                return w.x(((Double) obj).doubleValue());
            case 2:
                return w.y(((Float) obj).floatValue());
            case 3:
                return w.s0(((Long) obj).longValue());
            case 4:
                return w.t0(((Long) obj).longValue());
            case 5:
                return w.p(((Integer) obj).intValue());
            case 6:
                return w.v0(((Long) obj).longValue());
            case 7:
                return w.s(((Integer) obj).intValue());
            case 8:
                return w.Z(((Boolean) obj).booleanValue());
            case 9:
                return w.Y((i1) obj);
            case 10:
                return w.N((i1) obj);
            case 11:
                return obj instanceof i ? w.D((i) obj) : w.p0((String) obj);
            case 12:
                return obj instanceof i ? w.D((i) obj) : w.O((byte[]) obj);
            case 13:
                return w.q(((Integer) obj).intValue());
            case 14:
                return w.t(((Integer) obj).intValue());
            case 15:
                return w.w0(((Long) obj).longValue());
            case 16:
                return w.r(((Integer) obj).intValue());
            case 17:
                return w.u0(((Long) obj).longValue());
            case 18:
                return w.u(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean j(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    private final void l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    private static int n(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    final Iterator a() {
        return this.f20560c ? new r0(this.f20558a.o().iterator()) : this.f20558a.o().iterator();
    }

    public final boolean b() {
        for (int i7 = 0; i7 < this.f20558a.m(); i7++) {
            if (!j(this.f20558a.g(i7))) {
                return false;
            }
        }
        Iterator it = this.f20558a.n().iterator();
        while (it.hasNext()) {
            if (!j((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator c() {
        return this.f20560c ? new r0(this.f20558a.entrySet().iterator()) : this.f20558a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        e0 e0Var = new e0();
        for (int i7 = 0; i7 < this.f20558a.m(); i7++) {
            Map.Entry g8 = this.f20558a.g(i7);
            android.support.v4.media.session.b.a(g8.getKey());
            e0Var.f(null, g8.getValue());
        }
        for (Map.Entry entry : this.f20558a.n()) {
            android.support.v4.media.session.b.a(entry.getKey());
            e0Var.f(null, entry.getValue());
        }
        e0Var.f20560c = this.f20560c;
        return e0Var;
    }

    public final void e(e0 e0Var) {
        for (int i7 = 0; i7 < e0Var.f20558a.m(); i7++) {
            l(e0Var.f20558a.g(i7));
        }
        Iterator it = e0Var.f20558a.n().iterator();
        while (it.hasNext()) {
            l((Map.Entry) it.next());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f20558a.equals(((e0) obj).f20558a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20558a.hashCode();
    }

    public final void k() {
        if (this.f20559b) {
            return;
        }
        this.f20558a.j();
        this.f20559b = true;
    }

    public final int m() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f20558a.m(); i8++) {
            i7 += n(this.f20558a.g(i8));
        }
        Iterator it = this.f20558a.n().iterator();
        while (it.hasNext()) {
            i7 += n((Map.Entry) it.next());
        }
        return i7;
    }

    private e0(boolean z7) {
        k();
    }
}
