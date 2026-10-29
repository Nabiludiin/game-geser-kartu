package b7;

import e6.m;
import e6.s;
import java.util.Arrays;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: q, reason: collision with root package name */
    private d[] f3441q;

    /* renamed from: r, reason: collision with root package name */
    private int f3442r;

    /* renamed from: s, reason: collision with root package name */
    private int f3443s;

    protected final d b() {
        d dVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f3441q;
                if (dVarArr == null) {
                    dVarArr = e(2);
                    this.f3441q = dVarArr;
                } else if (this.f3442r >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    q6.i.d(copyOf, "copyOf(...)");
                    this.f3441q = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i7 = this.f3443s;
                do {
                    dVar = dVarArr[i7];
                    if (dVar == null) {
                        dVar = d();
                        dVarArr[i7] = dVar;
                    }
                    i7++;
                    if (i7 >= dVarArr.length) {
                        i7 = 0;
                    }
                    q6.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f3443s = i7;
                this.f3442r++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    protected abstract d d();

    protected abstract d[] e(int i7);

    protected final void f(d dVar) {
        int i7;
        g6.e[] b8;
        synchronized (this) {
            try {
                int i8 = this.f3442r - 1;
                this.f3442r = i8;
                if (i8 == 0) {
                    this.f3443s = 0;
                }
                q6.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b8 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (g6.e eVar : b8) {
            if (eVar != null) {
                m.a aVar = m.f23247q;
                eVar.h(m.a(s.f23253a));
            }
        }
    }

    protected final d[] g() {
        return this.f3441q;
    }
}
