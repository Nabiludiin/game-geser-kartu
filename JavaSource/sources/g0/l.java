package g0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import x6.g0;
import x6.s;
import x6.u;

/* compiled from: MyApplication */
public final class l implements g0.e {

    /* renamed from: k, reason: collision with root package name */
    public static final a f23842k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Set f23843l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    private static final Object f23844m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final p6.a f23845a;

    /* renamed from: b, reason: collision with root package name */
    private final g0.j f23846b;

    /* renamed from: c, reason: collision with root package name */
    private final g0.a f23847c;

    /* renamed from: d, reason: collision with root package name */
    private final g0 f23848d;

    /* renamed from: e, reason: collision with root package name */
    private final a7.b f23849e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23850f;

    /* renamed from: g, reason: collision with root package name */
    private final e6.g f23851g;

    /* renamed from: h, reason: collision with root package name */
    private final a7.j f23852h;

    /* renamed from: i, reason: collision with root package name */
    private List f23853i;

    /* renamed from: j, reason: collision with root package name */
    private final g0.k f23854j;

    /* compiled from: MyApplication */
    public static final class a {
        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        public final Set a() {
            return l.f23843l;
        }

        public final Object b() {
            return l.f23844m;
        }

        private a() {
        }
    }

    /* compiled from: MyApplication */
    private static abstract class b {

        /* compiled from: MyApplication */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final g0.m f23855a;

            public a(g0.m mVar) {
                super(null);
                this.f23855a = mVar;
            }

            public g0.m a() {
                return this.f23855a;
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: g0.l$b$b, reason: collision with other inner class name */
        public static final class C0090b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final p6.p f23856a;

            /* renamed from: b, reason: collision with root package name */
            private final s f23857b;

            /* renamed from: c, reason: collision with root package name */
            private final g0.m f23858c;

            /* renamed from: d, reason: collision with root package name */
            private final g6.i f23859d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0090b(p6.p pVar, s sVar, g0.m mVar, g6.i iVar) {
                super(null);
                q6.i.e(pVar, "transform");
                q6.i.e(sVar, "ack");
                q6.i.e(iVar, "callerContext");
                this.f23856a = pVar;
                this.f23857b = sVar;
                this.f23858c = mVar;
                this.f23859d = iVar;
            }

            public final s a() {
                return this.f23857b;
            }

            public final g6.i b() {
                return this.f23859d;
            }

            public g0.m c() {
                return this.f23858c;
            }

            public final p6.p d() {
                return this.f23856a;
            }
        }

