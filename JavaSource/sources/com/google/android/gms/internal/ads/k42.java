package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: MyApplication */
public final class k42 extends vg0 {

    /* renamed from: q, reason: collision with root package name */
    private final im0 f10885q;

    /* renamed from: r, reason: collision with root package name */
    private final eh0 f10886r;

    k42(im0 im0Var, eh0 eh0Var) {
        this.f10885q = im0Var;
        this.f10886r = eh0Var;
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void K5(ParcelFileDescriptor parcelFileDescriptor) {
        this.f10885q.b(new c52(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f10886r));
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void Q2(ParcelFileDescriptor parcelFileDescriptor, eh0 eh0Var) {
        this.f10885q.b(new c52(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), eh0Var));
    }

    @Override // com.google.android.gms.internal.ads.wg0
    public final void R6(v2.c0 c0Var) {
        this.f10885q.e(c0Var.N0());
    }
}
