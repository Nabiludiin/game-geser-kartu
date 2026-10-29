package g0;

import e6.s;
import java.util.Iterator;
import java.util.List;
import p6.p;

/* compiled from: MyApplication */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23813a = new a(null);

    /* compiled from: MyApplication */
    public static final class a {

        /* compiled from: MyApplication */
        /* renamed from: g0.d$a$a, reason: collision with other inner class name */
        static final class C0088a extends i6.k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f23814u;

            /* renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f23815v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ List f23816w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0088a(List list, g6.e eVar) {
                super(2, eVar);
                this.f23816w = list;
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                C0088a c0088a = new C0088a(this.f23816w, eVar);
                c0088a.f23815v = obj;
                return c0088a;
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f23814u;
                if (i7 == 0) {
                    e6.n.b(obj);
                    h hVar = (h) this.f23815v;
                    a aVar = d.f23813a;
                    List list = this.f23816w;
                    this.f23814u = 1;
                    if (aVar.c(list, hVar, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e6.n.b(obj);
                }
                return s.f23253a;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(h hVar, g6.e eVar) {
                return ((C0088a) j(hVar, eVar)).m(s.f23253a);
            }
        }

        /* compiled from: MyApplication */
        static final class b extends i6.d {

            /* renamed from: t, reason: collision with root package name */
            Object f23817t;

            /* renamed from: u, reason: collision with root package name */
            Object f23818u;

            /* renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f23819v;

            /* renamed from: x, reason: collision with root package name */
            int f23821x;

            b(g6.e eVar) {
                super(eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                this.f23819v = obj;
                this.f23821x |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* compiled from: MyApplication */
        static final class c extends i6.k implements p {
            final /* synthetic */ List A;

            /* renamed from: u, reason: collision with root package name */
            Object f23822u;

            /* renamed from: v, reason: collision with root package name */
            Object f23823v;

            /* renamed from: w, reason: collision with root package name */
            Object f23824w;

            /* renamed from: x, reason: collision with root package name */
            int f23825x;

            /* renamed from: y, reason: collision with root package name */
            /* synthetic */ Object f23826y;

            /* renamed from: z, reason: collision with root package name */
            final /* synthetic */ List f23827z;

            /* compiled from: MyApplication */
            /* renamed from: g0.d$a$c$a, reason: collision with other inner class name */
            static final class C0089a extends i6.k implements p6.l {

                /* renamed from: u, reason: collision with root package name */
                int f23828u;

                C0089a(g0.c cVar, g6.e eVar) {
                    super(1, eVar);
                }

                @Override // i6.a
                public final Object m(Object obj) {
                    h6.b.e();
                    int i7 = this.f23828u;
                    if (i7 == 0) {
                        e6.n.b(obj);
                        this.f23828u = 1;
                        throw null;
                    }
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e6.n.b(obj);
                    return s.f23253a;
                }

                public final g6.e p(g6.e eVar) {
                    return new C0089a(null, eVar);
                }

                @Override // p6.l
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object g(g6.e eVar) {
                    return ((C0089a) p(eVar)).m(s.f23253a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, g6.e eVar) {
                super(2, eVar);
                this.f23827z = list;
                this.A = list2;
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                c cVar = new c(this.f23827z, this.A, eVar);
                cVar.f23826y = obj;
                return cVar;
            }

            @Override // i6.a
            public final Object m(Object obj) {
                List list;
                Iterator it;
                h6.b.e();
                int i7 = this.f23825x;
                if (i7 == 0) {
                    e6.n.b(obj);
                    obj = this.f23826y;
                    List list2 = this.f23827z;
                    list = this.A;
                    it = list2.iterator();
                } else if (i7 == 1) {
                    Object obj2 = this.f23824w;
                    android.support.v4.media.session.b.a(this.f23823v);
                    Iterator it2 = (Iterator) this.f23822u;
                    List list3 = (List) this.f23826y;
                    e6.n.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0089a(null, null));
                        this.f23826y = list3;
                        this.f23822u = it2;
                        this.f23823v = null;
                        this.f23824w = null;
                        this.f23825x = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f23822u;
                    list = (List) this.f23826y;
                    e6.n.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                android.support.v4.media.session.b.a(it.next());
                this.f23826y = list;
                this.f23822u = it;
                this.f23823v = null;
                this.f23824w = obj;
                this.f23825x = 1;
                throw null;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(Object obj, g6.e eVar) {
                return ((c) j(obj, eVar)).m(s.f23253a);
            }
        }

        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0086 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(java.util.List r7, g0.h r8, g6.e r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof g0.d.a.b
                if (r0 == 0) goto L13
                r0 = r9
                g0.d$a$b r0 = (g0.d.a.b) r0
                int r1 = r0.f23821x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23821x = r1
                goto L18
            L13:
                g0.d$a$b r0 = new g0.d$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f23819v
                java.lang.Object r1 = h6.b.e()
                int r2 = r0.f23821x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f23818u
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f23817t
                q6.p r8 = (q6.p) r8
                e6.n.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f23817t
                java.util.List r7 = (java.util.List) r7
                e6.n.b(r9)
                goto L60
            L46:
                e6.n.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                g0.d$a$c r2 = new g0.d$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f23817t = r9
                r0.f23821x = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                goto L81
            L5f:
                r7 = r9
            L60:
                q6.p r8 = new q6.p
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                p6.l r9 = (p6.l) r9
                r0.f23817t = r8     // Catch: java.lang.Throwable -> L34
                r0.f23818u = r7     // Catch: java.lang.Throwable -> L34
                r0.f23821x = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.g(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
            L81:
                return r1
            L82:
                java.lang.Object r2 = r8.f25710q
                if (r2 != 0) goto L89
                r8.f25710q = r9
                goto L69
            L89:
                q6.i.b(r2)
                java.lang.Object r2 = r8.f25710q
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                e6.a.a(r2, r9)
                goto L69
            L94:
                java.lang.Object r7 = r8.f25710q
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                e6.s r7 = e6.s.f23253a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.d.a.c(java.util.List, g0.h, g6.e):java.lang.Object");
        }

        public final p b(List list) {
            q6.i.e(list, "migrations");
            return new C0088a(list, null);
        }

        private a() {
        }
    }
}
