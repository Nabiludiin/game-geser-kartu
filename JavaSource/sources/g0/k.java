package g0;

import e6.s;
import java.util.concurrent.atomic.AtomicInteger;
import p6.p;
import x6.g0;
import x6.m1;
import z6.f;

/* compiled from: MyApplication */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f23832a;

    /* renamed from: b, reason: collision with root package name */
    private final p f23833b;

    /* renamed from: c, reason: collision with root package name */
    private final z6.d f23834c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f23835d;

    /* compiled from: MyApplication */
    static final class a extends q6.j implements p6.l {

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ p6.l f23836r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ k f23837s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ p f23838t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p6.l lVar, k kVar, p pVar) {
            super(1);
            this.f23836r = lVar;
            this.f23837s = kVar;
            this.f23838t = pVar;
        }

        public final void c(Throwable th) {
            s sVar;
            this.f23836r.g(th);
            this.f23837s.f23834c.c(th);
            do {
                Object d8 = z6.f.d(this.f23837s.f23834c.a());
                if (d8 == null) {
                    sVar = null;
                } else {
                    this.f23838t.i(d8, th);
                    sVar = s.f23253a;
                }
            } while (sVar != null);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ Object g(Object obj) {
            c((Throwable) obj);
            return s.f23253a;
        }
    }

    /* compiled from: MyApplication */
    static final class b extends i6.k implements p {

        /* renamed from: u, reason: collision with root package name */
        Object f23839u;

        /* renamed from: v, reason: collision with root package name */
        int f23840v;

        b(g6.e eVar) {
            super(2, eVar);
        }

        @Override // i6.a
        public final g6.e j(Object obj, g6.e eVar) {
            return k.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        
            if (r1.i(r6, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
        
            if (r6 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
        @Override // i6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = h6.b.e()
                int r1 = r5.f23840v
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                e6.n.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f23839u
                p6.p r1 = (p6.p) r1
                e6.n.b(r6)
                goto L56
            L22:
                e6.n.b(r6)
                g0.k r6 = g0.k.this
                java.util.concurrent.atomic.AtomicInteger r6 = g0.k.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = r3
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                g0.k r6 = g0.k.this
                x6.g0 r6 = g0.k.d(r6)
                x6.h0.c(r6)
                g0.k r6 = g0.k.this
                p6.p r1 = g0.k.a(r6)
                g0.k r6 = g0.k.this
                z6.d r6 = g0.k.b(r6)
                r5.f23839u = r1
                r5.f23840v = r3
                java.lang.Object r6 = r6.b(r5)
                if (r6 != r0) goto L56
                goto L61
            L56:
                r4 = 0
                r5.f23839u = r4
                r5.f23840v = r2
                java.lang.Object r6 = r1.i(r6, r5)
                if (r6 != r0) goto L62
            L61:
                return r0
            L62:
                g0.k r6 = g0.k.this
                java.util.concurrent.atomic.AtomicInteger r6 = g0.k.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                e6.s r6 = e6.s.f23253a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.k.b.m(java.lang.Object):java.lang.Object");
        }

        @Override // p6.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object i(g0 g0Var, g6.e eVar) {
            return ((b) j(g0Var, eVar)).m(s.f23253a);
        }
    }

    public k(g0 g0Var, p6.l lVar, p pVar, p pVar2) {
        q6.i.e(g0Var, "scope");
        q6.i.e(lVar, "onComplete");
        q6.i.e(pVar, "onUndeliveredElement");
        q6.i.e(pVar2, "consumeMessage");
        this.f23832a = g0Var;
        this.f23833b = pVar2;
        this.f23834c = z6.e.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f23835d = new AtomicInteger(0);
        m1 m1Var = (m1) g0Var.a().e(m1.f27411p);
        if (m1Var == null) {
            return;
        }
        m1Var.m(new a(lVar, this, pVar));
    }

    public final void e(Object obj) {
        Object d8 = this.f23834c.d(obj);
        if (d8 instanceof f.a) {
            Throwable c8 = z6.f.c(d8);
            if (c8 != null) {
                throw c8;
            }
            throw new z6.j("Channel was closed normally");
        }
        if (!z6.f.f(d8)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f23835d.getAndIncrement() == 0) {
            x6.g.d(this.f23832a, null, null, new b(null), 3, null);
        }
    }
}
