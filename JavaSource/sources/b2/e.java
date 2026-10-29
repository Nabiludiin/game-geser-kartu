package b2;

/* compiled from: MyApplication */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f3178c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f3179a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3180b;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f3181a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f3182b = 0;

        a() {
        }

        public e a() {
            return new e(this.f3181a, this.f3182b);
        }

        public a b(long j7) {
            this.f3181a = j7;
            return this;
        }

        public a c(long j7) {
            this.f3182b = j7;
            return this;
        }
    }

    e(long j7, long j8) {
        this.f3179a = j7;
        this.f3180b = j8;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f3179a;
    }

    public long b() {
        return this.f3180b;
    }
}
