package c1;

import java.util.Objects;

/* compiled from: MyApplication */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final f[] f3479a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3480b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f3481c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3482d;

    public e(String str, f[] fVarArr) {
        this.f3480b = str;
        this.f3481c = null;
        this.f3479a = fVarArr;
        this.f3482d = 0;
    }

    private void a(int i7) {
        if (i7 == this.f3482d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f3482d) + " expected, but got " + c(i7));
    }

    private String c(int i7) {
        return i7 != 0 ? i7 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public String b() {
        a(0);
        return this.f3480b;
    }

    public e(byte[] bArr, f[] fVarArr) {
        Objects.requireNonNull(bArr);
        this.f3481c = bArr;
        this.f3480b = null;
        this.f3479a = fVarArr;
        this.f3482d = 1;
    }
}
