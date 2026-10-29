package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class xs1 {

    /* renamed from: b, reason: collision with root package name */
    private final r2.a f18999b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19000c;

    /* renamed from: d, reason: collision with root package name */
    private final rx1 f19001d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f19002e;

    /* renamed from: f, reason: collision with root package name */
    private final fn f19003f;

    /* renamed from: g, reason: collision with root package name */
    private final w2.a f19004g;

    /* renamed from: i, reason: collision with root package name */
    private final v82 f19006i;

    /* renamed from: j, reason: collision with root package name */
    private final x73 f19007j;

    /* renamed from: k, reason: collision with root package name */
    private final i92 f19008k;

    /* renamed from: l, reason: collision with root package name */
    private final a13 f19009l;

    /* renamed from: m, reason: collision with root package name */
    private a5.d f19010m;

    /* renamed from: a, reason: collision with root package name */
    private final ls1 f18998a = new ls1();

    /* renamed from: h, reason: collision with root package name */
    private final q60 f19005h = new q60();

    xs1(vs1 vs1Var) {
        this.f19000c = vs1Var.b();
        this.f19002e = vs1Var.e();
        this.f19003f = vs1Var.f();
        this.f19004g = vs1Var.g();
        this.f18999b = vs1Var.a();
        this.f19006i = vs1Var.d();
        this.f19007j = vs1Var.h();
        this.f19001d = vs1Var.c();
        this.f19008k = vs1Var.i();
        this.f19009l = vs1Var.j();
    }

    public final synchronized void a() {
        String str = (String) s2.b0.c().d(uy.f17162n4);
        fn fnVar = this.f19003f;
        r2.a aVar = this.f18999b;
        i92 i92Var = this.f19008k;
        a5.d k7 = p64.k(ds0.b(this.f19000c, this.f19004g, str, fnVar, aVar, i92Var, this.f19009l, this.f19001d), new hx3() { // from class: com.google.android.gms.internal.ads.us1
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                mr0 mr0Var = (mr0) obj;
                xs1.this.i(mr0Var);
                return mr0Var;
            }
        }, this.f19002e);
        this.f19010m = k7;
        fm0.a(k7, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void b() {
        a5.d dVar = this.f19010m;
        if (dVar == null) {
            return;
        }
        p64.r(dVar, new ms1(this), this.f19002e);
        this.f19010m = null;
    }

    public final synchronized a5.d c(final String str, final JSONObject jSONObject) {
        a5.d dVar = this.f19010m;
        if (dVar == null) {
            return p64.a(null);
        }
        return p64.j(dVar, new w54() { // from class: com.google.android.gms.internal.ads.ts1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return xs1.this.j(str, jSONObject, (mr0) obj);
            }
        }, this.f19002e);
    }

    public final synchronized void d(String str, y50 y50Var) {
        a5.d dVar = this.f19010m;
        if (dVar == null) {
            return;
        }
        p64.r(dVar, new ns1(this, str, y50Var), this.f19002e);
    }

    public final synchronized void e(String str, y50 y50Var) {
        a5.d dVar = this.f19010m;
        if (dVar == null) {
            return;
        }
        p64.r(dVar, new os1(this, str, y50Var), this.f19002e);
    }

    public final synchronized void f(String str, Map map) {
        a5.d dVar = this.f19010m;
        if (dVar == null) {
            return;
        }
        p64.r(dVar, new ps1(this, "sendMessageToNativeJs", map), this.f19002e);
    }

    public final synchronized void g(c03 c03Var, f03 f03Var, d01 d01Var) {
        a5.d dVar = this.f19010m;
        if (dVar == null) {
            return;
        }
        p64.r(dVar, new qs1(this, c03Var, f03Var, d01Var), this.f19002e);
    }

    public final void h(WeakReference weakReference, String str, y50 y50Var) {
        d(str, new ws1(this, weakReference, str, y50Var, null));
    }

    final /* synthetic */ mr0 i(mr0 mr0Var) {
        mr0Var.O0("/result", this.f19005h);
        ot0 s02 = mr0Var.s0();
        r2.b bVar = new r2.b(this.f19000c, null, null);
        v82 v82Var = this.f19006i;
        x73 x73Var = this.f19007j;
        rx1 rx1Var = this.f19001d;
        ls1 ls1Var = this.f18998a;
        s02.L(null, ls1Var, ls1Var, ls1Var, ls1Var, false, null, bVar, null, null, v82Var, x73Var, rx1Var, null, null, null, null, null, null, null, null);
        return mr0Var;
    }

    final /* synthetic */ a5.d j(String str, JSONObject jSONObject, mr0 mr0Var) {
        return this.f19005h.c(mr0Var, str, jSONObject);
    }

    final /* synthetic */ ls1 k() {
        return this.f18998a;
    }

    final /* synthetic */ rx1 l() {
        return this.f19001d;
    }

    final /* synthetic */ v82 m() {
        return this.f19006i;
    }

    final /* synthetic */ x73 n() {
        return this.f19007j;
    }
}
