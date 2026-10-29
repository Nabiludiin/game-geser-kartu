package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class e14 extends qz3 implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    final transient z04 f7401t;

    /* renamed from: u, reason: collision with root package name */
    final transient int f7402u;

    e14(z04 z04Var, int i7) {
        this.f7401t = z04Var;
        this.f7402u = i7;
    }

    @Override // com.google.android.gms.internal.ads.e24
    public final boolean a(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.oz3
    final Set b() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.oz3
    final /* synthetic */ Collection c() {
        return new d14(this);
    }

    @Override // com.google.android.gms.internal.ads.e24
    public final void e() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.oz3
    final Map f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.oz3
    public final boolean g(Object obj) {
        return obj != null && super.g(obj);
    }

    @Override // com.google.android.gms.internal.ads.e24
    public final int h() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.oz3, com.google.android.gms.internal.ads.e24
    public final /* bridge */ /* synthetic */ Collection r() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.oz3, com.google.android.gms.internal.ads.e24
    public /* synthetic */ Map t() {
        return this.f7401t;
    }
}
