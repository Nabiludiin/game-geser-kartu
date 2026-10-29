package z6;

import c7.c0;
import c7.d0;
import c7.e0;
import c7.f0;
import c7.o0;
import c7.x;
import com.google.android.gms.internal.ads.kc0;
import e6.m;
import e6.s;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.p;
import p6.q;
import x6.l2;

/* compiled from: MyApplication */
public class b implements d {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27995e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27996f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27997g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f27998h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f27999i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28000j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28001k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28002l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28003m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: b, reason: collision with root package name */
    private final int f28004b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final p6.l f28005c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    private final q f28006d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* compiled from: MyApplication */
    static final class a extends q6.j implements q {

        /* compiled from: MyApplication */
        /* renamed from: z6.b$a$a, reason: collision with other inner class name */
        static final class C0167a extends q6.j implements p6.l {

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Object f28008r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f28009s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0167a(Object obj, b bVar, f7.a aVar) {
                super(1);
                this.f28008r = obj;
                this.f28009s = bVar;
            }

            public final void c(Throwable th) {
                if (this.f28008r == c.y()) {
                    return;
                }
                p6.l lVar = this.f28009s.f28005c;
                throw null;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ Object g(Object obj) {
                c((Throwable) obj);
                return s.f23253a;
            }
        }

        a() {
            super(3);
        }

        public final p6.l c(f7.a aVar, Object obj, Object obj2) {
            return new C0167a(obj2, b.this, aVar);
        }

        @Override // p6.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.session.b.a(obj);
            return c(null, obj2, obj3);
        }
    }

