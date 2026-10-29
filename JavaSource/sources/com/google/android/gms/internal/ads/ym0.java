package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ym0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f19655q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f19656r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ en0 f19657s;

    ym0(en0 en0Var, int i7, int i8) {
        this.f19655q = i7;
        this.f19656r = i8;
        Objects.requireNonNull(en0Var);
        this.f19657s = en0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        en0 en0Var = this.f19657s;
        if (en0Var.I() != null) {
            en0Var.I().e(this.f19655q, this.f19656r);
        }
    }
}
