package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class fz1 {

    /* renamed from: a, reason: collision with root package name */
    private final b70 f8546a;

    fz1(b70 b70Var) {
        this.f8546a = b70Var;
    }

    private final void s(ez1 ez1Var) {
        String a8 = ez1Var.a();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(a8);
        int i7 = v2.n1.f26802b;
        w2.p.e(concat);
        this.f8546a.v(a8);
    }

    public final void a() {
        s(new ez1("initialize", null));
    }

    public final void b(long j7) {
        ez1 ez1Var = new ez1("creation", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("nativeObjectCreated");
        s(ez1Var);
    }

    public final void c(long j7) {
        ez1 ez1Var = new ez1("creation", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("nativeObjectNotCreated");
        s(ez1Var);
    }

    public final void d(long j7) {
        ez1 ez1Var = new ez1("interstitial", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onNativeAdObjectNotAvailable");
        s(ez1Var);
    }

    public final void e(long j7) {
        ez1 ez1Var = new ez1("interstitial", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onAdLoaded");
        s(ez1Var);
    }

    public final void f(long j7, int i7) {
        ez1 ez1Var = new ez1("interstitial", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onAdFailedToLoad");
        ez1Var.d(Integer.valueOf(i7));
        s(ez1Var);
    }

    public final void g(long j7) {
        ez1 ez1Var = new ez1("interstitial", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onAdOpened");
        s(ez1Var);
    }

    public final void h(long j7) {
        ez1 ez1Var = new ez1("interstitial", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onAdClicked");
        this.f8546a.v(ez1Var.a());
    }

    public final void i(long j7) {
        ez1 ez1Var = new ez1("interstitial", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onAdClosed");
        s(ez1Var);
    }

    public final void j(long j7) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onNativeAdObjectNotAvailable");
        s(ez1Var);
    }

    public final void k(long j7) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onRewardedAdLoaded");
        s(ez1Var);
    }

    public final void l(long j7, int i7) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onRewardedAdFailedToLoad");
        ez1Var.d(Integer.valueOf(i7));
        s(ez1Var);
    }

    public final void m(long j7) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onRewardedAdOpened");
        s(ez1Var);
    }

    public final void n(long j7, int i7) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onRewardedAdFailedToShow");
        ez1Var.d(Integer.valueOf(i7));
        s(ez1Var);
    }

    public final void o(long j7) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onRewardedAdClosed");
        s(ez1Var);
    }

    public final void p(long j7, hi0 hi0Var) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onUserEarnedReward");
        ez1Var.e(hi0Var.c());
        ez1Var.f(Integer.valueOf(hi0Var.e()));
        s(ez1Var);
    }

    public final void q(long j7) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onAdImpression");
        s(ez1Var);
    }

    public final void r(long j7) {
        ez1 ez1Var = new ez1("rewarded", null);
        ez1Var.b(Long.valueOf(j7));
        ez1Var.c("onAdClicked");
        s(ez1Var);
    }
}
