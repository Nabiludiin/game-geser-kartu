package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
final class xq0 extends ud3 implements g64 {

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f18931v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e, reason: collision with root package name */
    private final int f18932e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18933f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18934g;

    /* renamed from: h, reason: collision with root package name */
    private final t44 f18935h;

    /* renamed from: i, reason: collision with root package name */
    private cq3 f18936i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f18937j;

    /* renamed from: k, reason: collision with root package name */
    private final Queue f18938k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f18939l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18940m;

    /* renamed from: n, reason: collision with root package name */
    private int f18941n;

    /* renamed from: o, reason: collision with root package name */
    private long f18942o;

    /* renamed from: p, reason: collision with root package name */
    private long f18943p;

    /* renamed from: q, reason: collision with root package name */
    private long f18944q;

    /* renamed from: r, reason: collision with root package name */
    private long f18945r;

    /* renamed from: s, reason: collision with root package name */
    private long f18946s;

    /* renamed from: t, reason: collision with root package name */
    private final long f18947t;

    /* renamed from: u, reason: collision with root package name */
    private final long f18948u;

    xq0(String str, kb4 kb4Var, int i7, int i8, long j7, long j8) {
        super(true);
        e61.a(str);
        this.f18934g = str;
        this.f18935h = new t44();
        this.f18932e = i7;
        this.f18933f = i8;
        this.f18938k = new ArrayDeque();
        this.f18947t = j7;
        this.f18948u = j8;
        if (kb4Var != null) {
            a(kb4Var);
        }
    }

    private final void k() {
        while (true) {
            Queue queue = this.f18938k;
            if (queue.isEmpty()) {
                this.f18937j = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("Unexpected error while disconnecting", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        this.f18936i = cq3Var;
        this.f18943p = 0L;
        long j7 = cq3Var.f6575e;
        long j8 = cq3Var.f6576f;
        long min = j8 == -1 ? this.f18947t : Math.min(this.f18947t, j8);
        this.f18944q = j7;
        HttpURLConnection j9 = j(j7, (min + j7) - 1, 1);
        this.f18937j = j9;
        String headerField = j9.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f18931v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j10 = cq3Var.f6576f;
                    if (j10 != -1) {
                        this.f18942o = j10;
                        this.f18945r = Math.max(parseLong, (this.f18944q + j10) - 1);
                    } else {
                        this.f18942o = parseLong2 - this.f18944q;
                        this.f18945r = parseLong2 - 1;
                    }
                    this.f18946s = parseLong;
                    this.f18940m = true;
                    e(cq3Var);
                    return this.f18942o;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append("]");
                    String sb2 = sb.toString();
                    int i7 = v2.n1.f26802b;
                    w2.p.c(sb2);
                }
            }
        }
        throw new vq0(headerField, cq3Var);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.f18937j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        try {
            InputStream inputStream = this.f18939l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new s14(e8, this.f18936i, 2000, 3);
                }
            }
        } finally {
            this.f18939l = null;
            k();
            if (this.f18940m) {
                this.f18940m = false;
                g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ud3, com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public final Map i() {
        HttpURLConnection httpURLConnection = this.f18937j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection j(long j7, long j8, int i7) {
        int i8;
        IOException iOException;
        String uri = this.f18936i.f6571a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f18932e);
            httpURLConnection.setReadTimeout(this.f18933f);
            for (Map.Entry entry : this.f18935h.a().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e8) {
                    iOException = e8;
                    i8 = i7;
                    String valueOf = String.valueOf(uri);
                    throw new s14("Unable to connect to ".concat(valueOf), iOException, this.f18936i, 2000, i8);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 7 + String.valueOf(j8).length());
            sb.append("bytes=");
            sb.append(j7);
            sb.append("-");
            sb.append(j8);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.f18934g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f18938k.add(httpURLConnection);
            String uri2 = this.f18936i.f6571a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f18941n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    k();
                    throw new wq0(this.f18941n, headerFields, this.f18936i, i7);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f18939l != null) {
                        inputStream = new SequenceInputStream(this.f18939l, inputStream);
                    }
                    this.f18939l = inputStream;
                    return httpURLConnection;
                } catch (IOException e9) {
                    k();
                    throw new s14(e9, this.f18936i, 2000, i7);
                }
            } catch (IOException e10) {
                k();
                String valueOf2 = String.valueOf(uri2);
                throw new s14("Unable to connect to ".concat(valueOf2), e10, this.f18936i, 2000, i7);
            }
        } catch (IOException e11) {
            i8 = i7;
            iOException = e11;
        }
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j7 = this.f18942o;
            long j8 = this.f18943p;
            if (j7 - j8 == 0) {
                return -1;
            }
            long j9 = this.f18944q + j8;
            long j10 = i8;
            long j11 = j9 + j10 + this.f18948u;
            long j12 = this.f18946s;
            long j13 = j12 + 1;
            if (j11 > j13) {
                long j14 = this.f18945r;
                if (j12 < j14) {
                    long min = Math.min(j14, Math.max(((this.f18947t + j13) - r4) - 1, (j13 + j10) - 1));
                    j(j13, min, 2);
                    this.f18946s = min;
                    j12 = min;
                }
            }
            int read = this.f18939l.read(bArr, i7, (int) Math.min(j10, ((j12 + 1) - this.f18944q) - this.f18943p));
            if (read == -1) {
                throw new EOFException();
            }
            this.f18943p += read;
            f(read);
            return read;
        } catch (IOException e8) {
            throw new s14(e8, this.f18936i, 2000, 2);
        }
    }
}
