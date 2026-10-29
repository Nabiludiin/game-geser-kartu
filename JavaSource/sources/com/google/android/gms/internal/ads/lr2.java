package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class lr2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f11742a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11743b;

    /* renamed from: c, reason: collision with root package name */
    private final w2.a f11744c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11745d;

    lr2(z64 z64Var, Context context, w2.a aVar, String str) {
        this.f11742a = z64Var;
        this.f11743b = context;
        this.f11744c = aVar;
        this.f11745d = str;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f11742a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.kr2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return lr2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 35;
    }

    final /* synthetic */ mr2 c() {
        Context context = this.f11743b;
        boolean g8 = u3.e.a(context).g();
        r2.t.g();
        boolean i7 = v2.f2.i(context);
        String str = this.f11744c.f27051q;
        r2.t.g();
        boolean j7 = v2.f2.j();
        r2.t.g();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new mr2(g8, i7, str, j7, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), this.f11745d);
    }
}
