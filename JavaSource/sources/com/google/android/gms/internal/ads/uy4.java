package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: MyApplication */
public abstract class uy4 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f17265e = 100;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17266f = 0;

    /* renamed from: a, reason: collision with root package name */
    int f17267a;

    /* renamed from: b, reason: collision with root package name */
    int f17268b;

    /* renamed from: c, reason: collision with root package name */
    final int f17269c = f17265e;

    /* renamed from: d, reason: collision with root package name */
    Object f17270d;

    /* synthetic */ uy4(byte[] bArr) {
    }

    public static uy4 d(InputStream inputStream, int i7) {
        if (inputStream != null) {
            return new ty4(inputStream, 4096, null);
        }
        byte[] bArr = c05.f6204b;
        int length = bArr.length;
        return e(bArr, 0, 0, false);
    }

    static uy4 e(byte[] bArr, int i7, int i8, boolean z7) {
        ry4 ry4Var = new ry4(bArr, i7, i8, z7, null);
        try {
            ry4Var.E(i8);
            return ry4Var;
        } catch (e05 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int i(int i7) {
        return (i7 >>> 1) ^ (-(i7 & 1));
    }

    public static long j(long j7) {
        return (j7 >>> 1) ^ (-(1 & j7));
    }

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract long D();

    public abstract int E(int i7);

    public abstract void a(int i7);

    public abstract boolean b();

    public abstract int c();

    public final void f() {
        if (this.f17267a + this.f17268b >= this.f17269c) {
            throw new e05("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void g() {
        if (this.f17268b == 0) {
            l(0);
        }
    }

    public final void h() {
        int k7;
        do {
            k7 = k();
            if (k7 == 0) {
                return;
            }
            f();
            this.f17268b++;
            this.f17268b--;
        } while (m(k7));
    }

    public abstract int k();

    public abstract void l(int i7);

    public abstract boolean m(int i7);

    public abstract double n();

    public abstract float o();

    public abstract long p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract boolean u();

    public abstract String v();

    public abstract String w();

    public abstract qy4 x();

    public abstract int y();

    public abstract int z();
}
