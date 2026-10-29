package y1;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final w1.b f27605a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27606b;

    public h(w1.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f27605a = bVar;
        this.f27606b = bArr;
    }

    public byte[] a() {
        return this.f27606b;
    }

    public w1.b b() {
        return this.f27605a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f27605a.equals(hVar.f27605a)) {
            return Arrays.equals(this.f27606b, hVar.f27606b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f27605a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27606b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f27605a + ", bytes=[...]}";
    }
}
