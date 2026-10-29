package b2;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f3156b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final e f3157a;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f3158a = null;

        a() {
        }

        public b a() {
            return new b(this.f3158a);
        }

        public a b(e eVar) {
            this.f3158a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f3157a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f3157a;
    }
}
