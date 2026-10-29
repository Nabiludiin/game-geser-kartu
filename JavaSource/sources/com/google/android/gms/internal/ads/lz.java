package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: MyApplication */
public final class lz extends mz {

    /* renamed from: q, reason: collision with root package name */
    private final r2.g f11944q;

    /* renamed from: r, reason: collision with root package name */
    private final String f11945r;

    /* renamed from: s, reason: collision with root package name */
    private final String f11946s;

    public lz(r2.g gVar, String str, String str2) {
        this.f11944q = gVar;
        this.f11945r = str;
        this.f11946s = str2;
    }

    @Override // com.google.android.gms.internal.ads.nz
    public final String b() {
        return this.f11945r;
    }

    @Override // com.google.android.gms.internal.ads.nz
    public final void c() {
        this.f11944q.b();
    }

    @Override // com.google.android.gms.internal.ads.nz
    public final String d() {
        return this.f11946s;
    }

    @Override // com.google.android.gms.internal.ads.nz
    public final void d0(w3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f11944q.a((View) w3.b.r0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.nz
    public final void e() {
        this.f11944q.d();
    }
}
