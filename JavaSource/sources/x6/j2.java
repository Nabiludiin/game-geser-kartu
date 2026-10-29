package x6;

/* compiled from: MyApplication */
public final class j2 extends c7.b0 {
    private volatile boolean threadLocalIsSet;

    /* renamed from: u, reason: collision with root package name */
    private final ThreadLocal f27396u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j2(g6.i r3, g6.e r4) {
        /*
            r2 = this;
            x6.k2 r0 = x6.k2.f27404q
            g6.i$b r1 = r3.e(r0)
            if (r1 != 0) goto Ld
            g6.i r0 = r3.n(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f27396u = r0
            g6.i r4 = r4.getContext()
            g6.f$b r0 = g6.f.f24047n
            g6.i$b r4 = r4.e(r0)
            boolean r4 = r4 instanceof x6.d0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = c7.j0.c(r3, r4)
            c7.j0.a(r3, r4)
            r2.N0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.j2.<init>(g6.i, g6.e):void");
    }

    @Override // c7.b0, x6.a
    protected void I0(Object obj) {
        if (this.threadLocalIsSet) {
            e6.l lVar = (e6.l) this.f27396u.get();
            if (lVar != null) {
                c7.j0.a((g6.i) lVar.a(), lVar.b());
            }
            this.f27396u.remove();
        }
        Object a8 = b0.a(obj, this.f3769t);
        g6.e eVar = this.f3769t;
        g6.i context = eVar.getContext();
        Object c8 = c7.j0.c(context, null);
        j2 g8 = c8 != c7.j0.f3789a ? c0.g(eVar, context, c8) : null;
        try {
            this.f3769t.h(a8);
            e6.s sVar = e6.s.f23253a;
            if (g8 == null || g8.M0()) {
                c7.j0.a(context, c8);
            }
        } catch (Throwable th) {
            if (g8 == null || g8.M0()) {
                c7.j0.a(context, c8);
            }
            throw th;
        }
    }

    public final boolean M0() {
        boolean z7 = this.threadLocalIsSet && this.f27396u.get() == null;
        this.f27396u.remove();
        return !z7;
    }

    public final void N0(g6.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f27396u.set(e6.p.a(iVar, obj));
    }
}
