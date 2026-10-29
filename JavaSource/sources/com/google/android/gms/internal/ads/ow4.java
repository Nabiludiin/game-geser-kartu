package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class ow4 extends pw4 implements Iterable {

    /* renamed from: q, reason: collision with root package name */
    private final ArrayList f13528q = new ArrayList();

    @Override // com.google.android.gms.internal.ads.pw4
    public final String c() {
        ArrayList arrayList = this.f13528q;
        int size = arrayList.size();
        if (size == 1) {
            return ((pw4) arrayList.get(0)).c();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 37);
        sb.append("Array must have size 1, but has size ");
        sb.append(size);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof ow4) && ((ow4) obj).f13528q.equals(this.f13528q);
        }
        return true;
    }

    public final int hashCode() {
        return this.f13528q.hashCode();
    }

    public final void i(pw4 pw4Var) {
        this.f13528q.add(pw4Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f13528q.iterator();
    }

    public final int j() {
        return this.f13528q.size();
    }

    public final pw4 k(int i7) {
        return (pw4) this.f13528q.get(i7);
    }
}
