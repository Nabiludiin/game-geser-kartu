package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class w90 implements km0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u90 f18120a;

    w90(aa0 aa0Var, u90 u90Var) {
        this.f18120a = u90Var;
        Objects.requireNonNull(aa0Var);
    }

    @Override // com.google.android.gms.internal.ads.km0
    public final void a() {
        v2.n1.k("Rejecting reference for JS Engine.");
        if (((Boolean) s2.b0.c().d(uy.p8)).booleanValue()) {
            this.f18120a.d(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.f18120a.c();
        }
    }
}
