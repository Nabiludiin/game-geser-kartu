package d1;

import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class o {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f23073c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f23074a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23075b;

    /* compiled from: MyApplication */
    public static class a extends o {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    /* compiled from: MyApplication */
    public static class b extends o {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    o(String str, String str2) {
        this.f23074a = str;
        this.f23075b = str2;
        f23073c.add(this);
    }
}
