package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public abstract class js5 implements zt5 {

    /* renamed from: a, reason: collision with root package name */
    protected final b00 f10745a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10746b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f10747c;

    /* renamed from: d, reason: collision with root package name */
    private final eq5[] f10748d;

    /* renamed from: e, reason: collision with root package name */
    private int f10749e;

    public js5(b00 b00Var, int[] iArr, int i7) {
        int length = iArr.length;
        rx3.h(length > 0);
        b00Var.getClass();
        this.f10745a = b00Var;
        this.f10746b = length;
        this.f10748d = new eq5[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f10748d[i8] = b00Var.a(iArr[i8]);
        }
        Arrays.sort(this.f10748d, is5.f10182q);
        this.f10747c = new int[this.f10746b];
        for (int i9 = 0; i9 < this.f10746b; i9++) {
            this.f10747c[i9] = b00Var.b(this.f10748d[i9]);
        }
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final int B(int i7) {
        return this.f10747c[i7];
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final b00 a() {
        return this.f10745a;
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final eq5 b(int i7) {
        return this.f10748d[i7];
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final int b0(int i7) {
        for (int i8 = 0; i8 < this.f10746b; i8++) {
            if (this.f10747c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final int c() {
        return this.f10747c.length;
    }

    @Override // com.google.android.gms.internal.ads.zt5
    public final eq5 d() {
        return this.f10748d[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            js5 js5Var = (js5) obj;
            if (this.f10745a.equals(js5Var.f10745a) && Arrays.equals(this.f10747c, js5Var.f10747c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zt5
    public final int g() {
        return this.f10747c[0];
    }

    public final int hashCode() {
        int i7 = this.f10749e;
        if (i7 != 0) {
            return i7;
        }
        int identityHashCode = (System.identityHashCode(this.f10745a) * 31) + Arrays.hashCode(this.f10747c);
        this.f10749e = identityHashCode;
        return identityHashCode;
    }
}
