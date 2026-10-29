package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class ip0 implements Iterable {

    /* renamed from: q, reason: collision with root package name */
    private final List f10112q = new ArrayList();

    public final boolean c(bo0 bo0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            hp0 hp0Var = (hp0) it.next();
            if (hp0Var.f9600c == bo0Var) {
                arrayList.add(hp0Var);
            }
        }
        int i7 = 0;
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((hp0) obj).f9601d.q();
        }
        return true;
    }

    final hp0 e(bo0 bo0Var) {
        Iterator it = iterator();
        while (it.hasNext()) {
            hp0 hp0Var = (hp0) it.next();
            if (hp0Var.f9600c == bo0Var) {
                return hp0Var;
            }
        }
        return null;
    }

    public final void g(hp0 hp0Var) {
        this.f10112q.add(hp0Var);
    }

    public final void h(hp0 hp0Var) {
        this.f10112q.remove(hp0Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f10112q.iterator();
    }
}
