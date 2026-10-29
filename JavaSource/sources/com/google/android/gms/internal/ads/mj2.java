package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class mj2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f12273a;

    /* renamed from: b, reason: collision with root package name */
    private final w03 f12274b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12275c;

    mj2(z64 z64Var, w03 w03Var, n13 n13Var, int i7) {
        this.f12273a = z64Var;
        this.f12274b = w03Var;
        this.f12275c = i7;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f12273a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.lj2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return mj2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 5;
    }

    final /* synthetic */ nj2 c() {
        List asList;
        String str = null;
        if (((Boolean) s2.b0.c().d(uy.B7)).booleanValue()) {
            w03 w03Var = this.f12274b;
            if (this.f12275c != 2) {
                String c8 = b3.c.c(w03Var.f17958d);
                if (((Boolean) s2.b0.c().d(uy.D7)).booleanValue()) {
                    asList = Arrays.asList(((String) s2.b0.c().d(uy.E7)).split(","));
                } else {
                    asList = Arrays.asList(((String) s2.b0.c().d(uy.C7)).split(","));
                }
                if (asList.contains(b3.c.b(c8))) {
                    str = n13.a();
                }
            }
        }
        return new nj2(str);
    }
}
