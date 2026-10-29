package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* compiled from: MyApplication */
public abstract class n0 extends g0 implements Set {

    /* renamed from: r, reason: collision with root package name */
    private transient j0 f21693r;

    n0() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    public j0 h() {
        j0 j0Var = this.f21693r;
        if (j0Var != null) {
            return j0Var;
        }
        j0 k7 = k();
        this.f21693r = k7;
        return k7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return x0.a(this);
    }

    j0 k() {
        Object[] array = toArray();
        int i7 = j0.f21575s;
        return j0.l(array, array.length);
    }
}
