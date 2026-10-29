package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class ep implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final ko f7740a;

    /* renamed from: b, reason: collision with root package name */
    private final ak f7741b;

    public ep(ko koVar, ak akVar) {
        this.f7740a = koVar;
        this.f7741b = akVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ko koVar = this.f7740a;
        if (koVar.m() != null) {
            koVar.m().get();
        }
        xk l7 = koVar.l();
        if (l7 == null) {
            return null;
        }
        try {
            ak akVar = this.f7741b;
            synchronized (akVar) {
                akVar.d(l7.e(), ez4.a());
            }
            return null;
        } catch (e05 | NullPointerException unused) {
            return null;
        }
    }
}
