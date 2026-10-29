package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class rt3 implements it3, ek3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15217a;

    /* renamed from: b, reason: collision with root package name */
    private final nu3 f15218b;

    /* renamed from: c, reason: collision with root package name */
    private final z64 f15219c;

    /* renamed from: d, reason: collision with root package name */
    private final li3 f15220d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f15221e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private a5.d f15222f = p64.a(null);

    rt3(Context context, nu3 nu3Var, z64 z64Var, li3 li3Var) {
        this.f15217a = context;
        this.f15218b = nu3Var;
        this.f15219c = z64Var;
        this.f15220d = li3Var;
    }

    @Override // com.google.android.gms.internal.ads.ek3
    public final a5.d a() {
        return (this.f15221e.getAndSet(true) || !this.f15220d.j0()) ? p64.b() : this.f15219c.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.qt3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                rt3.this.e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void b(Map map) {
        map.put("gs", this.f15222f);
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void c(Map map) {
        map.put("gs", this.f15222f);
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void d(Map map, Context context, View view) {
        map.put("gs", this.f15222f);
    }

    final /* synthetic */ void e() {
        a5.d B0 = this.f15219c.B0(new Callable() { // from class: com.google.android.gms.internal.ads.pt3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return rt3.this.f();
            }
        });
        this.f15218b.e(53, B0);
        this.f15222f = B0;
    }

    final /* synthetic */ xk f() {
        Context context = this.f15217a;
        try {
            return sc3.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}
