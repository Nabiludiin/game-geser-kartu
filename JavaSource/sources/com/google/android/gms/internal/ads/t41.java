package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class t41 implements u41 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f15968a;

    t41(Map map) {
        this.f15968a = map;
    }

    @Override // com.google.android.gms.internal.ads.u41
    public final ka2 m0(int i7, String str) {
        return (ka2) this.f15968a.get(str);
    }
}
