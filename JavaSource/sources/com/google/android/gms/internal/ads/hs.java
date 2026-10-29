package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class hs extends Thread {
    private final int A;
    private final int B;
    private final String C;
    private final boolean D;
    private final boolean E;

    /* renamed from: q, reason: collision with root package name */
    private boolean f9636q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f9637r;

    /* renamed from: s, reason: collision with root package name */
    private final Object f9638s;

    /* renamed from: t, reason: collision with root package name */
    private final yr f9639t;

    /* renamed from: u, reason: collision with root package name */
    private final int f9640u;

    /* renamed from: v, reason: collision with root package name */
    private final int f9641v;

    /* renamed from: w, reason: collision with root package name */
    private final int f9642w;

    /* renamed from: x, reason: collision with root package name */
    private final int f9643x;

    /* renamed from: y, reason: collision with root package name */
    private final int f9644y;

    /* renamed from: z, reason: collision with root package name */
    private final int f9645z;

    public hs() {
        yr yrVar = new yr();
        this.f9636q = false;
        this.f9637r = false;
        this.f9639t = yrVar;
        this.f9638s = new Object();
        this.f9641v = ((Long) n00.f12515d.e()).intValue();
        this.f9642w = ((Long) n00.f12512a.e()).intValue();
        this.f9643x = ((Long) n00.f12516e.e()).intValue();
        this.f9644y = ((Long) n00.f12514c.e()).intValue();
        this.f9645z = ((Integer) s2.b0.c().d(uy.f17158n0)).intValue();
        this.A = ((Integer) s2.b0.c().d(uy.f17166o0)).intValue();
        this.B = ((Integer) s2.b0.c().d(uy.f17174p0)).intValue();
        this.f9640u = ((Long) n00.f12517f.e()).intValue();
        this.C = (String) s2.b0.c().d(uy.f17190r0);
        this.D = ((Boolean) s2.b0.c().d(uy.f17198s0)).booleanValue();
        this.E = ((Boolean) s2.b0.c().d(uy.f17206t0)).booleanValue();
        ((Boolean) s2.b0.c().d(uy.f17214u0)).getClass();
        setName("ContentFetchTask");
    }

    public final void a() {
        synchronized (this.f9638s) {
            try {
                if (this.f9636q) {
                    int i7 = v2.n1.f26802b;
                    w2.p.a("Content hash thread already started, quitting...");
                } else {
                    this.f9636q = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r10 == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void b(android.view.View r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.xr r0 = new com.google.android.gms.internal.ads.xr     // Catch: java.lang.Exception -> L50
            int r1 = r9.f9641v     // Catch: java.lang.Exception -> L50
            int r2 = r9.f9642w     // Catch: java.lang.Exception -> L50
            int r3 = r9.f9643x     // Catch: java.lang.Exception -> L50
            int r4 = r9.f9644y     // Catch: java.lang.Exception -> L50
            int r5 = r9.f9645z     // Catch: java.lang.Exception -> L50
            int r6 = r9.A     // Catch: java.lang.Exception -> L50
            int r7 = r9.B     // Catch: java.lang.Exception -> L50
            boolean r8 = r9.E     // Catch: java.lang.Exception -> L50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L50
            com.google.android.gms.internal.ads.cs r1 = r2.t.k()     // Catch: java.lang.Exception -> L50
            android.content.Context r1 = r1.e()     // Catch: java.lang.Exception -> L50
            if (r1 == 0) goto L53
            java.lang.String r2 = r9.C     // Catch: java.lang.Exception -> L50
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L50
            if (r3 != 0) goto L53
            android.content.res.Resources r3 = r1.getResources()     // Catch: java.lang.Exception -> L50
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.f17182q0     // Catch: java.lang.Exception -> L50
            com.google.android.gms.internal.ads.sy r5 = s2.b0.c()     // Catch: java.lang.Exception -> L50
            java.lang.Object r4 = r5.d(r4)     // Catch: java.lang.Exception -> L50
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L50
            java.lang.String r5 = "id"
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> L50
            int r1 = r3.getIdentifier(r4, r5, r1)     // Catch: java.lang.Exception -> L50
            java.lang.Object r1 = r10.getTag(r1)     // Catch: java.lang.Exception -> L50
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L50
            if (r1 == 0) goto L53
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L50
            if (r1 != 0) goto L78
            goto L53
        L50:
            r0 = move-exception
            r10 = r0
            goto L7f
        L53:
            com.google.android.gms.internal.ads.gs r10 = r9.c(r10, r0)     // Catch: java.lang.Exception -> L50
            r0.i()     // Catch: java.lang.Exception -> L50
            int r1 = r10.f9100a     // Catch: java.lang.Exception -> L50
            if (r1 != 0) goto L62
            int r1 = r10.f9101b     // Catch: java.lang.Exception -> L50
            if (r1 == 0) goto L78
        L62:
            int r10 = r10.f9101b     // Catch: java.lang.Exception -> L50
            if (r10 != 0) goto L6d
            int r10 = r0.l()     // Catch: java.lang.Exception -> L50
            if (r10 == 0) goto L78
            goto L6f
        L6d:
            if (r10 != 0) goto L79
        L6f:
            com.google.android.gms.internal.ads.yr r10 = r9.f9639t     // Catch: java.lang.Exception -> L50
            boolean r10 = r10.a(r0)     // Catch: java.lang.Exception -> L50
            if (r10 != 0) goto L78
            goto L79
        L78:
            return
        L79:
            com.google.android.gms.internal.ads.yr r10 = r9.f9639t     // Catch: java.lang.Exception -> L50
            r10.c(r0)     // Catch: java.lang.Exception -> L50
            return
        L7f:
            int r0 = v2.n1.f26802b
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            w2.p.d(r0, r10)
            java.lang.String r0 = "ContentFetchTask.fetchContent"
            com.google.android.gms.internal.ads.ql0 r1 = r2.t.l()
            r1.i(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs.b(android.view.View):void");
    }

    final gs c(View view, xr xrVar) {
        if (view == null) {
            return new gs(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new gs(this, 0, 0);
            }
            xrVar.g(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new gs(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof mr0)) {
            WebView webView = (WebView) view;
            xrVar.e();
            webView.post(new fs(this, xrVar, webView, globalVisibleRect));
            return new gs(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new gs(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            gs c8 = c(viewGroup.getChildAt(i9), xrVar);
            i7 += c8.f9100a;
            i8 += c8.f9101b;
        }
        return new gs(this, i7, i8);
    }

    final void d(xr xrVar, WebView webView, String str, boolean z7) {
        xr xrVar2;
        xrVar.d();
        try {
            if (TextUtils.isEmpty(str)) {
                xrVar2 = xrVar;
            } else {
                String optString = new JSONObject(str).optString("text");
                if (this.D || TextUtils.isEmpty(webView.getTitle())) {
                    xrVar2 = xrVar;
                    xrVar2.f(optString, z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    xrVar.f(sb.toString(), z7, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    xrVar2 = xrVar;
                }
            }
            if (xrVar2.a()) {
                this.f9639t.b(xrVar2);
            }
        } catch (JSONException unused) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Json string may be malformed.");
        } catch (Throwable th) {
            int i8 = v2.n1.f26802b;
            w2.p.b("Failed to get webview content.", th);
            r2.t.l().i(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void e() {
        synchronized (this.f9638s) {
            this.f9637r = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = ");
            sb.append(true);
            String sb2 = sb.toString();
            int i7 = v2.n1.f26802b;
            w2.p.a(sb2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = r2.t.k().d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        r1 = v2.n1.f26802b;
        w2.p.a("ContentFetchThread: no activity. Sleeping.");
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0095, code lost:
    
        r2.t.l().i(r0, "ContentFetchTask.extractContent");
        r2 = v2.n1.f26802b;
        w2.p.a("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00de, code lost:
    
        r1 = v2.n1.f26802b;
        w2.p.d("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cd, code lost:
    
        r1 = v2.n1.f26802b;
        w2.p.d("Error in ContentFetchTask", r0);
        r2.t.l().i(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00e8->B:16:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs.run():void");
    }
}
