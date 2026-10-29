package r5;

import r5.f;

/* compiled from: MyApplication */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f25877a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25878b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f25879c;

    /* compiled from: MyApplication */
    /* renamed from: r5.b$b, reason: collision with other inner class name */
    static final class C0128b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f25880a;

        /* renamed from: b, reason: collision with root package name */
        private Long f25881b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f25882c;

        C0128b() {
        }

        @Override // r5.f.a
        public f a() {
            String str = "";
            if (this.f25881b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f25880a, this.f25881b.longValue(), this.f25882c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r5.f.a
        public f.a b(f.b bVar) {
            this.f25882c = bVar;
            return this;
        }

        @Override // r5.f.a
        public f.a c(String str) {
            this.f25880a = str;
            return this;
        }

        @Override // r5.f.a
        public f.a d(long j7) {
            this.f25881b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // r5.f
    public f.b b() {
        return this.f25879c;
    }

    @Override // r5.f
    public String c() {
        return this.f25877a;
    }

    @Override // r5.f
    public long d() {
        return this.f25878b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f25877a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f25878b == fVar.d() && ((bVar = this.f25879c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f25877a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j7 = this.f25878b;
        int i7 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        f.b bVar = this.f25879c;
        return i7 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f25877a + ", tokenExpirationTimestamp=" + this.f25878b + ", responseCode=" + this.f25879c + "}";
    }

    private b(String str, long j7, f.b bVar) {
        this.f25877a = str;
        this.f25878b = j7;
        this.f25879c = bVar;
    }
}
