package b2;

/* compiled from: MyApplication */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f3183c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f3184a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3185b;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f3186a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f3187b = 0;

        a() {
        }

        public f a() {
            return new f(this.f3186a, this.f3187b);
        }

        public a b(long j7) {
            this.f3187b = j7;
            return this;
        }

        public a c(long j7) {
            this.f3186a = j7;
            return this;
        }
    }

    f(long j7, long j8) {
        this.f3184a = j7;
        this.f3185b = j8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f3185b;
    }

    public long b() {
        return this.f3184a;
    }
}
