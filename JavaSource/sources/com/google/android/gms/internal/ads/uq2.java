package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class uq2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16897a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16898b;

    public uq2(String str, int i7) {
        this.f16897a = str;
        this.f16898b = i7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((x81) obj).f18665b.putString("request_id", this.f16897a);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        bundle.putString("request_id", this.f16897a);
        if (this.f16898b == 2) {
            bundle.putInt("sod", 1);
        }
    }
}
