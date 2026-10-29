package com.google.android.gms.internal.ads;

import java.util.Objects;
import p3.c;

/* compiled from: MyApplication */
final class r70 implements c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ im0 f14757a;

    r70(s70 s70Var, im0 im0Var) {
        this.f14757a = im0Var;
        Objects.requireNonNull(s70Var);
    }

    @Override // p3.c.b
    public final void a(k3.b bVar) {
        this.f14757a.e(new RuntimeException("Connection failed."));
    }
}
