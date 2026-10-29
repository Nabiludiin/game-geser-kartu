package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: MyApplication */
public final class ks1 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final o30 f11220a;

    /* renamed from: b, reason: collision with root package name */
    private final xs1 f11221b;

    /* renamed from: c, reason: collision with root package name */
    private final h85 f11222c;

    public ks1(ao1 ao1Var, pn1 pn1Var, xs1 xs1Var, h85 h85Var) {
        this.f11220a = ao1Var.g(pn1Var.s());
        this.f11221b = xs1Var;
        this.f11222c = h85Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f11220a.t1((e30) this.f11222c.b(), str);
        } catch (RemoteException e8) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            String sb2 = sb.toString();
            int i7 = v2.n1.f26802b;
            w2.p.g(sb2, e8);
        }
    }

    public final void b() {
        if (this.f11220a == null) {
            return;
        }
        this.f11221b.d("/nativeAdCustomClick", this);
    }
}
