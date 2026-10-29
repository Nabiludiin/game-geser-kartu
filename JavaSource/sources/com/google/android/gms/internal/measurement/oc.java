package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class oc implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private int f21211q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21212r;

    /* renamed from: s, reason: collision with root package name */
    private Iterator f21213s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ qc f21214t;

    /* synthetic */ oc(qc qcVar, byte[] bArr) {
        Objects.requireNonNull(qcVar);
        this.f21214t = qcVar;
        this.f21211q = -1;
    }

    private final Iterator b() {
        if (this.f21213s == null) {
            this.f21213s = this.f21214t.k().entrySet().iterator();
        }
        return this.f21213s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f21211q + 1;
        qc qcVar = this.f21214t;
        if (i7 >= qcVar.j()) {
            return !qcVar.k().isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f21212r = true;
        int i7 = this.f21211q + 1;
        this.f21211q = i7;
        qc qcVar = this.f21214t;
        return i7 < qcVar.j() ? (nc) qcVar.i()[i7] : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f21212r) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f21212r = false;
        qc qcVar = this.f21214t;
        qcVar.h();
        int i7 = this.f21211q;
        if (i7 >= qcVar.j()) {
            b().remove();
        } else {
            this.f21211q = i7 - 1;
            qcVar.g(i7);
        }
    }
}
