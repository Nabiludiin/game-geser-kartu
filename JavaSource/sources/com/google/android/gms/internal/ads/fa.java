package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: MyApplication */
final class fa {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f8101a = new y82();

    /* renamed from: b, reason: collision with root package name */
    private final int[] f8102b = new int[256];

    /* renamed from: c, reason: collision with root package name */
    private boolean f8103c;

    /* renamed from: d, reason: collision with root package name */
    private int f8104d;

    /* renamed from: e, reason: collision with root package name */
    private int f8105e;

    /* renamed from: f, reason: collision with root package name */
    private int f8106f;

    /* renamed from: g, reason: collision with root package name */
    private int f8107g;

    /* renamed from: h, reason: collision with root package name */
    private int f8108h;

    /* renamed from: i, reason: collision with root package name */
    private int f8109i;

    public final vw0 a() {
        int i7;
        if (this.f8104d == 0 || this.f8105e == 0 || this.f8108h == 0 || this.f8109i == 0) {
            return null;
        }
        y82 y82Var = this.f8101a;
        if (y82Var.D() == 0 || y82Var.F() != y82Var.D() || !this.f8103c) {
            return null;
        }
        y82Var.G(0);
        int i8 = this.f8108h * this.f8109i;
        int[] iArr = new int[i8];
        int i9 = 0;
        while (i9 < i8) {
            int R = y82Var.R();
            if (R != 0) {
                i7 = i9 + 1;
                iArr[i9] = this.f8102b[R];
            } else {
                int R2 = y82Var.R();
                if (R2 != 0) {
                    int i10 = R2 & 63;
                    if ((R2 & 64) != 0) {
                        i10 = (i10 << 8) | y82Var.R();
                    }
                    i7 = i10 + i9;
                    Arrays.fill(iArr, i9, i7, (R2 & 128) == 0 ? this.f8102b[0] : this.f8102b[y82Var.R()]);
                }
            }
            i9 = i7;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f8108h, this.f8109i, Bitmap.Config.ARGB_8888);
        uv0 uv0Var = new uv0();
        uv0Var.c(createBitmap);
        uv0Var.i(this.f8106f / this.f8104d);
        uv0Var.j(0);
        uv0Var.f(this.f8107g / this.f8105e, 0);
        uv0Var.g(0);
        uv0Var.m(this.f8108h / this.f8104d);
        uv0Var.n(this.f8109i / this.f8105e);
        return uv0Var.r();
    }

    public final void b() {
        this.f8104d = 0;
        this.f8105e = 0;
        this.f8106f = 0;
        this.f8107g = 0;
        this.f8108h = 0;
        this.f8109i = 0;
        this.f8101a.z(0);
        this.f8103c = false;
    }

    final /* synthetic */ void c(y82 y82Var, int i7) {
        if (i7 % 5 != 2) {
            return;
        }
        y82Var.J(2);
        int[] iArr = this.f8102b;
        Arrays.fill(iArr, 0);
        int i8 = 0;
        for (int i9 = i7 / 5; i8 < i9; i9 = i9) {
            int R = y82Var.R();
            int R2 = y82Var.R();
            int R3 = y82Var.R();
            int R4 = y82Var.R();
            double d8 = R2;
            int R5 = y82Var.R() << 24;
            String str = hi2.f9535a;
            double d9 = R3 - 128;
            double d10 = R4 - 128;
            iArr[R] = (Math.max(0, Math.min((int) (d8 + (1.402d * d9)), 255)) << 16) | R5 | (Math.max(0, Math.min((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) (d8 + (d10 * 1.772d)), 255));
            i8++;
        }
        this.f8103c = true;
    }

    final /* synthetic */ void d(y82 y82Var, int i7) {
        int W;
        if (i7 < 4) {
            return;
        }
        y82Var.J(3);
        int i8 = i7 - 4;
        if ((y82Var.R() & 128) != 0) {
            if (i8 < 7 || (W = y82Var.W()) < 4) {
                return;
            }
            this.f8108h = y82Var.S();
            this.f8109i = y82Var.S();
            this.f8101a.z(W - 4);
            i8 = i7 - 11;
        }
        y82 y82Var2 = this.f8101a;
        int F = y82Var2.F();
        int D = y82Var2.D();
        if (F >= D || i8 <= 0) {
            return;
        }
        int min = Math.min(i8, D - F);
        y82Var.L(y82Var2.H(), F, min);
        y82Var2.G(F + min);
    }

    final /* synthetic */ void e(y82 y82Var, int i7) {
        if (i7 < 19) {
            return;
        }
        this.f8104d = y82Var.S();
        this.f8105e = y82Var.S();
        y82Var.J(11);
        this.f8106f = y82Var.S();
        this.f8107g = y82Var.S();
    }
}
