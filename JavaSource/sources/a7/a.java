package a7;

/* compiled from: MyApplication */
public abstract class a implements b {

    /* compiled from: MyApplication */
    /* renamed from: a7.a$a, reason: collision with other inner class name */
    static final class C0000a extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f17t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f18u;

        /* renamed from: w, reason: collision with root package name */
        int f20w;

        C0000a(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f18u = obj;
            this.f20w |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // a7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a7.c r6, g6.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a7.a.C0000a
            if (r0 == 0) goto L13
            r0 = r7
            a7.a$a r0 = (a7.a.C0000a) r0
            int r1 = r0.f20w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20w = r1
            goto L18
        L13:
            a7.a$a r0 = new a7.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18u
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f20w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f17t
            b7.i r6 = (b7.i) r6
            e6.n.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            e6.n.b(r7)
            b7.i r7 = new b7.i
            g6.i r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f17t = r7     // Catch: java.lang.Throwable -> L55
            r0.f20w = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.n()
            e6.s r6 = e6.s.f23253a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.n()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.a.a(a7.c, g6.e):java.lang.Object");
    }

    public abstract Object b(c cVar, g6.e eVar);
}
