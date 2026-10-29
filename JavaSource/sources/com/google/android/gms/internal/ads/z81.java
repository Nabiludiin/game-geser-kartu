package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class z81 {

    /* renamed from: a, reason: collision with root package name */
    private final f53 f20050a;

    /* renamed from: b, reason: collision with root package name */
    private final w2.a f20051b;

    /* renamed from: c, reason: collision with root package name */
    private final ApplicationInfo f20052c;

    /* renamed from: d, reason: collision with root package name */
    private final String f20053d;

    /* renamed from: e, reason: collision with root package name */
    private final List f20054e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f20055f;

    /* renamed from: g, reason: collision with root package name */
    private final h85 f20056g;

    /* renamed from: h, reason: collision with root package name */
    private final String f20057h;

    /* renamed from: i, reason: collision with root package name */
    private final bs2 f20058i;

    /* renamed from: j, reason: collision with root package name */
    private final v2.p1 f20059j;

    /* renamed from: k, reason: collision with root package name */
    private final w03 f20060k;

    /* renamed from: l, reason: collision with root package name */
    private final int f20061l;

    /* renamed from: m, reason: collision with root package name */
    private final zf1 f20062m;

    z81(f53 f53Var, w2.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, h85 h85Var, v2.p1 p1Var, String str2, bs2 bs2Var, w03 w03Var, zf1 zf1Var, int i7) {
        this.f20050a = f53Var;
        this.f20051b = aVar;
        this.f20052c = applicationInfo;
        this.f20053d = str;
        this.f20054e = list;
        this.f20055f = packageInfo;
        this.f20056g = h85Var;
        this.f20057h = str2;
        this.f20058i = bs2Var;
        this.f20059j = p1Var;
        this.f20060k = w03Var;
        this.f20062m = zf1Var;
        this.f20061l = i7;
    }

    public final a5.d a(Bundle bundle) {
        this.f20062m.a();
        z43 z43Var = z43.SIGNALS;
        f53 f53Var = this.f20050a;
        Objects.requireNonNull(f53Var);
        return q43.a(this.f20058i.a(new x81(new Bundle(), new Bundle()), bundle, this.f20061l == 2), z43Var, f53Var).i();
    }

    public final a5.d b() {
        final Bundle bundle = new Bundle();
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue()) {
            Bundle bundle2 = this.f20060k.f17974t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final a5.d a8 = a(bundle);
        return this.f20050a.b(z43.REQUEST_PARCEL, a8, (a5.d) this.f20056g.b()).a(new Callable() { // from class: com.google.android.gms.internal.ads.y81
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return z81.this.c(a8, bundle);
            }
        }).i();
    }

    final /* synthetic */ eh0 c(a5.d dVar, Bundle bundle) {
        x81 x81Var = (x81) dVar.get();
        Bundle bundle2 = x81Var.f18664a;
        String str = (String) ((a5.d) this.f20056g.b()).get();
        boolean z7 = false;
        if (((Boolean) s2.b0.c().d(uy.A7)).booleanValue() && this.f20059j.H()) {
            z7 = true;
        }
        boolean z8 = z7;
        String str2 = this.f20057h;
        PackageInfo packageInfo = this.f20055f;
        List list = this.f20054e;
        String str3 = this.f20053d;
        return new eh0(bundle2, this.f20051b, this.f20052c, str3, list, packageInfo, str, str2, null, null, z8, this.f20060k.a(), bundle, x81Var.f18665b, this.f20061l);
    }
}