        public /* synthetic */ b(q6.e eVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: MyApplication */
    private static final class c extends OutputStream {

        /* renamed from: q, reason: collision with root package name */
        private final FileOutputStream f23860q;

        public c(FileOutputStream fileOutputStream) {
            q6.i.e(fileOutputStream, "fileOutputStream");
            this.f23860q = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f23860q.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            this.f23860q.write(i7);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            q6.i.e(bArr, "b");
            this.f23860q.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            q6.i.e(bArr, "bytes");
            this.f23860q.write(bArr, i7, i8);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* compiled from: MyApplication */
    static final class d extends q6.j implements p6.l {
        d() {
            super(1);
        }

        public final void c(Throwable th) {
            if (th != null) {
                l.this.f23852h.setValue(new g0.g(th));
            }
            a aVar = l.f23842k;
            Object b8 = aVar.b();
            l lVar = l.this;
            synchronized (b8) {
                aVar.a().remove(lVar.q().getAbsolutePath());
                e6.s sVar = e6.s.f23253a;
            }
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ Object g(Object obj) {
            c((Throwable) obj);
            return e6.s.f23253a;
        }
    }

    /* compiled from: MyApplication */
    static final class e extends q6.j implements p6.p {

        /* renamed from: r, reason: collision with root package name */
        public static final e f23862r = new e();

        e() {
            super(2);
        }

        public final void c(b bVar, Throwable th) {
            q6.i.e(bVar, "msg");
            if (bVar instanceof b.C0090b) {
                s a8 = ((b.C0090b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a8.t(th);
            }
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
            c((b) obj, (Throwable) obj2);
            return e6.s.f23253a;
        }
    }

    /* compiled from: MyApplication */
    static final class f extends i6.k implements p6.p {

        /* renamed from: u, reason: collision with root package name */
        int f23863u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f23864v;

        f(g6.e eVar) {
            super(2, eVar);
        }

        @Override // i6.a
        public final g6.e j(Object obj, g6.e eVar) {
            f fVar = l.this.new f(eVar);
            fVar.f23864v = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            if (r4.f23865w.r((g0.l.b.a) r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if (r4.f23865w.s((g0.l.b.C0090b) r5, r4) == r0) goto L19;
         */
        @Override // i6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = h6.b.e()
                int r1 = r4.f23863u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                e6.n.b(r5)
                goto L44
            L1b:
                e6.n.b(r5)
                java.lang.Object r5 = r4.f23864v
                g0.l$b r5 = (g0.l.b) r5
                boolean r1 = r5 instanceof g0.l.b.a
                if (r1 == 0) goto L33
                g0.l r1 = g0.l.this
                g0.l$b$a r5 = (g0.l.b.a) r5
                r4.f23863u = r3
                java.lang.Object r5 = g0.l.h(r1, r5, r4)
                if (r5 != r0) goto L44
                goto L43
            L33:
                boolean r1 = r5 instanceof g0.l.b.C0090b
                if (r1 == 0) goto L44
                g0.l r1 = g0.l.this
                g0.l$b$b r5 = (g0.l.b.C0090b) r5
                r4.f23863u = r2
                java.lang.Object r5 = g0.l.i(r1, r5, r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                e6.s r5 = e6.s.f23253a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.l.f.m(java.lang.Object):java.lang.Object");
        }

        @Override // p6.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object i(b bVar, g6.e eVar) {
            return ((f) j(bVar, eVar)).m(e6.s.f23253a);
        }
    }

    /* compiled from: MyApplication */
    static final class g extends i6.k implements p6.p {

        /* renamed from: u, reason: collision with root package name */
        int f23866u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f23867v;

        /* compiled from: MyApplication */
        static final class a extends i6.k implements p6.p {

            /* renamed from: u, reason: collision with root package name */
            int f23869u;

            /* renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f23870v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ g0.m f23871w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0.m mVar, g6.e eVar) {
                super(2, eVar);
                this.f23871w = mVar;
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                a aVar = new a(this.f23871w, eVar);
                aVar.f23870v = obj;
                return aVar;
            }

            @Override // i6.a
            public final Object m(Object obj) {
                h6.b.e();
                if (this.f23869u != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e6.n.b(obj);
                g0.m mVar = (g0.m) this.f23870v;
                g0.m mVar2 = this.f23871w;
                boolean z7 = false;
                if (!(mVar2 instanceof g0.b) && !(mVar2 instanceof g0.g) && mVar == mVar2) {
                    z7 = true;
                }
                return i6.b.a(z7);
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0.m mVar, g6.e eVar) {
                return ((a) j(mVar, eVar)).m(e6.s.f23253a);
            }
        }

        /* compiled from: MyApplication */
        public static final class b implements a7.b {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ a7.b f23872q;

            /* compiled from: MyApplication */
            public static final class a implements a7.c {

                /* renamed from: q, reason: collision with root package name */
                final /* synthetic */ a7.c f23873q;

                /* renamed from: g0.l$g$b$a$a, reason: collision with other inner class name */
                public static final class C0091a extends i6.d {

                    /* renamed from: t, reason: collision with root package name */
                    /* synthetic */ Object f23874t;

                    /* renamed from: u, reason: collision with root package name */
                    int f23875u;

                    public C0091a(g6.e eVar) {
                        super(eVar);
                    }

                    @Override // i6.a
                    public final Object m(Object obj) {
                        this.f23874t = obj;
                        this.f23875u |= Integer.MIN_VALUE;
                        return a.this.c(null, this);
                    }
                }

                public a(a7.c cVar) {
                    this.f23873q = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // a7.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object c(java.lang.Object r5, g6.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof g0.l.g.b.a.C0091a
                        if (r0 == 0) goto L13
                        r0 = r6
                        g0.l$g$b$a$a r0 = (g0.l.g.b.a.C0091a) r0
                        int r1 = r0.f23875u
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f23875u = r1
                        goto L18
                    L13:
                        g0.l$g$b$a$a r0 = new g0.l$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f23874t
                        java.lang.Object r1 = h6.b.e()
                        int r2 = r0.f23875u
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        e6.n.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        e6.n.b(r6)
                        a7.c r6 = r4.f23873q
                        g0.m r5 = (g0.m) r5
                        boolean r2 = r5 instanceof g0.i
                        if (r2 != 0) goto L6f
                        boolean r2 = r5 instanceof g0.g
                        if (r2 != 0) goto L68
                        boolean r2 = r5 instanceof g0.b
                        if (r2 == 0) goto L56
                        g0.b r5 = (g0.b) r5
                        java.lang.Object r5 = r5.b()
                        r0.f23875u = r3
                        java.lang.Object r5 = r6.c(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        e6.s r5 = e6.s.f23253a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof g0.n
                        if (r5 == 0) goto L62
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L62:
                        e6.k r5 = new e6.k
                        r5.<init>()
                        throw r5
                    L68:
                        g0.g r5 = (g0.g) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L6f:
                        g0.i r5 = (g0.i) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: g0.l.g.b.a.c(java.lang.Object, g6.e):java.lang.Object");
                }
            }

            public b(a7.b bVar) {
                this.f23872q = bVar;
            }

            @Override // a7.b
            public Object a(a7.c cVar, g6.e eVar) {
                Object a8 = this.f23872q.a(new a(cVar), eVar);
                return a8 == h6.b.e() ? a8 : e6.s.f23253a;
            }
        }

        g(g6.e eVar) {
            super(2, eVar);
        }

        @Override // i6.a
        public final g6.e j(Object obj, g6.e eVar) {
            g gVar = l.this.new g(eVar);
            gVar.f23867v = obj;
            return gVar;
        }

        @Override // i6.a
        public final Object m(Object obj) {
            Object e8 = h6.b.e();
            int i7 = this.f23866u;
            if (i7 == 0) {
                e6.n.b(obj);
                a7.c cVar = (a7.c) this.f23867v;
                g0.m mVar = (g0.m) l.this.f23852h.getValue();
                if (!(mVar instanceof g0.b)) {
                    l.this.f23854j.e(new b.a(mVar));
                }
                b bVar = new b(a7.d.a(l.this.f23852h, new a(mVar, null)));
                this.f23866u = 1;
                if (a7.d.b(cVar, bVar, this) == e8) {
                    return e8;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e6.n.b(obj);
            }
            return e6.s.f23253a;
        }

        @Override // p6.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object i(a7.c cVar, g6.e eVar) {
            return ((g) j(cVar, eVar)).m(e6.s.f23253a);
        }
    }

    /* compiled from: MyApplication */
    static final class h extends q6.j implements p6.a {
        h() {
            super(0);
        }

        @Override // p6.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final File a() {
            File file = (File) l.this.f23845a.a();
            String absolutePath = file.getAbsolutePath();
            a aVar = l.f23842k;
            synchronized (aVar.b()) {
                if (aVar.a().contains(absolutePath)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set a8 = aVar.a();
                q6.i.d(absolutePath, "it");
                a8.add(absolutePath);
            }
            return file;
        }
    }

    /* compiled from: MyApplication */
    static final class i extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f23878t;

        /* renamed from: u, reason: collision with root package name */
        Object f23879u;

        /* renamed from: v, reason: collision with root package name */
        Object f23880v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f23881w;

        /* renamed from: y, reason: collision with root package name */
        int f23883y;

        i(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f23881w = obj;
            this.f23883y |= Integer.MIN_VALUE;
            return l.this.s(null, this);
        }
    }

    /* compiled from: MyApplication */
    static final class j extends i6.d {
        int B;

        /* renamed from: t, reason: collision with root package name */
        Object f23884t;

        /* renamed from: u, reason: collision with root package name */
        Object f23885u;

        /* renamed from: v, reason: collision with root package name */
        Object f23886v;

        /* renamed from: w, reason: collision with root package name */
        Object f23887w;

        /* renamed from: x, reason: collision with root package name */
        Object f23888x;

        /* renamed from: y, reason: collision with root package name */
        Object f23889y;

        /* renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f23890z;

        j(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f23890z = obj;
            this.B |= Integer.MIN_VALUE;
            return l.this.t(this);
        }
    }

    /* compiled from: MyApplication */
    public static final class k implements g0.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g7.a f23891a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q6.o f23892b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q6.p f23893c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f23894d;

        /* compiled from: MyApplication */
        static final class a extends i6.d {
            int A;

            /* renamed from: t, reason: collision with root package name */
            Object f23895t;

            /* renamed from: u, reason: collision with root package name */
            Object f23896u;

            /* renamed from: v, reason: collision with root package name */
            Object f23897v;

            /* renamed from: w, reason: collision with root package name */
            Object f23898w;

            /* renamed from: x, reason: collision with root package name */
            Object f23899x;

            /* renamed from: y, reason: collision with root package name */
            /* synthetic */ Object f23900y;

            a(g6.e eVar) {
                super(eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                this.f23900y = obj;
                this.A |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(g7.a aVar, q6.o oVar, q6.p pVar, l lVar) {
            this.f23891a = aVar;
            this.f23892b = oVar;
            this.f23893c = pVar;
            this.f23894d = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00da, B:46:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00da, B:46:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // g0.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(p6.p r10, g6.e r11) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.l.k.a(p6.p, g6.e):java.lang.Object");
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: g0.l$l, reason: collision with other inner class name */
    static final class C0092l extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f23902t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f23903u;

        /* renamed from: w, reason: collision with root package name */
        int f23905w;

        C0092l(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f23903u = obj;
            this.f23905w |= Integer.MIN_VALUE;
            return l.this.u(this);
        }
    }

    /* compiled from: MyApplication */
    static final class m extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f23906t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f23907u;

        /* renamed from: w, reason: collision with root package name */
        int f23909w;

        m(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f23907u = obj;
            this.f23909w |= Integer.MIN_VALUE;
            return l.this.v(this);
        }
    }

    /* compiled from: MyApplication */
    static final class n extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f23910t;

        /* renamed from: u, reason: collision with root package name */
        Object f23911u;

        /* renamed from: v, reason: collision with root package name */
        Object f23912v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f23913w;

        /* renamed from: y, reason: collision with root package name */
        int f23915y;

        n(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f23913w = obj;
            this.f23915y |= Integer.MIN_VALUE;
            return l.this.w(this);
        }
    }

    /* compiled from: MyApplication */
    static final class o extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f23916t;

        /* renamed from: u, reason: collision with root package name */
        Object f23917u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f23918v;

        /* renamed from: x, reason: collision with root package name */
        int f23920x;

        o(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f23918v = obj;
            this.f23920x |= Integer.MIN_VALUE;
            return l.this.x(this);
        }
    }

    /* compiled from: MyApplication */
    static final class p extends i6.d {

        /* renamed from: t, reason: collision with root package name */
        Object f23921t;

        /* renamed from: u, reason: collision with root package name */
        Object f23922u;

        /* renamed from: v, reason: collision with root package name */
        Object f23923v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f23924w;

        /* renamed from: y, reason: collision with root package name */
        int f23926y;

        p(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f23924w = obj;
            this.f23926y |= Integer.MIN_VALUE;
            return l.this.y(null, null, this);
        }
    }

    /* compiled from: MyApplication */
    static final class q extends i6.k implements p6.p {

        /* renamed from: u, reason: collision with root package name */
        int f23927u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ p6.p f23928v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Object f23929w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(p6.p pVar, Object obj, g6.e eVar) {
            super(2, eVar);
            this.f23928v = pVar;
            this.f23929w = obj;
        }

        @Override // i6.a
        public final g6.e j(Object obj, g6.e eVar) {
            return new q(this.f23928v, this.f23929w, eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            Object e8 = h6.b.e();
            int i7 = this.f23927u;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e6.n.b(obj);
                return obj;
            }
            e6.n.b(obj);
            p6.p pVar = this.f23928v;
            Object obj2 = this.f23929w;
            this.f23927u = 1;
            Object i8 = pVar.i(obj2, this);
            return i8 == e8 ? e8 : i8;
        }

        @Override // p6.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object i(g0 g0Var, g6.e eVar) {
            return ((q) j(g0Var, eVar)).m(e6.s.f23253a);
        }
    }

    /* compiled from: MyApplication */
    static final class r extends i6.d {
        int A;

        /* renamed from: t, reason: collision with root package name */
        Object f23930t;

        /* renamed from: u, reason: collision with root package name */
        Object f23931u;

        /* renamed from: v, reason: collision with root package name */
        Object f23932v;

        /* renamed from: w, reason: collision with root package name */
        Object f23933w;

        /* renamed from: x, reason: collision with root package name */
        Object f23934x;

        /* renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f23935y;

        r(g6.e eVar) {
            super(eVar);
        }

        @Override // i6.a
        public final Object m(Object obj) {
            this.f23935y = obj;
            this.A |= Integer.MIN_VALUE;
            return l.this.z(null, this);
        }
    }

    public l(p6.a aVar, g0.j jVar, List list, g0.a aVar2, g0 g0Var) {
        q6.i.e(aVar, "produceFile");
        q6.i.e(jVar, "serializer");
        q6.i.e(list, "initTasksList");
        q6.i.e(aVar2, "corruptionHandler");
        q6.i.e(g0Var, "scope");
        this.f23845a = aVar;
        this.f23846b = jVar;
        this.f23847c = aVar2;
        this.f23848d = g0Var;
        this.f23849e = a7.d.e(new g(null));
        this.f23850f = ".tmp";
        this.f23851g = e6.h.a(new h());
        this.f23852h = a7.m.a(g0.n.f23937a);
        this.f23853i = f6.l.q(list);
        this.f23854j = new g0.k(g0Var, new d(), e.f23862r, new f(null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(q6.i.j("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.f23851g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b.a aVar, g6.e eVar) {
        g0.m mVar = (g0.m) this.f23852h.getValue();
        if (!(mVar instanceof g0.b)) {
            if (mVar instanceof g0.i) {
                if (mVar == aVar.a()) {
                    Object v7 = v(eVar);
                    return v7 == h6.b.e() ? v7 : e6.s.f23253a;
                }
            } else {
                if (q6.i.a(mVar, g0.n.f23937a)) {
                    Object v8 = v(eVar);
                    return v8 == h6.b.e() ? v8 : e6.s.f23253a;
                }
                if (mVar instanceof g0.g) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return e6.s.f23253a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(6:(1:(1:(2:12|13))(3:15|16|17))|26|27|21|22|23)(5:28|29|30|(6:32|(1:34)|20|21|22|23)(3:35|(1:37)(1:53)|(2:39|(2:41|(1:43)(1:44))(2:45|46))(2:47|(2:49|50)(2:51|52)))|25)|18))|58|6|7|(0)(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
    
        if (r9 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v20, types: [x6.s] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3, types: [x6.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(g0.l.b.C0090b r9, g6.e r10) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.s(g0.l$b$b, g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(g6.e r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.t(g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(g6.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g0.l.C0092l
            if (r0 == 0) goto L13
            r0 = r5
            g0.l$l r0 = (g0.l.C0092l) r0
            int r1 = r0.f23905w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23905w = r1
            goto L18
        L13:
            g0.l$l r0 = new g0.l$l
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f23903u
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f23905w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f23902t
            g0.l r0 = (g0.l) r0
            e6.n.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            e6.n.b(r5)
            r0.f23902t = r4     // Catch: java.lang.Throwable -> L48
            r0.f23905w = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            e6.s r5 = e6.s.f23253a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            a7.j r0 = r0.f23852h
            g0.i r1 = new g0.i
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.u(g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(g6.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g0.l.m
            if (r0 == 0) goto L13
            r0 = r5
            g0.l$m r0 = (g0.l.m) r0
            int r1 = r0.f23909w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23909w = r1
            goto L18
        L13:
            g0.l$m r0 = new g0.l$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f23907u
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f23909w
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f23906t
            g0.l r0 = (g0.l) r0
            e6.n.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            e6.n.b(r5)
            r0.f23906t = r4     // Catch: java.lang.Throwable -> L45
            r0.f23909w = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            a7.j r0 = r0.f23852h
            g0.i r1 = new g0.i
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            e6.s r5 = e6.s.f23253a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.v(g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [g0.l] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [g0.l$n, g6.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [g0.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [g0.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(g6.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g0.l.n
            if (r0 == 0) goto L13
            r0 = r6
            g0.l$n r0 = (g0.l.n) r0
            int r1 = r0.f23915y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23915y = r1
            goto L18
        L13:
            g0.l$n r0 = new g0.l$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23913w
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f23915y
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f23912v
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f23911u
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f23910t
            g0.l r0 = (g0.l) r0
            e6.n.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            e6.n.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.q()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            g0.j r6 = r5.f23846b     // Catch: java.lang.Throwable -> L65
            r0.f23910t = r5     // Catch: java.lang.Throwable -> L65
            r0.f23911u = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f23912v = r4     // Catch: java.lang.Throwable -> L65
            r0.f23915y = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            n6.a.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            n6.a.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            g0.j r6 = r0.f23846b
            java.lang.Object r6 = r6.a()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.w(g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(g6.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof g0.l.o
            if (r0 == 0) goto L13
            r0 = r7
            g0.l$o r0 = (g0.l.o) r0
            int r1 = r0.f23920x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23920x = r1
            goto L18
        L13:
            g0.l$o r0 = new g0.l$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23918v
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f23920x
            r3 = 1
            if (r2 == 0) goto L67
            if (r2 == r3) goto L5f
            r3 = 2
            r4 = 0
            r5 = 3
            if (r2 == r3) goto L41
            if (r2 != r5) goto L39
            java.lang.Object r1 = r0.f23917u
            java.lang.Object r0 = r0.f23916t
            android.support.v4.media.session.b.a(r0)
            e6.n.b(r7)     // Catch: java.io.IOException -> L37
            return r1
        L37:
            r7 = move-exception
            goto L5b
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L41:
            java.lang.Object r2 = r0.f23917u
            android.support.v4.media.session.b.a(r2)
            java.lang.Object r2 = r0.f23916t
            g0.l r2 = (g0.l) r2
            e6.n.b(r7)
            r0.f23916t = r4     // Catch: java.io.IOException -> L37
            r0.f23917u = r7     // Catch: java.io.IOException -> L37
            r0.f23920x = r5     // Catch: java.io.IOException -> L37
            java.lang.Object r0 = r2.z(r7, r0)     // Catch: java.io.IOException -> L37
            if (r0 != r1) goto L5a
            goto L74
        L5a:
            return r7
        L5b:
            e6.a.a(r4, r7)
            throw r4
        L5f:
            java.lang.Object r0 = r0.f23916t
            g0.l r0 = (g0.l) r0
            e6.n.b(r7)
            return r7
        L67:
            e6.n.b(r7)
            r0.f23916t = r6
            r0.f23920x = r3
            java.lang.Object r7 = r6.w(r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.x(g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(p6.p r8, g6.i r9, g6.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof g0.l.p
            if (r0 == 0) goto L13
            r0 = r10
            g0.l$p r0 = (g0.l.p) r0
            int r1 = r0.f23926y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23926y = r1
            goto L18
        L13:
            g0.l$p r0 = new g0.l$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f23924w
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f23926y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f23922u
            java.lang.Object r9 = r0.f23921t
            g0.l r9 = (g0.l) r9
            e6.n.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f23923v
            java.lang.Object r9 = r0.f23922u
            g0.b r9 = (g0.b) r9
            java.lang.Object r2 = r0.f23921t
            g0.l r2 = (g0.l) r2
            e6.n.b(r10)
            goto L73
        L49:
            e6.n.b(r10)
            a7.j r10 = r7.f23852h
            java.lang.Object r10 = r10.getValue()
            g0.b r10 = (g0.b) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            g0.l$q r6 = new g0.l$q
            r6.<init>(r8, r2, r3)
            r0.f23921t = r7
            r0.f23922u = r10
            r0.f23923v = r2
            r0.f23926y = r5
            java.lang.Object r8 = x6.f.e(r9, r6, r0)
            if (r8 != r1) goto L6f
            goto L8b
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = q6.i.a(r8, r10)
            if (r9 == 0) goto L7d
            return r8
        L7d:
            r0.f23921t = r2
            r0.f23922u = r10
            r0.f23923v = r3
            r0.f23926y = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            a7.j r9 = r9.f23852h
            g0.b r10 = new g0.b
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.y(p6.p, g6.i, g6.e):java.lang.Object");
    }

    @Override // g0.e
    public Object a(p6.p pVar, g6.e eVar) {
        s b8 = u.b(null, 1, null);
        this.f23854j.e(new b.C0090b(pVar, b8, (g0.m) this.f23852h.getValue(), eVar.getContext()));
        return b8.q(eVar);
    }

    @Override // g0.e
    public a7.b getData() {
        return this.f23849e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:27:0x00c5, B:28:0x00c8, B:24:0x00c3), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.Object r8, g6.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof g0.l.r
            if (r0 == 0) goto L13
            r0 = r9
            g0.l$r r0 = (g0.l.r) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            g0.l$r r0 = new g0.l$r
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23935y
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f23934x
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f23933w
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f23932v
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f23931u
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f23930t
            g0.l r0 = (g0.l) r0
            e6.n.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            e6.n.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f23850f
            java.lang.String r2 = q6.i.j(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            g0.j r4 = r7.f23846b     // Catch: java.lang.Throwable -> Lc1
            g0.l$c r5 = new g0.l$c     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.f23930t = r7     // Catch: java.lang.Throwable -> Lc1
            r0.f23931u = r9     // Catch: java.lang.Throwable -> Lc1
            r0.f23932v = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.f23933w = r6     // Catch: java.lang.Throwable -> Lc1
            r0.f23934x = r2     // Catch: java.lang.Throwable -> Lc1
            r0.A = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.b(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            e6.s r8 = e6.s.f23253a     // Catch: java.lang.Throwable -> L3d
            n6.a.a(r2, r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r8 = r0.q()     // Catch: java.io.IOException -> Lbe
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            e6.s r8 = e6.s.f23253a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r9.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            r9.append(r3)     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbe
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lbe:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc1:
            r8 = move-exception
            r3 = r9
        Lc3:
            throw r8     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            n6.a.a(r2, r8)     // Catch: java.io.IOException -> Lbe
            throw r9     // Catch: java.io.IOException -> Lbe
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.z(java.lang.Object, g6.e):java.lang.Object");
    }
}
