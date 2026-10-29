package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class fl2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8309a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f8310b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8311c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8312d;

    /* renamed from: e, reason: collision with root package name */
    private final v2.p1 f8313e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8314f;

    /* renamed from: g, reason: collision with root package name */
    private final x61 f8315g;

    public fl2(Context context, Bundle bundle, String str, String str2, v2.p1 p1Var, String str3, x61 x61Var) {
        this.f8309a = context;
        this.f8310b = bundle;
        this.f8311c = str;
        this.f8312d = str2;
        this.f8313e = p1Var;
        this.f8314f = str3;
        this.f8315g = x61Var;
    }

    private final void a(Bundle bundle) {
        if (((Boolean) s2.b0.c().d(uy.f17140k6)).booleanValue()) {
            try {
                r2.t.g();
                bundle.putString("_app_id", v2.f2.f0(this.f8309a));
            } catch (RemoteException | RuntimeException e8) {
                r2.t.l().i(e8, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((x81) obj).f18665b;
        bundle.putBundle("quality_signals", this.f8310b);
        a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        bundle.putBundle("quality_signals", this.f8310b);
        bundle.putString("seq_num", this.f8311c);
        if (!this.f8313e.H()) {
            bundle.putString("session_id", this.f8312d);
        }
        bundle.putBoolean("client_purpose_one", !r0.H());
        a(bundle);
        String str = this.f8314f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            x61 x61Var = this.f8315g;
            bundle2.putLong("dload", x61Var.c(str));
            bundle2.putInt("pcc", x61Var.b(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) s2.b0.c().d(uy.Ma)).booleanValue() || r2.t.l().p() <= 0) {
            return;
        }
        bundle.putInt("nrwv", r2.t.l().p());
    }
}
