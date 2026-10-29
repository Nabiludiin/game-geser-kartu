package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: MyApplication */
final class hm1 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f9578a;

    /* renamed from: b, reason: collision with root package name */
    private final x73 f9579b;

    /* renamed from: c, reason: collision with root package name */
    private final w2.w f9580c;

    /* renamed from: d, reason: collision with root package name */
    private final b63 f9581d;

    /* synthetic */ hm1(im1 im1Var, x73 x73Var, w2.w wVar, b63 b63Var, byte[] bArr) {
        this.f9578a = new WeakReference(im1Var);
        this.f9579b = x73Var;
        this.f9580c = wVar;
        this.f9581d = b63Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        im1 im1Var = (im1) this.f9578a.get();
        String str = (String) map.get("u");
        if (im1Var == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f9579b.b(str, this.f9580c, this.f9581d, im1Var.e());
    }
}
