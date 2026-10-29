package w2;

import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.uy;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import s2.b0;

/* compiled from: MyApplication */
public final class v implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27100a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27101b;

    /* renamed from: c, reason: collision with root package name */
    private String f27102c;

    public v(Context context, String str) {
        this.f27100a = context;
        this.f27101b = str;
    }

    private final URL d(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e8) {
            e = e8;
            f(str, e);
        } catch (MalformedURLException e9) {
            e = e9;
            f(str, e);
        } catch (URISyntaxException e10) {
            f(str, e10);
            if (((Boolean) b0.c().d(uy.f17081e)).booleanValue()) {
                url = e(str);
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        p.a(sb.toString());
        return new URL(str);
    }

    private final URL e(String str) {
        URL url;
        URI uri;
        try {
            p.a("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e8) {
            e = e8;
            url = null;
        }
        try {
            String obj = uri.toString();
            StringBuilder sb = new StringBuilder(str.length() + 114 + obj.length());
            sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
            sb.append(str);
            sb.append("\" -> encoded URI: ");
            sb.append(obj);
            p.a(sb.toString());
            return url;
        } catch (IllegalArgumentException e9) {
            e = e9;
            f(str, e);
            return url;
        } catch (MalformedURLException e10) {
            e = e10;
            f(str, e);
            return url;
        } catch (URISyntaxException e11) {
            e = e11;
            f(str, e);
            return url;
        }
    }

    private final void f(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        p.f(sb.toString());
        ag0.c(this.f27100a).b(th, "HttpUrlPinger.pingUrl", ((Integer) b0.c().d(uy.Md)).intValue() / 100.0f);
    }

    public final String a() {
        return this.f27102c;
    }

    @Override // w2.f
    public final u b(String str) {
        return c(str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
    
        if (com.google.android.gms.common.util.d.a() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014d, code lost:
    
        if (com.google.android.gms.common.util.d.a() != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w2.u c(java.lang.String r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.v.c(java.lang.String, java.util.Map):w2.u");
    }
}
