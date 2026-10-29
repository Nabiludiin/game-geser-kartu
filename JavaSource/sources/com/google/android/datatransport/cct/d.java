package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import x1.j;
import x1.k;
import x1.l;
import x1.m;
import x1.n;
import x1.o;
import x1.p;
import y1.h;
import y1.i;
import z1.f;
import z1.g;
import z1.m;

/* compiled from: MyApplication */
final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final i5.a f4323a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f4324b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4325c;

    /* renamed from: d, reason: collision with root package name */
    final URL f4326d;

    /* renamed from: e, reason: collision with root package name */
    private final i2.a f4327e;

    /* renamed from: f, reason: collision with root package name */
    private final i2.a f4328f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4329g;

    /* compiled from: MyApplication */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f4330a;

        /* renamed from: b, reason: collision with root package name */
        final j f4331b;

        /* renamed from: c, reason: collision with root package name */
        final String f4332c;

        a(URL url, j jVar, String str) {
            this.f4330a = url;
            this.f4331b = jVar;
            this.f4332c = str;
        }

        a a(URL url) {
            return new a(url, this.f4331b, this.f4332c);
        }
    }

    /* compiled from: MyApplication */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f4333a;

        /* renamed from: b, reason: collision with root package name */
        final URL f4334b;

        /* renamed from: c, reason: collision with root package name */
        final long f4335c;

        b(int i7, URL url, long j7) {
            this.f4333a = i7;
            this.f4334b = url;
            this.f4335c = j7;
        }
    }

    d(Context context, i2.a aVar, i2.a aVar2, int i7) {
        this.f4323a = j.b();
        this.f4325c = context;
        this.f4324b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4326d = m(com.google.android.datatransport.cct.a.f4314c);
        this.f4327e = aVar2;
        this.f4328f = aVar;
        this.f4329g = i7;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f4334b;
        if (url == null) {
            return null;
        }
        c2.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f4334b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) {
        c2.a.f("CctTransportBackend", "Making request to: %s", aVar.f4330a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f4330a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f4329g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f4332c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f4323a.a(aVar.f4331b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    c2.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    c2.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    c2.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream l7 = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(l7))).c());
                            if (l7 != null) {
                                l7.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (i5.b e8) {
            e = e8;
            c2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e9) {
            e = e9;
            c2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            c2.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            c2.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.d();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.d();
        }
        if (o.b.c(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.d() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            c2.a.d("CctTransportBackend", "Unable to find version code for package", e8);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a j7;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j8 = iVar.j();
            if (hashMap.containsKey(j8)) {
                ((List) hashMap.get(j8)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j8, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b8 = x1.m.a().f(p.DEFAULT).g(this.f4328f.a()).h(this.f4327e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(x1.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b8.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b8.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e8 = iVar3.e();
                w1.b b9 = e8.b();
                if (b9.equals(w1.b.b("proto"))) {
                    j7 = l.j(e8.a());
                } else if (b9.equals(w1.b.b("json"))) {
                    j7 = l.i(new String(e8.a(), Charset.forName("UTF-8")));
                } else {
                    c2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b9);
                }
                j7.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.c(iVar3.g("net-type"))).b(o.b.c(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j7.b(iVar3.d());
                }
                arrayList3.add(j7.a());
            }
            b8.c(arrayList3);
            arrayList2.add(b8.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException("Invalid url: " + str, e8);
        }
    }

    @Override // z1.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f4324b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f4325c).getSimOperator()).c("application_build", Integer.toString(h(this.f4325c))).d();
    }

    @Override // z1.m
    public g b(f fVar) {
        j i7 = i(fVar);
        URL url = this.f4326d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a c8 = com.google.android.datatransport.cct.a.c(fVar.c());
                r3 = c8.d() != null ? c8.d() : null;
                if (c8.e() != null) {
                    url = m(c8.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) d2.b.a(5, new a(url, i7, r3), new d2.a() { // from class: com.google.android.datatransport.cct.b
                @Override // d2.a
                public final Object apply(Object obj) {
                    d.b e8;
                    e8 = d.this.e((d.a) obj);
                    return e8;
                }
            }, new d2.c() { // from class: com.google.android.datatransport.cct.c
                @Override // d2.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i8 = bVar.f4333a;
            if (i8 == 200) {
                return g.e(bVar.f4335c);
            }
            if (i8 < 500 && i8 != 404) {
                return i8 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e8) {
            c2.a.d("CctTransportBackend", "Could not make request to the backend", e8);
            return g.f();
        }
    }

    d(Context context, i2.a aVar, i2.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
