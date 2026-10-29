package b3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.a13;
import com.google.android.gms.internal.ads.b10;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.fn;
import com.google.android.gms.internal.ads.gn;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.wx1;
import com.google.android.gms.internal.ads.x73;
import com.google.android.gms.internal.ads.z64;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k2.g;
import org.json.JSONException;
import org.json.JSONObject;
import v2.x2;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3188a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f3189b;

    /* renamed from: c, reason: collision with root package name */
    private final fn f3190c;

    /* renamed from: d, reason: collision with root package name */
    private final a13 f3191d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3192e;

    /* renamed from: f, reason: collision with root package name */
    private final wx1 f3193f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f3194g;

    /* renamed from: h, reason: collision with root package name */
    private final z64 f3195h = cm0.f6505f;

    /* renamed from: i, reason: collision with root package name */
    private final x73 f3196i;

    /* renamed from: j, reason: collision with root package name */
    private final j1 f3197j;

    /* renamed from: k, reason: collision with root package name */
    private final a1 f3198k;

    /* renamed from: l, reason: collision with root package name */
    private final e1 f3199l;

    a(WebView webView, fn fnVar, wx1 wx1Var, x73 x73Var, a13 a13Var, j1 j1Var, a1 a1Var, e1 e1Var) {
        this.f3189b = webView;
        Context context = webView.getContext();
        this.f3188a = context;
        this.f3190c = fnVar;
        this.f3193f = wx1Var;
        uy.a(context);
        this.f3192e = ((Integer) s2.b0.c().d(uy.Ea)).intValue();
        this.f3194g = ((Boolean) s2.b0.c().d(uy.Fa)).booleanValue();
        this.f3196i = x73Var;
        this.f3191d = a13Var;
        this.f3197j = j1Var;
        this.f3198k = a1Var;
        this.f3199l = e1Var;
    }

    final /* synthetic */ void a(Bundle bundle, e3.b bVar) {
        x2 j7 = r2.t.j();
        Context context = this.f3188a;
        CookieManager a8 = j7.a(context);
        bundle.putBoolean("accept_3p_cookie", a8 != null ? a8.acceptThirdPartyCookies(this.f3189b) : false);
        e3.a.a(context, k2.c.BANNER, ((g.a) new g.a().c(AdMobAdapter.class, bundle)).k(), bVar);
    }

    final /* synthetic */ void b(String str) {
        a13 a13Var;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) s2.b0.c().d(uy.Zc)).booleanValue() || (a13Var = this.f3191d) == null) ? this.f3190c.d(parse, this.f3188a, this.f3189b, null) : a13Var.a(parse, this.f3188a, this.f3189b, null);
        } catch (gn e8) {
            int i7 = v2.n1.f26802b;
            w2.p.b("Failed to append the click signal to URL: ", e8);
            r2.t.l().i(e8, "TaggingLibraryJsInterface.recordClick");
        }
        this.f3196i.b(parse.toString(), null, null, null);
    }

    final /* synthetic */ WebView c() {
        return this.f3189b;
    }

    final /* synthetic */ z64 d() {
        return this.f3195h;
    }

    final /* synthetic */ a1 e() {
        return this.f3198k;
    }

    final /* synthetic */ e1 f() {
        return this.f3199l;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long a8 = r2.t.o().a();
            String l7 = this.f3190c.b().l(this.f3188a, str, this.f3189b);
            if (!this.f3194g) {
                return l7;
            }
            c.e(this.f3193f, null, "csg", new Pair("clat", String.valueOf(r2.t.o().a() - a8)));
            return l7;
        } catch (RuntimeException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Exception getting click signals. ", e8);
            r2.t.l().i(e8, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i7) {
        if (i7 <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 51);
            sb.append("Invalid timeout for getting click signals. Timeout=");
            sb.append(i7);
            String sb2 = sb.toString();
            int i8 = v2.n1.f26802b;
            w2.p.c(sb2);
            return "";
        }
        try {
            return (String) cm0.f6500a.B0(new Callable() { // from class: b3.u0
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return a.this.getClickSignals(str);
                }
            }).get(Math.min(i7, this.f3192e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            int i9 = v2.n1.f26802b;
            w2.p.d("Exception getting click signals with timeout. ", e8);
            r2.t.l().i(e8, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        r2.t.g();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final s0 s0Var = new s0(this, uuid);
        if (((Boolean) b10.f5455e.e()).booleanValue()) {
            this.f3197j.b(this.f3189b, s0Var);
            return uuid;
        }
        if (((Boolean) s2.b0.c().d(uy.Ha)).booleanValue()) {
            this.f3195h.execute(new Runnable() { // from class: b3.w0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    a.this.a(bundle, s0Var);
                }
            });
            return uuid;
        }
        e3.a.a(this.f3188a, k2.c.BANNER, ((g.a) new g.a().c(AdMobAdapter.class, bundle)).k(), s0Var);
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long a8 = r2.t.o().a();
            String m7 = this.f3190c.b().m(this.f3188a, this.f3189b, null);
            if (!this.f3194g) {
                return m7;
            }
            c.e(this.f3193f, null, "vsg", new Pair("vlat", String.valueOf(r2.t.o().a() - a8)));
            return m7;
        } catch (RuntimeException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Exception getting view signals. ", e8);
            r2.t.l().i(e8, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i7) {
        if (i7 <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 50);
            sb.append("Invalid timeout for getting view signals. Timeout=");
            sb.append(i7);
            String sb2 = sb.toString();
            int i8 = v2.n1.f26802b;
            w2.p.c(sb2);
            return "";
        }
        try {
            return (String) cm0.f6500a.B0(new Callable() { // from class: b3.t0
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return a.this.getViewSignals();
                }
            }).get(Math.min(i7, this.f3192e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            int i9 = v2.n1.f26802b;
            w2.p.d("Exception getting view signals with timeout. ", e8);
            r2.t.l().i(e8, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e8 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) s2.b0.c().d(uy.Ja)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        cm0.f6500a.execute(new Runnable() { // from class: b3.v0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                a.this.b(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i7;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i8 = jSONObject.getInt("x");
            int i9 = jSONObject.getInt("y");
            int i10 = jSONObject.getInt("duration_ms");
            float f8 = (float) jSONObject.getDouble("force");
            int i11 = jSONObject.getInt("type");
            if (i11 != 0) {
                i7 = 1;
                if (i11 != 1) {
                    i7 = 2;
                    if (i11 != 2) {
                        i7 = 3;
                        if (i11 != 3) {
                            i7 = -1;
                        }
                    }
                }
            } else {
                i7 = 0;
            }
            try {
                this.f3190c.c(MotionEvent.obtain(0L, i10, i7, i8, i9, f8, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e8) {
                e = e8;
                int i12 = v2.n1.f26802b;
                w2.p.d("Failed to parse the touch string. ", e);
                r2.t.l().i(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e9) {
                e = e9;
                int i122 = v2.n1.f26802b;
                w2.p.d("Failed to parse the touch string. ", e);
                r2.t.l().i(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
    }
}
