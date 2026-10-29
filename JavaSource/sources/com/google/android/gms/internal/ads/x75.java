package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: MyApplication */
public abstract class x75 implements Iterator, Closeable, sg {

    /* renamed from: w, reason: collision with root package name */
    private static final rg f18653w = new w75("eof ");

    /* renamed from: q, reason: collision with root package name */
    protected og f18654q;

    /* renamed from: r, reason: collision with root package name */
    protected y75 f18655r;

    /* renamed from: s, reason: collision with root package name */
    rg f18656s = null;

    /* renamed from: t, reason: collision with root package name */
    long f18657t = 0;

    /* renamed from: u, reason: collision with root package name */
    long f18658u = 0;

    /* renamed from: v, reason: collision with root package name */
    private final List f18659v = new ArrayList();

    static {
        e85.b(x75.class);
    }

    public final List g() {
        return (this.f18655r == null || this.f18656s == f18653w) ? this.f18659v : new d85(this.f18659v, this);
    }

    public final void h(y75 y75Var, long j7, og ogVar) {
        this.f18655r = y75Var;
        this.f18657t = y75Var.d();
        y75Var.f(y75Var.d() + j7);
        this.f18658u = y75Var.d();
        this.f18654q = ogVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        rg rgVar = this.f18656s;
        if (rgVar == f18653w) {
            return false;
        }
        if (rgVar != null) {
            return true;
        }
        try {
            this.f18656s = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f18656s = f18653w;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final rg next() {
        rg a8;
        rg rgVar = this.f18656s;
        if (rgVar != null && rgVar != f18653w) {
            this.f18656s = null;
            return rgVar;
        }
        y75 y75Var = this.f18655r;
        if (y75Var == null || this.f18657t >= this.f18658u) {
            this.f18656s = f18653w;
            throw new NoSuchElementException();
        }
        try {
            synchronized (y75Var) {
                this.f18655r.f(this.f18657t);
                a8 = this.f18654q.a(this.f18655r, this);
                this.f18657t = this.f18655r.d();
            }
            return a8;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i7 = 0;
        while (true) {
            List list = this.f18659v;
            if (i7 >= list.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i7 > 0) {
                sb.append(";");
            }
            sb.append(((rg) list.get(i7)).toString());
            i7++;
        }
    }

    public void close() {
    }
}
