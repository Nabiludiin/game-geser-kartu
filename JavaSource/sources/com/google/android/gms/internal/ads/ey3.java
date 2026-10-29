package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract class ey3 extends yw3 {

    /* renamed from: s, reason: collision with root package name */
    final CharSequence f7876s;

    /* renamed from: t, reason: collision with root package name */
    int f7877t = 0;

    /* renamed from: u, reason: collision with root package name */
    int f7878u = Integer.MAX_VALUE;

    ey3(gy3 gy3Var, CharSequence charSequence) {
        this.f7876s = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.yw3
    protected final /* bridge */ /* synthetic */ Object b() {
        int f8;
        int i7 = this.f7877t;
        while (true) {
            int i8 = this.f7877t;
            if (i8 == -1) {
                d();
                return null;
            }
            int e8 = e(i8);
            if (e8 == -1) {
                e8 = this.f7876s.length();
                this.f7877t = -1;
                f8 = -1;
            } else {
                f8 = f(e8);
                this.f7877t = f8;
            }
            if (f8 != i7) {
                if (i7 < e8) {
                    this.f7876s.charAt(i7);
                }
                if (i7 < e8) {
                    this.f7876s.charAt(e8 - 1);
                }
                int i9 = this.f7878u;
                if (i9 == 1) {
                    CharSequence charSequence = this.f7876s;
                    int length = charSequence.length();
                    this.f7877t = -1;
                    if (length > i7) {
                        charSequence.charAt(length - 1);
                    }
                    e8 = length;
                } else {
                    this.f7878u = i9 - 1;
                }
                return this.f7876s.subSequence(i7, e8).toString();
            }
            int i10 = f8 + 1;
            this.f7877t = i10;
            if (i10 > this.f7876s.length()) {
                this.f7877t = -1;
            }
        }
    }

    abstract int e(int i7);

    abstract int f(int i7);
}
