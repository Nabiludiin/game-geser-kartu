package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* compiled from: MyApplication */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f1777a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1778b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1779c;

    /* renamed from: d, reason: collision with root package name */
    private final List f1780d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1781e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f1782f;

    public e(String str, String str2, String str3, List list) {
        this.f1777a = (String) androidx.core.util.e.f(str);
        this.f1778b = (String) androidx.core.util.e.f(str2);
        this.f1779c = (String) androidx.core.util.e.f(str3);
        this.f1780d = (List) androidx.core.util.e.f(list);
        this.f1782f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f1780d;
    }

    public int c() {
        return this.f1781e;
    }

    String d() {
        return this.f1782f;
    }

    public String e() {
        return this.f1777a;
    }

    public String f() {
        return this.f1778b;
    }

    public String g() {
        return this.f1779c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1777a + ", mProviderPackage: " + this.f1778b + ", mQuery: " + this.f1779c + ", mCertificates:");
        for (int i7 = 0; i7 < this.f1780d.size(); i7++) {
            sb.append(" [");
            List list = (List) this.f1780d.get(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1781e);
        return sb.toString();
    }
}
