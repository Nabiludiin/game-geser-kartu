package l5;

import l5.d;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f24633a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f24634b = d.a.DEFAULT;

    /* compiled from: MyApplication */
    /* renamed from: l5.a$a, reason: collision with other inner class name */
    private static final class C0109a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f24635a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f24636b;

        C0109a(int i7, d.a aVar) {
            this.f24635a = i7;
            this.f24636b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f24635a == dVar.tag() && this.f24636b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f24635a) + (this.f24636b.hashCode() ^ 2041407134);
        }

        @Override // l5.d
        public d.a intEncoding() {
            return this.f24636b;
        }

        @Override // l5.d
        public int tag() {
            return this.f24635a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f24635a + "intEncoding=" + this.f24636b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0109a(this.f24633a, this.f24634b);
    }

    public a c(int i7) {
        this.f24633a = i7;
        return this;
    }
}
