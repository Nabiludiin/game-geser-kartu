package z6;

import c7.o0;
import c7.x;
import e6.s;
import q6.q;
import x6.l2;

/* compiled from: MyApplication */
public class k extends b {

    /* renamed from: n, reason: collision with root package name */
    private final int f28038n;

    /* renamed from: o, reason: collision with root package name */
    private final a f28039o;

    public k(int i7, a aVar, p6.l lVar) {
        super(i7, lVar);
        this.f28038n = i7;
        this.f28039o = aVar;
        if (aVar == a.f27990q) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + q.b(b.class).a() + " instead").toString());
        }
        if (i7 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i7 + " was specified").toString());
    }

    private final Object G0(Object obj, boolean z7) {
        p6.l lVar;
        o0 d8;
        Object d9 = super.d(obj);
        if (f.f(d9) || f.e(d9)) {
            return d9;
        }
        if (!z7 || (lVar = this.f28005c) == null || (d8 = x.d(lVar, obj, null, 2, null)) == null) {
            return f.f28033a.c(s.f23253a);
        }
        throw d8;
    }

    private final Object H0(Object obj) {
        h hVar;
        int i7;
        k kVar;
        Object obj2 = c.f28013d;
        h hVar2 = (h) b.f27999i.get(this);
        while (true) {
            long andIncrement = b.f27995e.getAndIncrement(this);
            long j7 = 1152921504606846975L & andIncrement;
            boolean a02 = a0(andIncrement);
            int i8 = c.f28011b;
            long j8 = j7 / i8;
            int i9 = (int) (j7 % i8);
            if (hVar2.f3772s != j8) {
                hVar = B(j8, hVar2);
                if (hVar != null) {
                    kVar = this;
                    i7 = i9;
                } else if (a02) {
                    return f.f28033a.a(M());
                }
            } else {
                hVar = hVar2;
                i7 = i9;
                kVar = this;
            }
            Object obj3 = obj;
            int B0 = kVar.B0(hVar, i7, obj3, j7, obj2, a02);
            hVar2 = hVar;
            if (B0 == 0) {
                hVar2.b();
                return f.f28033a.c(s.f23253a);
            }
            if (B0 == 1) {
                return f.f28033a.c(s.f23253a);
            }
            if (B0 == 2) {
                if (a02) {
                    hVar2.s();
                    return f.f28033a.a(M());
                }
                l2 l2Var = obj2 instanceof l2 ? (l2) obj2 : null;
                if (l2Var != null) {
                    n0(l2Var, hVar2, i7);
                }
                x((hVar2.f3772s * i8) + i7);
                return f.f28033a.c(s.f23253a);
            }
            if (B0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (B0 == 4) {
                if (j7 < L()) {
                    hVar2.b();
                }
                return f.f28033a.a(M());
            }
            if (B0 == 5) {
                hVar2.b();
            }
            obj = obj3;
        }
    }

    private final Object I0(Object obj, boolean z7) {
        return this.f28039o == a.f27992s ? G0(obj, z7) : H0(obj);
    }

    @Override // z6.b
    protected boolean b0() {
        return this.f28039o == a.f27991r;
    }

    @Override // z6.b, z6.m
    public Object d(Object obj) {
        return I0(obj, false);
    }
}
