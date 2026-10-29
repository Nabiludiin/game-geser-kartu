package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public final class y04 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f19327a;

    /* renamed from: b, reason: collision with root package name */
    int f19328b;

    /* renamed from: c, reason: collision with root package name */
    x04 f19329c;

    public y04() {
        this(4);
    }

    private final void d(int i7) {
        Object[] objArr = this.f19327a;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            this.f19327a = Arrays.copyOf(objArr, p04.b(length, i8));
        }
    }

    public final y04 a(Object obj, Object obj2) {
        d(this.f19328b + 1);
        sz3.a(obj, obj2);
        Object[] objArr = this.f19327a;
        int i7 = this.f19328b;
        int i8 = i7 + i7;
        objArr[i8] = obj;
        objArr[i8 + 1] = obj2;
        this.f19328b = i7 + 1;
        return this;
    }

    public final y04 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.f19328b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final z04 c() {
        x04 x04Var = this.f19329c;
        if (x04Var != null) {
            throw x04Var.a();
        }
        v24 k7 = v24.k(this.f19328b, this.f19327a, this);
        x04 x04Var2 = this.f19329c;
        if (x04Var2 == null) {
            return k7;
        }
        throw x04Var2.a();
    }

    y04(int i7) {
        this.f19327a = new Object[i7 + i7];
        this.f19328b = 0;
    }
}
