package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* compiled from: MyApplication */
public final class t53 implements r53 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15979a;

    /* renamed from: p, reason: collision with root package name */
    private final int f15994p;

    /* renamed from: b, reason: collision with root package name */
    private long f15980b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f15981c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15982d = false;

    /* renamed from: q, reason: collision with root package name */
    private int f15995q = 2;

    /* renamed from: r, reason: collision with root package name */
    private int f15996r = 2;

    /* renamed from: e, reason: collision with root package name */
    private int f15983e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f15984f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f15985g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f15986h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f15987i = "";

    /* renamed from: j, reason: collision with root package name */
    private g63 f15988j = g63.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* renamed from: k, reason: collision with root package name */
    private String f15989k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f15990l = "";

    /* renamed from: m, reason: collision with root package name */
    private String f15991m = "";

    /* renamed from: n, reason: collision with root package name */
    private boolean f15992n = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15993o = false;

    t53(Context context, int i7) {
        this.f15979a = context;
        this.f15994p = i7;
    }

    public final synchronized t53 A(String str) {
        this.f15987i = str;
        return this;
    }

    public final synchronized t53 B(g63 g63Var) {
        this.f15988j = g63Var;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r2.f15985g = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.t53 C(com.google.android.gms.internal.ads.n03 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.f03 r0 = r3.f12530b     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.f7926b     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            r2.f15984f = r0     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r3 = move-exception
            goto L2e
        L10:
            java.util.List r3 = r3.f12529a     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Le
        L16:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.internal.ads.c03 r0 = (com.google.android.gms.internal.ads.c03) r0     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r0.f6153b0     // Catch: java.lang.Throwable -> Le
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L16
            r2.f15985g = r0     // Catch: java.lang.Throwable -> Le
        L2c:
            monitor-exit(r2)
            return r2
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t53.C(com.google.android.gms.internal.ads.n03):com.google.android.gms.internal.ads.t53");
    }

    public final synchronized t53 D(s2.x2 x2Var) {
        try {
            IBinder iBinder = x2Var.f26263u;
            if (iBinder != null) {
                p91 p91Var = (p91) iBinder;
                String m8 = p91Var.m8();
                if (!TextUtils.isEmpty(m8)) {
                    this.f15984f = m8;
                }
                String e8 = p91Var.e();
                if (!TextUtils.isEmpty(e8)) {
                    this.f15985g = e8;
                }
            }
        } finally {
        }
        return this;
    }

    public final synchronized t53 E(String str) {
        this.f15986h = str;
        return this;
    }

    public final synchronized t53 F(Throwable th) {
        if (((Boolean) s2.b0.c().d(uy.J9)).booleanValue()) {
            this.f15990l = ag0.h(th);
            this.f15989k = (String) gy3.a(ex3.b('\n')).d(ag0.g(th)).iterator().next();
        }
        return this;
    }

    public final synchronized t53 G(String str) {
        if (((Boolean) s2.b0.c().d(uy.J9)).booleanValue()) {
            this.f15991m = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 a() {
        w();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final synchronized boolean b() {
        return this.f15993o;
    }

    final /* synthetic */ long c() {
        return this.f15980b;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 c0(String str) {
        E(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 d() {
        x();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 e(boolean z7) {
        z(z7);
        return this;
    }

    final /* synthetic */ long f() {
        return this.f15981c;
    }

    final /* synthetic */ boolean g() {
        return this.f15982d;
    }

    final /* synthetic */ int h() {
        return this.f15983e;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 h0(String str) {
        G(str);
        return this;
    }

    final /* synthetic */ String i() {
        return this.f15984f;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 i0(int i7) {
        s(i7);
        return this;
    }

    final /* synthetic */ String j() {
        return this.f15985g;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 j0(Throwable th) {
        F(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final boolean k() {
        return !TextUtils.isEmpty(this.f15986h);
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 k0(g63 g63Var) {
        B(g63Var);
        return this;
    }

    final /* synthetic */ String l() {
        return this.f15986h;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 l0(s2.x2 x2Var) {
        D(x2Var);
        return this;
    }

    final /* synthetic */ String m() {
        return this.f15987i;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 m0(n03 n03Var) {
        C(n03Var);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final synchronized u53 n() {
        try {
            if (this.f15992n) {
                return null;
            }
            this.f15992n = true;
            if (!this.f15993o) {
                w();
            }
            if (this.f15981c < 0) {
                x();
            }
            return new u53(this, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ g63 o() {
        return this.f15988j;
    }

    final /* synthetic */ String p() {
        return this.f15989k;
    }

    final /* synthetic */ String q() {
        return this.f15990l;
    }

    final /* synthetic */ String r() {
        return this.f15991m;
    }

    public final synchronized t53 s(int i7) {
        this.f15995q = i7;
        return this;
    }

    final /* synthetic */ int t() {
        return this.f15994p;
    }

    final /* synthetic */ int u() {
        return this.f15995q;
    }

    final /* synthetic */ int v() {
        return this.f15996r;
    }

    public final synchronized t53 w() {
        Configuration configuration;
        v2.x2 j7 = r2.t.j();
        Context context = this.f15979a;
        this.f15983e = j7.k(context);
        Resources resources = context.getResources();
        int i7 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i7 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f15996r = i7;
        this.f15980b = r2.t.o().b();
        this.f15993o = true;
        return this;
    }

    public final synchronized t53 x() {
        this.f15981c = r2.t.o().b();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.r53
    public final /* bridge */ /* synthetic */ r53 y(String str) {
        A(str);
        return this;
    }

    public final synchronized t53 z(boolean z7) {
        this.f15982d = z7;
        return this;
    }
}
