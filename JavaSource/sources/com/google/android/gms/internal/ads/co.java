package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
final class co implements he3 {

    /* renamed from: a, reason: collision with root package name */
    private final nc3 f6519a;

    /* renamed from: b, reason: collision with root package name */
    private final cd3 f6520b;

    /* renamed from: c, reason: collision with root package name */
    private final ro f6521c;

    /* renamed from: d, reason: collision with root package name */
    private final bo f6522d;

    /* renamed from: e, reason: collision with root package name */
    private final ln f6523e;

    /* renamed from: f, reason: collision with root package name */
    private final uo f6524f;

    /* renamed from: g, reason: collision with root package name */
    private final lo f6525g;

    /* renamed from: h, reason: collision with root package name */
    private final ao f6526h;

    co(nc3 nc3Var, cd3 cd3Var, ro roVar, bo boVar, ln lnVar, uo uoVar, lo loVar, ao aoVar) {
        this.f6519a = nc3Var;
        this.f6520b = cd3Var;
        this.f6521c = roVar;
        this.f6522d = boVar;
        this.f6523e = lnVar;
        this.f6524f = uoVar;
        this.f6525g = loVar;
        this.f6526h = aoVar;
    }

    private final Map e() {
        HashMap hashMap = new HashMap();
        nc3 nc3Var = this.f6519a;
        xk b8 = this.f6520b.b();
        hashMap.put("v", nc3Var.a());
        hashMap.put("gms", Boolean.valueOf(nc3Var.c()));
        hashMap.put("gv", Long.valueOf(b8.b1()));
        hashMap.put("int", b8.Z0());
        hashMap.put("attts", Long.valueOf(b8.e1().e0()));
        hashMap.put("att", b8.e1().g0());
        hashMap.put("attkid", b8.e1().f0());
        hashMap.put("up", Boolean.valueOf(this.f6522d.a()));
        hashMap.put("t", new Throwable());
        lo loVar = this.f6525g;
        if (loVar != null) {
            hashMap.put("tcq", Long.valueOf(loVar.e()));
            hashMap.put("tpq", Long.valueOf(loVar.d()));
            hashMap.put("tcv", Long.valueOf(loVar.f()));
            hashMap.put("tpv", Long.valueOf(loVar.g()));
            hashMap.put("tchv", Long.valueOf(loVar.i()));
            hashMap.put("tphv", Long.valueOf(loVar.h()));
            hashMap.put("tcc", Long.valueOf(loVar.j()));
            hashMap.put("tpc", Long.valueOf(loVar.k()));
            ln lnVar = this.f6523e;
            if (lnVar != null) {
                hashMap.put("nt", Long.valueOf(lnVar.c()));
            }
            uo uoVar = this.f6524f;
            if (uoVar != null) {
                hashMap.put("vs", Long.valueOf(uoVar.c()));
                hashMap.put("vf", Long.valueOf(uoVar.d()));
            }
        }
        return hashMap;
    }

    final void a(View view) {
        this.f6521c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.he3
    public final Map b() {
        return e();
    }

    @Override // com.google.android.gms.internal.ads.he3
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.he3
    public final Map d() {
        ao aoVar = this.f6526h;
        Map e8 = e();
        if (aoVar != null) {
            e8.put("vst", aoVar.b());
        }
        return e8;
    }

    @Override // com.google.android.gms.internal.ads.he3
    public final Map h() {
        ro roVar = this.f6521c;
        Map e8 = e();
        e8.put("lts", Long.valueOf(roVar.c()));
        return e8;
    }
}
