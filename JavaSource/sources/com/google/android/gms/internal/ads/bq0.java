package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: MyApplication */
final class bq0 extends ud3 implements g64 {

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f5902u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicReference f5903v = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final SSLSocketFactory f5904e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5905f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5906g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5907h;

    /* renamed from: i, reason: collision with root package name */
    private final t44 f5908i;

    /* renamed from: j, reason: collision with root package name */
    private cq3 f5909j;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f5910k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f5911l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5912m;

    /* renamed from: n, reason: collision with root package name */
    private int f5913n;

    /* renamed from: o, reason: collision with root package name */
    private long f5914o;

    /* renamed from: p, reason: collision with root package name */
    private long f5915p;

    /* renamed from: q, reason: collision with root package name */
    private long f5916q;

    /* renamed from: r, reason: collision with root package name */
    private long f5917r;

    /* renamed from: s, reason: collision with root package name */
    private int f5918s;

    /* renamed from: t, reason: collision with root package name */
    private final Set f5919t;

    bq0(String str, kb4 kb4Var, int i7, int i8, int i9) {
        super(true);
        this.f5904e = new aq0(this);
        this.f5919t = new HashSet();
        e61.a(str);
        this.f5907h = str;
        this.f5908i = new t44();
        this.f5905f = i7;
        this.f5906g = i8;
        this.f5918s = i9;
        if (kb4Var != null) {
            a(kb4Var);
        }
    }

    private final void m() {
        HttpURLConnection httpURLConnection = this.f5910k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("Unexpected error while disconnecting", e8);
            }
            this.f5910k = null;
        }
    }

    final void P(int i7) {
        this.f5918s = i7;
        for (Socket socket : this.f5919t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f5918s);
                } catch (SocketException e8) {
                    int i8 = v2.n1.f26802b;
                    w2.p.g("Failed to update receive buffer size.", e8);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0127, code lost:
    
        if (r2 == r16) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028f A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:9:0x0047, B:10:0x005f, B:12:0x0065, B:19:0x0092, B:21:0x00b2, B:22:0x00d1, B:23:0x00d6, B:25:0x00df, B:26:0x00e6, B:39:0x010f, B:100:0x0282, B:102:0x028f, B:104:0x02a0, B:110:0x02a9, B:111:0x02b6, B:114:0x02c0, B:115:0x02c7, B:118:0x02c8, B:119:0x02e5), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:9:0x0047, B:10:0x005f, B:12:0x0065, B:19:0x0092, B:21:0x00b2, B:22:0x00d1, B:23:0x00d6, B:25:0x00df, B:26:0x00e6, B:39:0x010f, B:100:0x0282, B:102:0x028f, B:104:0x02a0, B:110:0x02a9, B:111:0x02b6, B:114:0x02c0, B:115:0x02c7, B:118:0x02c8, B:119:0x02e5), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0214  */
    @Override // com.google.android.gms.internal.ads.yl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.google.android.gms.internal.ads.cq3 r25) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bq0.b(com.google.android.gms.internal.ads.cq3):long");
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.f5910k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        try {
            InputStream inputStream = this.f5911l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new s14(e8, this.f5909j, 2000, 3);
                }
            }
        } finally {
            this.f5911l = null;
            m();
            if (this.f5912m) {
                this.f5912m = false;
                g();
            }
            this.f5919t.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.ud3, com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public final Map i() {
        HttpURLConnection httpURLConnection = this.f5910k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final /* synthetic */ void j(Socket socket) {
        this.f5919t.add(socket);
    }

    final /* synthetic */ int l() {
        return this.f5918s;
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        try {
            if (this.f5916q != this.f5914o) {
                AtomicReference atomicReference = f5903v;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j7 = this.f5916q;
                    long j8 = this.f5914o;
                    if (j7 == j8) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.f5911l.read(bArr2, 0, (int) Math.min(j8 - j7, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f5916q += read;
                    f(read);
                }
            }
            if (i8 == 0) {
                return 0;
            }
            long j9 = this.f5915p;
            if (j9 != -1) {
                long j10 = j9 - this.f5917r;
                if (j10 == 0) {
                    return -1;
                }
                i8 = (int) Math.min(i8, j10);
            }
            int read2 = this.f5911l.read(bArr, i7, i8);
            if (read2 == -1) {
                if (this.f5915p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f5917r += read2;
            f(read2);
            return read2;
        } catch (IOException e8) {
            throw new s14(e8, this.f5909j, 2000, 2);
        }
    }
}
