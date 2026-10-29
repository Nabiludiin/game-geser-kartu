package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class az4 extends gy4 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f5412b = Logger.getLogger(az4.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f5413c = f25.i();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5414d = 0;

    /* renamed from: a, reason: collision with root package name */
    Object f5415a;

    /* synthetic */ az4(byte[] bArr) {
    }

    static int D(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    public static int b(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int c(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static int d(String str) {
        int length;
        try {
            length = k25.b(str);
        } catch (j25 unused) {
            length = str.getBytes(c05.f6203a).length;
        }
        return b(length) + length;
    }

    public static int e(v05 v05Var) {
        int m7 = v05Var.m();
        return b(m7) + m7;
    }

    public abstract void A(long j7);

    public abstract void B(String str);

    public abstract void C();

    @Override // com.google.android.gms.internal.ads.gy4
    public abstract void a(byte[] bArr, int i7, int i8);

    public final void f() {
        if (n() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void g(String str, j25 j25Var) {
        f5412b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) j25Var);
        byte[] bytes = str.getBytes(c05.f6203a);
        try {
            int length = bytes.length;
            x(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new yy4(e8);
        }
    }

    public abstract void i(int i7, int i8);

    public abstract void j(int i7, int i8);

    public abstract void k(int i7, int i8);

    public abstract void l(int i7, int i8);

    public abstract void m(int i7, long j7);

    public abstract int n();

    public abstract void o(int i7, long j7);

    public abstract void p(int i7, boolean z7);

    public abstract void q(int i7, String str);

    public abstract void r(int i7, qy4 qy4Var);

    public abstract void s(qy4 qy4Var);

    abstract void t(byte[] bArr, int i7, int i8);

    public abstract void u(v05 v05Var);

    public abstract void v(byte b8);

    public abstract void w(int i7);

    public abstract void x(int i7);

    public abstract void y(int i7);

    public abstract void z(long j7);
}
