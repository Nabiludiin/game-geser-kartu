package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* compiled from: MyApplication */
public final class j42 extends vg0 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ l42 f10340q;

    protected j42(l42 l42Var) {
        Objects.requireNonNull(l42Var);
        this.f10340q = l42Var;
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void K5(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        l42 l42Var = this.f10340q;
        l42Var.f11412a.b(new c52(autoCloseInputStream, l42Var.f11416e));
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void Q2(ParcelFileDescriptor parcelFileDescriptor, eh0 eh0Var) {
        this.f10340q.f11412a.b(new c52(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), eh0Var));
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void R6(v2.c0 c0Var) {
        this.f10340q.f11412a.e(c0Var.N0());
    }
}
