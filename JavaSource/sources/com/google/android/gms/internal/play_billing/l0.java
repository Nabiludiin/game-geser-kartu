package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f21595a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f21596b = 0;

    /* renamed from: c, reason: collision with root package name */
    k0 f21597c;

    public final l0 a(Object obj, Object obj2) {
        int i7 = this.f21596b + 1;
        Object[] objArr = this.f21595a;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            if (i8 > length) {
                length = length + (length >> 1) + 1;
                if (length < i8) {
                    int highestOneBit = Integer.highestOneBit(i8 - 1);
                    length = highestOneBit + highestOneBit;
                }
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
            }
            this.f21595a = Arrays.copyOf(objArr, length);
        }
        e0.a(obj, obj2);
        Object[] objArr2 = this.f21595a;
        int i9 = this.f21596b;
        int i10 = i9 + i9;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.f21596b = i9 + 1;
        return this;
    }

    public final m0 b() {
        k0 k0Var = this.f21597c;
        if (k0Var != null) {
            throw k0Var.a();
        }
        w0 g8 = w0.g(this.f21596b, this.f21595a, this);
        k0 k0Var2 = this.f21597c;
        if (k0Var2 == null) {
            return g8;
        }
        throw k0Var2.a();
    }
}
