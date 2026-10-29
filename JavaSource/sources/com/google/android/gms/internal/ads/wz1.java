package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class wz1 extends w70 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Object f18487q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f18488r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ long f18489s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ r53 f18490t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ im0 f18491u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ f02 f18492v;

    wz1(f02 f02Var, Object obj, String str, long j7, r53 r53Var, im0 im0Var) {
        this.f18487q = obj;
        this.f18488r = str;
        this.f18489s = j7;
        this.f18490t = r53Var;
        this.f18491u = im0Var;
        Objects.requireNonNull(f02Var);
        this.f18492v = f02Var;
    }

    @Override // com.google.android.gms.internal.ads.x70
    public final void c() {
        synchronized (this.f18487q) {
            f02 f02Var = this.f18492v;
            String str = this.f18488r;
            f02Var.m(str, true, "", (int) (r2.t.o().b() - this.f18489s));
            f02Var.r().b(str);
            f02Var.s().v(str);
            e63 t7 = f02Var.t();
            r53 r53Var = this.f18490t;
            r53Var.e(true);
            t7.b(r53Var.n());
            this.f18491u.b(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.x70
    public final void u(String str) {
        synchronized (this.f18487q) {
            f02 f02Var = this.f18492v;
            String str2 = this.f18488r;
            f02Var.m(str2, false, str, (int) (r2.t.o().b() - this.f18489s));
            f02Var.r().c(str2, "error");
            f02Var.s().h(str2, "error");
            e63 t7 = f02Var.t();
            r53 r53Var = this.f18490t;
            r53Var.h0(str);
            r53Var.e(false);
            t7.b(r53Var.n());
            this.f18491u.b(Boolean.FALSE);
        }
    }
}
