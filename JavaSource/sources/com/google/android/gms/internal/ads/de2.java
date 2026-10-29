package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class de2 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f7078a = new long[10];

    /* renamed from: b, reason: collision with root package name */
    private Object[] f7079b = new Object[10];

    /* renamed from: c, reason: collision with root package name */
    private int f7080c;

    /* renamed from: d, reason: collision with root package name */
    private int f7081d;

    public de2(int i7) {
    }

    private final Object f() {
        rx3.h(this.f7081d > 0);
        Object[] objArr = this.f7079b;
        int i7 = this.f7080c;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f7080c = (i7 + 1) % objArr.length;
        this.f7081d--;
        return obj;
    }

    public final synchronized void a(long j7, Object obj) {
        try {
            if (this.f7081d > 0) {
                if (j7 <= this.f7078a[((this.f7080c + r0) - 1) % this.f7079b.length]) {
                    b();
                }
            }
            int length = this.f7079b.length;
            if (this.f7081d >= length) {
                int i7 = length + length;
                long[] jArr = new long[i7];
                Object[] objArr = new Object[i7];
                int i8 = this.f7080c;
                int i9 = length - i8;
                System.arraycopy(this.f7078a, i8, jArr, 0, i9);
                System.arraycopy(this.f7079b, this.f7080c, objArr, 0, i9);
                int i10 = this.f7080c;
                if (i10 > 0) {
                    System.arraycopy(this.f7078a, 0, jArr, i9, i10);
                    System.arraycopy(this.f7079b, 0, objArr, i9, this.f7080c);
                }
                this.f7078a = jArr;
                this.f7079b = objArr;
                this.f7080c = 0;
            }
            int i11 = this.f7080c;
            int i12 = this.f7081d;
            Object[] objArr2 = this.f7079b;
            int length2 = (i11 + i12) % objArr2.length;
            this.f7078a[length2] = j7;
            objArr2[length2] = obj;
            this.f7081d = i12 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        this.f7080c = 0;
        this.f7081d = 0;
        Arrays.fill(this.f7079b, (Object) null);
    }

    public final synchronized int c() {
        return this.f7081d;
    }

    public final synchronized Object d() {
        if (this.f7081d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object e(long j7) {
        Object obj;
        obj = null;
        while (this.f7081d > 0 && j7 - this.f7078a[this.f7080c] >= 0) {
            obj = f();
        }
        return obj;
    }
}
