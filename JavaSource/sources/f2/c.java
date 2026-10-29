package f2;

import f2.f;
import java.util.Set;

/* compiled from: MyApplication */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f23643a;

    /* renamed from: b, reason: collision with root package name */
    private final long f23644b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f23645c;

    /* compiled from: MyApplication */
    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f23646a;

        /* renamed from: b, reason: collision with root package name */
        private Long f23647b;

        /* renamed from: c, reason: collision with root package name */
        private Set f23648c;

        b() {
        }

        @Override // f2.f.b.a
        public f.b a() {
            String str = "";
            if (this.f23646a == null) {
                str = " delta";
            }
            if (this.f23647b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f23648c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f23646a.longValue(), this.f23647b.longValue(), this.f23648c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f2.f.b.a
        public f.b.a b(long j7) {
            this.f23646a = Long.valueOf(j7);
            return this;
        }

        @Override // f2.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f23648c = set;
            return this;
        }

        @Override // f2.f.b.a
        public f.b.a d(long j7) {
            this.f23647b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // f2.f.b
    long b() {
        return this.f23643a;
    }

    @Override // f2.f.b
    Set c() {
        return this.f23645c;
    }

    @Override // f2.f.b
    long d() {
        return this.f23644b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f23643a == bVar.b() && this.f23644b == bVar.d() && this.f23645c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f23643a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        long j8 = this.f23644b;
        return ((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f23645c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f23643a + ", maxAllowedDelay=" + this.f23644b + ", flags=" + this.f23645c + "}";
    }

    private c(long j7, long j8, Set set) {
        this.f23643a = j7;
        this.f23644b = j8;
        this.f23645c = set;
    }
}
