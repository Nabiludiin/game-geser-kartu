package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class ww1 implements jd1, qb1, z91, cj1 {

    /* renamed from: q, reason: collision with root package name */
    private final lx1 f18459q;

    /* renamed from: r, reason: collision with root package name */
    private final wx1 f18460r;

    /* renamed from: s, reason: collision with root package name */
    private final int f18461s;

    ww1(lx1 lx1Var, wx1 wx1Var, int i7) {
        this.f18459q = lx1Var;
        this.f18460r = wx1Var;
        this.f18461s = i7;
    }

    private final void b(Bundle bundle, w04 w04Var) {
        if (!((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(yw1.PUBLIC_API_CALLBACK.c(), r2.t.o().a());
        lx1 lx1Var = this.f18459q;
        lx1Var.f();
        if (bundle.containsKey("ls")) {
            lx1Var.d("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = w04Var.size();
        for (int i7 = 0; i7 < size; i7++) {
            zw1 zw1Var = (zw1) w04Var.get(i7);
            long j7 = bundle.getLong(zw1Var.b().c(), -1L);
            long j8 = bundle.getLong(zw1Var.c().c(), -1L);
            if (j7 > 0 && j8 > 0) {
                lx1Var.d(zw1Var.a(), String.valueOf(j8 - j7));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) s2.b0.c().d(uy.d8)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                lx1Var.d("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                lx1Var.d("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j7 = bundle.getLong(str);
            if (j7 >= 0) {
                this.f18459q.d(str, String.valueOf(j7));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
        this.f18459q.b(eh0Var.f7624q);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    @Override // com.google.android.gms.internal.ads.cj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(b3.m0 r6) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ww1.a(b3.m0):void");
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        lx1 lx1Var = this.f18459q;
        lx1Var.c().put("action", "loaded");
        b(lx1Var.e(), zw1.f20504e);
        if (((Boolean) s2.b0.c().d(uy.Gd)).booleanValue()) {
            lx1Var.c().put("mafe", true != c1.h.a("MUTE_AUDIO") ? "0" : "1");
        }
        lx1Var.g();
        this.f18460r.b(lx1Var.c());
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void o(s2.x2 x2Var) {
        lx1 lx1Var = this.f18459q;
        lx1Var.c().put("action", "ftl");
        lx1Var.d("ftl", String.valueOf(x2Var.f26259q));
        lx1Var.d("ed", x2Var.f26261s);
        if (((Boolean) s2.b0.c().d(uy.L7)).booleanValue()) {
            lx1Var.d("emsg", x2Var.f26260r);
        }
        lx1Var.g();
        this.f18460r.b(lx1Var.c());
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(o03 o03Var) {
        this.f18459q.a(o03Var);
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void y(String str) {
        if (((Boolean) s2.b0.c().d(uy.w7)).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.d8)).booleanValue()) {
                this.f18459q.c().put("sgw", String.valueOf(this.f18461s));
            }
            lx1 lx1Var = this.f18459q;
            lx1Var.c().put("action", "sgf");
            lx1Var.d("sgf_reason", str);
            lx1Var.g();
            this.f18460r.b(lx1Var.c());
        }
    }
}
