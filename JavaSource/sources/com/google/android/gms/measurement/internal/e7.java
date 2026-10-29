package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class e7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22086b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f22087c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ y7 f22088d;

    e7(y7 y7Var, String str, String str2, String str3) {
        this.f22085a = str;
        this.f22086b = str2;
        this.f22087c = str3;
        Objects.requireNonNull(y7Var);
        this.f22088d = y7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        y7 y7Var = this.f22088d;
        y7Var.u4().E();
        return y7Var.u4().F0().D0(this.f22085a, this.f22086b, this.f22087c);
    }
}
