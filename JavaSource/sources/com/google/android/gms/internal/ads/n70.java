package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* compiled from: MyApplication */
final class n70 extends k70 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ im0 f12605q;

    n70(o70 o70Var, im0 im0Var) {
        this.f12605q = im0Var;
        Objects.requireNonNull(o70Var);
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void l1(ParcelFileDescriptor parcelFileDescriptor) {
        this.f12605q.b(parcelFileDescriptor);
    }
}
