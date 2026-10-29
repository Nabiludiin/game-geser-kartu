package c6;

import android.content.Context;
import android.net.Uri;
import c6.j;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public class s implements j {

    /* renamed from: a, reason: collision with root package name */
    private final OkHttpClient f3666a;

    public s(Context context) {
        this(e0.f(context));
    }

    private static OkHttpClient b() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(15000L, timeUnit);
        okHttpClient.setReadTimeout(20000L, timeUnit);
        okHttpClient.setWriteTimeout(20000L, timeUnit);
        return okHttpClient;
    }

    @Override // c6.j
    public j.a a(Uri uri, int i7) {
        CacheControl cacheControl;
        if (i7 == 0) {
            cacheControl = null;
        } else if (q.c(i7)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!q.d(i7)) {
                builder.noCache();
            }
            if (!q.j(i7)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.f3666a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z7 = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new j.a(body.byteStream(), z7, body.contentLength());
        }
        execute.body().close();
        throw new j.b(code + " " + execute.message(), i7, code);
    }

    public s(File file) {
        this(file, e0.a(file));
    }

    public s(File file, long j7) {
        this(b());
        try {
            this.f3666a.setCache(new Cache(file, j7));
        } catch (IOException unused) {
        }
    }

    public s(OkHttpClient okHttpClient) {
        this.f3666a = okHttpClient;
    }
}
