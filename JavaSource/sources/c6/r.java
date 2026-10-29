package c6;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import c6.j;
import c6.t;
import c6.y;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MyApplication */
class r extends y {

    /* renamed from: a, reason: collision with root package name */
    private final j f3664a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f3665b;

    /* compiled from: MyApplication */
    static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public r(j jVar, a0 a0Var) {
        this.f3664a = jVar;
        this.f3665b = a0Var;
    }

    @Override // c6.y
    public boolean c(w wVar) {
        String scheme = wVar.f3719d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // c6.y
    int e() {
        return 2;
    }

    @Override // c6.y
    public y.a f(w wVar, int i7) {
        j.a a8 = this.f3664a.a(wVar.f3719d, wVar.f3718c);
        if (a8 == null) {
            return null;
        }
        t.e eVar = a8.f3631c ? t.e.DISK : t.e.NETWORK;
        Bitmap a9 = a8.a();
        if (a9 != null) {
            return new y.a(a9, eVar);
        }
        InputStream c8 = a8.c();
        if (c8 == null) {
            return null;
        }
        if (eVar == t.e.DISK && a8.b() == 0) {
            e0.e(c8);
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == t.e.NETWORK && a8.b() > 0) {
            this.f3665b.f(a8.b());
        }
        return new y.a(c8, eVar);
    }

    @Override // c6.y
    boolean h(boolean z7, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // c6.y
    boolean i() {
        return true;
    }
}
