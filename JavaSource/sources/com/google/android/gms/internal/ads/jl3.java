package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class jl3 implements ek3 {

    /* renamed from: a, reason: collision with root package name */
    private final li3 f10607a;

    /* renamed from: b, reason: collision with root package name */
    private final fl3 f10608b;

    /* renamed from: c, reason: collision with root package name */
    private final zk3 f10609c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f10610d;

    /* renamed from: e, reason: collision with root package name */
    private final nu3 f10611e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f10612f = new AtomicReference();

    jl3(li3 li3Var, fl3 fl3Var, zk3 zk3Var, ExecutorService executorService, nu3 nu3Var) {
        this.f10607a = li3Var;
        this.f10608b = fl3Var;
        this.f10609c = zk3Var;
        this.f10610d = executorService;
        this.f10611e = nu3Var;
    }

    @Override // com.google.android.gms.internal.ads.ek3
    public final a5.d a() {
        fl3 fl3Var = this.f10608b;
        li3 li3Var = this.f10607a;
        h64 h64Var = (h64) p64.k(h64.C(fl3Var.b(li3Var.f0(), li3Var.h0())), new hx3() { // from class: com.google.android.gms.internal.ads.il3
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                yk3 yk3Var = (yk3) obj;
                jl3.this.f(yk3Var);
                return yk3Var;
            }
        }, g74.a());
        p64.r(h64Var, new hl3(this), this.f10610d);
        return h64Var;
    }

    public final a5.d b(Context context) {
        return ((yk3) this.f10612f.get()).d(context);
    }

    public final a5.d c(Context context, String str, View view, Activity activity) {
        return ((yk3) this.f10612f.get()).e(context, null, view, activity);
    }

    public final a5.d d(Context context, String str, View view, Activity activity) {
        return ((yk3) this.f10612f.get()).c(context, str, view, null);
    }

    public final void e(InputEvent inputEvent) {
        yk3 yk3Var = (yk3) this.f10612f.get();
        if (yk3Var == null) {
            this.f10611e.b(54);
        } else {
            yk3Var.g(inputEvent);
        }
    }

    final /* synthetic */ yk3 f(yk3 yk3Var) {
        this.f10612f.set(yk3Var);
        return yk3Var;
    }

    final /* synthetic */ zk3 g() {
        return this.f10609c;
    }

    public final int h() {
        yk3 yk3Var = (yk3) this.f10612f.get();
        if (yk3Var == null) {
            return 1;
        }
        return yk3Var.f();
    }
}
