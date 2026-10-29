package z6;

import c7.c0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: MyApplication */
public final class h extends c0 {

    /* renamed from: u, reason: collision with root package name */
    private final b f28036u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f28037v;

    public h(long j7, h hVar, b bVar, int i7) {
        super(j7, hVar, i7);
        this.f28036u = bVar;
        this.f28037v = new AtomicReferenceArray(c.f28011b * 2);
    }

    private final void D(int i7, Object obj) {
        y().set(i7 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray y() {
        return this.f28037v;
    }

    public final Object A(int i7) {
        return y().get((i7 * 2) + 1);
    }

    public final void B(int i7, boolean z7) {
        if (z7) {
            x().F0((this.f3772s * c.f28011b) + i7);
        }
        s();
    }

    public final Object C(int i7) {
        Object z7 = z(i7);
        v(i7);
        return z7;
    }

    public final void E(int i7, Object obj) {
        y().set((i7 * 2) + 1, obj);
    }

    public final void F(int i7, Object obj) {
        D(i7, obj);
    }

    @Override // c7.c0
    public int q() {
        return c.f28011b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        v(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        r4 = x().f28005c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006f, code lost:
    
        c7.x.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // c7.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r4, java.lang.Throwable r5, g6.i r6) {
        /*
            r3 = this;
            int r5 = z6.c.f28011b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.z(r4)
        Le:
            java.lang.Object r1 = r3.A(r4)
            boolean r2 = r1 instanceof x6.l2
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof z6.n
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            c7.f0 r2 = z6.c.j()
            if (r1 == r2) goto L62
            c7.f0 r2 = z6.c.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            c7.f0 r2 = z6.c.o()
            if (r1 == r2) goto Le
            c7.f0 r2 = z6.c.p()
            if (r1 != r2) goto L35
            goto Le
        L35:
            c7.f0 r4 = z6.c.f()
            if (r1 == r4) goto L99
            c7.f0 r4 = z6.c.f28013d
            if (r1 != r4) goto L40
            goto L99
        L40:
            c7.f0 r4 = z6.c.y()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.v(r4)
            if (r0 == 0) goto L99
            z6.b r4 = r3.x()
            p6.l r4 = r4.f28005c
            if (r4 == 0) goto L99
            c7.x.b(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            c7.f0 r2 = z6.c.j()
            goto L7e
        L7a:
            c7.f0 r2 = z6.c.i()
        L7e:
            boolean r1 = r3.u(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.v(r4)
            r1 = r0 ^ 1
            r3.B(r4, r1)
            if (r0 == 0) goto L99
            z6.b r4 = r3.x()
            p6.l r4 = r4.f28005c
            if (r4 == 0) goto L99
            c7.x.b(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.h.r(int, java.lang.Throwable, g6.i):void");
    }

    public final boolean u(int i7, Object obj, Object obj2) {
        return g.a(y(), (i7 * 2) + 1, obj, obj2);
    }

    public final void v(int i7) {
        D(i7, null);
    }

    public final Object w(int i7, Object obj) {
        return y().getAndSet((i7 * 2) + 1, obj);
    }

    public final b x() {
        b bVar = this.f28036u;
        q6.i.b(bVar);
        return bVar;
    }

    public final Object z(int i7) {
        return y().get(i7 * 2);
    }
}
