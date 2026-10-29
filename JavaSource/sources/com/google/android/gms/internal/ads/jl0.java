package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class jl0 {

    /* renamed from: a, reason: collision with root package name */
    private long f10597a;

    /* renamed from: b, reason: collision with root package name */
    private long f10598b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kl0 f10599c;

    public jl0(kl0 kl0Var) {
        Objects.requireNonNull(kl0Var);
        this.f10599c = kl0Var;
        this.f10597a = -1L;
        this.f10598b = -1L;
    }

    public final long a() {
        return this.f10598b;
    }

    public final void b() {
        this.f10598b = this.f10599c.k().b();
    }

    public final void c() {
        this.f10597a = this.f10599c.k().b();
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f10597a);
        bundle.putLong("tclose", this.f10598b);
        return bundle;
    }
}
