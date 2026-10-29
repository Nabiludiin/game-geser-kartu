package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: MyApplication */
public abstract class g14 extends s04 implements Set {

    /* renamed from: r, reason: collision with root package name */
    private transient w04 f8612r;

    g14() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean A(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    public static g14 l() {
        return w24.f17997y;
    }

    public static g14 m(Object obj) {
        return new g34(obj);
    }

    public static g14 n(Object obj, Object obj2) {
        return z(2, obj, obj2);
    }

    public static g14 o(Object obj, Object obj2, Object obj3) {
        return z(3, obj, obj2, obj3);
    }

    public static g14 p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return z(5, obj, obj2, obj3, obj4, obj5);
    }

    public static g14 q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i7 = length + 6;
        Object[] objArr2 = new Object[i7];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return z(i7, objArr2);
    }

    static int r(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            rx3.b(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static g14 s(Collection collection) {
        if ((collection instanceof g14) && !(collection instanceof SortedSet)) {
            g14 g14Var = (g14) collection;
            if (!g14Var.j()) {
                return g14Var;
            }
        }
        Object[] array = collection.toArray();
        return z(array.length, array);
    }

    public static g14 t(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? z(length, (Object[]) objArr.clone()) : new g34(objArr[0]) : w24.f17997y;
    }

    public static f14 w(int i7) {
        sz3.b(i7, "expectedSize");
        return new f14(i7, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g14 z(int i7, Object... objArr) {
        if (i7 == 0) {
            return w24.f17997y;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new g34(obj);
        }
        int r7 = r(i7);
        Object[] objArr2 = new Object[r7];
        int i8 = r7 - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            o24.b(obj2, i11);
            int hashCode = obj2.hashCode();
            int a8 = n04.a(hashCode);
            while (true) {
                int i12 = a8 & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a8++;
                }
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new g34(obj4);
        }
        if (r(i10) < r7 / 2) {
            return z(i10, objArr);
        }
        if (A(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new w24(objArr, i9, objArr2, i8, i10);
    }

    @Override // com.google.android.gms.internal.ads.s04
    public abstract j34 c();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g14) && u() && ((g14) obj).u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return f34.d(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f34.c(this);
    }

    @Override // com.google.android.gms.internal.ads.s04
    public w04 i() {
        w04 w04Var = this.f8612r;
        if (w04Var != null) {
            return w04Var;
        }
        w04 v7 = v();
        this.f8612r = v7;
        return v7;
    }

    boolean u() {
        return false;
    }

    w04 v() {
        Object[] array = toArray();
        int i7 = w04.f17978s;
        return w04.x(array, array.length);
    }
}
