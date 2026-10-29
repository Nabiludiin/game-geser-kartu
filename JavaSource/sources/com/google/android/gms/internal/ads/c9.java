package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
final class c9 extends f9 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f6321o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f6322p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f6323n;

    c9() {
    }

    public static boolean j(y82 y82Var) {
        return k(y82Var, f6321o);
    }

    private static boolean k(y82 y82Var, byte[] bArr) {
        if (y82Var.C() < 8) {
            return false;
        }
        int F = y82Var.F();
        byte[] bArr2 = new byte[8];
        y82Var.L(bArr2, 0, 8);
        y82Var.G(F);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final void a(boolean z7) {
        super.a(z7);
        if (z7) {
            this.f6323n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final long b(y82 y82Var) {
        return h(l3.d(y82Var.H()));
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final boolean c(y82 y82Var, long j7, d9 d9Var) {
        if (k(y82Var, f6321o)) {
            byte[] copyOf = Arrays.copyOf(y82Var.H(), y82Var.D());
            int i7 = copyOf[9] & 255;
            List a8 = l3.a(copyOf);
            if (d9Var.f6985a != null) {
                return true;
            }
            xn5 xn5Var = new xn5();
            xn5Var.k0("audio/ogg");
            xn5Var.l0("audio/opus");
            xn5Var.e(i7);
            xn5Var.f(48000);
            xn5Var.o0(a8);
            d9Var.f6985a = xn5Var.m();
            return true;
        }
        if (!k(y82Var, f6322p)) {
            d9Var.f6985a.getClass();
            return false;
        }
        d9Var.f6985a.getClass();
        if (this.f6323n) {
            return true;
        }
        this.f6323n = true;
        y82Var.J(8);
        le c8 = g4.c(w04.v(g4.b(y82Var, false, false).f6916a));
        if (c8 == null) {
            return true;
        }
        xn5 a9 = d9Var.f6985a.a();
        a9.j0(c8.f(d9Var.f6985a.f7772l));
        d9Var.f6985a = a9.m();
        return true;
    }
}
