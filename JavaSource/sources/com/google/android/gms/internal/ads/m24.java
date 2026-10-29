package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
final class m24 extends uy3 {

    /* renamed from: v, reason: collision with root package name */
    final transient jy3 f12043v;

    m24(Map map, jy3 jy3Var) {
        super(map);
        this.f12043v = jy3Var;
    }

    @Override // com.google.android.gms.internal.ads.oz3
    final Set b() {
        return n();
    }

    @Override // com.google.android.gms.internal.ads.oz3
    final Map f() {
        return o();
    }

    @Override // com.google.android.gms.internal.ads.lz3
    protected final /* bridge */ /* synthetic */ Collection l() {
        return (List) this.f12043v.a();
    }
}
