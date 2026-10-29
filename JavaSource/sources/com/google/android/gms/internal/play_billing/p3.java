package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class p3 extends z2 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f21706b = Logger.getLogger(p3.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f21707c = w5.C();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f21708d = 0;

    /* renamed from: a, reason: collision with root package name */
    q3 f21709a;

    /* synthetic */ p3(o3 o3Var) {
    }

    static int a(z4 z4Var, j5 j5Var) {
        int c8 = ((u2) z4Var).c(j5Var);
        return c(c8) + c8;
    }

    public static int b(String str) {
        int length;
        try {
            length = z5.c(str);
        } catch (y5 unused) {
            length = str.getBytes(j4.f21585a).length;
        }
        return c(length) + length;
    }

    public static int c(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int d(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    static int z(int i7, z4 z4Var, j5 j5Var) {
        int c8 = c(i7 << 3);
        return c8 + c8 + ((u2) z4Var).c(j5Var);
    }

    public final void e() {
        if (h() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, y5 y5Var) {
        f21706b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) y5Var);
        byte[] bytes = str.getBytes(j4.f21585a);
        try {
            int length = bytes.length;
            w(length);
            r(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new n3(e8);
        }
    }

    public abstract int h();

    public abstract void i(byte b8);

    public abstract void j(int i7, boolean z7);

    public abstract void k(int i7, i3 i3Var);

    public abstract void l(int i7, int i8);

    public abstract void m(int i7);

    public abstract void n(int i7, long j7);

    public abstract void o(long j7);

    public abstract void p(int i7, int i8);

    public abstract void q(int i7);

    public abstract void r(byte[] bArr, int i7, int i8);

    abstract void s(int i7, z4 z4Var, j5 j5Var);

    public abstract void t(int i7, String str);

    public abstract void u(int i7, int i8);

    public abstract void v(int i7, int i8);

    public abstract void w(int i7);

    public abstract void x(int i7, long j7);

    public abstract void y(long j7);
}
