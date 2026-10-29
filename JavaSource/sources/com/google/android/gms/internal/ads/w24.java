package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
final class w24 extends g14 {

    /* renamed from: x, reason: collision with root package name */
    private static final Object[] f17996x;

    /* renamed from: y, reason: collision with root package name */
    static final w24 f17997y;

    /* renamed from: s, reason: collision with root package name */
    final transient Object[] f17998s;

    /* renamed from: t, reason: collision with root package name */
    private final transient int f17999t;

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f18000u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f18001v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f18002w;

    static {
        Object[] objArr = new Object[0];
        f17996x = objArr;
        f17997y = new w24(objArr, 0, objArr, 0, 0);
    }

    w24(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f17998s = objArr;
        this.f17999t = i7;
        this.f18000u = objArr2;
        this.f18001v = i8;
        this.f18002w = i9;
    }

    @Override // com.google.android.gms.internal.ads.g14, com.google.android.gms.internal.ads.s04
    public final j34 c() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.s04, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f18000u;
            if (objArr.length != 0) {
                int b8 = n04.b(obj);
                while (true) {
                    int i7 = b8 & this.f18001v;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b8 = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final Object[] e() {
        return this.f17998s;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int h() {
        return this.f18002w;
    }

    @Override // com.google.android.gms.internal.ads.g14, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f17999t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.s04
    final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.s04
    final int k(Object[] objArr, int i7) {
        Object[] objArr2 = this.f17998s;
        int i8 = this.f18002w;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18002w;
    }

    @Override // com.google.android.gms.internal.ads.g14
    final boolean u() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.g14
    final w04 v() {
        return w04.x(this.f17998s, this.f18002w);
    }
}
