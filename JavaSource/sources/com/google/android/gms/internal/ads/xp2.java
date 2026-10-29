package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class xp2 implements yr2 {

    /* renamed from: c, reason: collision with root package name */
    private static String f18915c;

    /* renamed from: a, reason: collision with root package name */
    private final z64 f18916a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18917b;

    public xp2(z64 z64Var, Context context) {
        this.f18916a = z64Var;
        this.f18917b = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f18916a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.wp2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return xp2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 27;
    }

    final /* synthetic */ yp2 c() {
        if (!((Boolean) s2.b0.c().d(uy.P5)).booleanValue()) {
            return new yp2(null);
        }
        if (!((Boolean) s2.b0.c().d(uy.Y5)).booleanValue()) {
            return new yp2(r2.t.y().j(this.f18917b));
        }
        if (f18915c == null) {
            f18915c = r2.t.y().j(this.f18917b);
        }
        return new yp2(f18915c);
    }
}
