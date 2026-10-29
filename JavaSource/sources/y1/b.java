package y1;

import java.util.Map;
import y1.i;

/* compiled from: MyApplication */
final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final String f27566a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f27567b;

    /* renamed from: c, reason: collision with root package name */
    private final h f27568c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27569d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27570e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f27571f;

    /* compiled from: MyApplication */
    /* renamed from: y1.b$b, reason: collision with other inner class name */
    static final class C0153b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f27572a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f27573b;

        /* renamed from: c, reason: collision with root package name */
        private h f27574c;

        /* renamed from: d, reason: collision with root package name */
        private Long f27575d;

        /* renamed from: e, reason: collision with root package name */
        private Long f27576e;

        /* renamed from: f, reason: collision with root package name */
        private Map f27577f;

        C0153b() {
        }

        @Override // y1.i.a
        public i d() {
            String str = "";
            if (this.f27572a == null) {
                str = " transportName";
            }
            if (this.f27574c == null) {
                str = str + " encodedPayload";
            }
            if (this.f27575d == null) {
                str = str + " eventMillis";
            }
            if (this.f27576e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f27577f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f27572a, this.f27573b, this.f27574c, this.f27575d.longValue(), this.f27576e.longValue(), this.f27577f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // y1.i.a
        protected Map e() {
            Map map = this.f27577f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // y1.i.a
        protected i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f27577f = map;
            return this;
        }

        @Override // y1.i.a
        public i.a g(Integer num) {
            this.f27573b = num;
            return this;
        }

        @Override // y1.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f27574c = hVar;
            return this;
        }

        @Override // y1.i.a
        public i.a i(long j7) {
            this.f27575d = Long.valueOf(j7);
            return this;
        }

        @Override // y1.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f27572a = str;
            return this;
        }

        @Override // y1.i.a
        public i.a k(long j7) {
            this.f27576e = Long.valueOf(j7);
            return this;
        }
    }

    @Override // y1.i
    protected Map c() {
        return this.f27571f;
    }

    @Override // y1.i
    public Integer d() {
        return this.f27567b;
    }

    @Override // y1.i
    public h e() {
        return this.f27568c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f27566a.equals(iVar.j()) && ((num = this.f27567b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f27568c.equals(iVar.e()) && this.f27569d == iVar.f() && this.f27570e == iVar.k() && this.f27571f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // y1.i
    public long f() {
        return this.f27569d;
    }

    public int hashCode() {
        int hashCode = (this.f27566a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f27567b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f27568c.hashCode()) * 1000003;
        long j7 = this.f27569d;
        int i7 = (hashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f27570e;
        return ((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f27571f.hashCode();
    }

    @Override // y1.i
    public String j() {
        return this.f27566a;
    }

    @Override // y1.i
    public long k() {
        return this.f27570e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f27566a + ", code=" + this.f27567b + ", encodedPayload=" + this.f27568c + ", eventMillis=" + this.f27569d + ", uptimeMillis=" + this.f27570e + ", autoMetadata=" + this.f27571f + "}";
    }

    private b(String str, Integer num, h hVar, long j7, long j8, Map map) {
        this.f27566a = str;
        this.f27567b = num;
        this.f27568c = hVar;
        this.f27569d = j7;
        this.f27570e = j8;
        this.f27571f = map;
    }
}
