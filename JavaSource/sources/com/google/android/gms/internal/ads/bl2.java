package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class bl2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    final ql0 f5849a;

    /* renamed from: b, reason: collision with root package name */
    h3.b f5850b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f5851c;

    /* renamed from: d, reason: collision with root package name */
    private final z64 f5852d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f5853e;

    bl2(Context context, ql0 ql0Var, ScheduledExecutorService scheduledExecutorService, z64 z64Var) {
        if (!((Boolean) s2.b0.c().d(uy.f17241x3)).booleanValue()) {
            this.f5850b = h3.a.a(context);
        }
        this.f5853e = context;
        this.f5849a = ql0Var;
        this.f5851c = scheduledExecutorService;
        this.f5852d = z64Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        if (((Boolean) s2.b0.c().d(uy.f17209t3)).booleanValue()) {
            if (!((Boolean) s2.b0.c().d(uy.f17249y3)).booleanValue()) {
                if (!((Boolean) s2.b0.c().d(uy.f17217u3)).booleanValue()) {
                    return p64.k(xh3.a(this.f5850b.a(), null), al2.f5031a, cm0.f6506g);
                }
                w4.i b8 = ((Boolean) s2.b0.c().d(uy.f17241x3)).booleanValue() ? c23.b(this.f5853e) : this.f5850b.a();
                if (b8 == null) {
                    return p64.a(new cl2(null, -1));
                }
                a5.d j7 = p64.j(xh3.a(b8, null), yk2.f19635a, cm0.f6506g);
                if (((Boolean) s2.b0.c().d(uy.f17225v3)).booleanValue()) {
                    j7 = p64.i(j7, ((Long) s2.b0.c().d(uy.f17233w3)).longValue(), TimeUnit.MILLISECONDS, this.f5851c);
                }
                return p64.g(j7, Exception.class, new hx3() { // from class: com.google.android.gms.internal.ads.zk2
                    @Override // com.google.android.gms.internal.ads.hx3
                    public final /* synthetic */ Object apply(Object obj) {
                        bl2.this.f5849a.i((Exception) obj, "AppSetIdInfoSignal");
                        return new cl2(null, -1);
                    }
                }, this.f5852d);
            }
        }
        return p64.a(new cl2(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 11;
    }
}
