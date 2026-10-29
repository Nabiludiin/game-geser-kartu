package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class rx1 {

    /* renamed from: a, reason: collision with root package name */
    private final wx1 f15380a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f15381b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f15382c;

    public rx1(wx1 wx1Var, Executor executor) {
        this.f15380a = wx1Var;
        this.f15382c = wx1Var.j();
        this.f15381b = executor;
    }

    public final qx1 a() {
        qx1 qx1Var = new qx1(this);
        qx1Var.l();
        return qx1Var;
    }

    public final void b() {
        if (((Boolean) s2.b0.c().d(uy.Fc)).booleanValue()) {
            qx1 a8 = a();
            a8.c("action", "pecr");
            a8.d();
        }
    }

    final /* synthetic */ wx1 c() {
        return this.f15380a;
    }

    final /* synthetic */ Executor d() {
        return this.f15381b;
    }

    final /* synthetic */ Map e() {
        return this.f15382c;
    }
}
