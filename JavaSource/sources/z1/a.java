package z1;

import java.util.Arrays;
import z1.f;

/* compiled from: MyApplication */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f27813a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27814b;

    /* compiled from: MyApplication */
    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f27815a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f27816b;

        b() {
        }

        @Override // z1.f.a
        public f a() {
            String str = "";
            if (this.f27815a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f27815a, this.f27816b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z1.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f27815a = iterable;
            return this;
        }

        @Override // z1.f.a
        public f.a c(byte[] bArr) {
            this.f27816b = bArr;
            return this;
        }
    }

    @Override // z1.f
    public Iterable b() {
        return this.f27813a;
    }

    @Override // z1.f
    public byte[] c() {
        return this.f27814b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f27813a.equals(fVar.b())) {
                if (Arrays.equals(this.f27814b, fVar instanceof a ? ((a) fVar).f27814b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f27813a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27814b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f27813a + ", extras=" + Arrays.toString(this.f27814b) + "}";
    }

    private a(Iterable iterable, byte[] bArr) {
        this.f27813a = iterable;
        this.f27814b = bArr;
    }
}
