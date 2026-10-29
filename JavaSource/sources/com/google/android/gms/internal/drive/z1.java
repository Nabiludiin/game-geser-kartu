package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class z1 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private int f20783q;

    /* renamed from: r, reason: collision with root package name */
    private Iterator f20784r;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ x1 f20785s;

    private z1(x1 x1Var) {
        List list;
        this.f20785s = x1Var;
        list = x1Var.f20773r;
        this.f20783q = list.size();
    }

    private final Iterator b() {
        Map map;
        if (this.f20784r == null) {
            map = this.f20785s.f20777v;
            this.f20784r = map.entrySet().iterator();
        }
        return this.f20784r;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i7 = this.f20783q;
        if (i7 > 0) {
            list = this.f20785s.f20773r;
            if (i7 <= list.size()) {
                return true;
            }
        }
        return b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (b().hasNext()) {
            return (Map.Entry) b().next();
        }
        list = this.f20785s.f20773r;
        int i7 = this.f20783q - 1;
        this.f20783q = i7;
        return (Map.Entry) list.get(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ z1(x1 x1Var, y1 y1Var) {
        this(x1Var);
    }
}
