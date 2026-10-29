package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
final class kn3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final Activity f11148f;

    /* renamed from: g, reason: collision with root package name */
    private final View f11149g;

    kn3(ak akVar, dn3 dn3Var, View view, Activity activity, nu3 nu3Var) {
        super("71irZxeyztMVPxtkZNjCXCWzc9uBzzqfxPgw1LkoaIGD1YWtoRaLj8ZtqyMHro2I", "sazFFsabItlse3qDY43b32ZnLCjQJ0+CJQYLaEeKmSw=", akVar, dn3Var, nu3Var.a(111));
        this.f11149g = view;
        this.f11148f = activity;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        Object[] objArr = (Object[]) method.invoke("", this.f11149g, this.f11148f);
        objArr.getClass();
        synchronized (akVar) {
            akVar.W(((Long) objArr[0]).longValue());
            akVar.X(((Long) objArr[1]).longValue());
            akVar.Y((String) objArr[2]);
        }
    }
}
