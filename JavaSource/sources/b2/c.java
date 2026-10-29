package b2;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f3159c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f3160a;

    /* renamed from: b, reason: collision with root package name */
    private final b f3161b;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f3162a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f3163b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f3162a, this.f3163b);
        }

        public a b(long j7) {
            this.f3162a = j7;
            return this;
        }

        public a c(b bVar) {
            this.f3163b = bVar;
            return this;
        }
    }

    /* compiled from: MyApplication */
    public enum b implements l5.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: q, reason: collision with root package name */
        private final int f3172q;

        b(int i7) {
            this.f3172q = i7;
        }

        @Override // l5.c
        public int c() {
            return this.f3172q;
        }
    }

    c(long j7, b bVar) {
        this.f3160a = j7;
        this.f3161b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f3160a;
    }

    public b b() {
        return this.f3161b;
    }
}
