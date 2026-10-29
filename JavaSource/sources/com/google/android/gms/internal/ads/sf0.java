package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class sf0 extends sk0 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ e3.b f15594q;

    sf0(tf0 tf0Var, e3.b bVar) {
        this.f15594q = bVar;
        Objects.requireNonNull(tf0Var);
    }

    @Override // com.google.android.gms.internal.ads.tk0
    public final void L2(String str, String str2, Bundle bundle) {
        this.f15594q.b(new e3.a(new s2.w3(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.tk0
    public final void v(String str) {
        this.f15594q.a(str);
    }
}
