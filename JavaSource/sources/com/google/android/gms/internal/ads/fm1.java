package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: MyApplication */
final class fm1 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f8323a;

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        im1 im1Var = (im1) this.f8323a.get();
        if (im1Var == null) {
            return;
        }
        im1Var.c().c0();
        if (((Boolean) s2.b0.c().d(uy.Nb)).booleanValue()) {
            im1Var.d().z();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            im1Var.d().M();
        }
    }
}
