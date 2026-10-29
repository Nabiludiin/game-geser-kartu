package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class zi2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20191a;

    zi2(Context context) {
        this.f20191a = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return p64.a(new aj2(androidx.core.content.a.a(this.f20191a, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 2;
    }
}
