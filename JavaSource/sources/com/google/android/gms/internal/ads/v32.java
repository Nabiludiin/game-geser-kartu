package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class v32 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b42 f17374a;

    v32(b42 b42Var) {
        Objects.requireNonNull(b42Var);
        this.f17374a = b42Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        o03 o03Var = (o03) obj;
        if (((Boolean) s2.b0.c().d(uy.A2)).booleanValue()) {
            this.f17374a.f().x(o03Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
    }
}
