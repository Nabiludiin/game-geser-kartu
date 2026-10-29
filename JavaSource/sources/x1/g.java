package x1;

import java.util.List;
import x1.m;

/* compiled from: MyApplication */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f27290a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27291b;

    /* renamed from: c, reason: collision with root package name */
    private final k f27292c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f27293d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27294e;

    /* renamed from: f, reason: collision with root package name */
    private final List f27295f;

    /* renamed from: g, reason: collision with root package name */
    private final p f27296g;

    /* compiled from: MyApplication */
    static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f27297a;

        /* renamed from: b, reason: collision with root package name */
        private Long f27298b;

        /* renamed from: c, reason: collision with root package name */
        private k f27299c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f27300d;

        /* renamed from: e, reason: collision with root package name */
        private String f27301e;

        /* renamed from: f, reason: collision with root package name */
        private List f27302f;

        /* renamed from: g, reason: collision with root package name */
        private p f27303g;

        b() {
        }

        @Override // x1.m.a
        public m a() {
            String str = "";
            if (this.f27297a == null) {
                str = " requestTimeMs";
            }
            if (this.f27298b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f27297a.longValue(), this.f27298b.longValue(), this.f27299c, this.f27300d, this.f27301e, this.f27302f, this.f27303g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x1.m.a
        public m.a b(k kVar) {
            this.f27299c = kVar;
            return this;
        }

        @Override // x1.m.a
        public m.a c(List list) {
            this.f27302f = list;
            return this;
        }

        @Override // x1.m.a
        m.a d(Integer num) {
            this.f27300d = num;
            return this;
        }

        @Override // x1.m.a
        m.a e(String str) {
            this.f27301e = str;
            return this;
        }

        @Override // x1.m.a
        public m.a f(p pVar) {
            this.f27303g = pVar;
            return this;
        }

        @Override // x1.m.a
        public m.a g(long j7) {
            this.f27297a = Long.valueOf(j7);
            return this;
        }

        @Override // x1.m.a
        public m.a h(long j7) {
            this.f27298b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // x1.m
    public k b() {
        return this.f27292c;
    }

    @Override // x1.m
    public List c() {
        return this.f27295f;
    }

    @Override // x1.m
    public Integer d() {
        return this.f27293d;
    }

    @Override // x1.m
    public String e() {
        return this.f27294e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f27290a == mVar.g() && this.f27291b == mVar.h() && ((kVar = this.f27292c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f27293d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f27294e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f27295f) != null ? list.equals(mVar.c()) : mVar.c() == null) && ((pVar = this.f27296g) != null ? pVar.equals(mVar.f()) : mVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // x1.m
    public p f() {
        return this.f27296g;
    }

    @Override // x1.m
    public long g() {
        return this.f27290a;
    }

    @Override // x1.m
    public long h() {
        return this.f27291b;
    }

    public int hashCode() {
        long j7 = this.f27290a;
        long j8 = this.f27291b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        k kVar = this.f27292c;
        int hashCode = (i7 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f27293d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f27294e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f27295f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f27296g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f27290a + ", requestUptimeMs=" + this.f27291b + ", clientInfo=" + this.f27292c + ", logSource=" + this.f27293d + ", logSourceName=" + this.f27294e + ", logEvents=" + this.f27295f + ", qosTier=" + this.f27296g + "}";
    }

    private g(long j7, long j8, k kVar, Integer num, String str, List list, p pVar) {
        this.f27290a = j7;
        this.f27291b = j8;
        this.f27292c = kVar;
        this.f27293d = num;
        this.f27294e = str;
        this.f27295f = list;
        this.f27296g = pVar;
    }
}
