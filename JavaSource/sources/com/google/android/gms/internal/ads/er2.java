package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class er2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f7790a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f7791b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7792c;

    public er2(String str, Bundle bundle, String str2) {
        this.f7790a = str;
        this.f7791b = bundle;
        this.f7792c = str2;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        bundle.putString("rtb", this.f7790a);
        if (((Boolean) s2.b0.c().d(uy.L4)).booleanValue()) {
            String str = this.f7792c;
            if (!str.isEmpty()) {
                bundle.putString("cld_status", str);
            }
        }
        Bundle bundle2 = this.f7791b;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", bundle2);
    }
}
