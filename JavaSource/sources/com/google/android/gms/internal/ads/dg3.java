package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: MyApplication */
public final class dg3 implements g0.j {

    /* renamed from: a, reason: collision with root package name */
    public static final dg3 f7101a = new dg3();

    /* renamed from: b, reason: collision with root package name */
    private static final ag3 f7102b;

    static {
        ag3 g02 = ag3.g0();
        q6.i.d(g02, "getDefaultInstance(...)");
        f7102b = g02;
    }

    private dg3() {
    }

    @Override // g0.j
    public final /* synthetic */ Object a() {
        return f7102b;
    }

    @Override // g0.j
    public final /* synthetic */ Object b(Object obj, OutputStream outputStream, g6.e eVar) {
        ((ag3) obj).o(outputStream);
        return e6.s.f23253a;
    }

    @Override // g0.j
    public final Object c(InputStream inputStream, g6.e eVar) {
        try {
            ag3 f02 = ag3.f0(inputStream);
            q6.i.b(f02);
            return f02;
        } catch (Exception unused) {
            return f7102b;
        }
    }
}
