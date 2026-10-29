package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class mp2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f12356a;

    public mp2(Bundle bundle) {
        this.f12356a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        Bundle a8 = m13.a(bundle, "device");
        a8.putBundle("android_mem_info", this.f12356a);
        bundle.putBundle("device", a8);
    }
}
