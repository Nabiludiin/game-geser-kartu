package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class hr2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final jk0 f9627a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f9628b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9629c;

    public hr2(jk0 jk0Var, z64 z64Var, Context context) {
        this.f9627a = jk0Var;
        this.f9628b = z64Var;
        this.f9629c = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f9628b.B0(new Callable() { // from class: com.google.android.gms.internal.ads.gr2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return hr2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 34;
    }

    final /* synthetic */ ir2 c() {
        jk0 jk0Var = this.f9627a;
        Context context = this.f9629c;
        if (!jk0Var.a(context)) {
            return new ir2(null, null, null, null, null);
        }
        String h8 = jk0Var.h(context);
        String str = h8 == null ? "" : h8;
        String i7 = jk0Var.i(context);
        String str2 = i7 == null ? "" : i7;
        String j7 = jk0Var.j(context);
        String str3 = j7 == null ? "" : j7;
        String str4 = true != jk0Var.a(context) ? null : "fa";
        return new ir2(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) s2.b0.c().d(uy.C0) : null);
    }
}
