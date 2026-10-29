package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;

/* compiled from: MyApplication */
public final class kf3 extends df3 {

    /* renamed from: q, reason: collision with root package name */
    private jy3 f11004q;

    /* renamed from: r, reason: collision with root package name */
    private jy3 f11005r;

    /* renamed from: s, reason: collision with root package name */
    private ff3 f11006s;

    /* renamed from: t, reason: collision with root package name */
    private HttpURLConnection f11007t;

    kf3(jy3 jy3Var, jy3 jy3Var2, ff3 ff3Var) {
        this.f11004q = jy3Var;
        this.f11005r = jy3Var2;
        this.f11006s = ff3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer c() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer e() {
        return -1;
    }

    public static void h(HttpURLConnection httpURLConnection) {
        ef3.b();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h(this.f11007t);
    }

    public HttpURLConnection g(ff3 ff3Var, final int i7, final int i8) {
        this.f11004q = new jy3() { // from class: com.google.android.gms.internal.ads.hf3
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                Integer valueOf;
                valueOf = Integer.valueOf(i7);
                return valueOf;
            }
        };
        this.f11005r = new jy3() { // from class: com.google.android.gms.internal.ads.if3
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                Integer valueOf;
                valueOf = Integer.valueOf(i8);
                return valueOf;
            }
        };
        this.f11006s = ff3Var;
        return j();
    }

    public HttpURLConnection j() {
        ef3.a(((Integer) this.f11004q.a()).intValue(), ((Integer) this.f11005r.a()).intValue());
        ff3 ff3Var = this.f11006s;
        ff3Var.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) ff3Var.a();
        this.f11007t = httpURLConnection;
        return httpURLConnection;
    }

    kf3() {
        this(jf3.f10532q, gf3.f8882q, null);
    }
}
