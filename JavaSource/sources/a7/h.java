package a7;

import e6.s;
import p6.p;
import q6.o;

/* compiled from: MyApplication */
abstract /* synthetic */ class h {

    /* compiled from: MyApplication */
    public static final class a implements a7.b {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ a7.b f21q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ p f22r;

        public a(a7.b bVar, p pVar) {
            this.f21q = bVar;
            this.f22r = pVar;
        }

        @Override // a7.b
        public Object a(c cVar, g6.e eVar) {
            Object a8 = this.f21q.a(new b(new o(), cVar, this.f22r), eVar);
            return a8 == h6.b.e() ? a8 : s.f23253a;
        }
    }

    /* compiled from: MyApplication */
    static final class b implements c {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ o f23q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f24r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f25s;

        /* compiled from: MyApplication */
        static final class a extends i6.d {

            /* renamed from: t, reason: collision with root package name */
            Object f26t;

            /* renamed from: u, reason: collision with root package name */
            Object f27u;

            /* renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f28v;

            /* renamed from: x, reason: collision with root package name */
            int f30x;

            a(g6.e eVar) {
                super(eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                this.f28v = obj;
                this.f30x |= Integer.MIN_VALUE;
                return b.this.c(null, this);
            }
        }

        b(o oVar, c cVar, p pVar) {
            this.f23q = oVar;
            this.f24r = cVar;
            this.f25s = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r8.c(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        
            if (r8.c(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // a7.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(java.lang.Object r7, g6.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof a7.h.b.a
                if (r0 == 0) goto L13
                r0 = r8
                a7.h$b$a r0 = (a7.h.b.a) r0
                int r1 = r0.f30x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30x = r1
                goto L18
            L13:
                a7.h$b$a r0 = new a7.h$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f28v
                java.lang.Object r1 = h6.b.e()
                int r2 = r0.f30x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                e6.n.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f27u
                java.lang.Object r2 = r0.f26t
                a7.h$b r2 = (a7.h.b) r2
                e6.n.b(r8)
                goto L6c
            L41:
                e6.n.b(r8)
                goto L59
            L45:
                e6.n.b(r8)
                q6.o r8 = r6.f23q
                boolean r8 = r8.f25709q
                if (r8 == 0) goto L5c
                a7.c r8 = r6.f24r
                r0.f30x = r5
                java.lang.Object r7 = r8.c(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                e6.s r7 = e6.s.f23253a
                return r7
            L5c:
                p6.p r8 = r6.f25s
                r0.f26t = r6
                r0.f27u = r7
                r0.f30x = r4
                java.lang.Object r8 = r8.i(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                q6.o r8 = r2.f23q
                r8.f25709q = r5
                a7.c r8 = r2.f24r
                r2 = 0
                r0.f26t = r2
                r0.f27u = r2
                r0.f30x = r3
                java.lang.Object r7 = r8.c(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                e6.s r7 = e6.s.f23253a
                return r7
            L8b:
                e6.s r7 = e6.s.f23253a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a7.h.b.c(java.lang.Object, g6.e):java.lang.Object");
        }
    }

    public static final a7.b a(a7.b bVar, p pVar) {
        return new a(bVar, pVar);
    }
}
