package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class ry1 implements l2.d, jd1, s2.a, w91, ra1, sa1, qb1, z91, g53 {

    /* renamed from: q, reason: collision with root package name */
    private final List f15385q;

    /* renamed from: r, reason: collision with root package name */
    private final ey1 f15386r;

    /* renamed from: s, reason: collision with root package name */
    private long f15387s;

    public ry1(ey1 ey1Var, gu0 gu0Var) {
        this.f15386r = ey1Var;
        this.f15385q = Collections.singletonList(gu0Var);
    }

    private final void y(Class cls, String str, Object... objArr) {
        this.f15386r.a(this.f15385q, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final void E() {
        y(ra1.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
        this.f15387s = r2.t.o().b();
        y(jd1.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void a() {
        y(w91.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void b() {
        y(w91.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void c() {
        y(w91.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // s2.a
    public final void c0() {
        y(s2.a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void d(Context context) {
        y(sa1.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void e() {
        y(w91.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        long b8 = r2.t.o().b() - this.f15387s;
        StringBuilder sb = new StringBuilder(String.valueOf(b8).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(b8);
        v2.n1.k(sb.toString());
        y(qb1.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void h(Context context) {
        y(sa1.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void j(Context context) {
        y(sa1.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void k(z43 z43Var, String str) {
        y(y43.class, "onTaskStarted", str);
    }

    @Override // l2.d
    public final void n(String str, String str2) {
        y(l2.d.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void o(s2.x2 x2Var) {
        y(z91.class, "onAdFailedToLoad", Integer.valueOf(x2Var.f26259q), x2Var.f26260r, x2Var.f26261s);
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void q(z43 z43Var, String str) {
        y(y43.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void s(z43 z43Var, String str, Throwable th) {
        y(y43.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void t(z43 z43Var, String str) {
        y(y43.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void u(qh0 qh0Var, String str, String str2) {
        y(w91.class, "onRewarded", qh0Var, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void v() {
        y(w91.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(o03 o03Var) {
    }
}
