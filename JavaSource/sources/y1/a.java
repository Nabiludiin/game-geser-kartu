package y1;

/* compiled from: MyApplication */
public final class a implements j5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final j5.a f27544a = new a();

    /* compiled from: MyApplication */
    /* renamed from: y1.a$a, reason: collision with other inner class name */
    private static final class C0152a implements i5.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0152a f27545a = new C0152a();

        /* renamed from: b, reason: collision with root package name */
        private static final i5.c f27546b = i5.c.a("window").b(l5.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final i5.c f27547c = i5.c.a("logSourceMetrics").b(l5.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final i5.c f27548d = i5.c.a("globalMetrics").b(l5.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final i5.c f27549e = i5.c.a("appNamespace").b(l5.a.b().c(4).a()).a();

        private C0152a() {
        }

        @Override // i5.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b2.a aVar, i5.e eVar) {
            eVar.d(f27546b, aVar.d());
            eVar.d(f27547c, aVar.c());
            eVar.d(f27548d, aVar.b());
            eVar.d(f27549e, aVar.a());
        }
    }

    /* compiled from: MyApplication */
    private static final class b implements i5.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f27550a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final i5.c f27551b = i5.c.a("storageMetrics").b(l5.a.b().c(1).a()).a();

        private b() {
        }

        @Override // i5.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b2.b bVar, i5.e eVar) {
            eVar.d(f27551b, bVar.a());
        }
    }

    /* compiled from: MyApplication */
    private static final class c implements i5.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f27552a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final i5.c f27553b = i5.c.a("eventsDroppedCount").b(l5.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final i5.c f27554c = i5.c.a("reason").b(l5.a.b().c(3).a()).a();

        private c() {
        }

        @Override // i5.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b2.c cVar, i5.e eVar) {
            eVar.a(f27553b, cVar.a());
            eVar.d(f27554c, cVar.b());
        }
    }

    /* compiled from: MyApplication */
    private static final class d implements i5.d {

        /* renamed from: a, reason: collision with root package name */
        static final d f27555a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final i5.c f27556b = i5.c.a("logSource").b(l5.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final i5.c f27557c = i5.c.a("logEventDropped").b(l5.a.b().c(2).a()).a();

        private d() {
        }

        @Override // i5.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b2.d dVar, i5.e eVar) {
            eVar.d(f27556b, dVar.b());
            eVar.d(f27557c, dVar.a());
        }
    }

    /* compiled from: MyApplication */
    private static final class e implements i5.d {

        /* renamed from: a, reason: collision with root package name */
        static final e f27558a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final i5.c f27559b = i5.c.d("clientMetrics");

        private e() {
        }

        @Override // i5.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (i5.e) obj2);
        }

        public void b(l lVar, i5.e eVar) {
            throw null;
        }
    }

    /* compiled from: MyApplication */
    private static final class f implements i5.d {

        /* renamed from: a, reason: collision with root package name */
        static final f f27560a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final i5.c f27561b = i5.c.a("currentCacheSizeBytes").b(l5.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final i5.c f27562c = i5.c.a("maxCacheSizeBytes").b(l5.a.b().c(2).a()).a();

        private f() {
        }

        @Override // i5.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b2.e eVar, i5.e eVar2) {
            eVar2.a(f27561b, eVar.a());
            eVar2.a(f27562c, eVar.b());
        }
    }

    /* compiled from: MyApplication */
    private static final class g implements i5.d {

        /* renamed from: a, reason: collision with root package name */
        static final g f27563a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final i5.c f27564b = i5.c.a("startMs").b(l5.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final i5.c f27565c = i5.c.a("endMs").b(l5.a.b().c(2).a()).a();

        private g() {
        }

        @Override // i5.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b2.f fVar, i5.e eVar) {
            eVar.a(f27564b, fVar.b());
            eVar.a(f27565c, fVar.a());
        }
    }

    private a() {
    }

    @Override // j5.a
    public void a(j5.b bVar) {
        bVar.a(l.class, e.f27558a);
        bVar.a(b2.a.class, C0152a.f27545a);
        bVar.a(b2.f.class, g.f27563a);
        bVar.a(b2.d.class, d.f27555a);
        bVar.a(b2.c.class, c.f27552a);
        bVar.a(b2.b.class, b.f27550a);
        bVar.a(b2.e.class, f.f27560a);
    }
}
