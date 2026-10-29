package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class hu5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9702a;

    /* renamed from: b, reason: collision with root package name */
    public final tc5[] f9703b;

    /* renamed from: c, reason: collision with root package name */
    public final zt5[] f9704c;

    /* renamed from: d, reason: collision with root package name */
    public final d70 f9705d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9706e;

    public hu5(tc5[] tc5VarArr, zt5[] zt5VarArr, d70 d70Var, Object obj) {
        int length = tc5VarArr.length;
        rx3.a(length == zt5VarArr.length);
        this.f9703b = tc5VarArr;
        this.f9704c = (zt5[]) zt5VarArr.clone();
        this.f9705d = d70Var;
        this.f9706e = obj;
        this.f9702a = length;
    }

    public final boolean a(int i7) {
        return this.f9703b[i7] != null;
    }

    public final boolean b(hu5 hu5Var, int i7) {
        return hu5Var != null && Objects.equals(this.f9703b[i7], hu5Var.f9703b[i7]) && Objects.equals(this.f9704c[i7], hu5Var.f9704c[i7]);
    }
}
