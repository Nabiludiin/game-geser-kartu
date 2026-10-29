package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class d7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22047a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22048b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f22049c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ y7 f22050d;

    d7(y7 y7Var, String str, String str2, String str3) {
        this.f22047a = str;
        this.f22048b = str2;
        this.f22049c = str3;
        Objects.requireNonNull(y7Var);
        this.f22050d = y7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        y7 y7Var = this.f22050d;
        y7Var.u4().E();
        return y7Var.u4().F0().D0(this.f22047a, this.f22048b, this.f22049c);
    }
}
