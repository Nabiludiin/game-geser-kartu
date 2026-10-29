package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class t32 implements a52 {

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f15957h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a, reason: collision with root package name */
    private final t22 f15958a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f15959b;

    /* renamed from: c, reason: collision with root package name */
    private final w03 f15960c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f15961d;

    /* renamed from: e, reason: collision with root package name */
    private final r72 f15962e;

    /* renamed from: f, reason: collision with root package name */
    private final b63 f15963f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f15964g;

    t32(Context context, w03 w03Var, t22 t22Var, z64 z64Var, ScheduledExecutorService scheduledExecutorService, r72 r72Var, b63 b63Var) {
        this.f15964g = context;
        this.f15960c = w03Var;
        this.f15958a = t22Var;
        this.f15959b = z64Var;
        this.f15961d = scheduledExecutorService;
        this.f15962e = r72Var;
        this.f15963f = b63Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final a5.d a(eh0 eh0Var) {
        Context context = this.f15964g;
        a5.d a8 = this.f15958a.a(eh0Var);
        r53 a9 = q53.a(context, 11);
        a63.b(a8, a9);
        a5.d j7 = p64.j(a8, new w54() { // from class: com.google.android.gms.internal.ads.s32
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return t32.this.b((c52) obj);
            }
        }, this.f15959b);
        if (((Boolean) s2.b0.c().d(uy.f17115h6)).booleanValue()) {
            j7 = p64.h(p64.i(j7, ((Integer) s2.b0.c().d(uy.f17124i6)).intValue(), TimeUnit.SECONDS, this.f15961d), TimeoutException.class, r32.f14721a, cm0.f6506g);
        }
        a63.d(j7, this.f15963f, a9);
        p64.r(j7, new p32(this), cm0.f6506g);
        return j7;
    }

    final /* synthetic */ a5.d b(c52 c52Var) {
        return p64.a(new o03(new l03(this.f15960c), n03.a(new InputStreamReader(c52Var.a()), c52Var.b().C)));
    }

    final /* synthetic */ r72 c() {
        return this.f15962e;
    }
}
