package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class ps1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14085a = "sendMessageToNativeJs";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f14086b;

    ps1(xs1 xs1Var, String str, Map map) {
        this.f14086b = map;
        Objects.requireNonNull(xs1Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((mr0) obj).B(this.f14085a, this.f14086b);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
    }
}
