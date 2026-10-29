package a7;

import q6.p;

/* compiled from: MyApplication */
abstract /* synthetic */ class i {

    /* compiled from: MyApplication */
    public static final class a implements c {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ p f31q;

        public a(p pVar) {
            this.f31q = pVar;
        }

        @Override // a7.c
        public Object c(Object obj, g6.e eVar) {
            this.f31q.f25710q = obj;
            throw new b7.a(this);
        }
    }

    /* compiled from: MyApplication */
    static final class b extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f32t;

        /* renamed from: u, reason: collision with root package name */
        Object f33u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f34v;

        /* renamed from: w, reason: collision with root package name */
        int f35w;

        b(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f34v = obj;
            this.f35w |= Integer.MIN_VALUE;
            return d.d(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(a7.b r4, g6.e r5) {
        /*
            boolean r0 = r5 instanceof a7.i.b
            if (r0 == 0) goto L13
            r0 = r5
            a7.i$b r0 = (a7.i.b) r0
            int r1 = r0.f35w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35w = r1
            goto L18
        L13:
            a7.i$b r0 = new a7.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f34v
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f35w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f33u
            a7.i$a r4 = (a7.i.a) r4
            java.lang.Object r0 = r0.f32t
            q6.p r0 = (q6.p) r0
            e6.n.b(r5)     // Catch: b7.a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            e6.n.b(r5)
            q6.p r5 = new q6.p
            r5.<init>()
            a7.i$a r2 = new a7.i$a
            r2.<init>(r5)
            r0.f32t = r5     // Catch: b7.a -> L57
            r0.f33u = r2     // Catch: b7.a -> L57
            r0.f35w = r3     // Catch: b7.a -> L57
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: b7.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            b7.f.a(r5, r4)
        L5e:
            java.lang.Object r4 = r0.f25710q
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.i.a(a7.b, g6.e):java.lang.Object");
    }
}
