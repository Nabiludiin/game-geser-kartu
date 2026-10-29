package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class tr3 implements jr3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16333a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f16334b;

    /* renamed from: c, reason: collision with root package name */
    private final lj3 f16335c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16336d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16337e;

    /* renamed from: f, reason: collision with root package name */
    private final nu3 f16338f;

    /* renamed from: g, reason: collision with root package name */
    private final xr3 f16339g;

    tr3(Context context, ExecutorService executorService, li3 li3Var, lj3 lj3Var, nu3 nu3Var, xr3 xr3Var) {
        this.f16333a = context;
        this.f16334b = executorService;
        this.f16335c = lj3Var;
        this.f16338f = nu3Var;
        this.f16339g = xr3Var;
        this.f16336d = li3Var.i0();
        this.f16337e = li3Var.o0().f0();
    }

    private static tk3 c(int i7) {
        sk3 g02 = tk3.g0();
        g02.I(i7);
        return (tk3) g02.A();
    }

    @Override // com.google.android.gms.internal.ads.jr3
    public final a5.d a() {
        int i7;
        fq d02 = gq.d0();
        byte[] a8 = eh.a();
        qy4 qy4Var = qy4.f14669r;
        d02.E(qy4.s(a8, 0, a8.length));
        d02.F(Build.VERSION.SDK_INT);
        d02.G(Build.MODEL);
        Context context = this.f16333a;
        d02.H(context.getPackageName());
        try {
            i7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i7 = -1;
        }
        lj3 lj3Var = this.f16335c;
        nu3 nu3Var = this.f16338f;
        d02.I(i7);
        d02.J(this.f16336d);
        a5.d k7 = p64.k(lj3Var.b(Uri.parse(this.f16337e).buildUpon().appendQueryParameter("aspq", hj3.a(((gq) d02.A()).e(), true)).build().toString()), new hx3() { // from class: com.google.android.gms.internal.ads.sr3
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return tr3.this.b((kj3) obj);
            }
        }, this.f16334b);
        nu3Var.e(20002, k7);
        return k7;
    }

    final /* synthetic */ tk3 b(kj3 kj3Var) {
        if (kj3Var.a() != 200) {
            this.f16338f.c(20003, new String(eh.a(), StandardCharsets.UTF_8));
            return c(7);
        }
        try {
            String b8 = kj3Var.b();
            if (TextUtils.isEmpty(b8)) {
                this.f16338f.b(20004);
                return c(8);
            }
            iq e02 = iq.e0(hj3.b(b8, true), ez4.b());
            if (e02.d0().f0() && e02.d0().d0()) {
                if (!this.f16339g.a(e02)) {
                    this.f16338f.b(20006);
                    return c(12);
                }
                sk3 g02 = tk3.g0();
                uk3 g03 = xk3.g0();
                g03.F(e02.d0().e0());
                g02.F(g03);
                g02.G(e02.d0().g0());
                g02.I(2);
                return (tk3) g02.A();
            }
            this.f16338f.b(20004);
            return c(8);
        } catch (Throwable th) {
            this.f16338f.d(20005, th);
            return c(6);
        }
    }
}
