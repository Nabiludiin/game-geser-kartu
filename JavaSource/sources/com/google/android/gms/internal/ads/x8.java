package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class x8 extends f9 {

    /* renamed from: n, reason: collision with root package name */
    private z2 f18660n;

    /* renamed from: o, reason: collision with root package name */
    private w8 f18661o;

    x8() {
    }

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final void a(boolean z7) {
        super.a(z7);
        if (z7) {
            this.f18660n = null;
            this.f18661o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final long b(y82 y82Var) {
        if (!j(y82Var.H())) {
            return -1L;
        }
        int i7 = (y82Var.H()[2] & 255) >> 4;
        if (i7 != 6) {
            if (i7 == 7) {
                i7 = 7;
            }
            int c8 = u2.c(y82Var, i7);
            y82Var.G(0);
            return c8;
        }
        y82Var.J(4);
        y82Var.o();
        int c82 = u2.c(y82Var, i7);
        y82Var.G(0);
        return c82;
    }

    @Override // com.google.android.gms.internal.ads.f9
    protected final boolean c(y82 y82Var, long j7, d9 d9Var) {
        byte[] H = y82Var.H();
        z2 z2Var = this.f18660n;
        if (z2Var == null) {
            z2 z2Var2 = new z2(H, 17);
            this.f18660n = z2Var2;
            xn5 a8 = z2Var2.c(Arrays.copyOfRange(H, 9, y82Var.D()), null).a();
            a8.k0("audio/ogg");
            d9Var.f6985a = a8.m();
            return true;
        }
        if ((H[0] & Byte.MAX_VALUE) == 3) {
            y2 c8 = w2.c(y82Var);
            z2 e8 = z2Var.e(c8);
            this.f18660n = e8;
            this.f18661o = new w8(e8, c8);
            return true;
        }
        if (!j(H)) {
            return true;
        }
        w8 w8Var = this.f18661o;
        if (w8Var != null) {
            w8Var.a(j7);
            d9Var.f6986b = this.f18661o;
        }
        d9Var.f6985a.getClass();
        return false;
    }
}
