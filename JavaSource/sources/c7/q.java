package c7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
public class q {

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3811q = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3812r = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev$volatile");

    /* renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3813s = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* compiled from: MyApplication */
    public static abstract class a extends c7.b {

        /* renamed from: b, reason: collision with root package name */
        public final q f3814b;

        /* renamed from: c, reason: collision with root package name */
        public q f3815c;

        public a(q qVar) {
            this.f3814b = qVar;
        }

        @Override // c7.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(q qVar, Object obj) {
            boolean z7 = obj == null;
            q qVar2 = z7 ? this.f3814b : this.f3815c;
            if (qVar2 != null && androidx.concurrent.futures.b.a(q.s(), qVar, this, qVar2) && z7) {
                q qVar3 = this.f3814b;
                q qVar4 = this.f3815c;
                q6.i.b(qVar4);
                qVar3.o(qVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (androidx.concurrent.futures.b.a(c7.q.f3811q, r3, r2, ((c7.z) r4).f3831a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final c7.q m(c7.y r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = t()
            java.lang.Object r0 = r0.get(r7)
            c7.q r0 = (c7.q) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = s()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L25
            if (r0 != r2) goto L1a
            goto L2e
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = t()
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L2e
            goto L0
        L25:
            boolean r5 = r7.v()
            if (r5 == 0) goto L2c
            return r1
        L2c:
            if (r4 != r8) goto L2f
        L2e:
            return r2
        L2f:
            boolean r5 = r4 instanceof c7.y
            if (r5 == 0) goto L39
            c7.y r4 = (c7.y) r4
            r4.a(r2)
            goto L0
        L39:
            boolean r5 = r4 instanceof c7.z
            if (r5 == 0) goto L5b
            if (r3 == 0) goto L50
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = s()
            c7.z r4 = (c7.z) r4
            c7.q r4 = r4.f3831a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4e
            goto L0
        L4e:
            r2 = r3
            goto Lc
        L50:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = t()
            java.lang.Object r2 = r4.get(r2)
            c7.q r2 = (c7.q) r2
            goto Ld
        L5b:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            q6.i.c(r4, r3)
            r3 = r4
            c7.q r3 = (c7.q) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.q.m(c7.y):c7.q");
    }

    private final q n(q qVar) {
        while (qVar.v()) {
            qVar = (q) f3812r.get(qVar);
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(q qVar) {
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3812r;
        do {
            qVar2 = (q) atomicReferenceFieldUpdater.get(qVar);
            if (p() != qVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f3812r, qVar, qVar2, this));
        if (v()) {
            qVar.m(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater s() {
        return f3811q;
    }

    private final z y() {
        z zVar = (z) f3813s.get(this);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this);
        f3813s.set(this, zVar2);
        return zVar2;
    }

    public final boolean l(q qVar) {
        f3812r.set(qVar, this);
        f3811q.set(qVar, this);
        while (p() == this) {
            if (androidx.concurrent.futures.b.a(f3811q, this, this, qVar)) {
                qVar.o(this);
                return true;
            }
        }
        return false;
    }

    public final Object p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3811q;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final q q() {
        q qVar;
        Object p7 = p();
        z zVar = p7 instanceof z ? (z) p7 : null;
        if (zVar != null && (qVar = zVar.f3831a) != null) {
            return qVar;
        }
        q6.i.c(p7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (q) p7;
    }

    public final q r() {
        q m7 = m(null);
        return m7 == null ? n((q) f3812r.get(this)) : m7;
    }

    public String toString() {
        return new q6.m(this) { // from class: c7.q.b
            @Override // u6.e
            public Object get() {
                return x6.k0.a(this.f25689r);
            }
        } + '@' + x6.k0.b(this);
    }

    public boolean v() {
        return p() instanceof z;
    }

    public boolean w() {
        return x() == null;
    }

    public final q x() {
        Object p7;
        q qVar;
        do {
            p7 = p();
            if (p7 instanceof z) {
                return ((z) p7).f3831a;
            }
            if (p7 == this) {
                return (q) p7;
            }
            q6.i.c(p7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            qVar = (q) p7;
        } while (!androidx.concurrent.futures.b.a(f3811q, this, p7, qVar.y()));
        qVar.m(null);
        return null;
    }

    public final int z(q qVar, q qVar2, a aVar) {
        f3812r.set(qVar, this);
        f3811q.set(qVar, qVar2);
        aVar.f3815c = qVar2;
        if (androidx.concurrent.futures.b.a(f3811q, this, qVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
