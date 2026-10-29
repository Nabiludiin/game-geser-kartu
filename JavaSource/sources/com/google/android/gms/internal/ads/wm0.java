package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class wm0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f18313q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f18314r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ en0 f18315s;

    wm0(en0 en0Var, String str, String str2) {
        this.f18313q = str;
        this.f18314r = str2;
        Objects.requireNonNull(en0Var);
        this.f18315s = en0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        en0 en0Var = this.f18315s;
        if (en0Var.I() != null) {
            en0Var.I().i(this.f18313q, this.f18314r);
        }
    }
}
