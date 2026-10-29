package f5;

/* compiled from: MyApplication */
class c0 implements o5.b {

    /* renamed from: c, reason: collision with root package name */
    private static final o5.a f23733c = new o5.a() { // from class: f5.a0
        @Override // o5.a
        public final void a(o5.b bVar) {
            c0.b(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final o5.b f23734d = new o5.b() { // from class: f5.b0
        @Override // o5.b
        public final Object get() {
            return c0.a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private o5.a f23735a;

    /* renamed from: b, reason: collision with root package name */
    private volatile o5.b f23736b;

    private c0(o5.a aVar, o5.b bVar) {
        this.f23735a = aVar;
        this.f23736b = bVar;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    static c0 c() {
        return new c0(f23733c, f23734d);
    }

    void d(o5.b bVar) {
        o5.a aVar;
        if (this.f23736b != f23734d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f23735a;
            this.f23735a = null;
            this.f23736b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // o5.b
    public Object get() {
        return this.f23736b.get();
    }

    public static /* synthetic */ void b(o5.b bVar) {
    }
}
