package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: MyApplication */
final class l15 implements Iterator {

    /* renamed from: q, reason: collision with root package name */
    private final ArrayDeque f11353q;

    /* renamed from: r, reason: collision with root package name */
    private ny4 f11354r;

    /* synthetic */ l15(qy4 qy4Var, byte[] bArr) {
        if (!(qy4Var instanceof m15)) {
            this.f11353q = null;
            this.f11354r = (ny4) qy4Var;
            return;
        }
        m15 m15Var = (m15) qy4Var;
        ArrayDeque arrayDeque = new ArrayDeque(m15Var.k());
        this.f11353q = arrayDeque;
        arrayDeque.push(m15Var);
        this.f11354r = d(m15Var.A());
    }

    private final ny4 d(qy4 qy4Var) {
        while (qy4Var instanceof m15) {
            m15 m15Var = (m15) qy4Var;
            this.f11353q.push(m15Var);
            qy4Var = m15Var.A();
        }
        return (ny4) qy4Var;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ny4 next() {
        ny4 ny4Var;
        ny4 ny4Var2 = this.f11354r;
        if (ny4Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f11353q;
            ny4Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            ny4Var = d(((m15) arrayDeque.pop()).C());
        } while (ny4Var.h() == 0);
        this.f11354r = ny4Var;
        return ny4Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11354r != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