    public b(int i7, p6.l lVar) {
        long z7;
        f0 f0Var;
        this.f28004b = i7;
        this.f28005c = lVar;
        if (i7 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i7 + ", should be >=0").toString());
        }
        z7 = c.z(i7);
        this.bufferEnd$volatile = z7;
        this.completedExpandBuffersAndPauseFlag$volatile = D();
        h hVar = new h(0L, null, this, 3);
        this.sendSegment$volatile = hVar;
        this.receiveSegment$volatile = hVar;
        if (c0()) {
            hVar = c.f28010a;
            q6.i.c(hVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = hVar;
        this.f28006d = lVar != null ? new a() : null;
        f0Var = c.f28028s;
        this._closeCause$volatile = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h A(long j7, h hVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28000j;
        p pVar = (p) c.x();
        loop0: while (true) {
            c8 = c7.d.c(hVar, j7, pVar);
            if (!d0.c(c8)) {
                c0 b8 = d0.b(c8);
                while (true) {
                    c0 c0Var = (c0) atomicReferenceFieldUpdater.get(this);
                    if (c0Var.f3772s >= b8.f3772s) {
                        break loop0;
                    }
                    if (!b8.t()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c0Var, b8)) {
                        if (c0Var.o()) {
                            c0Var.m();
                        }
                    } else if (b8.o()) {
                        b8.m();
                    }
                }
            } else {
                break;
            }
        }
        if (d0.c(c8)) {
            w();
            if (hVar.f3772s * c.f28011b < P()) {
                hVar.b();
            }
            return null;
        }
        h hVar2 = (h) d0.b(c8);
        if (!c0() && j7 <= D() / c.f28011b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28001k;
            while (true) {
                c0 c0Var2 = (c0) atomicReferenceFieldUpdater2.get(this);
                if (c0Var2.f3772s >= hVar2.f3772s || !hVar2.t()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, c0Var2, hVar2)) {
                    if (c0Var2.o()) {
                        c0Var2.m();
                    }
                } else if (hVar2.o()) {
                    hVar2.m();
                }
            }
        }
        long j8 = hVar2.f3772s;
        if (j8 <= j7) {
            return hVar2;
        }
        int i7 = c.f28011b;
        D0(j8 * i7);
        if (hVar2.f3772s * i7 < P()) {
            hVar2.b();
        }
        return null;
    }

    private final Object A0(h hVar, int i7, long j7, Object obj) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        f0 f0Var6;
        f0 f0Var7;
        f0 f0Var8;
        f0 f0Var9;
        f0 f0Var10;
        f0 f0Var11;
        f0 f0Var12;
        f0 f0Var13;
        f0 f0Var14;
        f0 f0Var15;
        f0 f0Var16;
        while (true) {
            Object A = hVar.A(i7);
            if (A != null) {
                f0Var5 = c.f28014e;
                if (A != f0Var5) {
                    if (A == c.f28013d) {
                        f0Var6 = c.f28018i;
                        if (hVar.u(i7, A, f0Var6)) {
                            y();
                            return hVar.C(i7);
                        }
                    } else {
                        f0Var7 = c.f28019j;
                        if (A == f0Var7) {
                            f0Var8 = c.f28024o;
                            return f0Var8;
                        }
                        f0Var9 = c.f28017h;
                        if (A == f0Var9) {
                            f0Var10 = c.f28024o;
                            return f0Var10;
                        }
                        if (A == c.y()) {
                            y();
                            f0Var11 = c.f28024o;
                            return f0Var11;
                        }
                        f0Var12 = c.f28016g;
                        if (A != f0Var12) {
                            f0Var13 = c.f28015f;
                            if (hVar.u(i7, A, f0Var13)) {
                                boolean z7 = A instanceof n;
                                if (z7) {
                                    A = ((n) A).f28040a;
                                }
                                if (w0(A, hVar, i7)) {
                                    f0Var16 = c.f28018i;
                                    hVar.E(i7, f0Var16);
                                    y();
                                    return hVar.C(i7);
                                }
                                f0Var14 = c.f28019j;
                                hVar.E(i7, f0Var14);
                                hVar.B(i7, false);
                                if (z7) {
                                    y();
                                }
                                f0Var15 = c.f28024o;
                                return f0Var15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j7 < (f27995e.get(this) & 1152921504606846975L)) {
                f0Var = c.f28017h;
                if (hVar.u(i7, A, f0Var)) {
                    y();
                    f0Var2 = c.f28024o;
                    return f0Var2;
                }
            } else {
                if (obj == null) {
                    f0Var3 = c.f28023n;
                    return f0Var3;
                }
                if (hVar.u(i7, A, obj)) {
                    y();
                    f0Var4 = c.f28022m;
                    return f0Var4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h B(long j7, h hVar) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27999i;
        p pVar = (p) c.x();
        loop0: while (true) {
            c8 = c7.d.c(hVar, j7, pVar);
            if (!d0.c(c8)) {
                c0 b8 = d0.b(c8);
                while (true) {
                    c0 c0Var = (c0) atomicReferenceFieldUpdater.get(this);
                    if (c0Var.f3772s >= b8.f3772s) {
                        break loop0;
                    }
                    if (!b8.t()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c0Var, b8)) {
                        if (c0Var.o()) {
                            c0Var.m();
                        }
                    } else if (b8.o()) {
                        b8.m();
                    }
                }
            } else {
                break;
            }
        }
        if (d0.c(c8)) {
            w();
            if (hVar.f3772s * c.f28011b < L()) {
                hVar.b();
            }
            return null;
        }
        h hVar2 = (h) d0.b(c8);
        long j8 = hVar2.f3772s;
        if (j8 <= j7) {
            return hVar2;
        }
        int i7 = c.f28011b;
        E0(j8 * i7);
        if (hVar2.f3772s * i7 < L()) {
            hVar2.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B0(h hVar, int i7, Object obj, long j7, Object obj2, boolean z7) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        hVar.F(i7, obj);
        if (z7) {
            return C0(hVar, i7, obj, j7, obj2, z7);
        }
        Object A = hVar.A(i7);
        if (A == null) {
            if (q(j7)) {
                if (hVar.u(i7, null, c.f28013d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (hVar.u(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (A instanceof l2) {
            hVar.v(i7);
            if (v0(A, obj)) {
                f0Var3 = c.f28018i;
                hVar.E(i7, f0Var3);
                k0();
                return 0;
            }
            f0Var = c.f28020k;
            Object w7 = hVar.w(i7, f0Var);
            f0Var2 = c.f28020k;
            if (w7 == f0Var2) {
                return 5;
            }
            hVar.B(i7, true);
            return 5;
        }
        return C0(hVar, i7, obj, j7, obj2, z7);
    }

    private final int C0(h hVar, int i7, Object obj, long j7, Object obj2, boolean z7) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        f0 f0Var6;
        f0 f0Var7;
        while (true) {
            Object A = hVar.A(i7);
            if (A != null) {
                f0Var2 = c.f28014e;
                if (A != f0Var2) {
                    f0Var3 = c.f28020k;
                    if (A == f0Var3) {
                        hVar.v(i7);
                        return 5;
                    }
                    f0Var4 = c.f28017h;
                    if (A == f0Var4) {
                        hVar.v(i7);
                        return 5;
                    }
                    if (A == c.y()) {
                        hVar.v(i7);
                        w();
                        return 4;
                    }
                    hVar.v(i7);
                    if (A instanceof n) {
                        A = ((n) A).f28040a;
                    }
                    if (v0(A, obj)) {
                        f0Var7 = c.f28018i;
                        hVar.E(i7, f0Var7);
                        k0();
                        return 0;
                    }
                    f0Var5 = c.f28020k;
                    Object w7 = hVar.w(i7, f0Var5);
                    f0Var6 = c.f28020k;
                    if (w7 != f0Var6) {
                        hVar.B(i7, true);
                    }
                    return 5;
                }
                if (hVar.u(i7, A, c.f28013d)) {
                    return 1;
                }
            } else if (!q(j7) || z7) {
                if (z7) {
                    f0Var = c.f28019j;
                    if (hVar.u(i7, null, f0Var)) {
                        hVar.B(i7, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (hVar.u(i7, null, obj2)) {
                        return 2;
                    }
                }
            } else if (hVar.u(i7, null, c.f28013d)) {
                return 1;
            }
        }
    }

    private final long D() {
        return f27997g.get(this);
    }

    private final void D0(long j7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27996f;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if (j8 >= j7) {
                return;
            }
            long j9 = j7;
            if (f27996f.compareAndSet(this, j8, j9)) {
                return;
            } else {
                j7 = j9;
            }
        }
    }

    private final void E0(long j7) {
        long j8;
        long v7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27995e;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            long j9 = 1152921504606846975L & j8;
            if (j9 >= j7) {
                return;
            } else {
                v7 = c.v(j9, (int) (j8 >> 60));
            }
        } while (!f27995e.compareAndSet(this, j8, v7));
    }

    private final Throwable I() {
        Throwable F = F();
        return F == null ? new i("Channel was closed") : F;
    }

    private final void S(long j7) {
        if ((f27998h.addAndGet(this, j7) & 4611686018427387904L) != 0) {
            while ((f27998h.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void T(b bVar, long j7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i7 & 1) != 0) {
            j7 = 1;
        }
        bVar.S(j7);
    }

    private final void U() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28003m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f28026q : c.f28027r));
        if (obj == null) {
            return;
        }
        ((p6.l) obj).g(F());
    }

    private final boolean V(h hVar, int i7, long j7) {
        Object A;
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        f0 f0Var6;
        f0 f0Var7;
        do {
            A = hVar.A(i7);
            if (A != null) {
                f0Var2 = c.f28014e;
                if (A != f0Var2) {
                    if (A == c.f28013d) {
                        return true;
                    }
                    f0Var3 = c.f28019j;
                    if (A == f0Var3 || A == c.y()) {
                        return false;
                    }
                    f0Var4 = c.f28018i;
                    if (A == f0Var4) {
                        return false;
                    }
                    f0Var5 = c.f28017h;
                    if (A == f0Var5) {
                        return false;
                    }
                    f0Var6 = c.f28016g;
                    if (A == f0Var6) {
                        return true;
                    }
                    f0Var7 = c.f28015f;
                    return A != f0Var7 && j7 == L();
                }
            }
            f0Var = c.f28017h;
        } while (!hVar.u(i7, A, f0Var));
        y();
        return false;
    }

    private final boolean W(long j7, boolean z7) {
        int i7 = (int) (j7 >> 60);
        if (i7 == 0 || i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            v(j7 & 1152921504606846975L);
            return (z7 && R()) ? false : true;
        }
        if (i7 == 3) {
            u(j7 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i7).toString());
    }

    private final boolean Y(long j7) {
        return W(j7, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a0(long j7) {
        return W(j7, false);
    }

    private final boolean c0() {
        long D = D();
        return D == 0 || D == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (z6.h) r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long d0(z6.h r8) {
        /*
            r7 = this;
        L0:
            int r0 = z6.c.f28011b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f3772s
            int r5 = z6.c.f28011b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.L()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.A(r0)
            if (r1 == 0) goto L2c
            c7.f0 r2 = z6.c.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            c7.f0 r2 = z6.c.f28013d
            if (r1 != r2) goto L39
            return r3
        L2c:
            c7.f0 r2 = z6.c.y()
            boolean r1 = r8.u(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.s()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            c7.e r8 = r8.g()
            z6.h r8 = (z6.h) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.d0(z6.h):long");
    }

    private final void e0() {
        long j7;
        long v7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27995e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if (((int) (j7 >> 60)) != 0) {
                return;
            } else {
                v7 = c.v(1152921504606846975L & j7, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, v7));
    }

    private final void f0() {
        long j7;
        long v7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27995e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            v7 = c.v(1152921504606846975L & j7, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, v7));
    }

    private final void g0() {
        long j7;
        long v7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27995e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            int i7 = (int) (j7 >> 60);
            if (i7 == 0) {
                v7 = c.v(1152921504606846975L & j7, 2);
            } else if (i7 != 1) {
                return;
            } else {
                v7 = c.v(1152921504606846975L & j7, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, v7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h0(long r5, z6.h r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f3772s
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            c7.e r0 = r7.e()
            z6.h r0 = (z6.h) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.j()
            if (r5 == 0) goto L22
            c7.e r5 = r7.e()
            z6.h r5 = (z6.h) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = E()
        L26:
            java.lang.Object r6 = r5.get(r4)
            c7.c0 r6 = (c7.c0) r6
            long r0 = r6.f3772s
            long r2 = r7.f3772s
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.t()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.o()
            if (r5 == 0) goto L4b
            r6.m()
        L4b:
            return
        L4c:
            boolean r6 = r7.o()
            if (r6 == 0) goto L26
            r7.m()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.h0(long, z6.h):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(x6.j jVar) {
        m.a aVar = e6.m.f23247q;
        jVar.h(e6.m.a(e6.n.a(I())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(l2 l2Var, h hVar, int i7) {
        l0();
        l2Var.a(hVar, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(l2 l2Var, h hVar, int i7) {
        l2Var.a(hVar, i7 + c.f28011b);
    }

    static /* synthetic */ Object o0(b bVar, g6.e eVar) {
        h hVar;
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        h hVar2 = (h) f28000j.get(bVar);
        while (!bVar.X()) {
            long andIncrement = f27996f.getAndIncrement(bVar);
            int i7 = c.f28011b;
            long j7 = andIncrement / i7;
            int i8 = (int) (andIncrement % i7);
            if (hVar2.f3772s != j7) {
                h A = bVar.A(j7, hVar2);
                if (A == null) {
                    continue;
                } else {
                    hVar = A;
                }
            } else {
                hVar = hVar2;
            }
            b bVar2 = bVar;
            Object z02 = bVar2.z0(hVar, i8, andIncrement, null);
            f0Var = c.f28022m;
            if (z02 == f0Var) {
                throw new IllegalStateException("unexpected");
            }
            f0Var2 = c.f28024o;
            if (z02 != f0Var2) {
                f0Var3 = c.f28023n;
                if (z02 == f0Var3) {
                    return bVar2.p0(hVar, i8, andIncrement, eVar);
                }
                hVar.b();
                return z02;
            }
            if (andIncrement < bVar2.P()) {
                hVar.b();
            }
            bVar = bVar2;
            hVar2 = hVar;
        }
        throw e0.a(bVar.I());
    }

    private final Object p0(h hVar, int i7, long j7, g6.e eVar) {
        f0 f0Var;
        f0 f0Var2;
        p6.l lVar;
        g6.i context;
        h hVar2;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        x6.k b8 = x6.m.b(h6.b.c(eVar));
        try {
            Object z02 = z0(hVar, i7, j7, b8);
            f0Var = c.f28022m;
            if (z02 == f0Var) {
                m0(b8, hVar, i7);
            } else {
                f0Var2 = c.f28024o;
                p6.l lVar2 = null;
                lVar2 = null;
                if (z02 == f0Var2) {
                    if (j7 < P()) {
                        hVar.b();
                    }
                    h hVar3 = (h) f28000j.get(this);
                    while (true) {
                        if (X()) {
                            j0(b8);
                            break;
                        }
                        long andIncrement = f27996f.getAndIncrement(this);
                        int i8 = c.f28011b;
                        long j8 = andIncrement / i8;
                        int i9 = (int) (andIncrement % i8);
                        if (hVar3.f3772s != j8) {
                            h A = A(j8, hVar3);
                            if (A != null) {
                                hVar2 = A;
                            }
                        } else {
                            hVar2 = hVar3;
                        }
                        z02 = z0(hVar2, i9, andIncrement, b8);
                        h hVar4 = hVar2;
                        f0Var3 = c.f28022m;
                        if (z02 == f0Var3) {
                            x6.k kVar = kc0.a(b8) ? b8 : null;
                            if (kVar != null) {
                                m0(kVar, hVar4, i9);
                            }
                        } else {
                            f0Var4 = c.f28024o;
                            if (z02 == f0Var4) {
                                if (andIncrement < P()) {
                                    hVar4.b();
                                }
                                hVar3 = hVar4;
                            } else {
                                f0Var5 = c.f28023n;
                                if (z02 == f0Var5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                hVar4.b();
                                lVar = this.f28005c;
                                if (lVar != null) {
                                    context = b8.getContext();
                                }
                            }
                        }
                    }
                } else {
                    hVar.b();
                    lVar = this.f28005c;
                    if (lVar != null) {
                        context = b8.getContext();
                        lVar2 = x.a(lVar, z02, context);
                    }
                    b8.v(z02, lVar2);
                }
            }
            Object w7 = b8.w();
            if (w7 == h6.b.e()) {
                i6.h.c(eVar);
            }
            return w7;
        } catch (Throwable th) {
            b8.N();
            throw th;
        }
    }

    private final boolean q(long j7) {
        return j7 < D() || j7 < L() + ((long) this.f28004b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (z6.h) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q0(z6.h r12) {
        /*
            r11 = this;
            p6.l r0 = r11.f28005c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = c7.l.b(r1, r2, r1)
        L8:
            int r4 = z6.c.f28011b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f3772s
            int r8 = z6.c.f28011b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.A(r4)
            c7.f0 r9 = z6.c.f()
            if (r8 == r9) goto Lbb
            c7.f0 r9 = z6.c.f28013d
            if (r8 != r9) goto L48
            long r9 = r11.L()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            c7.f0 r9 = z6.c.y()
            boolean r8 = r12.u(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.z(r4)
            c7.o0 r1 = c7.x.c(r0, r5, r1)
        L40:
            r12.v(r4)
            r12.s()
            goto Laf
        L48:
            c7.f0 r9 = z6.c.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof x6.l2
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof z6.n
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            c7.f0 r9 = z6.c.o()
            if (r8 == r9) goto Lbb
            c7.f0 r9 = z6.c.p()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            c7.f0 r9 = z6.c.o()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.L()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof z6.n
            if (r9 == 0) goto L80
            r9 = r8
            z6.n r9 = (z6.n) r9
            x6.l2 r9 = r9.f28040a
            goto L83
        L80:
            r9 = r8
            x6.l2 r9 = (x6.l2) r9
        L83:
            c7.f0 r10 = z6.c.y()
            boolean r8 = r12.u(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.z(r4)
            c7.o0 r1 = c7.x.c(r0, r5, r1)
        L97:
            java.lang.Object r3 = c7.l.c(r3, r9)
            r12.v(r4)
            r12.s()
            goto Laf
        La2:
            c7.f0 r9 = z6.c.y()
            boolean r8 = r12.u(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.s()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            c7.e r12 = r12.g()
            z6.h r12 = (z6.h) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            x6.l2 r3 = (x6.l2) r3
            r11.s0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            q6.i.c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            x6.l2 r0 = (x6.l2) r0
            r11.s0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.q0(z6.h):void");
    }

    private final void r(h hVar, long j7) {
        f0 f0Var;
        Object b8 = c7.l.b(null, 1, null);
        loop0: while (hVar != null) {
            for (int i7 = c.f28011b - 1; -1 < i7; i7--) {
                if ((hVar.f3772s * c.f28011b) + i7 < j7) {
                    break loop0;
                }
                while (true) {
                    Object A = hVar.A(i7);
                    if (A != null) {
                        f0Var = c.f28014e;
                        if (A != f0Var) {
                            if (!(A instanceof n)) {
                                if (!(A instanceof l2)) {
                                    break;
                                }
                                if (hVar.u(i7, A, c.y())) {
                                    b8 = c7.l.c(b8, A);
                                    hVar.B(i7, true);
                                    break;
                                }
                            } else {
                                if (hVar.u(i7, A, c.y())) {
                                    b8 = c7.l.c(b8, ((n) A).f28040a);
                                    hVar.B(i7, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (hVar.u(i7, A, c.y())) {
                        hVar.s();
                        break;
                    }
                }
            }
            hVar = (h) hVar.g();
        }
        if (b8 != null) {
            if (!(b8 instanceof ArrayList)) {
                r0((l2) b8);
                return;
            }
            q6.i.c(b8, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b8;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                r0((l2) arrayList.get(size));
            }
        }
    }

    private final void r0(l2 l2Var) {
        t0(l2Var, true);
    }

    private final h s() {
        Object obj = f28001k.get(this);
        h hVar = (h) f27999i.get(this);
        if (hVar.f3772s > ((h) obj).f3772s) {
            obj = hVar;
        }
        h hVar2 = (h) f28000j.get(this);
        if (hVar2.f3772s > ((h) obj).f3772s) {
            obj = hVar2;
        }
        return (h) c7.d.b((c7.e) obj);
    }

    private final void s0(l2 l2Var) {
        t0(l2Var, false);
    }

    private final void t0(l2 l2Var, boolean z7) {
        if (l2Var instanceof x6.j) {
            g6.e eVar = (g6.e) l2Var;
            m.a aVar = e6.m.f23247q;
            eVar.h(e6.m.a(e6.n.a(z7 ? I() : M())));
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + l2Var).toString());
        }
    }

    private final void u(long j7) {
        q0(v(j7));
    }

    private final boolean u0(long j7) {
        if (a0(j7)) {
            return false;
        }
        return !q(j7 & 1152921504606846975L);
    }

    private final h v(long j7) {
        h s7 = s();
        if (b0()) {
            long d02 = d0(s7);
            if (d02 != -1) {
                x(d02);
            }
        }
        r(s7, j7);
        return s7;
    }

    private final boolean v0(Object obj, Object obj2) {
        boolean A;
        if (!(obj instanceof x6.j)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        x6.j jVar = (x6.j) obj;
        p6.l lVar = this.f28005c;
        A = c.A(jVar, obj2, lVar != null ? x.a(lVar, obj2, jVar.getContext()) : null);
        return A;
    }

    private final void w() {
        Z();
    }

    private final boolean w0(Object obj, h hVar, int i7) {
        if (obj instanceof x6.j) {
            q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.B((x6.j) obj, s.f23253a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final boolean x0(h hVar, int i7, long j7) {
        f0 f0Var;
        f0 f0Var2;
        Object A = hVar.A(i7);
        if ((A instanceof l2) && j7 >= f27996f.get(this)) {
            f0Var = c.f28016g;
            if (hVar.u(i7, A, f0Var)) {
                if (w0(A, hVar, i7)) {
                    hVar.E(i7, c.f28013d);
                    return true;
                }
                f0Var2 = c.f28019j;
                hVar.E(i7, f0Var2);
                hVar.B(i7, false);
                return false;
            }
        }
        return y0(hVar, i7, j7);
    }

    private final void y() {
        if (c0()) {
            return;
        }
        h hVar = (h) f28001k.get(this);
        while (true) {
            long andIncrement = f27997g.getAndIncrement(this);
            int i7 = c.f28011b;
            long j7 = andIncrement / i7;
            if (P() <= andIncrement) {
                if (hVar.f3772s < j7 && hVar.e() != null) {
                    h0(j7, hVar);
                }
                T(this, 0L, 1, null);
                return;
            }
            if (hVar.f3772s != j7) {
                h z7 = z(j7, hVar, andIncrement);
                if (z7 == null) {
                    continue;
                } else {
                    hVar = z7;
                }
            }
            if (x0(hVar, (int) (andIncrement % i7), andIncrement)) {
                T(this, 0L, 1, null);
                return;
            }
            T(this, 0L, 1, null);
        }
    }

    private final boolean y0(h hVar, int i7, long j7) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        f0 f0Var6;
        f0 f0Var7;
        f0 f0Var8;
        while (true) {
            Object A = hVar.A(i7);
            if (!(A instanceof l2)) {
                f0Var3 = c.f28019j;
                if (A != f0Var3) {
                    if (A != null) {
                        if (A != c.f28013d) {
                            f0Var5 = c.f28017h;
                            if (A == f0Var5) {
                                break;
                            }
                            f0Var6 = c.f28018i;
                            if (A == f0Var6) {
                                break;
                            }
                            f0Var7 = c.f28020k;
                            if (A == f0Var7 || A == c.y()) {
                                return true;
                            }
                            f0Var8 = c.f28015f;
                            if (A != f0Var8) {
                                throw new IllegalStateException(("Unexpected cell state: " + A).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        f0Var4 = c.f28014e;
                        if (hVar.u(i7, A, f0Var4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j7 >= f27996f.get(this)) {
                f0Var = c.f28016g;
                if (hVar.u(i7, A, f0Var)) {
                    if (w0(A, hVar, i7)) {
                        hVar.E(i7, c.f28013d);
                        return true;
                    }
                    f0Var2 = c.f28019j;
                    hVar.E(i7, f0Var2);
                    hVar.B(i7, false);
                    return false;
                }
            } else if (hVar.u(i7, A, new n((l2) A))) {
                return true;
            }
        }
    }

    private final h z(long j7, h hVar, long j8) {
        Object c8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28001k;
        p pVar = (p) c.x();
        loop0: while (true) {
            c8 = c7.d.c(hVar, j7, pVar);
            if (!d0.c(c8)) {
                c0 b8 = d0.b(c8);
                while (true) {
                    c0 c0Var = (c0) atomicReferenceFieldUpdater.get(this);
                    if (c0Var.f3772s >= b8.f3772s) {
                        break loop0;
                    }
                    if (!b8.t()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c0Var, b8)) {
                        if (c0Var.o()) {
                            c0Var.m();
                        }
                    } else if (b8.o()) {
                        b8.m();
                    }
                }
            } else {
                break;
            }
        }
        if (d0.c(c8)) {
            w();
            h0(j7, hVar);
            T(this, 0L, 1, null);
            return null;
        }
        h hVar2 = (h) d0.b(c8);
        if (hVar2.f3772s <= j7) {
            return hVar2;
        }
        long j9 = hVar2.f3772s;
        int i7 = c.f28011b;
        if (f27997g.compareAndSet(this, j8 + 1, j9 * i7)) {
            S((hVar2.f3772s * i7) - j8);
        } else {
            T(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z0(h hVar, int i7, long j7, Object obj) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        Object A = hVar.A(i7);
        if (A == null) {
            if (j7 >= (f27995e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    f0Var3 = c.f28023n;
                    return f0Var3;
                }
                if (hVar.u(i7, A, obj)) {
                    y();
                    f0Var2 = c.f28022m;
                    return f0Var2;
                }
            }
        } else if (A == c.f28013d) {
            f0Var = c.f28018i;
            if (hVar.u(i7, A, f0Var)) {
                y();
                return hVar.C(i7);
            }
        }
        return A0(hVar, i7, j7, obj);
    }

    protected final Throwable F() {
        return (Throwable) f28002l.get(this);
    }

    public final void F0(long j7) {
        int i7;
        long u7;
        long u8;
        long u9;
        b bVar = this;
        if (bVar.c0()) {
            return;
        }
        while (bVar.D() <= j7) {
            bVar = this;
        }
        i7 = c.f28012c;
        for (int i8 = 0; i8 < i7; i8++) {
            long D = bVar.D();
            if (D == (4611686018427387903L & f27998h.get(bVar)) && D == bVar.D()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f27998h;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(bVar);
            u7 = c.u(j8 & 4611686018427387903L, true);
            if (atomicLongFieldUpdater.compareAndSet(bVar, j8, u7)) {
                break;
            } else {
                bVar = this;
            }
        }
        while (true) {
            long D2 = bVar.D();
            long j9 = f27998h.get(bVar);
            long j10 = j9 & 4611686018427387903L;
            boolean z7 = (4611686018427387904L & j9) != 0;
            if (D2 == j10 && D2 == bVar.D()) {
                break;
            }
            if (z7) {
                bVar = this;
            } else {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f27998h;
                u8 = c.u(j10, true);
                bVar = this;
                atomicLongFieldUpdater2.compareAndSet(bVar, j9, u8);
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = f27998h;
        while (true) {
            long j11 = atomicLongFieldUpdater3.get(bVar);
            u9 = c.u(j11 & 4611686018427387903L, false);
            boolean compareAndSet = atomicLongFieldUpdater3.compareAndSet(bVar, j11, u9);
            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
            if (compareAndSet) {
                return;
            }
            atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
            bVar = this;
        }
    }

    public final long L() {
        return f27996f.get(this);
    }

    protected final Throwable M() {
        Throwable F = F();
        return F == null ? new j("Channel was closed") : F;
    }

    public final long P() {
        return f27995e.get(this) & 1152921504606846975L;
    }

    public final boolean R() {
        while (true) {
            h hVar = (h) f28000j.get(this);
            long L = L();
            if (P() <= L) {
                return false;
            }
            int i7 = c.f28011b;
            long j7 = L / i7;
            if (hVar.f3772s == j7 || (hVar = A(j7, hVar)) != null) {
                hVar.b();
                if (V(hVar, (int) (L % i7), L)) {
                    return true;
                }
                f27996f.compareAndSet(this, L, 1 + L);
            } else if (((h) f28000j.get(this)).f3772s < j7) {
                return false;
            }
        }
    }

    public boolean X() {
        return Y(f27995e.get(this));
    }

    public boolean Z() {
        return a0(f27995e.get(this));
    }

    @Override // z6.l
    public Object a() {
        Object obj;
        h hVar;
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        long j7 = f27996f.get(this);
        long j8 = f27995e.get(this);
        if (Y(j8)) {
            return f.f28033a.a(F());
        }
        if (j7 >= (j8 & 1152921504606846975L)) {
            return f.f28033a.b();
        }
        obj = c.f28020k;
        h hVar2 = (h) f28000j.get(this);
        while (!X()) {
            long andIncrement = f27996f.getAndIncrement(this);
            int i7 = c.f28011b;
            long j9 = andIncrement / i7;
            int i8 = (int) (andIncrement % i7);
            if (hVar2.f3772s != j9) {
                hVar = A(j9, hVar2);
                if (hVar == null) {
                    continue;
                }
            } else {
                hVar = hVar2;
            }
            Object z02 = z0(hVar, i8, andIncrement, obj);
            f0Var = c.f28022m;
            if (z02 == f0Var) {
                l2 l2Var = obj instanceof l2 ? (l2) obj : null;
                if (l2Var != null) {
                    m0(l2Var, hVar, i8);
                }
                F0(andIncrement);
                hVar.s();
                return f.f28033a.b();
            }
            f0Var2 = c.f28024o;
            if (z02 != f0Var2) {
                f0Var3 = c.f28023n;
                if (z02 == f0Var3) {
                    throw new IllegalStateException("unexpected");
                }
                hVar.b();
                return f.f28033a.c(z02);
            }
            if (andIncrement < P()) {
                hVar.b();
            }
            hVar2 = hVar;
        }
        return f.f28033a.a(F());
    }

    @Override // z6.l
    public Object b(g6.e eVar) {
        return o0(this, eVar);
    }

    protected boolean b0() {
        return false;
    }

    @Override // z6.m
    public boolean c(Throwable th) {
        return t(th, false);
    }

    @Override // z6.m
    public Object d(Object obj) {
        Object obj2;
        h hVar;
        long j7;
        b bVar;
        if (u0(f27995e.get(this))) {
            return f.f28033a.b();
        }
        obj2 = c.f28019j;
        h hVar2 = (h) f27999i.get(this);
        while (true) {
            long andIncrement = f27995e.getAndIncrement(this);
            long j8 = 1152921504606846975L & andIncrement;
            boolean a02 = a0(andIncrement);
            int i7 = c.f28011b;
            long j9 = j8 / i7;
            int i8 = (int) (j8 % i7);
            if (hVar2.f3772s != j9) {
                hVar = B(j9, hVar2);
                if (hVar != null) {
                    bVar = this;
                    j7 = j8;
                } else if (a02) {
                    return f.f28033a.a(M());
                }
            } else {
                hVar = hVar2;
                j7 = j8;
                bVar = this;
            }
            Object obj3 = obj;
            int B0 = bVar.B0(hVar, i8, obj3, j7, obj2, a02);
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
                    n0(l2Var, hVar2, i8);
                }
                hVar2.s();
                return f.f28033a.b();
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

    protected boolean t(Throwable th, boolean z7) {
        f0 f0Var;
        if (z7) {
            e0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28002l;
        f0Var = c.f28028s;
        boolean a8 = androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, f0Var, th);
        if (z7) {
            f0();
        } else {
            g0();
        }
        w();
        i0();
        if (a8) {
            U();
        }
        return a8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c7, code lost:
    
        r16 = r7;
        r3 = (z6.h) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.toString():java.lang.String");
    }

    protected final void x(long j7) {
        h hVar;
        f0 f0Var;
        o0 d8;
        h hVar2 = (h) f28000j.get(this);
        while (true) {
            long j8 = f27996f.get(this);
            if (j7 < Math.max(this.f28004b + j8, D())) {
                return;
            }
            if (f27996f.compareAndSet(this, j8, 1 + j8)) {
                int i7 = c.f28011b;
                long j9 = j8 / i7;
                int i8 = (int) (j8 % i7);
                if (hVar2.f3772s != j9) {
                    hVar = A(j9, hVar2);
                    if (hVar == null) {
                        continue;
                    }
                } else {
                    hVar = hVar2;
                }
                Object z02 = z0(hVar, i8, j8, null);
                f0Var = c.f28024o;
                if (z02 != f0Var) {
                    hVar.b();
                    p6.l lVar = this.f28005c;
                    if (lVar != null && (d8 = x.d(lVar, z02, null, 2, null)) != null) {
                        throw d8;
                    }
                } else if (j8 < P()) {
                    hVar.b();
                }
                hVar2 = hVar;
            }
        }
    }

    protected void i0() {
    }

    protected void k0() {
    }

    protected void l0() {
    }
}
