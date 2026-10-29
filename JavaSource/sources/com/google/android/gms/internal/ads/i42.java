package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class i42 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f9828a;

    i42(Context context) {
        this.f9828a = context;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        if (((Boolean) o00.f13128h.e()).booleanValue() && (th instanceof v2.a0)) {
            fy.e(this.f9828a);
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) o00.f13130j.e()).booleanValue()) {
            fy.e(this.f9828a);
        }
    }
}
