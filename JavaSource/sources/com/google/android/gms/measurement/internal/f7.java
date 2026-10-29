package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class f7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22129a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22130b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f22131c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ y7 f22132d;

    f7(y7 y7Var, String str, String str2, String str3) {
        this.f22129a = str;
        this.f22130b = str2;
        this.f22131c = str3;
        Objects.requireNonNull(y7Var);
        this.f22132d = y7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        y7 y7Var = this.f22132d;
        y7Var.u4().E();
        return y7Var.u4().F0().H0(this.f22129a, this.f22130b, this.f22131c);
    }
}
