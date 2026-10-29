package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class sw1 implements g53 {

    /* renamed from: q, reason: collision with root package name */
    private final Map f15858q;

    /* renamed from: r, reason: collision with root package name */
    private final iu f15859r;

    sw1(iu iuVar, Map map) {
        this.f15858q = map;
        this.f15859r = iuVar;
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void k(z43 z43Var, String str) {
        Map map = this.f15858q;
        if (map.containsKey(z43Var)) {
            this.f15859r.c(((rw1) map.get(z43Var)).f15373a);
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void s(z43 z43Var, String str, Throwable th) {
        Map map = this.f15858q;
        if (map.containsKey(z43Var)) {
            this.f15859r.c(((rw1) map.get(z43Var)).f15375c);
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void t(z43 z43Var, String str) {
        Map map = this.f15858q;
        if (map.containsKey(z43Var)) {
            this.f15859r.c(((rw1) map.get(z43Var)).f15374b);
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void q(z43 z43Var, String str) {
    }
}
