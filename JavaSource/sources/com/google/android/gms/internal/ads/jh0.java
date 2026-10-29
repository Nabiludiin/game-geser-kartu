package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class jh0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f10550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ lh0 f10551b;

    jh0(lh0 lh0Var, Context context) {
        this.f10550a = context;
        Objects.requireNonNull(lh0Var);
        this.f10551b = lh0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ih0 a8;
        lh0 lh0Var = this.f10551b;
        WeakHashMap b8 = lh0Var.b();
        Context context = this.f10550a;
        kh0 kh0Var = (kh0) b8.get(context);
        if (kh0Var != null) {
            if (kh0Var.f11049a + ((Long) l00.f11318d.e()).longValue() >= r2.t.o().a()) {
                a8 = new hh0(context, kh0Var.f11050b).a();
                lh0Var.b().put(context, new kh0(lh0Var, a8));
                return a8;
            }
        }
        a8 = new hh0(context).a();
        lh0Var.b().put(context, new kh0(lh0Var, a8));
        return a8;
    }
}
