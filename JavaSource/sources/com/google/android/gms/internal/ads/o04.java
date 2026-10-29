package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MyApplication */
abstract class o04 extends p04 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f13138a;

    /* renamed from: b, reason: collision with root package name */
    int f13139b;

    /* renamed from: c, reason: collision with root package name */
    boolean f13140c;

    o04(int i7) {
        sz3.b(i7, "initialCapacity");
        this.f13138a = new Object[i7];
        this.f13139b = 0;
    }

    private final void f(int i7) {
        int length = this.f13138a.length;
        int b8 = p04.b(length, this.f13139b + i7);
        if (b8 > length || this.f13140c) {
            this.f13138a = Arrays.copyOf(this.f13138a, b8);
            this.f13140c = false;
        }
    }

    public final o04 c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.f13138a;
        int i7 = this.f13139b;
        this.f13139b = i7 + 1;
        objArr[i7] = obj;
        return this;
    }

    final void d(Object[] objArr, int i7) {
        o24.a(objArr, 2);
        f(2);
        System.arraycopy(objArr, 0, this.f13138a, this.f13139b, 2);
        this.f13139b += 2;
    }

    public final p04 e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof s04) {
                this.f13139b = ((s04) collection).k(this.f13138a, this.f13139b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
