package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class hd implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f22210a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd f22211b;

    hd(pd pdVar, ae aeVar) {
        this.f22210a = aeVar;
        Objects.requireNonNull(pdVar);
        this.f22211b = pdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ae aeVar = this.f22210a;
        String str = (String) p3.o.m(aeVar.f21861q);
        pd pdVar = this.f22211b;
        d8 g8 = pdVar.g(str);
        t4.v vVar = t4.v.ANALYTICS_STORAGE;
        if (g8.o(vVar) && d8.f(aeVar.I, 100).o(vVar)) {
            return pdVar.o0(aeVar).p0();
        }
        pdVar.a().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
