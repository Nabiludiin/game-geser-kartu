package q5;

import q5.c;
import q5.d;

/* compiled from: MyApplication */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f25661b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f25662c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25663d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25664e;

    /* renamed from: f, reason: collision with root package name */
    private final long f25665f;

    /* renamed from: g, reason: collision with root package name */
    private final long f25666g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25667h;

    /* compiled from: MyApplication */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f25668a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f25669b;

        /* renamed from: c, reason: collision with root package name */
        private String f25670c;

        /* renamed from: d, reason: collision with root package name */
        private String f25671d;

        /* renamed from: e, reason: collision with root package name */
        private Long f25672e;

        /* renamed from: f, reason: collision with root package name */
        private Long f25673f;

        /* renamed from: g, reason: collision with root package name */
        private String f25674g;

        @Override // q5.d.a
        public d a() {
            String str = "";
            if (this.f25669b == null) {
                str = " registrationStatus";
            }
            if (this.f25672e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f25673f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f25668a, this.f25669b, this.f25670c, this.f25671d, this.f25672e.longValue(), this.f25673f.longValue(), this.f25674g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q5.d.a
        public d.a b(String str) {
            this.f25670c = str;
            return this;
        }

        @Override // q5.d.a
        public d.a c(long j7) {
            this.f25672e = Long.valueOf(j7);
            return this;
        }

        @Override // q5.d.a
        public d.a d(String str) {
            this.f25668a = str;
            return this;
        }

        @Override // q5.d.a
        public d.a e(String str) {
            this.f25674g = str;
            return this;
        }

        @Override // q5.d.a
        public d.a f(String str) {
            this.f25671d = str;
            return this;
        }

        @Override // q5.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f25669b = aVar;
            return this;
        }

        @Override // q5.d.a
        public d.a h(long j7) {
            this.f25673f = Long.valueOf(j7);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f25668a = dVar.d();
            this.f25669b = dVar.g();
            this.f25670c = dVar.b();
            this.f25671d = dVar.f();
            this.f25672e = Long.valueOf(dVar.c());
            this.f25673f = Long.valueOf(dVar.h());
            this.f25674g = dVar.e();
        }
    }

    @Override // q5.d
    public String b() {
        return this.f25663d;
    }

    @Override // q5.d
    public long c() {
        return this.f25665f;
    }

    @Override // q5.d
    public String d() {
        return this.f25661b;
    }

    @Override // q5.d
    public String e() {
        return this.f25667h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f25661b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f25662c.equals(dVar.g()) && ((str = this.f25663d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f25664e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f25665f == dVar.c() && this.f25666g == dVar.h() && ((str3 = this.f25667h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // q5.d
    public String f() {
        return this.f25664e;
    }

    @Override // q5.d
    public c.a g() {
        return this.f25662c;
    }

    @Override // q5.d
    public long h() {
        return this.f25666g;
    }

    public int hashCode() {
        String str = this.f25661b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f25662c.hashCode()) * 1000003;
        String str2 = this.f25663d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f25664e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j7 = this.f25665f;
        int i7 = (hashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f25666g;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.f25667h;
        return i8 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // q5.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f25661b + ", registrationStatus=" + this.f25662c + ", authToken=" + this.f25663d + ", refreshToken=" + this.f25664e + ", expiresInSecs=" + this.f25665f + ", tokenCreationEpochInSecs=" + this.f25666g + ", fisError=" + this.f25667h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j7, long j8, String str4) {
        this.f25661b = str;
        this.f25662c = aVar;
        this.f25663d = str2;
        this.f25664e = str3;
        this.f25665f = j7;
        this.f25666g = j8;
        this.f25667h = str4;
    }
}
