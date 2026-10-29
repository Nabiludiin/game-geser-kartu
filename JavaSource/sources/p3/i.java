package p3;

import android.util.Log;

/* compiled from: MyApplication */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f25205a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25206b;

    public i(String str) {
        this(str, null);
    }

    private final String e(String str) {
        String str2 = this.f25206b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i7) {
        return Log.isLoggable(this.f25205a, i7);
    }

    public void b(String str, String str2) {
        if (a(6)) {
            Log.e(str, e(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(5)) {
            Log.w(str, e(str2));
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(5)) {
            Log.w(str, e(str2), th);
        }
    }

    public i(String str, String str2) {
        o.n(str, "log tag cannot be null");
        o.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f25205a = str;
        this.f25206b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
