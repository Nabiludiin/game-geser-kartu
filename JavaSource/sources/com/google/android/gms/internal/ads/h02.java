package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class h02 implements ph1 {

    /* renamed from: q, reason: collision with root package name */
    private final Bundle f9276q = new Bundle();

    public final synchronized Bundle a() {
        return new Bundle(this.f9276q);
    }

    @Override // com.google.android.gms.internal.ads.ph1
    public final synchronized void b(String str) {
        this.f9276q.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.ph1
    public final synchronized void h(String str, String str2) {
        this.f9276q.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.ph1
    public final synchronized void v(String str) {
        this.f9276q.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.ph1
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.ph1
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.ph1
    public final void l0(String str) {
    }
}
