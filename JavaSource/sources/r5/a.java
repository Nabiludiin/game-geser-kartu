package r5;

import r5.d;

/* compiled from: MyApplication */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f25867a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25868b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25869c;

    /* renamed from: d, reason: collision with root package name */
    private final f f25870d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f25871e;

    /* compiled from: MyApplication */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f25872a;

        /* renamed from: b, reason: collision with root package name */
        private String f25873b;

        /* renamed from: c, reason: collision with root package name */
        private String f25874c;

        /* renamed from: d, reason: collision with root package name */
        private f f25875d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f25876e;

        b() {
        }

        @Override // r5.d.a
        public d a() {
            return new a(this.f25872a, this.f25873b, this.f25874c, this.f25875d, this.f25876e);
        }

        @Override // r5.d.a
        public d.a b(f fVar) {
            this.f25875d = fVar;
            return this;
        }

        @Override // r5.d.a
        public d.a c(String str) {
            this.f25873b = str;
            return this;
        }

        @Override // r5.d.a
        public d.a d(String str) {
            this.f25874c = str;
            return this;
        }

        @Override // r5.d.a
        public d.a e(d.b bVar) {
            this.f25876e = bVar;
            return this;
        }

        @Override // r5.d.a
        public d.a f(String str) {
            this.f25872a = str;
            return this;
        }
    }

    @Override // r5.d
    public f b() {
        return this.f25870d;
    }

    @Override // r5.d
    public String c() {
        return this.f25868b;
    }

    @Override // r5.d
    public String d() {
        return this.f25869c;
    }

    @Override // r5.d
    public d.b e() {
        return this.f25871e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f25867a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f25868b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f25869c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f25870d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f25871e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // r5.d
    public String f() {
        return this.f25867a;
    }

    public int hashCode() {
        String str = this.f25867a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f25868b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f25869c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f25870d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f25871e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f25867a + ", fid=" + this.f25868b + ", refreshToken=" + this.f25869c + ", authToken=" + this.f25870d + ", responseCode=" + this.f25871e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f25867a = str;
        this.f25868b = str2;
        this.f25869c = str3;
        this.f25870d = fVar;
        this.f25871e = bVar;
    }
}
