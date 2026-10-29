package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class ru5 implements ku5 {

    /* renamed from: a, reason: collision with root package name */
    private int f15232a;

    /* renamed from: b, reason: collision with root package name */
    private int f15233b;

    /* renamed from: c, reason: collision with root package name */
    private int f15234c = 0;

    /* renamed from: d, reason: collision with root package name */
    private iu5[] f15235d = new iu5[100];

    public ru5(boolean z7, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.ku5
    public final synchronized iu5 a() {
        iu5 iu5Var;
        try {
            this.f15233b++;
            int i7 = this.f15234c;
            if (i7 > 0) {
                iu5[] iu5VarArr = this.f15235d;
                int i8 = i7 - 1;
                this.f15234c = i8;
                iu5Var = iu5VarArr[i8];
                if (iu5Var == null) {
                    throw null;
                }
                iu5VarArr[i8] = null;
            } else {
                iu5Var = new iu5(new byte[65536], 0);
                int i9 = this.f15233b;
                iu5[] iu5VarArr2 = this.f15235d;
                int length = iu5VarArr2.length;
                if (i9 > length) {
                    this.f15235d = (iu5[]) Arrays.copyOf(iu5VarArr2, length + length);
                    return iu5Var;
                }
            }
            return iu5Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ku5
    public final synchronized void b(iu5 iu5Var) {
        iu5[] iu5VarArr = this.f15235d;
        int i7 = this.f15234c;
        this.f15234c = i7 + 1;
        iu5VarArr[i7] = iu5Var;
        this.f15233b--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.ku5
    public final synchronized void c(ju5 ju5Var) {
        while (ju5Var != null) {
            try {
                iu5[] iu5VarArr = this.f15235d;
                int i7 = this.f15234c;
                this.f15234c = i7 + 1;
                iu5VarArr[i7] = ju5Var.h();
                this.f15233b--;
                ju5Var = ju5Var.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void d() {
        e(0);
    }

    public final synchronized void e(int i7) {
        int i8 = this.f15232a;
        this.f15232a = i7;
        if (i7 < i8) {
            h();
        }
    }

    public final synchronized int f() {
        return this.f15233b * 65536;
    }

    @Override // com.google.android.gms.internal.ads.ku5
    public final synchronized void h() {
        int i7 = this.f15232a;
        String str = hi2.f9535a;
        int max = Math.max(0, ((i7 + 65535) / 65536) - this.f15233b);
        int i8 = this.f15234c;
        if (max >= i8) {
            return;
        }
        Arrays.fill(this.f15235d, max, i8, (Object) null);
        this.f15234c = max;
    }
}
