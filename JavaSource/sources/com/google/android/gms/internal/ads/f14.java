package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
public final class f14 extends o04 {

    /* renamed from: d, reason: collision with root package name */
    Object[] f7968d;

    /* renamed from: e, reason: collision with root package name */
    private int f7969e;

    public f14() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.p04
    public final /* bridge */ /* synthetic */ p04 a(Object obj) {
        g(obj);
        return this;
    }

    public final f14 g(Object obj) {
        obj.getClass();
        if (this.f7968d != null) {
            int r7 = g14.r(this.f13139b);
            Object[] objArr = this.f7968d;
            if (r7 <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int a8 = n04.a(hashCode);
                while (true) {
                    int i7 = a8 & length;
                    Object[] objArr2 = this.f7968d;
                    Object obj2 = objArr2[i7];
                    if (obj2 == null) {
                        objArr2[i7] = obj;
                        this.f7969e += hashCode;
                        super.c(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    a8 = i7 + 1;
                }
            }
        }
        this.f7968d = null;
        super.c(obj);
        return this;
    }

    public final f14 h(Object... objArr) {
        if (this.f7968d == null) {
            d(objArr, 2);
            return this;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            g(objArr[i7]);
        }
        return this;
    }

    public final f14 i(Iterable iterable) {
        iterable.getClass();
        if (this.f7968d == null) {
            super.e(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        return this;
    }

    public final g14 j() {
        g14 z7;
        boolean A;
        int i7 = this.f13139b;
        if (i7 == 0) {
            return w24.f17997y;
        }
        if (i7 == 1) {
            Object obj = this.f13138a[0];
            Objects.requireNonNull(obj);
            return new g34(obj);
        }
        if (this.f7968d == null || g14.r(i7) != this.f7968d.length) {
            z7 = g14.z(this.f13139b, this.f13138a);
            this.f13139b = z7.size();
        } else {
            int i8 = this.f13139b;
            Object[] objArr = this.f13138a;
            A = g14.A(i8, objArr.length);
            if (A) {
                objArr = Arrays.copyOf(objArr, i8);
            }
            z7 = new w24(objArr, this.f7969e, this.f7968d, r6.length - 1, this.f13139b);
        }
        this.f13140c = true;
        this.f7968d = null;
        return z7;
    }

    f14(int i7, boolean z7) {
        super(i7);
        this.f7968d = new Object[g14.r(i7)];
    }
}
