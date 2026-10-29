package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class fs2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8462a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8463b;

    fs2(int i7, int i8) {
        this.f8462a = i7;
        this.f8463b = i8;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        int i7;
        Bundle bundle = ((x81) obj).f18664a;
        int i8 = this.f8462a;
        if (i8 == -1 || (i7 = this.f8463b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i8);
        bundle.putInt("crashes_without_flags", i7);
        int i9 = s2.z.f26272g;
        if (s2.b0.c().c()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
