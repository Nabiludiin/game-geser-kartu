package r2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.i00;
import com.google.android.gms.internal.ads.lf0;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.xh0;
import java.util.Map;
import s2.a1;
import s2.b3;
import s2.b5;
import s2.f0;
import s2.f3;
import s2.g5;
import s2.i0;
import s2.l0;
import s2.l1;
import s2.m5;
import s2.p1;
import s2.q2;
import s2.s1;
import s2.u0;
import s2.u4;
import s2.y2;
import s2.z;

/* compiled from: MyApplication */
public final class s extends u0 {

    /* renamed from: q, reason: collision with root package name */
    private final w2.a f25828q;

    /* renamed from: r, reason: collision with root package name */
    private final g5 f25829r;

    /* renamed from: s, reason: collision with root package name */
    private final Context f25830s;

    /* renamed from: t, reason: collision with root package name */
    private final r f25831t;

    /* renamed from: u, reason: collision with root package name */
    private WebView f25832u;

    /* renamed from: v, reason: collision with root package name */
    private i0 f25833v;

    /* renamed from: w, reason: collision with root package name */
    private AsyncTask f25834w;

    public s(Context context, g5 g5Var, String str, w2.a aVar) {
        this.f25830s = context;
        this.f25828q = aVar;
        this.f25829r = g5Var;
        this.f25832u = new WebView(context);
        this.f25831t = new r(context, str);
        k8(0);
        this.f25832u.setVerticalScrollBarEnabled(false);
        this.f25832u.getSettings().setJavaScriptEnabled(true);
        this.f25832u.setWebViewClient(new o(this));
        this.f25832u.setOnTouchListener(new p(this));
    }

    @Override // s2.v0
    public final void A6(u4 u4Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final boolean C() {
        return false;
    }

    @Override // s2.v0
    public final b3 D() {
        return null;
    }

    @Override // s2.v0
    public final i0 G() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // s2.v0
    public final void I6(m5 m5Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final boolean J() {
        return false;
    }

    @Override // s2.v0
    public final void L4(i0 i0Var) {
        this.f25833v = i0Var;
    }

    @Override // s2.v0
    public final void N2(qz qzVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final void Q7(xh0 xh0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final void R5(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final boolean U0(b5 b5Var) {
        p3.o.n(this.f25832u, "This Search Ad has already been torn down");
        this.f25831t.f(b5Var, this.f25828q);
        this.f25834w = new q(this, null).execute(new Void[0]);
        return true;
    }

    @Override // s2.v0
    public final void U4(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final void X4(g5 g5Var) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // s2.v0
    public final void Y5(lf0 lf0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final void Z5(p1 p1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final void a6(a1 a1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final w3.a b() {
        p3.o.f("getAdFrame must be called on the main UI thread.");
        return w3.b.C1(this.f25832u);
    }

    @Override // s2.v0
    public final void d() {
        p3.o.f("destroy must be called on the main UI thread.");
        this.f25834w.cancel(true);
        this.f25832u.destroy();
        this.f25832u = null;
    }

    @Override // s2.v0
    public final void e() {
        p3.o.f("pause must be called on the main UI thread.");
    }

    @Override // s2.v0
    public final void f() {
        p3.o.f("resume must be called on the main UI thread.");
    }

    @Override // s2.v0
    public final void g3(f0 f0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final boolean h() {
        return false;
    }

    @Override // s2.v0
    public final void j3(et etVar) {
        throw new IllegalStateException("Unused method");
    }

    final int j8(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            z.a();
            return w2.g.c(this.f25830s, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // s2.v0
    public final void k() {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final long k0() {
        return 0L;
    }

    final void k8(int i7) {
        if (this.f25832u == null) {
            return;
        }
        this.f25832u.setLayoutParams(new ViewGroup.LayoutParams(-1, i7));
    }

    @Override // s2.v0
    public final Bundle l() {
        throw new IllegalStateException("Unused method");
    }

    final String l8() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) i00.f9781d.e());
        r rVar = this.f25831t;
        builder.appendQueryParameter("query", rVar.b());
        builder.appendQueryParameter("pubId", rVar.c());
        builder.appendQueryParameter("mappver", rVar.d());
        Map e8 = rVar.e();
        for (String str : e8.keySet()) {
            builder.appendQueryParameter(str, (String) e8.get(str));
        }
        Uri build = builder.build();
        String m8 = m8();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(m8.length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(m8);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    final String m8() {
        String a8 = this.f25831t.a();
        if (true == TextUtils.isEmpty(a8)) {
            a8 = "www.google.com";
        }
        String str = (String) i00.f9781d.e();
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(a8);
        sb.append(str);
        return sb.toString();
    }

    @Override // s2.v0
    public final void n() {
        throw new IllegalStateException("Unused method");
    }

    final /* synthetic */ void n8(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f25830s.startActivity(intent);
    }

    @Override // s2.v0
    public final g5 o() {
        return this.f25829r;
    }

    final /* synthetic */ WebView o8() {
        return this.f25832u;
    }

    @Override // s2.v0
    public final String p() {
        return null;
    }

    final /* synthetic */ i0 p8() {
        return this.f25833v;
    }

    @Override // s2.v0
    public final y2 r() {
        return null;
    }

    @Override // s2.v0
    public final String t() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // s2.v0
    public final void v2(l1 l1Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final void v4(of0 of0Var, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final String w() {
        return null;
    }

    @Override // s2.v0
    public final void x6(f3 f3Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final l1 z() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // s2.v0
    public final void z0(boolean z7) {
        throw new IllegalStateException("Unused method");
    }

    @Override // s2.v0
    public final void N3(q2 q2Var) {
    }

    @Override // s2.v0
    public final void O1(s1 s1Var) {
    }

    @Override // s2.v0
    public final void W1(w3.a aVar) {
    }

    @Override // s2.v0
    public final void m2(long j7) {
    }

    @Override // s2.v0
    public final void x5(boolean z7) {
    }

    @Override // s2.v0
    public final void p3(b5 b5Var, l0 l0Var) {
    }
}
