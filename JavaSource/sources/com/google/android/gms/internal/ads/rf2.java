package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
public final class rf2 implements ka2 {

    /* renamed from: a, reason: collision with root package name */
    private final ma2 f14891a;

    /* renamed from: b, reason: collision with root package name */
    private final qa2 f14892b;

    /* renamed from: c, reason: collision with root package name */
    private final f53 f14893c;

    /* renamed from: d, reason: collision with root package name */
    private final z64 f14894d;

    public rf2(f53 f53Var, z64 z64Var, ma2 ma2Var, qa2 qa2Var) {
        this.f14893c = f53Var;
        this.f14894d = z64Var;
        this.f14892b = qa2Var;
        this.f14891a = ma2Var;
    }

    static final String e(String str, int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i7).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i7);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final boolean a(o03 o03Var, c03 c03Var) {
        return !c03Var.f6188t.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final a5.d b(final o03 o03Var, final c03 c03Var) {
        final na2 na2Var;
        Iterator it = c03Var.f6188t.iterator();
        while (true) {
            if (!it.hasNext()) {
                na2Var = null;
                break;
            }
            try {
                na2Var = this.f14891a.a((String) it.next(), c03Var.f6192v);
                break;
            } catch (d13 unused) {
            }
        }
        if (na2Var == null) {
            return p64.c(new gd2("Unable to instantiate mediation adapter class."));
        }
        im0 im0Var = new im0();
        na2Var.f12650c.u4(new of2(this, na2Var, im0Var));
        if (c03Var.M) {
            Bundle bundle = o03Var.f13136a.f11326a.f17958d.C;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        f53 f53Var = this.f14893c;
        z43 z43Var = z43.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(f53Var);
        return q43.d(new k43() { // from class: com.google.android.gms.internal.ads.qf2
            @Override // com.google.android.gms.internal.ads.k43
            public final /* synthetic */ void a() {
                rf2.this.c(o03Var, c03Var, na2Var);
            }
        }, this.f14894d, z43Var, f53Var).j(z43.ADAPTER_LOAD_AD_ACK).e(im0Var).j(z43.ADAPTER_WRAP_ADAPTER).b(new j43() { // from class: com.google.android.gms.internal.ads.pf2
            @Override // com.google.android.gms.internal.ads.j43
            public final /* synthetic */ Object d(Object obj) {
                return rf2.this.d(o03Var, c03Var, na2Var, (Void) obj);
            }
        }).i();
    }

    final /* synthetic */ void c(o03 o03Var, c03 c03Var, na2 na2Var) {
        this.f14892b.a(o03Var, c03Var, na2Var);
    }

    final /* synthetic */ Object d(o03 o03Var, c03 c03Var, na2 na2Var, Void r42) {
        return this.f14892b.b(o03Var, c03Var, na2Var);
    }
}
