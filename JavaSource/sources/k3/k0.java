package k3;

import android.util.Log;

/* compiled from: MyApplication */
class k0 {

    /* renamed from: e, reason: collision with root package name */
    private static final k0 f24508e = new k0(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f24509a;

    /* renamed from: b, reason: collision with root package name */
    final String f24510b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f24511c;

    /* renamed from: d, reason: collision with root package name */
    final int f24512d;

    private k0(boolean z7, int i7, int i8, String str, Throwable th) {
        this.f24509a = z7;
        this.f24512d = i7;
        this.f24510b = str;
        this.f24511c = th;
    }

    static k0 b() {
        return f24508e;
    }

    static k0 c(String str) {
        return new k0(false, 1, 5, str, null);
    }

    static k0 d(String str, Throwable th) {
        return new k0(false, 1, 5, str, th);
    }

    static k0 f(int i7) {
        return new k0(true, i7, 1, null, null);
    }

    static k0 g(int i7, int i8, String str, Throwable th) {
        return new k0(false, i7, i8, str, th);
    }

    String a() {
        return this.f24510b;
    }

    final void e() {
        if (this.f24509a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f24511c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f24511c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
