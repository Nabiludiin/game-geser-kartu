package y1;

import java.util.Arrays;
import y1.o;

/* compiled from: MyApplication */
final class d extends o {

    /* renamed from: a, reason: collision with root package name */
    private final String f27588a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27589b;

    /* renamed from: c, reason: collision with root package name */
    private final w1.d f27590c;

    /* compiled from: MyApplication */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private String f27591a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f27592b;

        /* renamed from: c, reason: collision with root package name */
        private w1.d f27593c;

        b() {
        }

        @Override // y1.o.a
        public o a() {
            String str = "";
            if (this.f27591a == null) {
                str = " backendName";
            }
            if (this.f27593c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f27591a, this.f27592b, this.f27593c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // y1.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f27591a = str;
            return this;
        }

        @Override // y1.o.a
        public o.a c(byte[] bArr) {
            this.f27592b = bArr;
            return this;
        }

        @Override // y1.o.a
        public o.a d(w1.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f27593c = dVar;
            return this;
        }
    }

    @Override // y1.o
    public String b() {
        return this.f27588a;
    }

    @Override // y1.o
    public byte[] c() {
        return this.f27589b;
    }

    @Override // y1.o
    public w1.d d() {
        return this.f27590c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f27588a.equals(oVar.b())) {
                if (Arrays.equals(this.f27589b, oVar instanceof d ? ((d) oVar).f27589b : oVar.c()) && this.f27590c.equals(oVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f27588a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27589b)) * 1000003) ^ this.f27590c.hashCode();
    }

    private d(String str, byte[] bArr, w1.d dVar) {
        this.f27588a = str;
        this.f27589b = bArr;
        this.f27590c = dVar;
    }
}
