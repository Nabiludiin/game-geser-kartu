package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: MyApplication */
public abstract class xk4 extends az {

    /* renamed from: b, reason: collision with root package name */
    private final int f18858b;

    /* renamed from: c, reason: collision with root package name */
    private final tr5 f18859c;

    public xk4(boolean z7, tr5 tr5Var) {
        this.f18859c = tr5Var;
        this.f18858b = tr5Var.a();
    }

    private final int w(int i7, boolean z7) {
        if (z7) {
            return this.f18859c.b(i7);
        }
        if (i7 >= this.f18858b - 1) {
            return -1;
        }
        return i7 + 1;
    }

    private final int x(int i7, boolean z7) {
        if (z7) {
            return this.f18859c.c(i7);
        }
        if (i7 <= 0) {
            return -1;
        }
        return i7 - 1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final yx b(int i7, yx yxVar, long j7) {
        int q7 = q(i7);
        int u7 = u(q7);
        int t7 = t(q7);
        s(q7).b(i7 - u7, yxVar, j7);
        Object v7 = v(q7);
        if (!yx.f19894o.equals(yxVar.f19896a)) {
            v7 = Pair.create(v7, yxVar.f19896a);
        }
        yxVar.f19896a = v7;
        yxVar.f19908m += t7;
        yxVar.f19909n += t7;
        return yxVar;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final ot d(int i7, ot otVar, boolean z7) {
        int p7 = p(i7);
        int u7 = u(p7);
        s(p7).d(i7 - t(p7), otVar, z7);
        otVar.f13477c += u7;
        if (z7) {
            Object v7 = v(p7);
            Object obj = otVar.f13476b;
            obj.getClass();
            otVar.f13476b = Pair.create(v7, obj);
        }
        return otVar;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int e(Object obj) {
        int e8;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int r7 = r(obj2);
            if (r7 != -1 && (e8 = s(r7).e(obj3)) != -1) {
                return t(r7) + e8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final Object f(int i7) {
        int p7 = p(i7);
        return Pair.create(v(p7), s(p7).f(i7 - t(p7)));
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int h(int i7, int i8, boolean z7) {
        int q7 = q(i7);
        int u7 = u(q7);
        int h8 = s(q7).h(i7 - u7, i8 == 2 ? 0 : i8, z7);
        if (h8 != -1) {
            return u7 + h8;
        }
        int w7 = w(q7, z7);
        while (w7 != -1 && s(w7).g()) {
            w7 = w(w7, z7);
        }
        if (w7 != -1) {
            return u(w7) + s(w7).k(z7);
        }
        if (i8 == 2) {
            return k(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int i(int i7, int i8, boolean z7) {
        int q7 = q(i7);
        int u7 = u(q7);
        int i9 = s(q7).i(i7 - u7, 0, false);
        if (i9 != -1) {
            return u7 + i9;
        }
        int x7 = x(q7, false);
        while (x7 != -1 && s(x7).g()) {
            x7 = x(x7, false);
        }
        if (x7 != -1) {
            return u(x7) + s(x7).j(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int j(boolean z7) {
        int i7 = this.f18858b;
        if (i7 != 0) {
            int d8 = z7 ? this.f18859c.d() : i7 - 1;
            while (s(d8).g()) {
                d8 = x(d8, z7);
                if (d8 == -1) {
                }
            }
            return u(d8) + s(d8).j(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int k(boolean z7) {
        if (this.f18858b != 0) {
            int e8 = z7 ? this.f18859c.e() : 0;
            while (s(e8).g()) {
                e8 = w(e8, z7);
                if (e8 == -1) {
                }
            }
            return u(e8) + s(e8).k(z7);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final ot o(Object obj, ot otVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int r7 = r(obj2);
        int u7 = u(r7);
        s(r7).o(obj3, otVar);
        otVar.f13477c += u7;
        otVar.f13476b = obj;
        return otVar;
    }

    protected abstract int p(int i7);

    protected abstract int q(int i7);

    protected abstract int r(Object obj);

    protected abstract az s(int i7);

    protected abstract int t(int i7);

    protected abstract int u(int i7);

    protected abstract Object v(int i7);
}
