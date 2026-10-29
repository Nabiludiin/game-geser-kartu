package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: MyApplication */
public abstract class az {

    /* renamed from: a, reason: collision with root package name */
    public static final az f5406a = new ns();

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    protected az() {
    }

    public abstract int a();

    public abstract yx b(int i7, yx yxVar, long j7);

    public abstract int c();

    public abstract ot d(int i7, ot otVar, boolean z7);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int j7;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        if (azVar.a() == a() && azVar.c() == c()) {
            yx yxVar = new yx();
            ot otVar = new ot();
            yx yxVar2 = new yx();
            ot otVar2 = new ot();
            for (int i7 = 0; i7 < a(); i7++) {
                if (!b(i7, yxVar, 0L).equals(azVar.b(i7, yxVar2, 0L))) {
                    return false;
                }
            }
            for (int i8 = 0; i8 < c(); i8++) {
                if (!d(i8, otVar, true).equals(azVar.d(i8, otVar2, true))) {
                    return false;
                }
            }
            int k7 = k(true);
            if (k7 == azVar.k(true) && (j7 = j(true)) == azVar.j(true)) {
                while (k7 != j7) {
                    int h8 = h(k7, 0, true);
                    if (h8 != azVar.h(k7, 0, true)) {
                        return false;
                    }
                    k7 = h8;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i7);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i7, int i8, boolean z7) {
        if (i8 == 0) {
            if (i7 == j(z7)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == j(z7) ? k(z7) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i7;
        yx yxVar = new yx();
        ot otVar = new ot();
        int a8 = a() + 217;
        int i8 = 0;
        while (true) {
            i7 = a8 * 31;
            if (i8 >= a()) {
                break;
            }
            a8 = i7 + b(i8, yxVar, 0L).hashCode();
            i8++;
        }
        int c8 = i7 + c();
        for (int i9 = 0; i9 < c(); i9++) {
            c8 = (c8 * 31) + d(i9, otVar, true).hashCode();
        }
        int k7 = k(true);
        while (k7 != -1) {
            c8 = (c8 * 31) + k7;
            k7 = h(k7, 0, true);
        }
        return c8;
    }

    public int i(int i7, int i8, boolean z7) {
        if (i7 == k(false)) {
            return -1;
        }
        return i7 - 1;
    }

    public int j(boolean z7) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z7) {
        return g() ? -1 : 0;
    }

    public final int l(int i7, ot otVar, yx yxVar, int i8, boolean z7) {
        int i9 = d(i7, otVar, false).f13477c;
        if (b(i9, yxVar, 0L).f19909n != i7) {
            return i7 + 1;
        }
        int h8 = h(i9, i8, z7);
        if (h8 == -1) {
            return -1;
        }
        return b(h8, yxVar, 0L).f19908m;
    }

    public final Pair m(yx yxVar, ot otVar, int i7, long j7) {
        Pair n7 = n(yxVar, otVar, i7, j7, 0L);
        n7.getClass();
        return n7;
    }

    public final Pair n(yx yxVar, ot otVar, int i7, long j7, long j8) {
        rx3.m(i7, a(), "index");
        b(i7, yxVar, j8);
        if (j7 == -9223372036854775807L) {
            long j9 = yxVar.f19906k;
            j7 = 0;
        }
        int i8 = yxVar.f19908m;
        d(i8, otVar, false);
        while (i8 < yxVar.f19909n) {
            long j10 = otVar.f13479e;
            if (j7 == 0) {
                break;
            }
            int i9 = i8 + 1;
            long j11 = d(i9, otVar, false).f13479e;
            if (j7 < 0) {
                break;
            }
            i8 = i9;
        }
        d(i8, otVar, true);
        long j12 = otVar.f13479e;
        long j13 = otVar.f13478d;
        if (j13 != -9223372036854775807L) {
            j7 = Math.min(j7, j13 - 1);
        }
        long max = Math.max(0L, j7);
        Object obj = otVar.f13476b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public ot o(Object obj, ot otVar) {
        return d(e(obj), otVar, true);
    }
}
