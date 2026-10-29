package c6;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import c6.j;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: MyApplication */
public class d0 implements j {

    /* renamed from: b, reason: collision with root package name */
    static volatile Object f3599b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3600c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f3601d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f3602a;

    /* compiled from: MyApplication */
    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    /* compiled from: MyApplication */
    private static class b {
        static Object a(Context context) {
            File f8 = e0.f(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(f8, e0.a(f8)) : installed;
        }
    }

    public d0(Context context) {
        this.f3602a = context.getApplicationContext();
    }

    private static void b(Context context) {
        if (f3599b == null) {
            try {
                synchronized (f3600c) {
                    try {
                        if (f3599b == null) {
                            f3599b = b.a(context);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // c6.j
    public j.a a(Uri uri, int i7) {
        String sb;
        b(this.f3602a);
        HttpURLConnection c8 = c(uri);
        c8.setUseCaches(true);
        if (i7 != 0) {
            if (q.c(i7)) {
                sb = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb2 = (StringBuilder) f3601d.get();
                sb2.setLength(0);
                if (!q.d(i7)) {
                    sb2.append("no-cache");
                }
                if (!q.j(i7)) {
                    if (sb2.length() > 0) {
                        sb2.append(',');
                    }
                    sb2.append("no-store");
                }
                sb = sb2.toString();
            }
            c8.setRequestProperty("Cache-Control", sb);
        }
        int responseCode = c8.getResponseCode();
        if (responseCode < 300) {
            return new j.a(c8.getInputStream(), e0.w(c8.getHeaderField("X-Android-Response-Source")), c8.getHeaderFieldInt("Content-Length", -1));
        }
        c8.disconnect();
        throw new j.b(responseCode + " " + c8.getResponseMessage(), i7, responseCode);
    }

    protected HttpURLConnection c(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
