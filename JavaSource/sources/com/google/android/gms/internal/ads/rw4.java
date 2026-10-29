package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class rw4 extends pw4 {

    /* renamed from: q, reason: collision with root package name */
    private final gx4 f15378q = new gx4(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof rw4) && ((rw4) obj).f15378q.equals(this.f15378q);
        }
        return true;
    }

    public final int hashCode() {
        return this.f15378q.hashCode();
    }

    public final void i(String str, pw4 pw4Var) {
        this.f15378q.put(str, pw4Var);
    }

    public final Set j() {
        return this.f15378q.entrySet();
    }

    public final boolean k(String str) {
        return this.f15378q.containsKey(str);
    }

    public final pw4 l(String str) {
        return (pw4) this.f15378q.get(str);
    }
}
