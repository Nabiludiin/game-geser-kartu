package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
final class xa implements n9 {

    /* renamed from: a, reason: collision with root package name */
    private final qa f18684a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f18685b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f18686c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f18687d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f18688e;

    public xa(qa qaVar, Map map, Map map2, Map map3) {
        this.f18684a = qaVar;
        this.f18687d = map2;
        this.f18688e = map3;
        this.f18686c = Collections.unmodifiableMap(map);
        this.f18685b = qaVar.g();
    }

    @Override // com.google.android.gms.internal.ads.n9
    public final int a() {
        return this.f18685b.length;
    }

    @Override // com.google.android.gms.internal.ads.n9
    public final long b(int i7) {
        return this.f18685b[i7];
    }

    @Override // com.google.android.gms.internal.ads.n9
    public final List c(long j7) {
        return this.f18684a.h(j7, this.f18686c, this.f18687d, this.f18688e);
    }
}
