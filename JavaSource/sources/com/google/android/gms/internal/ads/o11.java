package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o11 {

    /* renamed from: a, reason: collision with root package name */
    private final rx1 f13156a;

    /* renamed from: b, reason: collision with root package name */
    private final o03 f13157b;

    o11(rx1 rx1Var, o03 o03Var) {
        this.f13156a = rx1Var;
        this.f13157b = o03Var;
    }

    public final void a(long j7, int i7) {
        qx1 a8 = this.f13156a.a();
        a8.a(this.f13157b.f13137b.f12530b);
        a8.c("action", "ad_closed");
        a8.c("show_time", String.valueOf(j7));
        a8.c("ad_format", "app_open_ad");
        int i8 = i7 - 1;
        a8.c("acr", i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        a8.d();
    }
}
