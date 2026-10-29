package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public abstract class ha extends t9 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f21003b = Logger.getLogger(ha.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f21004c = ad.f();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f21005d = 0;

    /* renamed from: a, reason: collision with root package name */
    ia f21006a;

    /* synthetic */ ha(byte[] bArr) {
    }

    public static int E(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int a(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = dd.b(str);
        } catch (cd unused) {
            length = str.getBytes(eb.f20913a).length;
        }
        return E(length) + length;
    }

    public static int c(xb xbVar) {
        int a8 = xbVar.a();
        return E(a8) + a8;
    }

    static int d(xb xbVar, ic icVar) {
        int f8 = ((o9) xbVar).f(icVar);
        return E(f8) + f8;
    }

    static int g(int i7, xb xbVar, ic icVar) {
        int E = E(i7 << 3);
        return E + E + ((o9) xbVar).f(icVar);
    }

    public abstract void A(long j7);

    public abstract void B(byte[] bArr, int i7, int i8);

    public abstract void C(String str);

    public abstract int D();

    public final void e() {
        if (D() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, cd cdVar) {
        f21003b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cdVar);
        byte[] bytes = str.getBytes(eb.f20913a);
        try {
            int length = bytes.length;
            x(length);
            B(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new ga(e8);
        }
    }

    public abstract void i(int i7, int i8);

    public abstract void j(int i7, int i8);

    public abstract void k(int i7, int i8);

    public abstract void l(int i7, int i8);

    public abstract void m(int i7, long j7);

    public abstract void n(int i7, long j7);

    public abstract void o(int i7, boolean z7);

    public abstract void p(int i7, String str);

    public abstract void q(int i7, ca caVar);

    public abstract void r(ca caVar);

    abstract void s(byte[] bArr, int i7, int i8);

    abstract void t(int i7, xb xbVar, ic icVar);

    public abstract void u(xb xbVar);

    public abstract void v(byte b8);

    public abstract void w(int i7);

    public abstract void x(int i7);

    public abstract void y(int i7);

    public abstract void z(long j7);
}
