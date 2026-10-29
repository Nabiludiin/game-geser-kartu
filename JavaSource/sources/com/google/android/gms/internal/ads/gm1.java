package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: MyApplication */
final class gm1 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f9026a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f9027b;

    /* synthetic */ gm1(im1 im1Var, View view, byte[] bArr) {
        this.f9026a = new WeakReference(im1Var);
        if (((Boolean) s2.b0.c().d(uy.Wd)).booleanValue()) {
            this.f9027b = new WeakReference(view);
        } else {
            this.f9027b = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        im1 im1Var = (im1) this.f9026a.get();
        if (im1Var == null) {
            return;
        }
        im1Var.b().a();
        if (((Boolean) s2.b0.c().d(uy.Wd)).booleanValue()) {
            im1Var.a((View) this.f9027b.get());
        }
    }
}
