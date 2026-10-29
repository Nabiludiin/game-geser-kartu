package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class f2 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private int f20579q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20580r;

    /* renamed from: s, reason: collision with root package name */
    private Iterator f20581s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ x1 f20582t;

    private f2(x1 x1Var) {
        this.f20582t = x1Var;
        this.f20579q = -1;
    }

    private final Iterator b() {
        Map map;
        if (this.f20581s == null) {
            map = this.f20582t.f20774s;
            this.f20581s = map.entrySet().iterator();
        }
        return this.f20581s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i7 = this.f20579q + 1;
        list = this.f20582t.f20773r;
        if (i7 >= list.size()) {
            map = this.f20582t.f20774s;
            if (map.isEmpty() || !b().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f20580r = true;
        int i7 = this.f20579q + 1;
        this.f20579q = i7;
        list = this.f20582t.f20773r;
        if (i7 >= list.size()) {
            return (Map.Entry) b().next();
        }
        list2 = this.f20582t.f20773r;
        return (Map.Entry) list2.get(this.f20579q);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f20580r) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f20580r = false;
        this.f20582t.p();
        int i7 = this.f20579q;
        list = this.f20582t.f20773r;
        if (i7 >= list.size()) {
            b().remove();
            return;
        }
        x1 x1Var = this.f20582t;
        int i8 = this.f20579q;
        this.f20579q = i8 - 1;
        x1Var.h(i8);
    }

    /* synthetic */ f2(x1 x1Var, y1 y1Var) {
        this(x1Var);
    }
}
