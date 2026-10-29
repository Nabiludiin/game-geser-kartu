package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ln0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ boolean f11660q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ pn0 f11661r;

    ln0(pn0 pn0Var, boolean z7) {
        this.f11660q = z7;
        Objects.requireNonNull(pn0Var);
        this.f11661r = pn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11661r.t("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.f11660q)});
    }
}
