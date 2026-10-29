package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class yb2 implements ka2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19459a;

    /* renamed from: b, reason: collision with root package name */
    private final al1 f19460b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f19461c;

    /* renamed from: d, reason: collision with root package name */
    private final b03 f19462d;

    /* renamed from: e, reason: collision with root package name */
    private final rx1 f19463e;

    public yb2(Context context, Executor executor, al1 al1Var, b03 b03Var, rx1 rx1Var) {
        this.f19459a = context;
        this.f19460b = al1Var;
        this.f19461c = executor;
        this.f19462d = b03Var;
        this.f19463e = rx1Var;
    }

    private static String e(c03 c03Var) {
        try {
            return c03Var.f6192v.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final boolean a(o03 o03Var, c03 c03Var) {
        Context context = this.f19459a;
        return (context instanceof Activity) && wz.a(context) && !TextUtils.isEmpty(e(c03Var));
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final a5.d b(final o03 o03Var, final c03 c03Var) {
        if (((Boolean) s2.b0.c().d(uy.fe)).booleanValue()) {
            qx1 a8 = this.f19463e.a();
            a8.c("action", "cstm_tbs_rndr");
            a8.d();
        }
        String e8 = e(c03Var);
        final Uri parse = e8 != null ? Uri.parse(e8) : null;
        final f03 f03Var = o03Var.f13137b.f12530b;
        return p64.j(p64.a(null), new w54() { // from class: com.google.android.gms.internal.ads.xb2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return yb2.this.c(parse, o03Var, c03Var, f03Var, obj);
            }
        }, this.f19461c);
    }

    final /* synthetic */ a5.d c(Uri uri, o03 o03Var, c03 c03Var, f03 f03Var, Object obj) {
        try {
            androidx.browser.customtabs.d a8 = new d.C0013d().a();
            a8.f1034a.setData(uri);
            u2.m mVar = new u2.m(a8.f1034a, null);
            im0 im0Var = new im0();
            sj1 d8 = this.f19460b.d(new i51(o03Var, c03Var, null), new wj1(new wb2(this, im0Var, c03Var), null));
            im0Var.b(new AdOverlayInfoParcel(mVar, null, d8.i(), null, new w2.a(0, 0, false), null, null, f03Var.f7926b));
            this.f19462d.d();
            return p64.a(d8.h());
        } catch (Throwable th) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ rx1 d() {
        return this.f19463e;
    }
}
