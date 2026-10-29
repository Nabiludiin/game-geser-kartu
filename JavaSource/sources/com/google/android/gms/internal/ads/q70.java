package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import java.util.Objects;
import p3.c;

/* compiled from: MyApplication */
final class q70 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ im0 f14276a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s70 f14277b;

    q70(s70 s70Var, im0 im0Var) {
        this.f14276a = im0Var;
        Objects.requireNonNull(s70Var);
        this.f14277b = s70Var;
    }

    @Override // p3.c.a
    public final void O(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 23);
        sb.append("onConnectionSuspended: ");
        sb.append(i7);
        this.f14276a.e(new RuntimeException(sb.toString()));
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        try {
            this.f14276a.b(this.f14277b.c().o0());
        } catch (DeadObjectException e8) {
            this.f14276a.e(e8);
        }
    }
}
