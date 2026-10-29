package g2;

import g2.e;

/* compiled from: MyApplication */
final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    private final long f23953b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23954c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23955d;

    /* renamed from: e, reason: collision with root package name */
    private final long f23956e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23957f;

    /* compiled from: MyApplication */
    static final class b extends e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f23958a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f23959b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f23960c;

        /* renamed from: d, reason: collision with root package name */
        private Long f23961d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f23962e;

        b() {
        }

        @Override // g2.e.a
        e a() {
            String str = "";
            if (this.f23958a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f23959b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f23960c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f23961d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f23962e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f23958a.longValue(), this.f23959b.intValue(), this.f23960c.intValue(), this.f23961d.longValue(), this.f23962e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g2.e.a
        e.a b(int i7) {
            this.f23960c = Integer.valueOf(i7);
            return this;
        }

        @Override // g2.e.a
        e.a c(long j7) {
            this.f23961d = Long.valueOf(j7);
            return this;
        }

        @Override // g2.e.a
        e.a d(int i7) {
            this.f23959b = Integer.valueOf(i7);
            return this;
        }

        @Override // g2.e.a
        e.a e(int i7) {
            this.f23962e = Integer.valueOf(i7);
            return this;
        }

        @Override // g2.e.a
        e.a f(long j7) {
            this.f23958a = Long.valueOf(j7);
            return this;
        }
    }

    @Override // g2.e
    int b() {
        return this.f23955d;
    }

    @Override // g2.e
    long c() {
        return this.f23956e;
    }

    @Override // g2.e
    int d() {
        return this.f23954c;
    }

    @Override // g2.e
    int e() {
        return this.f23957f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f23953b == eVar.f() && this.f23954c == eVar.d() && this.f23955d == eVar.b() && this.f23956e == eVar.c() && this.f23957f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // g2.e
    long f() {
        return this.f23953b;
    }

    public int hashCode() {
        long j7 = this.f23953b;
        int i7 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f23954c) * 1000003) ^ this.f23955d) * 1000003;
        long j8 = this.f23956e;
        return ((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f23957f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f23953b + ", loadBatchSize=" + this.f23954c + ", criticalSectionEnterTimeoutMs=" + this.f23955d + ", eventCleanUpAge=" + this.f23956e + ", maxBlobByteSizePerRow=" + this.f23957f + "}";
    }

    private a(long j7, int i7, int i8, long j8, int i9) {
        this.f23953b = j7;
        this.f23954c = i7;
        this.f23955d = i8;
        this.f23956e = j8;
        this.f23957f = i9;
    }
}
