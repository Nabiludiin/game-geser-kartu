package androidx.privacysandbox.ads.adservices.topics;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f2572a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2573b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f2574c;

    public a(byte[] bArr, String str, byte[] bArr2) {
        q6.i.e(bArr, "encryptedTopic");
        q6.i.e(str, "keyIdentifier");
        q6.i.e(bArr2, "encapsulatedKey");
        this.f2572a = bArr;
        this.f2573b = str;
        this.f2574c = bArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f2572a, aVar.f2572a) && this.f2573b.contentEquals(aVar.f2573b) && Arrays.equals(this.f2574c, aVar.f2574c);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f2572a)), this.f2573b, Integer.valueOf(Arrays.hashCode(this.f2574c)));
    }

    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + w6.e.l(this.f2572a) + ", KeyIdentifier=" + this.f2573b + ", EncapsulatedKey=" + w6.e.l(this.f2574c) + " }");
    }
}
