package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* compiled from: MyApplication */
public final class nx3 extends ud3 implements g64 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13093e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13094f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13095g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13096h;

    /* renamed from: i, reason: collision with root package name */
    private final t44 f13097i;

    /* renamed from: j, reason: collision with root package name */
    private final t44 f13098j;

    /* renamed from: k, reason: collision with root package name */
    private cq3 f13099k;

    /* renamed from: l, reason: collision with root package name */
    private HttpURLConnection f13100l;

    /* renamed from: m, reason: collision with root package name */
    private InputStream f13101m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13102n;

    /* renamed from: o, reason: collision with root package name */
    private int f13103o;

    /* renamed from: p, reason: collision with root package name */
    private long f13104p;

    /* renamed from: q, reason: collision with root package name */
    private long f13105q;

    /* synthetic */ nx3(String str, int i7, int i8, boolean z7, boolean z8, t44 t44Var, sx3 sx3Var, boolean z9, byte[] bArr) {
        super(true);
        this.f13096h = str;
        this.f13094f = i7;
        this.f13095g = i8;
        this.f13093e = z7;
        this.f13097i = t44Var;
        this.f13098j = new t44();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection j(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.f13094f
            r3.setConnectTimeout(r4)
            int r4 = r2.f13095g
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.t44 r5 = r2.f13097i
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.t44 r5 = r2.f13098j
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r4 = r2.f13096h
            if (r4 == 0) goto L8c
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8c:
            r4 = 1
            if (r4 == r10) goto L92
            java.lang.String r4 = "identity"
            goto L94
        L92:
            java.lang.String r4 = "gzip"
        L94:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.cq3.f6570h
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nx3.j(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL l(URL url, String str, cq3 cq3Var) {
        if (str == null) {
            throw new s14("Null location redirect", cq3Var, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new s14("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), cq3Var, 2001, 1);
            }
            if (this.f13093e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new s14(sb.toString(), cq3Var, 2001, 1);
        } catch (MalformedURLException e8) {
            throw new s14(e8, cq3Var, 2001, 1);
        }
    }

    private final void m() {
        HttpURLConnection httpURLConnection = this.f13100l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                gv1.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        if (r0 == r18) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.yl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.google.android.gms.internal.ads.cq3 r23) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nx3.b(com.google.android.gms.internal.ads.cq3):long");
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.f13100l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        cq3 cq3Var = this.f13099k;
        if (cq3Var != null) {
            return cq3Var.f6571a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        try {
            InputStream inputStream = this.f13101m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    cq3 cq3Var = this.f13099k;
                    String str = hi2.f9535a;
                    throw new s14(e8, cq3Var, 2000, 3);
                }
            }
        } finally {
            this.f13101m = null;
            m();
            if (this.f13102n) {
                this.f13102n = false;
                g();
            }
            this.f13100l = null;
            this.f13099k = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ud3, com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public final Map i() {
        HttpURLConnection httpURLConnection = this.f13100l;
        return httpURLConnection == null ? z04.a() : new lw3(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j7 = this.f13104p;
            if (j7 != -1) {
                long j8 = j7 - this.f13105q;
                if (j8 == 0) {
                    return -1;
                }
                i8 = (int) Math.min(i8, j8);
            }
            InputStream inputStream = this.f13101m;
            String str = hi2.f9535a;
            int read = inputStream.read(bArr, i7, i8);
            if (read == -1) {
                return -1;
            }
            this.f13105q += read;
            f(read);
            return read;
        } catch (IOException e8) {
            cq3 cq3Var = this.f13099k;
            String str2 = hi2.f9535a;
            throw s14.a(e8, cq3Var, 2);
        }
    }
}
