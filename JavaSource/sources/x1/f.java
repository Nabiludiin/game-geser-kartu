package x1;

import java.util.Arrays;
import x1.l;

/* compiled from: MyApplication */
final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f27276a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f27277b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27278c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f27279d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27280e;

    /* renamed from: f, reason: collision with root package name */
    private final long f27281f;

    /* renamed from: g, reason: collision with root package name */
    private final o f27282g;

    /* compiled from: MyApplication */
    static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f27283a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f27284b;

        /* renamed from: c, reason: collision with root package name */
        private Long f27285c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f27286d;

        /* renamed from: e, reason: collision with root package name */
        private String f27287e;

        /* renamed from: f, reason: collision with root package name */
        private Long f27288f;

        /* renamed from: g, reason: collision with root package name */
        private o f27289g;

        b() {
        }

        @Override // x1.l.a
        public l a() {
            String str = "";
            if (this.f27283a == null) {
                str = " eventTimeMs";
            }
            if (this.f27285c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f27288f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f27283a.longValue(), this.f27284b, this.f27285c.longValue(), this.f27286d, this.f27287e, this.f27288f.longValue(), this.f27289g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x1.l.a
        public l.a b(Integer num) {
            this.f27284b = num;
            return this;
        }

        @Override // x1.l.a
        public l.a c(long j7) {
            this.f27283a = Long.valueOf(j7);
            return this;
        }

        @Override // x1.l.a
        public l.a d(long j7) {
            this.f27285c = Long.valueOf(j7);
            return this;
        }

        @Override // x1.l.a
        public l.a e(o oVar) {
            this.f27289g = oVar;
            return this;
        }

        @Override // x1.l.a
        l.a f(byte[] bArr) {
            this.f27286d = bArr;
            return this;
        }

        @Override // x1.l.a
        l.a g(String str) {
            this.f27287e = str;
            return this;
        }

        @Override // x1.l.a
        public l.a h(long j7) {
            this.f27288f = Long.valueOf(j7);
            return this;
        }
    }

    @Override // x1.l
    public Integer b() {
        return this.f27277b;
    }

    @Override // x1.l
    public long c() {
        return this.f27276a;
    }

    @Override // x1.l
    public long d() {
        return this.f27278c;
    }

    @Override // x1.l
    public o e() {
        return this.f27282g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f27276a == lVar.c() && ((num = this.f27277b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f27278c == lVar.d()) {
                if (Arrays.equals(this.f27279d, lVar instanceof f ? ((f) lVar).f27279d : lVar.f()) && ((str = this.f27280e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f27281f == lVar.h() && ((oVar = this.f27282g) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x1.l
    public byte[] f() {
        return this.f27279d;
    }

    @Override // x1.l
    public String g() {
        return this.f27280e;
    }

    @Override // x1.l
    public long h() {
        return this.f27281f;
    }

    public int hashCode() {
        long j7 = this.f27276a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f27277b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j8 = this.f27278c;
        int hashCode2 = (((((i7 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f27279d)) * 1000003;
        String str = this.f27280e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j9 = this.f27281f;
        int i8 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        o oVar = this.f27282g;
        return i8 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f27276a + ", eventCode=" + this.f27277b + ", eventUptimeMs=" + this.f27278c + ", sourceExtension=" + Arrays.toString(this.f27279d) + ", sourceExtensionJsonProto3=" + this.f27280e + ", timezoneOffsetSeconds=" + this.f27281f + ", networkConnectionInfo=" + this.f27282g + "}";
    }

    private f(long j7, Integer num, long j8, byte[] bArr, String str, long j9, o oVar) {
        this.f27276a = j7;
        this.f27277b = num;
        this.f27278c = j8;
        this.f27279d = bArr;
        this.f27280e = str;
        this.f27281f = j9;
        this.f27282g = oVar;
    }
}
